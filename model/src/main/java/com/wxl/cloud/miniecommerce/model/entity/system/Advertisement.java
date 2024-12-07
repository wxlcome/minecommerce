package com.wxl.cloud.miniecommerce.model.entity.system;

import java.util.Date;

import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import com.wxl.cloud.miniecommerce.model.enums.system.AdvertisementStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.FieldFill;
import lombok.*;

/**
 * @ClassName  ：Advertisement
 * @description：广告
 * @author     ：wxl
 * @date       ：2024/12/08 02:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_advertisement")
@Schema(name="Advertisement",description="广告")
public class Advertisement extends BaseEntity {

    private static final long serialVersionUID = -59870055312082513L;

    /**
     * 商品id
     */     
    @TableField(value="goods_id")
    @Schema(name="goodsId",description="商品id")
    private Long goodsId;
    /**
     * 商品编号
     */     
    @TableField(value="goods_no")
    @Schema(name="goodsNo",description="商品编号")
    private String goodsNo;
    /**
     * 商品名称
     */     
    @TableField(value="goods_name")
    @Schema(name="goodsName",description="商品名称")
    private String goodsName;
    /**
     * 标题
     */     
    @TableField(value="title")
    @Schema(name="title",description="标题")
    private String title;
    /**
     * 描述
     */     
    @TableField(value="description")
    @Schema(name="description",description="描述")
    private String description;
    /**
     * 概念图
     */     
    @TableField(value="idea_img")
    @Schema(name="ideaImg",description="概念图")
    private String ideaImg;
    /**
     * 顺序
     */     
    @TableField(value="index")
    @Schema(name="index",description="顺序")
    private Integer index;
    /**
     * 状态（0-未上线，1-已上线）
     */     
    @TableField(value="status")
    @Schema(name="status",description="状态（0-未上线，1-已上线）")
    private AdvertisementStatus status;

}

