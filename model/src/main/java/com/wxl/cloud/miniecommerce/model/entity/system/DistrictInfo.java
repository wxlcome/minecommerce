package com.wxl.cloud.miniecommerce.model.entity.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：DistrictInfo
 * @description：$tableInfo.comment
 * @author     ：wxl
 * @date       ：2024/12/05 11:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_district_info")
@Schema(name="DistrictInfo",description="")
public class DistrictInfo extends BaseEntity {

    private static final long serialVersionUID = -33294446480881965L;

     
    @TableField(value="name")
    @Schema(name="name",description="${column.comment}")
    private String name;
     
    @TableField(value="city_id")
    @Schema(name="cityId",description="${column.comment}")
    private Integer cityId;

}

