package com.smartsheet.demo.step3;

import org.reflections.Reflections;

import java.util.Map;
import java.util.Set;

public class JavaConfig implements Config {

    private Reflections scanner;
    private Map<Class, Class> interfaceMap;

    public JavaConfig(String packages, Map<Class, Class> interfaceMap) {
        this.scanner = new Reflections(packages);
        this.interfaceMap = interfaceMap;
    }

    @Override
    public <T> Class<? extends T> getImplClass(Class<T> t) {
        return interfaceMap.computeIfAbsent(t, aClass -> {
            Set<Class<? extends T>> classes = scanner.getSubTypesOf(t);
            if (classes.size() != 1) {
                throw new RuntimeException("You must have only one implementation of " + t.getName() + ". Please update your config");
            }
            return classes.iterator().next();
        });
    }
}
