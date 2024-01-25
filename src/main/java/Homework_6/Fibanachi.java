package Homework_6;

import java.util.Arrays;
import java.util.Scanner;

public class Fibanachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] method1 = fibanachiWhile(number);
        System.out.println("Result While: " + Arrays.toString(method1));
        int[] method2 = fibanachiDoWhile(number);
        System.out.println("Result Do While: " + Arrays.toString(method2));
        int[] method3 = fibanachiFor(number);
        System.out.println("Result For: " + Arrays.toString(method3));
    }
    //        написать программу, которая принимает от пользователя целое число n.
//        программа должна посчитать и вывести n чисел Фибоначчи.
//
//        написать 3 варианта реализации ('3 метода'):
//        1.используя цикл while
//        2.используя цикл do-while
//        3.используя цикл for
//
//        Пример: ввод пользователя 9 -> вывод [0, 1, 1, 2, 3, 5, 8, 13, 21],
//        ввод пользователя 5 -> вывод [0, 1, 1, 2, 3]
    public static int[] fibanachiWhile(int number) {
        int num1 = 0, num2 = 1, i = 0;
        int[] result = new int[number];
        while (i < number) {
            result[i] = num1;
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
            i++;
        }
        return result;
    }

    public static int[] fibanachiDoWhile(int number) {
        int num1 = 0, num2 = 1, i = 0;
        int[] result = new int[number];
        do {
            result[i] = num1;
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
            i++;
        } while (i < number);
        return result;
    }

    public static int[] fibanachiFor(int number) {
        int num1 = 0, num2 = 1;
        int[] result = new int[number];
        for (int i = 0; i < number; i++) {
            result[i] = num1;
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
        return result;
    }
}
