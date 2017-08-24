package com.myziyue.ch01.summary;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input a number:");
        int number = in.nextInt();

        System.out.printf("%s == %s",number%360,Math.floorMod(number, 360));
    }
}
