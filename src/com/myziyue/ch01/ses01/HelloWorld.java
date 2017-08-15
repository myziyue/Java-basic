package com.myziyue.ch01.ses01;

import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!".length());
        //随机数
        Random generator = new Random();
        System.out.println(generator.nextInt());
        System.out.println(generator.nextInt());
    }
}