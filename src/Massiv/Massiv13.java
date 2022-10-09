package Massiv;

import java.util.Scanner;

//Напишите класс, который заполняет случайными трехзначными числами массив,
// размер которого при инициализации вводится с клавиатуры.
//После заполнения класс должен вывести на экран значения массива в одной строке,
// начиная с «начала» массива (с первой ячейки).
public class Massiv13 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] massive = new int[scanner.nextInt()];
        for (int i = 1; i < massive.length ; i++) {
            massive[i]=(int)(Math.random()*899)+100;
            System.out.print((massive[i])+" ");
        }
    }
}
