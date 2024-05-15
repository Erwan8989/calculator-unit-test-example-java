package com.github.stokito.unitTestExample.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sumResult = calculator.sum(5, 3);
        int minusResult = calculator.minus(5, 3);
        int divideResult = calculator.divide(6, 3);
        int multiplyResult = calculator.multiply(5, 3);

        System.out.println("Sum: " + sumResult);
        System.out.println("Minus: " + minusResult);
        System.out.println("Divide: " + divideResult);
        System.out.println("Multiply: " + multiplyResult);
    }
}

//test