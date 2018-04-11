package com.company;


import java.util.Scanner;

public class Lesson10 {
    public void areaOfCircle (double radius)
    {
        double result = 22/7F * radius * radius;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Lesson10 l = new Lesson10();
        l.areaOfCircle(7.0);


        // an object will always have a function or method attached to it so as to manipulate it
        //Scanner class is used to capture data
        //the function system.in tells the compiler to capture data from your keyboard
        //the function next.int is the one that actually captures the data
       /* Scanner s = new Scanner(System.in);
      *//*  *//**//*System.out.println("Enter First Number :");
        int a = s.nextInt();
        System.out.println("Enter Second Number :");
        int b = s.nextInt();
        int result = a + b;*//**//*
        System.out.println("The sum is " +result);*//*

        System.out.println("Enter Your Name = ");
        String name = s.nextLine();
        System.out.println("Your Name is " +name.toUpperCase());*/
    }
}
