package com.smartsheet.demo.step6;

import java.util.Map;

public class Application {

    public static ApplicationContext run(String packages, Map<Class, Class> interfacesImpl) {
        Config config = new JavaConfig(packages, interfacesImpl);
        ApplicationContext context = new ApplicationContext(config);
        ObjectFactory objectFactory = new ObjectFactory(context);
        context.setObjectFactory(objectFactory);

        return context;
    }
}
