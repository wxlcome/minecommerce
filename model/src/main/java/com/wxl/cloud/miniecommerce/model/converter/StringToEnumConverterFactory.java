package com.wxl.cloud.miniecommerce.model.converter;

import com.wxl.cloud.miniecommerce.model.enums.BaseEnum;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

import java.util.Objects;

/**
 * @ClassName  ：StringToEnumConverterFactory
 * @description：String转Enum转换器工厂
 * @author     ：wxl
 * @date       ：2024/08/29 17:56
 */
public class StringToEnumConverterFactory implements ConverterFactory<String, BaseEnum> {

    @Override
    public <T extends BaseEnum> Converter<String, T> getConverter(Class<T> targetType) {
        return source -> {

            Integer value = Integer.valueOf(source);

            T[] enums = targetType.getEnumConstants();

            for (T e : enums) {
                if (Objects.equals(e.getValue(),value)) {
                    return e;
                }
            }
            return null;
        };
    }
}
