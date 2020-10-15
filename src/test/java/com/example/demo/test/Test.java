package com.example.demo.test;
import com.example.demo.entity.Dog;
import org.springframework.beans.factory.annotation.Autowired;


public class Test {
    @Autowired
    private static Dog dog;
    public static void main(String[] args) {
        System.out.println(dog);
    }
}