package com.smartsheet.demo.completed;

public class CoronaDesinfector {

    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policeman policeman;

    public void start(Room room) {
        announcer.announce("Attention all!!! Please leave the room!");
        policeman.makePeopleLeaveRoom();
        //TODO: tell everyone about desinfection and ask to leave the room
        //TODO: get however left out
        desinfect(room);
        //TODO: tell everyone you can come back
        announcer.announce("you can now come back!!!");
    }

    private void desinfect(Room room) {
        System.out.println("We are doing desinfection!!!");
    }

}
