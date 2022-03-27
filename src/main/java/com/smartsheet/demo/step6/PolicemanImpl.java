package com.smartsheet.demo.step6;

public class PolicemanImpl implements Policeman {

    @InjectByType
    private Recommendator recommendator;

    @Override
    public void makePeopleLeave() {
        System.out.println("I AM THE LAW! ALL OUT!");
    }
}
