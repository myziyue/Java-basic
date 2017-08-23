package com.myziyue.ch01.ses06;

import java.io.Console;
import java.util.Scanner;

public class IOdemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.printf("Your name is %s.\n", name);

        System.out.println("What is your sex?");
        System.out.printf("Your sex is %s.\n", in.next());
        if(in.hasNext()) {
            System.out.printf("Other is %s.\n", in.next());
        }

        System.out.println("What is your age?");
        System.out.printf("Your age is %s.\n", in.nextInt());

        Console terminal = System.console();
        String username = terminal.readLine("User name:");
        char[] passwd = terminal.readPassword("Password:");
        System.out.printf("Your username is %s, your password is %s.", username, passwd);
    }
}
