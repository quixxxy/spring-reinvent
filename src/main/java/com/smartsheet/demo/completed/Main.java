package com.smartsheet.demo.completed;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = Application.run("com.smartsheet.demo", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
        CoronaDesinfector coronaDesinfector = context.getObject(CoronaDesinfector.class);
        coronaDesinfector.start(new Room());
    }
}
