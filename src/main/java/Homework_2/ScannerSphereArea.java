package Homework_2;

import java.util.Scanner;

public class ScannerSphereArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double area = calculateSphereArea(radius);
        System.out.println("Площадь сферы: " + area);
    }

    public static double calculateSphereArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
