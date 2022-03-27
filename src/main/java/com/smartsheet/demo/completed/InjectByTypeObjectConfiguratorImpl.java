package com.smartsheet.demo.completed;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class InjectByTypeObjectConfiguratorImpl implements ObjectConfigurator {

    @SneakyThrows
    @Override
    public void configure(Object o, ApplicationContext context) {
        for (Field field : o.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                field.setAccessible(true);
                field.set(o, context.getObject(field.getType()));
            }
        }
    }
}
