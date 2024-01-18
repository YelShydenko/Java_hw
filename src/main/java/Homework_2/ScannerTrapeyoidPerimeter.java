package Homework_2;

import java.util.Scanner;

public class ScannerTrapeyoidPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double top = scanner.nextDouble();
        double base = scanner.nextDouble();

        double perimeter = calculateTrapezoidPerimeter(side1, side2, top, base);
        System.out.println("Периметр трапеции: " + perimeter);

    }

    public static double calculateTrapezoidPerimeter(double side1, double side2, double top, double base) {
        return side1 + side2 + top + base;
    }
}
