package com.smartsheet.demo.completed;

//@Singleton
public class Recommendator {

    @InjectProperty("alcohol")
    private String alcohol;

    public Recommendator() {
        System.out.println("recommendator created");
    }

    public void recommend() {
        System.out.println("to protect from covid19 drink " + alcohol);
    }
}
