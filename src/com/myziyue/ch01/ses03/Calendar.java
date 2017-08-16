package com.myziyue.ch01.ses03;

public class Calendar {
    public static final int DAYS_PER_WEEK = 7;

    public int finalTest(){
        final int WEEKS = 70;
        return WEEKS;
    }

    public static void main(String[] args) {
        System.out.println(Calendar.DAYS_PER_WEEK);
        System.out.println((new Calendar()).finalTest());
    }
}
