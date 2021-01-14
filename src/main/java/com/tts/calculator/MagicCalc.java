package com.tts.calculator;

public class MagicCalc extends Calculator{

    public double squareRoot(int num){
        return Math.sqrt(num);
    }
    public double sin(int num){
        return Math.sin(Math.toRadians(num));
    }
    public double cosine(int num){
        return Math.cos(Math.toRadians(num));
    }
    public double tangent(int num){
        return Math.tan(Math.toRadians(num));
    }
    public int factorial(int num){
        int fact = 1;
        for (int i = 2; i<=num; i++){
            fact *=i;
        }
        return fact;
    }
}
