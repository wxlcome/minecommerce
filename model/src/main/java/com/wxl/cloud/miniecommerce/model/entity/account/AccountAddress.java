package com.wxl.cloud.miniecommerce.model.entity.account;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @ClassName  ：AccountAddress
 * @description：账户-地址
 * @author     ：wxl
 * @date       ：2024/12/05 11:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_account_address")
@Schema(name="AccountAddress",description="账户-地址")
public class AccountAddress extends BaseEntity {

    private static final long serialVersionUID = 793698355916342490L;

    /**
     * 账户id
     */     
    @TableField(value="account_id")
    @Schema(name="accountId",description="账户id")
    private Long accountId;

    /**
     * 省份id
     */     
    @TableField(value="province_id")
    @Schema(name="provinceId",description="省份id")
    private Integer provinceId;

    /**
     * 省份名称
     */     
    @TableField(value="province_name")
    @Schema(name="provinceName",description="省份名称")
    private String provinceName;

    /**
     * 城市id
     */     
    @TableField(value="city_id")
    @Schema(name="cityId",description="城市id")
    private Integer cityId;

    /**
     * 城市名称
     */     
    @TableField(value="city_name")
    @Schema(name="cityName",description="城市名称")
    private String cityName;

    /**
     * 区县id
     */     
    @TableField(value="district_id")
    @Schema(name="districtId",description="区县id")
    private Integer districtId;

    /**
     * 区县名称
     */     
    @TableField(value="district_name")
    @Schema(name="districtName",description="区县名称")
    private String districtName;

    /**
     * 经度
     */     
    @TableField(value="longitude")
    @Schema(name="longitude",description="经度")
    private BigDecimal longitude;

    /**
     * 纬度
     */     
    @TableField(value="latitude")
    @Schema(name="latitude",description="纬度")
    private BigDecimal latitude;

    /**
     * 详细地址
     */     
    @TableField(value="detail_address")
    @Schema(name="detailAddress",description="详细地址")
    private String detailAddress;

    /**
     * 收货人
     */     
    @TableField(value="receiver_name")
    @Schema(name="receiverName",description="收货人")
    private String receiverName;

    /**
     * 收货人手机号
     */     
    @TableField(value="receiver_phone")
    @Schema(name="receiverPhone",description="收货人手机号")
    private String receiverPhone;

    /**
     * 是否默认地址（0-否、1-是）
     */     
    @TableField(value="is_default")
    @Schema(name="isDefault",description="是否默认地址（0-否、1-是）")
    private Integer isDefault;


}

