package com.smartsheet.demo.step2;

public class Main {

    public static void main(String[] args) {
        CoronaDisinfector coronaDisinfector = new CoronaDisinfector();
        coronaDisinfector.start(new Room());
    }
}
