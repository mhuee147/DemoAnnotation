package com.example.annotation.Lesson1;

import org.springframework.stereotype.Component;

@Component
public class Teacher implements ConNguoi{

    @Override
    public void hear() {
        System.out.println("T,Hear");

    }

    @Override
    public void speak() {
        System.out.println("t.speak");

    }
}
