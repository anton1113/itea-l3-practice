package conditionals;

import java.time.LocalTime;
import java.util.Scanner;

public class ConditionalOperatorsExamples {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        ifElseExample();
        switchExample();
    }

    private static void ifElseExample() {
        boolean beforeMidnight = LocalTime.now().isBefore(LocalTime.MAX);
        if (beforeMidnight) {
            System.out.println("I will use metro");
        } else {
            System.out.println("I should take taxi");
        }

        int a = SCANNER.nextInt();
        int b = SCANNER.nextInt();
        int max = a > b ? a : b;
        System.out.println(max);
    }

    private static void switchExample() {
        int hour = SCANNER.nextInt();
        switch (hour) {
            case 9 : {
                System.out.println("Have breakfast");
                break;
            }
            case 13 : {
                System.out.println("Have dinner");
                break;
            }
            case 19 : {
                System.out.println("Have supper");
                break;
            }
            default : {
                System.out.println("Do not eat");
            }
        }
    }
}
