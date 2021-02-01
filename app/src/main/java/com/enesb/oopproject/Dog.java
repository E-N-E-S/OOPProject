package com.enesb.oopproject;

public class Dog extends Animal{
    public void test() {
        super.sing(); // animal classini referans alir
    }

    public void sing(){
        System.out.println("dog class");
    }
}
