package com.myziyue.ch01.ses07;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arrInt = new int[10];
        String[] arrStr = new String[10];
        ArrayList<String> people = new ArrayList<>();
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("int is " + arrInt[i]);
            System.out.println("string is " + arrStr[i]);
            arrInt[i] = i;
            people.add("people" + i);
            arrStr[i] = "str+" + i;
        }

        int[] copyArrInt = Arrays.copyOf(arrInt, arrInt.length);
        ArrayList<String> copyPeople = new ArrayList<>(people);
        ArrayList<String> copyStr = new ArrayList<>(Arrays.asList(arrStr));

        System.out.println("copy int is " + Arrays.toString(copyArrInt));
        System.out.println("copy people is " +  copyPeople);
        System.out.println("people is " + people);
        System.out.println("copy str list is " + copyStr);

        Collections.reverse(copyStr);
        System.out.println("reverses copyStr list is " + copyStr);
        Collections.shuffle(copyPeople);
        System.out.println("shuffle copyPeople list is " + copyPeople);
    }
}
