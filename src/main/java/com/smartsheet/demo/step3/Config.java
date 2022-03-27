package com.smartsheet.demo.step3;

public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> t);
}
