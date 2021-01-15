package com.tts.calculator;

public class Calculator {

    public int add(int num1, int num2) {
        return (num1+num2);
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        return (double) num1 / (double) num2;
    }

    public int square(int num) {
        return (int) Math.pow(num, 2);
    }

    public int powerOf(int num, int pow){
        return (int)Math.pow(num, pow);
    }

    public double log(int num){

        return Math.log10(num);
    }


}
