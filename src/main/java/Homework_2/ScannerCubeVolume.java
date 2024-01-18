package Homework_2;

import java.util.Scanner;

public class ScannerCubeVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cubeRib = scanner.nextDouble();
        double volume = calculateCubeVolume (cubeRib);

        System.out.println("Обьем куба: " + volume);
    }

    public static double calculateCubeVolume(double cubeRib) {
        return Math.pow(cubeRib, 3);
    }
}
