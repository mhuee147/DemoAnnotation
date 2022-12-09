package com.example.annotation.Lesson1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("hue")
public class Student implements ConNguoi {


    @Override
    public void hear() {
        System.out.println("Hear");
    }

    @Override
    public void speak() {
        System.out.println("Speak");
    }
}
