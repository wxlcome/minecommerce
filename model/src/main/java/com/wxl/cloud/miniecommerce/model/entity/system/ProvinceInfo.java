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
public class ProvinceInfo implements Serializable {

    private static final long serialVersionUID = -43283326370395275L;

    /**
     * 数据行id
     */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    @Schema(name="id",description="数据行id")
    private Long id;
     
    @TableField(value="name")
    @Schema(name="name",description="${column.comment}")
    private String name;

}

