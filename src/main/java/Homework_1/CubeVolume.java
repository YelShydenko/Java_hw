package Homework_1;

public class CubeVolume {
    public static void main(String[] args) {
        double cubeRib = 8;
        double volume = calculateCubeVolume (cubeRib);

        System.out.println("Обьем куба: " + volume);
    }

    public static double calculateCubeVolume(double cubeRib) {
        return Math.pow(cubeRib, 3);
    }
}
