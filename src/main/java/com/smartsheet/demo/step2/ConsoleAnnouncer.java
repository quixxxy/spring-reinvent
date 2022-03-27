package com.smartsheet.demo.step2;

public class ConsoleAnnouncer implements Announcer {
    @Override
    public void announce(String msg) {
        System.out.println(msg);
    }
}
