package com.wxl.cloud.miniecommerce.model.entity.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：ExpressCompany
 * @description：快递公司
 * @author     ：wxl
 * @date       ：2024/12/05 11:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_express_company")
@Schema(name="ExpressCompany",description="快递公司")
public class ExpressCompany extends BaseEntity {

    private static final long serialVersionUID = 481519679174552761L;

    /**
     * 快递公司名称
     */     
    @TableField(value="company_name")
    @Schema(name="companyName",description="快递公司名称")
    private String companyName;
    /**
     * 公司编码
     */     
    @TableField(value="company_code")
    @Schema(name="companyCode",description="公司编码")
    private String companyCode;
    /**
     * 快递公司图标
     */     
    @TableField(value="company_icon")
    @Schema(name="companyIcon",description="快递公司图标")
    private String companyIcon;


}

