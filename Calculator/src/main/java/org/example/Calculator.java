package org.example;

import java.util.Scanner;

public class Calculator {

    public double additon(double num1, double num2)
    {
        return num1+num2;
    }
    public double subtraction(double num1, double num2)
    {
        return num1-num2;
    }
    public double multiplication(double num1, double num2)
    {
        return num1*num2;
    }
    public double division(double num1, double num2)
    {
        return num1/num2;
    }
    public double modulous(double num1, double num2)
    {
        return num1%num2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1,num2,result;
        System.out.println("******************");
        System.out.println("Calculator");
        System.out.println("___________________");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("0. Exit");
        System.out.println();
        boolean flag = true;
        do {
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();
            Calculator calculator = new Calculator();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter 1st Number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter 2nd Number : ");
                    num2 = scanner.nextDouble();
                    result = calculator.additon(num1,num2);
                    System.out.println("Sum = "+result);
                    break;
                case 2:
                    System.out.println("Enter 1st Number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter 2nd Number : ");
                    num2 = scanner.nextDouble();
                    result = calculator.subtraction(num1,num2);
                    System.out.println("Difference = "+result);
                    break;
                case 3:
                    System.out.println("Enter 1st Number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter 2nd Number : ");
                    num2 = scanner.nextDouble();
                    result = calculator.multiplication(num1,num2);
                    System.out.println("Product = "+result);
                    break;
                case 4:
                    System.out.println("Enter 1st Number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter 2nd Number : ");
                    num2 = scanner.nextDouble();
                    result = calculator.division(num1,num2);
                    System.out.println("Division = "+result);
                    break;
                case 5:
                    System.out.println("Enter 1st Number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter 2nd Number : ");
                    num2 = scanner.nextDouble();
                    result = calculator.modulous(num1,num2);
                    System.out.println("Modulus = "+result);
                    break;
                default:
                    flag=false;
            }
        }
        while (flag);

    }
}
