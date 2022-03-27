package com.smartsheet.demo.step5;

public class Main {

    public static void main(String[] args) {
        CoronaDisinfector coronaDisinfector = ObjectFactory.getInstance().createObject(CoronaDisinfector.class);
        coronaDisinfector.start(new Room());
    }
}
