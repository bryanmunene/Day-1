package com.company;

public class Lesson9 {
    public static void main(String[] args) {
        //loops- for, while, do-while, foreach
        /*for (int i = 1000; i >= 100 ; i-=5) {
            System.out.println("Brian"+"  "+i);

*/
      /*  int scores[] = {90,56,87,34,56,56,767,345,234,2,3523,53463,452657,876,884543,23534,324525,24534562,25235252};

        int end = scores.length;
        for (int i = 0; i < end; i++) {
            System.out.println(scores[i]);*/
       /* String names[] = {"John", "Mary", "Mike", "Spencer"};
        for (String jina:names) {
            System.out.println(jina.toUpperCase());*/
            //you cannot use a 'foreach' loop to
            // workout an integer or double value
            //Assignement; use while loop to print all even numbers from 1000-100
            //use the do-while loop to print the sum of 1-100-answer shown should only be the total.

           /* int x = 10;
            String v = x+"";
            System.out.println(v);*/
/*
            int g = 1000;
            while(g>100){
                System.out.println(g);g-=2;
            }*/

          int a = 1;
          int sum = 0;
          do {
              sum += a;
              a++;
              System.out.println("The Current Sum is " +sum);
          }
          while (a <=100);
        System.out.println("The total sum is " + sum);
        }
        {

        }
    }



