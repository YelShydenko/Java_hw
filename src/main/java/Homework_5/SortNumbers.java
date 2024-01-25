package Homework_5;

import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        //Отсортировать массив целых чисел по возрастанию и по убыванию (2 отдельных метода),
        // не используя Arrays.sort()
        int[] taskArray = {5, 9, 8, 4, 2, 6, 1, 7, 10, 3};

        bubbleSortHigher(taskArray);
        System.out.println(Arrays.toString(taskArray));

        bubbleSortLower(taskArray);
        System.out.println(Arrays.toString(taskArray));
    }

    public static void bubbleSortHigher(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array [i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
    public static void bubbleSortLower(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] < array [i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
}
