package com.wxl.cloud.miniecommerce.model.entity.order;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import com.wxl.cloud.miniecommerce.model.enums.order.ReplaceGoodsStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：ReplaceGoodsBill
 * @description：换货单
 * @author     ：wxl
 * @date       ：2024/12/05 12:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_replace_goods_bill")
@Schema(name="ReplaceGoodsBill",description="换货单")
public class ReplaceGoodsBill extends BaseEntity {

    private static final long serialVersionUID = -96917775656597280L;

    /**
     * 售后单id
     */     
    @TableField(value="post_sale_bill_id")
    @Schema(name="postSaleBillId",description="售后单id")
    private Long postSaleBillId;
    /**
     * 状态（0-取消换货、1-拒绝换货、2-确认换货、3-买家未发货、4-退货物流运输中、5-卖家确认收货、6-卖家未发货、7-发货物流运送中、8-买家确认收货、9-换货完成）
     */     
    @TableField(value="status")
    @Schema(name="status",description="状态（0-取消换货、1-确认换货、2-拒绝换货、3-买家未发货、4-退货物流运输中、5-卖家确认收货、6-卖家未发货、7-发货物流运送中、8-买家确认收货、9-换货完成）")
    private ReplaceGoodsStatus status;


}

