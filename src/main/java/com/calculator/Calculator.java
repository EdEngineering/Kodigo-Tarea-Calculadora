package com.calculator;

import com.calculator.exceptions.CalculatorException;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws CalculatorException {
        if (b == 0) {
            throw new CalculatorException("Division entre cero no permitida.");
        }
        return a / b;
    }

    public double squareRoot(double a) throws CalculatorException {
        if (a < 0) {
            throw new CalculatorException("Raiz Cuadrada de un numero negativo no permitida.");
        }
        return Math.sqrt(a);
    }

    public double exponentiate(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}