package com.tts;

import com.tts.calculator.Calculator;
import com.tts.calculator.MagicCalc;

public class Main {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        MagicCalc myMagicCalc = new MagicCalc();

        // Testing Calculator Class
        System.out.println("Adding 1 and 2:");
        System.out.println(myCalc.add(1, 2));

        System.out.println("Subtracting 6 from 10:");
        System.out.println(myCalc.subtract(10, 6));

        System.out.println("Multiplying 3 x 4:");
        System.out.println(myCalc.multiply(3, 4));

        System.out.println("Dividing 10 by 3:");
        System.out.println(myCalc.divide(10, 3));

        System.out.println("Squaring 4:");
        System.out.println(myCalc.square(4));

        // Testing MagicCalc Class
        System.out.println("Square root of 12:");
        System.out.println(myMagicCalc.squareRoot(12));

        System.out.println("Sin of 30:");
        System.out.println(myMagicCalc.sin(30));

        System.out.println("Cosine of 30:");
        System.out.println(myMagicCalc.cosine(30));

        System.out.println("Tangent of 30:");
        System.out.println(myMagicCalc.tangent(30));

        System.out.println("Factorial of 5:");
        System.out.println(myMagicCalc.factorial(5));

        System.out.println("Taking 4 to the power of 3:");
        System.out.println(myMagicCalc.powerOf(4, 3));

        System.out.println("Finding the log (base 10) of 15:");
        System.out.println(myMagicCalc.log(15));
    }
}
