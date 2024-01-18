package Homework_1;

public class TrapezoidPerimeter {
    public static void main(String[] args) {
        double side1 = 5;
        double side2 = 4.5;
        double top = 3;
        double base = 6;

        double perimeter = calculateTrapezoidPerimeter(side1, side2, top, base);
        System.out.println("Периметр трапеции: " + perimeter);

    }

    public static double calculateTrapezoidPerimeter(double side1, double side2, double top, double base) {
        return side1 + side2 + top + base;
    }
}
