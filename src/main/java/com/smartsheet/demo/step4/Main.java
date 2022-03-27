package com.smartsheet.demo.step4;

public class Main {

    public static void main(String[] args) {
        CoronaDisinfector coronaDisinfector = new CoronaDisinfector();
        coronaDisinfector.start(new Room());
    }
}
