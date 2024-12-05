package com.wxl.cloud.miniecommerce.model.entity.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：ExpressAddr
 * @description：快递地址信息
 * @author     ：wxl
 * @date       ：2024/12/05 11:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_express_addr")
@Schema(name="ExpressAddr",description="快递地址信息")
public class ExpressAddr extends BaseEntity {

    private static final long serialVersionUID = 240532952909793571L;

    /**
     * 快递信息id
     */     
    @TableField(value="express_info_id")
    @Schema(name="expressInfoId",description="快递信息id")
    private Long expressInfoId;
    /**
     * 发货人姓名
     */     
    @TableField(value="sender_name")
    @Schema(name="senderName",description="发货人姓名")
    private String senderName;
    /**
     * 发货人手机号
     */     
    @TableField(value="sender_phone")
    @Schema(name="senderPhone",description="发货人手机号")
    private String senderPhone;
    /**
     * 发货人省份名称
     */     
    @TableField(value="sender_province_name")
    @Schema(name="senderProvinceName",description="发货人省份名称")
    private String senderProvinceName;
    /**
     * 发货人城市名称
     */     
    @TableField(value="sender_city_name")
    @Schema(name="senderCityName",description="发货人城市名称")
    private String senderCityName;
    /**
     * 发货人区县名称
     */     
    @TableField(value="sender_district_name")
    @Schema(name="senderDistrictName",description="发货人区县名称")
    private String senderDistrictName;
    /**
     * 发货人详细地址
     */     
    @TableField(value="sender_detail_addr")
    @Schema(name="senderDetailAddr",description="发货人详细地址")
    private String senderDetailAddr;
    /**
     * 收货人姓名
     */     
    @TableField(value="receiver_name")
    @Schema(name="receiverName",description="收货人姓名")
    private String receiverName;
    /**
     * 收货人手机号
     */     
    @TableField(value="receiver_phone")
    @Schema(name="receiverPhone",description="收货人手机号")
    private String receiverPhone;
    /**
     * 收货人省份名称
     */     
    @TableField(value="receiver_province_name")
    @Schema(name="receiverProvinceName",description="收货人省份名称")
    private String receiverProvinceName;
    /**
     * 收货人城市名称
     */     
    @TableField(value="receiver_city_name")
    @Schema(name="receiverCityName",description="收货人城市名称")
    private String receiverCityName;
    /**
     * 收货人区县名称
     */     
    @TableField(value="receiver_district_name")
    @Schema(name="receiverDistrictName",description="收货人区县名称")
    private String receiverDistrictName;
    /**
     * 收货人详细地址
     */     
    @TableField(value="receiver_detail_addr")
    @Schema(name="receiverDetailAddr",description="收货人详细地址")
    private String receiverDetailAddr;


}

