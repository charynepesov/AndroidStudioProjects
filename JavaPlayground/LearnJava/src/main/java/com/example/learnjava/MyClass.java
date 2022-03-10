package com.example.learnjava;

public class MyClass {

    public static void main(String[] args) {

        multiplyNumbers(5, 6);
        divideNumbers(30, 0);

    }

    // Todo: multiplyNumbers and divideNumbers methods
    public  static void multiplyNumbers(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a*b));
    }
    public static void divideNumbers(int a, int b) {
        if (b == 0) {
            System.out.println("Can't divide to zero. Because " + b + " is zero.");
        } else {
            System.out.println(a + " / " + b + " = " + (a/b));
        }
    }

}

//        // Variable == bucket in memory
//        String name = "Jeremy";
//        String lastName = "Bush";
//
//        int age = 23;
//        int year = 1996865456; // 32 bits
//        long bigNumber = 994944646546665465L; // 64 bits
//
//        float celsius = 45.9F; // 32 bits
//        double height = 5.9D; // 64 bits
//
//        byte myByte = 127; // 8 bits
//        short myShort = 15465; // 16 bits
//
//        char letter = 'C';
//
//        boolean isTall = false;
//
//        System.out.println("Hello my name is "+name+"and I am "+age+" years old.");
//        System.out.println(year);
//        System.out.println(bigNumber);
//        System.out.println(celsius);
//        System.out.println(height);
//        System.out.println(letter);
//        System.out.println(isTall);


//        float a = 20;
//        float b = 24;
//
//        int sum = (int) (a + b);
//        int diff = (int) (a - b);
//        int mult = (int) (a*b);
//        float quot = a/b;
//
//        // Remainder = % --> "what remains"
//        float remainder = b % a;
//
//        System.out.println("Remainder is: " + remainder);
//        System.out.println("The sum is: " + sum);
//        System.out.println("The difference is: " + diff);
//        System.out.println("The product is: " + mult);
//        System.out.println("The quotient is: " + quot);