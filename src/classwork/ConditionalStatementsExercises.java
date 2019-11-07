package com.itea.practice.l3;

import java.util.Scanner;

public class ConditionalStatementsExercises {

    private static final Scanner SCANNER = new Scanner(System.in);

    private static int abs(int param) {
        if (param < 0) {
            param = param * -1;
        }
        return param;
    }

    static void printOdd() {
        int n = SCANNER.nextInt();
        boolean nIsOdd = isOdd(n);
        if (nIsOdd) {
            System.out.println(n + " is odd");
        } else {
            System.out.println(n + " is even");
        }
    }

    private static boolean isOdd(int n) {
        return n % 2 == 0;
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    private static int divisionByThree(int number) {
        return number % 3 == 0 ? number : number + 1;
    }

    private static void groupGreeting() {
        int number = SCANNER.nextInt();
        switch (number) {
            case 1 : {
                System.out.println("Natalia");
                break;
            }
            case 2 : {
                System.out.println("Denis");
            }
            case 3 :
            case 6: {
                System.out.println("Sergei");
                break;
            }
            case 4 : {
                System.out.println("Andrei");
                break;
            }
            case 5 : {
                System.out.println("Alexei");
                break;
            }
            case 7 : {
                System.out.println("Nick");
                break;
            }
            case 8 : {
                System.out.println("Anton");
                break;
            }
            default: {
                System.out.println("Name not found!");
            }
        }
    }
}
