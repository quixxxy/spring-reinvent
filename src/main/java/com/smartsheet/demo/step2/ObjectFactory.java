package com.smartsheet.demo.step2;

import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {

    private static ObjectFactory instance = new ObjectFactory();
    private Config config;

    private ObjectFactory() {
        this.config = new JavaConfig("com.smartsheet.demo.step2", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
    }

    public static ObjectFactory getInstance() {
        return instance;
    }

    @SneakyThrows
    public <T> T createObject(Class<T> t) {
        Class<? extends T> implClass = t;
        if (t.isInterface()) {
            implClass = config.getImplClass(t);
        }
        //TODO: tune object after creation

        return implClass.getDeclaredConstructor().newInstance();
    }
}
