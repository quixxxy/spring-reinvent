package com.smartsheet.demo.completed;

import java.util.Map;

public class Application {

    public static ApplicationContext run(String packages, Map<Class, Class> implClasses) {
        JavaConfig javaConfig = new JavaConfig(packages, implClasses);
        ApplicationContext context = new ApplicationContext(javaConfig);
        ObjectFactory objectFactory = new ObjectFactory(context);
        context.setObjectFactory(objectFactory);

        return context;
    }
}
