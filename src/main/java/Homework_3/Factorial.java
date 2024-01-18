package Homework_3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nummer = scanner.nextInt();
        long method1 = factorialWhile(nummer);
        System.out.println("Result While: " + method1);
        long method2 = factorialDoWhile(nummer);
        System.out.println("Result Do While: " + method2);
        long method3 = factorialFor(nummer);
        System.out.println("Result For: " + method3);
    }
    public static long factorialWhile(int number) {
        int i = 1;
        long result = 1;
        while (i <= number) {
            result = i * result;
            i++;
        }
        return result;
    }

    public static long factorialDoWhile(int number) {
        int i = 1;
        long result = 1;
        do {
            result = i * result;
            i++;
        } while (i <= number);
        return result;
    }

    public static long factorialFor(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result = i * result;
        }
        return result;
    }

}
