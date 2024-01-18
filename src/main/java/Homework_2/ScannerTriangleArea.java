package Homework_2;

import java.util.Scanner;

public class ScannerTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        double area = calculateTriangleArea(base, height);

        System.out.println("Площадь треугольника: " + area);
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}
