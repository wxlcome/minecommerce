package com.wxl.cloud.miniecommerce.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage;
import com.wxl.cloud.miniecommerce.model.entity.system.Operation;
import com.wxl.cloud.miniecommerce.model.entity.system.OperationGoods;
import com.wxl.cloud.miniecommerce.system.dto.OperationAdminDTO;
import com.wxl.cloud.miniecommerce.system.mapper.OperationMapper;
import com.wxl.cloud.miniecommerce.system.pagefilter.OperationAdminPageFilter;
import com.wxl.cloud.miniecommerce.system.service.OperationGoodsService;
import com.wxl.cloud.miniecommerce.system.service.OperationService;
import com.wxl.cloud.miniecommerce.system.vo.admin.OperationAdminPageVO;
import com.wxl.cloud.miniecommerce.system.vo.admin.OperationAdminVO;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName  ：OperationServiceImpl
 * @description：活动服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Service("operationService")
@RequiredArgsConstructor
public class OperationServiceImpl extends ServiceImpl<OperationMapper, Operation> implements OperationService {

    private final OperationGoodsService operationGoodsService;

    @Override
    public OperationAdminVO getAdminVOById(Long id) {
        OperationAdminVO vo = null;
        Operation entity = this.getById(id);// 查询实体信息
        if(entity != null){
            vo = new OperationAdminVO();
            BeanUtil.copyProperties(entity, vo);

            vo.setGoodsList(operationGoodsService.list(new LambdaQueryWrapper<OperationGoods>()
                    .eq(OperationGoods::getOperationId, id)
            )); // 获取活动商品列表
        }
        return vo;
    }

    @Override
    public BasePage<OperationAdminPageVO, OperationAdminPageFilter> getAdminPageByFilter(BasePage<Operation, OperationAdminPageFilter> page) {
        page = baseMapper.selectPageByFilter(page);
        BasePage<OperationAdminPageVO, OperationAdminPageFilter> resultPage = new BasePage<>();
        BeanUtil.copyProperties(page, resultPage, "records");
        resultPage.setRecords(BeanUtil.copyToList(page.getRecords(), OperationAdminPageVO.class));
        return resultPage;
    }

    @Override
    @GlobalTransactional
    public void saveOrUpdateByDTO(OperationAdminDTO dto) {

        Operation entity = new Operation(); // 创建实体
        BeanUtil.copyProperties(dto, entity); // 复制属性

        this.saveOrUpdate(entity); // 保存或更新实体
        Long id = entity.getId(); // 获取实体id

        List<OperationGoods> goodsList = dto.getGoodsList(); // 获取活动商品列表
        if(!CollectionUtils.isEmpty(goodsList)){

            goodsList.forEach(goods->{
                goods.setOperationId(id);
            });

            operationGoodsService.remove(new LambdaQueryWrapper<OperationGoods>().eq(OperationGoods::getOperationId, id)); // 删除原活动商品数据
            operationGoodsService.saveBatch(goodsList); // 保存新活动商品数据
        }



    }
}
