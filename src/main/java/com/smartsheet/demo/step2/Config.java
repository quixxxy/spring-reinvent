package com.smartsheet.demo.step2;

public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> t);
}
