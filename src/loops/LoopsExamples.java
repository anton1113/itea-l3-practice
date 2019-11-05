package loops;

import java.util.Scanner;

public class LoopsExamples {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        whileExample();
        doWhileExample();
        forExample();
    }

    private static void whileExample() {
        System.out.print("Введите число: ");
        int number = SCANNER.nextInt();
        while (number != 7) {
            System.out.println("Введенное число: " + number);
            number = SCANNER.nextInt();
        }
    }

    private static void doWhileExample() {
        System.out.print("Введите число: ");
        int number;
        do {
            number = SCANNER.nextInt();
            System.out.println("Введенное число: " + number);
        } while (number != 7);
    }

    private static void forExample() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Строка номер " + (i + 1));
        }
    }
}
