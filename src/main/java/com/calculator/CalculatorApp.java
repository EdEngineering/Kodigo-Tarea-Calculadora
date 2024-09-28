package com.calculator;

import com.calculator.exceptions.CalculatorException;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido a la Calculadora de Consola!");
            System.out.println("Selecciona una operacion");
            System.out.println("---------------------------");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Raiz Cuadrada");
            System.out.println("6. Potencia");
            System.out.println("---------------------------");
            System.out.println("7. Salir");
            System.out.print("Ingresa el numero correspondiente: ");

            try {
                int choice = scanner.nextInt();
                clearConsole();
                System.out.println("Operando");
                if (choice == 7) {
                    scanner.close();
                    System.out.println("Gracias por usar la Calculadora de Consola!");
                    break;
                }

                double num1, num2;
                switch (choice) {
                    case 1:
                        System.out.print("Ingrese el primer numero: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Ingrese el segundo numero: ");
                        num2 = scanner.nextDouble();
                        System.out.println("------------------------\nResultado: " + calculator.add(num1, num2) + "\n------------------------");

                        waitEnter(scanner);
                        clearConsole();

                        break;
                    case 2:
                        System.out.print("Ingrese el primer numero: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Ingrese el segundo numero: ");
                        num2 = scanner.nextDouble();
                        System.out.println("------------------------\nResultado: " + calculator.subtract(num1, num2) + "\n------------------------");

                        waitEnter(scanner);
                        clearConsole();

                        break;
                    case 3:
                        System.out.print("Ingrese el primer numero: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Ingrese el segundo numero: ");
                        num2 = scanner.nextDouble();
                        System.out.println("------------------------\nResultado: " + calculator.multiply(num1, num2)
                                + "\n------------------------");

                        waitEnter(scanner);
                        clearConsole();

                        break;
                    case 4:
                        System.out.print("Ingrese el primer numero: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Ingrese el segundo numero: ");
                        num2 = scanner.nextDouble();
                        try {
                            System.out.println("------------------------\nResultado: " + calculator.divide(num1, num2) + "\n------------------------");
                        } catch (CalculatorException e) {
                            System.out.println(e.getMessage());
                        }
                        waitEnter(scanner);
                        clearConsole();

                        break;
                    case 5:
                        System.out.print("Ingrese el numero: ");
                        num1 = scanner.nextDouble();
                        try {
                            System.out.println("------------------------\nResultado Raiz Cuadrada: " + calculator.squareRoot(num1) + "\n------------------------");
                        } catch (CalculatorException e) {
                            System.out.println(e.getMessage());
                        }

                        waitEnter(scanner);
                        clearConsole();

                        break;
                    case 6:
                        System.out.print("Ingrese la base: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Ingrese el exponente: ");
                        num2 = scanner.nextDouble();
                        System.out.println(
                                "------------------------\nResultado de Exponente " + num1 + "^" + num2 + ": "
                                        + calculator.exponentiate(num1, num2) + "\n------------------------");

                        waitEnter(scanner);
                        clearConsole();

                        break;
                    default:
                        System.out.println("Seleccion invalida. Por favor, intente de nuevo.");
                        waitEnter(scanner);
                        clearConsole();
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                waitEnter(scanner);
                clearConsole();
            }
        }
    }

    public static void clearConsole() {
        try {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } catch (Exception e) {
            // Handle any exceptions.
        }
    }

    public static void waitEnter(java.util.Scanner scanner) {
        System.out.println("Presione Enter para Continuar...");
        scanner.nextLine();
        scanner.nextLine();
    }
}