package com.myziyue.ch01.ses09;

public class Model {
    public static double test(double... args) {
        double sum = 0;
        for(double v:args){
            sum += v;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(test(3.0, 2.1, 4.7, 0.2));
    }
}
