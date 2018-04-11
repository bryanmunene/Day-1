package com.company;

public class Lesson6 {
    public static void main(String[] args) {
        String fname ="John";
        String lname ="Mark";
        String regNO ="001";
        System.out.println(fname+" "+lname+" "+regNO);
        String fullNames = fname +" "+lname;
        System.out.println(fullNames);
        String sentence ="The quick brown fox jumped over a lazy dog";
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence);
        String upper = sentence.toUpperCase();
        System.out.println(upper);

        System.out.println(sentence.length());
        sentence="The Name's Breezy";
        sentence= sentence.trim();
        if (sentence.isEmpty())
        {
            System.out.println("Fill in please");
    }
        else{
            System.out.println("Your sentence is awesome");

        }
        String spaceless=upper.replace(" ", "_");
        System.out.println(spaceless);
}
}

