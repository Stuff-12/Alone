package Massiv;

//Создайте массив из 4 случайных целых чисел из отрезка [10;99],
// выведите его на экран в строку. Определить и вывести на экран сообщение о том,
// является ли массив строго возрастающей последовательностью.
public class Massiv8 {
    public static void main(String[] args) {
        int[] massive = new int[2];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 89) + 10;
            System.out.print(massive[i] + " ");

        }
        System.out.println();
        int perebor = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] >= perebor) {
                perebor = massive[i];

            } else {
                System.out.println("Не возрастающая последовательность");
                break;
            }
            if (i == massive.length - 1)
                System.out.println("Возрастающая последовательность");


        }

    }
}

