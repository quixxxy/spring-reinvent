package com.smartsheet.demo.step5;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class InjectPropertyConfigurator implements ObjectConfigurator {

    private final Map<String, String> properties;

    @SneakyThrows
    public InjectPropertyConfigurator() {
        String path = ClassLoader.getSystemClassLoader().getResource("application.properties").getPath();
        Stream<String> lines = new BufferedReader(new FileReader(path)).lines();
        properties = lines.map(line -> line.split("=")).collect(toMap(arr -> arr[0], arr -> arr[1]));
    }

    @SneakyThrows
    @Override
    public void configure(Object o) {

        for (Field field : o.getClass().getDeclaredFields()) {
            InjectProperty annotation = field.getAnnotation(InjectProperty.class);
            if (annotation != null) {
                String value = annotation.value().isEmpty() ? properties.get(field.getName()) : properties.get(annotation.value());
                field.setAccessible(true);
                field.set(o, value);
            }
        }
    }
}
