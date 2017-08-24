package com.myziyue.ch01.summary;

import java.math.BigInteger;

public class ex06 {
    public static void main(String[] args) {
        BigInteger sum = new BigInteger("1");
        for (int i = 2;  i <= 1000; i++){
            sum = sum.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(sum);
    }
}
