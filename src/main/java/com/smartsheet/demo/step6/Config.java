package com.smartsheet.demo.step6;

import org.reflections.Reflections;

public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> t);

    Reflections getScanner();
}
