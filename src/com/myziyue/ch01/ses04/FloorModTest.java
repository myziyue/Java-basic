package com.myziyue.ch01.ses04;

import java.math.BigInteger;

public class FloorModTest {
    public static void main(String[] args) {
        System.out.println(Math.floorMod(13, 12));

        BigInteger n = BigInteger.valueOf(876543210123456789L);
        System.out.println(n);
        BigInteger k = new BigInteger("9876543210123456789");
        System.out.println(k);
        BigInteger r = BigInteger.valueOf(5).multiply(n.add(k)); // r = 5 * (n + k)
        System.out.println(r);
    }
}
