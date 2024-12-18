package com.wxl.cloud.miniecommerce.model.entity.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName  ：CityInfo
 * @description：$tableInfo.comment
 * @author     ：wxl
 * @date       ：2024/12/05 11:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_city_info")
@Schema(name="CityInfo",description="")
public class CityInfo implements Serializable {

    private static final long serialVersionUID = 339437652444127498L;

    /**
     * 数据行id
     */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    @Schema(name="id",description="数据行id")
    private Long id;
     
    @TableField(value="name")
    @Schema(name="name",description="${column.comment}")
    private String name;
     
    @TableField(value="province_id")
    @Schema(name="provinceId",description="${column.comment}")
    private Integer provinceId;

}

