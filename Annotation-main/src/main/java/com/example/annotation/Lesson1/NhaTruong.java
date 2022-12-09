package com.example.annotation.Lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NhaTruong {
    @Autowired
    @Qualifier("hue")
    public ConNguoi conNguoi;
    public NhaTruong(ConNguoi conNguoi){
        this.conNguoi = conNguoi;
    }
}
