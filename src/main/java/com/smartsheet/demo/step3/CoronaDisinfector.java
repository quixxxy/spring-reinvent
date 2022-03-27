package com.smartsheet.demo.step3;

public class CoronaDisinfector {

    private Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);
    private Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

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
