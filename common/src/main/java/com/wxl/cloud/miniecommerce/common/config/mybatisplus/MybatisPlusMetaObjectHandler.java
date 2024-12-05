package com.wxl.cloud.miniecommerce.common.config.mybatisplus;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;


/**
 * @ClassName  ：MybatisPlusMetaObjectHandler
 * @description： mybatis plus 元数据自动填充
 * @author     ：wxl
 * @date       ：2024/08/28 13:16
 */
@Component
public class MybatisPlusMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject,"createTime", Date.class, new Date());
        this.strictInsertFill(metaObject,"updateTime", Date.class, new Date());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject,"updateTime",Date.class, new Date());
    }
}
