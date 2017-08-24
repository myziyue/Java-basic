package com.myziyue.ch01.summary;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input a number:");
        int number = in.nextInt();

        System.out.printf("二进制：0b%s,八进制：0%o,十六进制：0x%x",
                Integer.toBinaryString(number),
                number,
                number
        );
    }
}
