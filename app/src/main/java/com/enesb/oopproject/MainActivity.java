package com.enesb.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        User myUser = new User();
        myUser.name = "Enes";
        myUser.job = "Student";

        User newUser = new User();
        newUser.name = "Kirk";
        newUser.job = "Musician";
         */

        User myUser = new User("Enes", "Student");
        System.out.println(myUser.information()); // Abstract Class

        // Encapsulation
        Musician james = new Musician("James", "Guitar", 50);
        System.out.println(james.getName());

        // Inheritance
        SuperMusician lars = new SuperMusician("Lars", "Drums", 55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        // Polymorphism

            // Static Polymorphism
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(3,5));
        System.out.println(mathematics.sum(3,5,7));

            // Dynamic Polymorphism
        Animal myAnimal = new Animal();
        myAnimal.sing();

        Dog barley = new Dog();
        barley.test();
        barley.sing();

        // Abstract and Interface
        Piano myPiano = new Piano();
        myPiano.brand = "Yamaha";
        myPiano.digital = true;
        myPiano.info();


    }
}