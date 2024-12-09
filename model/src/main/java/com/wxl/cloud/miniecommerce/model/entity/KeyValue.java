package com.wxl.cloud.miniecommerce.model.entity;

import lombok.Data;

/**
 * @ClassName  ：KeyValue
 * @description：键值对
 * @author     ：wxl
 * @date       ：2024/12/09 13:51
 */
@Data
public class KeyValue {

    private String key;
    private String value;

    public KeyValue(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
