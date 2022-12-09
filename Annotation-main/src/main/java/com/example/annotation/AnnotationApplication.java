package com.example.annotation;

import com.example.annotation.Lesson1.ConNguoi;
import com.example.annotation.Lesson1.NhaTruong;
import com.example.annotation.Lesson1.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnnotationApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AnnotationApplication.class);

        ConNguoi conNguoi = context.getBean(ConNguoi.class);

        System.out.println("Instance: " +conNguoi);
        conNguoi.hear();

        NhaTruong nhaTruong = context.getBean(NhaTruong.class);

        System.out.println("Nha Truong: " + nhaTruong);

        System.out.println("Nha Truong : " + nhaTruong.conNguoi);

        nhaTruong.conNguoi.hear();
}}
