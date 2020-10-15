package com.example.demo;

import com.example.demo.entity.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private Dog dog;
    @Test
    void contextLoads() {
        System.out.println(dog);
    }

}
