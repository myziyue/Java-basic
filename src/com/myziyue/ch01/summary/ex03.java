package com.myziyue.ch01.summary;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input three numbers:");
        int maxNumber = 0,maxNumberMath = 0;
        int number = in.nextInt();
        int number2 = 0, number3 = 0;
        if(in.hasNextInt()){
          number2 = in.nextInt();
          if(number2 > number){
              maxNumber = number2;
          }
          maxNumberMath = Math.max(number, number2);
        }
        if(in.hasNextInt()){
            number3 = in.nextInt();
            if(number3 > number){
                maxNumber = number3;
            }
            maxNumberMath = Math.max(maxNumberMath, number3);
        }

        System.out.printf("max number : %s, math max number: %s", maxNumber, maxNumberMath);
    }
}
