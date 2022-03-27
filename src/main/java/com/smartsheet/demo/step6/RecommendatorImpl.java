package com.smartsheet.demo.step6;

@Singleton
public class RecommendatorImpl implements Recommendator {

    @InjectProperty
    private String alcohol;

    public RecommendatorImpl() {
        System.out.println("I was created");
    }

    @Override
    public void recommend() {
        System.out.println("to protect from corona drink " + alcohol);
    }
}
