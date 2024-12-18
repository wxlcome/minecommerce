package com.wxl.cloud.miniecommerce.common.util.mybatisplus.annotation;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface OrderField {

    /**
     * @return 列名
     */
    String column() ;

}
