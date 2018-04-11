package com.company;

public class Lesson7 {
    public static void main(String[] args) {
        int x = 49;
        System.out.println(Math.sqrt(x));
        double result = Math.sqrt(65);
        System.out.println(result);
        double powered = Math.pow(x,2.1);
        System.out.println(powered);

        double area = 3.142 * Math.pow(7,2);
        System.out.println(area);

        System.out.println(11/5.0);

        powered = Math.round(powered);
        System.out.println(powered);
        int z = (int)powered;
        System.out.println(powered);

        String y = "10";
        int v = Integer.parseInt(y);
        String k = "12.66c";
        double s = Double.parseDouble(k);
    }
}
