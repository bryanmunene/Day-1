package com.company;

public class Lesson4 {
    public static void main(String[] args) {
        double w = 70;
        double h = 1.5;
        double result = w/(h*h);
        System.out.println(result);
        //conditional statements
        if(result<15)
        {
            System.out.println("very severely underweight");
        }
        else if(result>=15 && result<16)
        {
            System.out.println("severely underweight");
        }
        else if(result>=16 && result<18.5)
        {
            System.out.println("underweight");
        }
        else if(result>=18.5 && result<25)
        {
            System.out.println("normal");
        }
        else if (result>=25 && result<30)
        {
            System.out.println("Overweight");
        }
        else if (result>=30 && result<35)
        {
            System.out.println("Obese Class 1 (Moderately obese");
        }
        else if(result>=35 && result<40)
        {
            System.out.println("Obese Class 2 (Severely obese");
        }
        else
        {
            System.out.println("Obese Class 3 (Very severely obese");
        }
    }
}
