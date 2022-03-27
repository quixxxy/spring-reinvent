package com.smartsheet.demo.step1;

public class Main {

    public static void main(String[] args) {
        CoronaDisinfector coronaDisinfector = new CoronaDisinfector();
        coronaDisinfector.start(new Room());
    }
}
