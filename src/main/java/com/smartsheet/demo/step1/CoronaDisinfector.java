package com.smartsheet.demo.step1;

public class CoronaDisinfector {

    private Announcer announcer = new ConsoleAnnouncer();
    private Policeman policeman = new PolicemanImpl();

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
