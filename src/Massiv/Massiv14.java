package Massiv;

import java.util.Scanner;

//Напишите класс, который заполняет случайными четырехзначными числами массив,
// размер которого при инициализации вводится с клавиатуры.
//После заполнения класс должен вывести на экран значения массива в одной строке,
// начиная с «конца>> массива (с последней ячейки).
public class Massiv14 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] massive = new int[scanner.nextInt()];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 1500) + 1000;
            System.out.print((massive[i]) + " ");
        }
    }
}