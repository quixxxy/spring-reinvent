package com.smartsheet.demo.step5;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class InjectByTypeConfigurator implements ObjectConfigurator {

    @SneakyThrows
    @Override
    public void configure(Object o) {
        for (Field field : o.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                field.setAccessible(true);
                field.set(o, ObjectFactory.getInstance().createObject(field.getType()));
            }
        }
    }
}
