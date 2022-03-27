package com.smartsheet.demo.step6;

public class CoronaDisinfector {

    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policeman policeman;

    public void start(Room room) {
        announcer.announce("We're staring disinfection, please leave the room");
        policeman.makePeopleLeave();
        disinfect(room);
        announcer.announce("All good. You can come back");
    }

    private void disinfect(Room room) {
        System.out.println("We are doing disinfection");
    }

}
