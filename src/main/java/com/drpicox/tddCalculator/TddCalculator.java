package com.drpicox.tddCalculator;

public class TddCalculator implements Calculator {

    @Override
    public void input(char c) {
        throw new IllegalArgumentException("Unknown input '"+ c +"'");
    }

    @Override
    public int getDisplay() {
        return 0;
    }

}
