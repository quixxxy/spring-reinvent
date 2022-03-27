package com.smartsheet.demo.completed;

public class PolicemanImpl implements Policeman {

    @InjectByType
    private Recommendator recommendator;

    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("I AM THE LAW!!! LEAVE THE ROOM!!!");
        recommendator.recommend();
    }
}
