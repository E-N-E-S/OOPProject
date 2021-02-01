package com.enesb.oopproject;

public class Piano implements Instrument, HouseDecor{

    String brand;
    boolean digital;

    @Override
    public void info() {
        System.out.println("Override Method");
    }
}
