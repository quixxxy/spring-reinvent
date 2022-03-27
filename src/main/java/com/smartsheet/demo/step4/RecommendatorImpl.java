package com.smartsheet.demo.step4;

public class RecommendatorImpl implements Recommendator {

    @InjectProperty
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println("to protect from corona drink " + alcohol);
    }
}
