package Homework_1;

public class TriangleArea {
    public static void main(String[] args) {
        double base = 15.0;
        double height = 25.0;
        double area = calculateTriangleArea(base, height);

        System.out.println("Площадь треугольника: " + area);
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}
