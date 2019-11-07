package com.itea.practice.l3;

import java.util.Scanner;

public class LoopsExercises {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String EMPTY = "";

    private static void printNumbers() {
        int number = SCANNER.nextInt();

        System.out.println("== print using while loop ==");
        int whileCounter = 0;
        while (whileCounter++ < number) {
            System.out.println(whileCounter);
        }

        System.out.println("== print using do-while ==");
        int doWhileCounter = 0;
        do {
            System.out.println(doWhileCounter);
            doWhileCounter++;
        } while (doWhileCounter < number);

        System.out.println("== print using for loop ==");
        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
    }

    private static void reverseInt() {
        int number = SCANNER.nextInt();
        String result = EMPTY;
        while (number > 0) {
            int lastDigit = number % 10;
            result = result + lastDigit;
            number /= 10;
        }
        System.out.println(result);
    }

    private static void printSimples() {
        int n = SCANNER.nextInt();
        int counter = 0;
        int lastSimpleNumber = 1;
        while (counter++ < n) {
            for (int i = lastSimpleNumber + 1; i < Integer.MAX_VALUE; i++) {
                if (isSimple(i)) {
                    System.out.print(i + " ");
                    lastSimpleNumber = i;
                    break;
                }
            }
        }
    }

    private static boolean isSimple(int number) {
        for (int i = 1; i < number - 1; i++) {
            if (number % (i + 1) == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printFactorial() {
        int number = SCANNER.nextInt();

        int factorial = 1;
        for (int i = 0; i < number; i++) {
            factorial *= i + 1;
        }

        System.out.println(factorial);

        int factorialWithWhile = 1;
        int counter = 0;
        while (counter < number) {
            factorialWithWhile *= counter;
            // ....
            counter += 1;
        }

        System.out.println(factorialWithWhile);
    }

    private static void printFibonacci() {
        int number = SCANNER.nextInt();

        // print first two predefined values
        for (int i = 0; i < number; i++) {
            if (i == 2) {
                break;
            }
            System.out.print(1 + " ");
        }

        // compute and print the following values
        int last = 1;
        int preLast = 1;
        for (int i = 2; i < number; i++) {
            int current = last + preLast;
            preLast = last;
            last = current;
            System.out.print(current + " ");
        }
    }
}
