package com.company;

public class Hesabu {
    public void add(int a, int b)
    {
        System.out.println(a + b);
    }
    public void Multiply (int a, int b)
    {
        System.out.println(a * b);
    }
    public void Divide (int a, int b) {
        System.out.println(a / b);
    }
    public static void Subtract (int a, int b)
        {
            System.out.println(a - b);

        }
        public void AreaC (double a)
        {
            double pi = 3.142;
            System.out.println(pi * a * a);
        }
        public void  Areasq (double s)
        {
            System.out.println(s*s);
        }
        public void Equiltri (double b, double h)
        {
            System.out.println(1/2f * b * h);
        }
        public void volcylinder (double radius, double height )
        {
            double PI = 22/7f;
            System.out.println(PI * radius * 2 * height);
        }
        public void volsphere (double radius)
        {
            double PI = 3.142;
            System.out.println(4/3F * PI * radius * radius * radius);
        }
        //Vcone = 1/3 × pi × r2 × h
        public void volcone (double r, double h )
        {
            Double PI = 3.142;
            System.out.println(1/3f * PI * r * r * h);
        }
    }

