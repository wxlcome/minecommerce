package com.wxl.cloud.miniecommerce.model.entity.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：ProvinceInfo
 * @description：$tableInfo.comment
 * @author     ：wxl
 * @date       ：2024/12/05 11:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_province_info")
@Schema(name="ProvinceInfo",description="")
public class ProvinceInfo extends BaseEntity {

    private static final long serialVersionUID = -43283326370395275L;

     
    @TableField(value="name")
    @Schema(name="name",description="${column.comment}")
    private String name;

}

