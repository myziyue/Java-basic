package com.myziyue.ch02.ses01;

import java.time.LocalDate;

public class UsingObject {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 8, 24);
        System.out.println(date.plusDays(32));
        System.out.printf("Moth : %s, day : %s, week day : %s", date.getMonthValue(), date.getDayOfMonth(), date.getDayOfWeek());
    }
}
