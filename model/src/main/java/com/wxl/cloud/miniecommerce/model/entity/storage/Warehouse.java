package com.wxl.cloud.miniecommerce.model.entity.storage;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @ClassName  ：Warehouse
 * @description：仓库
 * @author     ：wxl
 * @date       ：2024/12/05 13:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_warehouse")
@Schema(name="Warehouse",description="仓库")
public class Warehouse extends BaseEntity {

    private static final long serialVersionUID = -15899744366606395L;



    /**
     * 仓库名称
     */     
    @TableField(value="name")
    @Schema(name="name",description="仓库名称")
    private String name;
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
     
    @TableField(value="city_id")
    @Schema(name="cityId",description="${column.comment}")
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
    private Long districtId;
    /**
     * 区县名称
     */     
    @TableField(value="district_name")
    @Schema(name="districtName",description="区县名称")
    private String districtName;
    /**
     * 详细地址
     */     
    @TableField(value="detail_address")
    @Schema(name="detailAddress",description="详细地址")
    private String detailAddress;
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
     * 联系电话
     */     
    @TableField(value="phone")
    @Schema(name="phone",description="联系电话")
    private String phone;
    /**
     * 备注
     */     
    @TableField(value="remark")
    @Schema(name="remark",description="备注")
    private String remark;

}

