package com.tts;

import com.tts.calculator.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        System.out.println("Adding 1 and 2:");
        System.out.println(myCalc.add(1,2));

        System.out.println("Subtracting 6 from 10:");
        System.out.println(myCalc.subtract(10,6));

        System.out.println("Multiplying 3 x 4:");
        System.out.println(myCalc.multiply(3,4));

        System.out.println("Dividing 10 by 3:");
        System.out.println(myCalc.divide(10,3));

        System.out.println("Squaring 4:");
        System.out.println(myCalc.square(4));
    }
}
