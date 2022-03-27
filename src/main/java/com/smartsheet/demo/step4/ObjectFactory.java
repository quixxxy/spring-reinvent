package com.smartsheet.demo.step4;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectFactory {

    private static ObjectFactory instance = new ObjectFactory();
    private List<ObjectConfigurator> configurators = new ArrayList<>();
    private Config config;

    @SneakyThrows
    private ObjectFactory() {
        this.config = new JavaConfig("com.smartsheet.demo.step4", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
        for (Class<? extends ObjectConfigurator> aClass : this.config.getScanner().getSubTypesOf(ObjectConfigurator.class)) {
            configurators.add(aClass.getDeclaredConstructor().newInstance());
        }
    }

    public static ObjectFactory getInstance() {
        return instance;
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        Class<? extends T> implClass = type;
        if (type.isInterface()) {
            implClass = config.getImplClass(type);
        }
        T t = implClass.getDeclaredConstructor().newInstance();

        configurators.forEach(objectConfigurator -> objectConfigurator.configure(t));

        return t;
    }
}
