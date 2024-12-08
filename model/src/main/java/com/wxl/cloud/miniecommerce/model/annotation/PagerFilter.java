package com.wxl.cloud.miniecommerce.model.annotation;

import java.lang.annotation.*;

/**
 * @ClassName  ：PagerFilter
 * @description：条件过滤器注解
 * @author     ：wxl
 * @date       ：2024/8/30 13:28
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface PagerFilter {
}
