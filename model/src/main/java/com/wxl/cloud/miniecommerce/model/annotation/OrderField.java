package com.wxl.cloud.miniecommerce.model.annotation;

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
