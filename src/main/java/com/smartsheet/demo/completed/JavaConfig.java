package com.smartsheet.demo.completed;

import lombok.Getter;
import org.reflections.Reflections;

import java.util.Map;
import java.util.Set;

public class JavaConfig implements Config {

    private final Map<Class, Class> classMap;

    @Getter
    private Reflections scanner;

    public JavaConfig(String packageToScan, Map<Class, Class> classMap) {
        this.classMap = classMap;
        this.scanner = new Reflections(packageToScan);
    }

    @Override
    public <T> Class<? extends T> getImplClass(Class<T> type) {
        return classMap.computeIfAbsent(type, clazz -> {
            Set<Class<? extends T>> classes = scanner.getSubTypesOf(type);
            if (classes.size() != 1) {
                throw new RuntimeException(type + " must have exactly one implementation");
            }
            return classes.iterator().next();
        });

    }
}
