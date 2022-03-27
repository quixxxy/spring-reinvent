package com.smartsheet.demo.step5;

import org.reflections.Reflections;

public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> t);

    Reflections getScanner();
}
