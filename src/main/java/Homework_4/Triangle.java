package Homework_4;

public class Triangle {
    public static void main(String[] args) {
//        Вывести на экран “равнобедренный треугольник”, всё “рёбра”
//        которого состоят из единиц, “медиана” равна 14, а вся “площадь” заполнена нулями
        int height = 14;
        for (int i = 0; i <= height; i++) {
            if (i == 0){
                System.out.println(1);
            }
            System.out.print(1);
            for (int x = 0; x < i; x++) {
                System.out.print(0);
            }
            System.out.println(1);

        }
        for (int i = height; i > 0; i--) {
            if (i == 0){
                System.out.println(1);
            }
            System.out.print(1);
            for (int x = 1; x < i; x++) {
                System.out.print(0);
            }
            System.out.println(1);
        }
        System.out.println(1);

    }
}
