package com.example.demo.test;

import com.example.demo.entity.User;
import com.example.demo.utils.ClassCompareUtil;

public class Test {
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User();
        u1.setId(11111L);
        u1.setEmail("111");
        u1.setName("111");
        u2.setId(1L);
        u2.setEmail("111");
        u2.setName("111");
        System.out.println(ClassCompareUtil.compareObject(u1,u2));
    }
}