package com.hakanerdogmus.maintest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Veriables extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //DEĞİŞKENLER

        int age = 20;

        System.out.println(10 * age);
        System.out.println(age / 5);

        double x = 5 ;
        double y = 11 ;

        System.out.println(y / x);

        double pi = 3.14;
        int r = 5;

        System.out.println(2 * pi * r);

        String name = "Hakan";
        String surname = "Erdoğmuş";
        String fullname = name + " " + surname;
        String fullnamee = name + surname;

        System.out.println(name);
        System.out.println(surname);

        System.out.println(fullname);
        System.out.println(fullnamee);


    }
}