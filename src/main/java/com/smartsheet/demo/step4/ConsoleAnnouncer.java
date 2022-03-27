package com.smartsheet.demo.step4;

public class ConsoleAnnouncer implements Announcer {

    private Recommendator recommendator = ObjectFactory.getInstance().createObject(Recommendator.class);

    @Override
    public void announce(String msg) {
        System.out.println(msg);
        recommendator.recommend();
    }
}
