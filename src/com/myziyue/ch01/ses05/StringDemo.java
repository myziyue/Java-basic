package com.myziyue.ch01.ses05;

public class StringDemo {
    public static void main(String[] args) {
        String names = String.join(",", "Peter", "Paul", "Mary");
        System.out.println(names);
        String test = names + " are goods freids";
        System.out.println(test);

        StringBuilder builder = new StringBuilder();
        int i = 0;
        while(i < 10000){
            builder.append("test" + i + "\n\r");
            i++;
        }
        System.out.println(builder.toString());

        String nameStr = "Peter, Paul, Mary";
        String[] result = nameStr.split(", ");
        System.out.println(nameStr.substring(7, 10));
        i = 0;
        while(i < result.length) {
            System.out.println(result[i]);
            i++;
        }

        System.out.println(names.equals(nameStr));
        System.out.println("World".equalsIgnoreCase("world"));
    }
}
