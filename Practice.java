package com.company;

public class Practice {;
    public static void main(String[] args) {
        System.out.print("Hello"+ " ");
        System.out.println("World");

        int fifa = 537;
        long playstation = fifa;
        System.out.println(fifa);
        System.out.println(playstation);

        double answer = 9/2.0;
        System.out.println(answer);



        double number1 = 0.8;
        double number2 = 0.8;
        int result = Double.compare(number1, number2);
        System.out.println(result);
        int a = 15;
        int b = 10;
        int c = a++ * --b + b-- - --a;
        //15 later value will change to 16
        //15 * (b will change to 9 before you equit
        //15 * 9 = 135 +
        //b had changed to 9 so it will be (9 --) hence it will remain 9
        //135+9 =144
        // a had changed to 16 so it will now be (-- 16) which is back to 15
        //so, 144 - 15 = 129
        System.out.println(c);

        int marks = 88;
        char grade = marks < 75 && marks > 80? 'B' : 'A';
        System.out.println(grade);

        int volkswagen = 1;
        switch(volkswagen)
        {
            case 1:
                System.out.println("This is a Tuareg");
                break;
            case 5:
                System.out.println("This is a golf");
                break;
            case 10:
                System.out.println("This is a Beetle");
                break;
            case 15:
                System.out.println("This is a Tuaran");
                break;
            case 20:
                System.out.println("These are volkswagen");
                break;
        }
        for (int score=80; score >= 80; score--) {
            System.out.println("Good Job");
        }

}
}

