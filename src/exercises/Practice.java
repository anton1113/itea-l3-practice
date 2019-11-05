package exercises;

import java.util.Scanner;

public class Practice {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(6));
//        printEvenNumbers();
//        reverseNumber();
        reverseNumberViaWhile();
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int previous = 1;
        int current = 1;
        int result = 0;
        for (int i = 2; i < n; i++) {
            result = previous + current;
            previous = current;
            current = result;
        }
        return result;
    }

    private static void printEvenNumbers() {
        System.out.print("Введите число: ");
        int number = SCANNER.nextInt();
        System.out.println("Четные цифры: ");
        while (number > 0) {
            int currentNumber = number % 10;
            if (currentNumber % 2 == 0) {
                System.out.println(currentNumber);
            }
            number /= 10;
        }
    }

    private static void reverseNumber() {
        System.out.print("Введите число: ");
        int number = SCANNER.nextInt();
        int resultNumber = 0;
        for (int i = number; i > 0; i /= 10) {
            resultNumber = resultNumber * 10 + i % 10;
        }
        System.out.println(resultNumber);
    }

    private static void reverseNumberViaWhile() {
        System.out.print("Введите число: ");
        int number = SCANNER.nextInt();
        int resultNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            resultNumber = resultNumber * 10 + lastDigit;
            number /= 10;
        }
        System.out.println(resultNumber);
    }
}
