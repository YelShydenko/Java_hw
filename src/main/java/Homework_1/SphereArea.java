package Homework_1;

public class SphereArea {
    public static void main(String[] args) {
        double radius = 5.3;

        double area = calculateSphereArea(radius);
        System.out.println("Площадь сферы: " + area);
    }

    public static double calculateSphereArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
