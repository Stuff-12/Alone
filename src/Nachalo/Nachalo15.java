package Nachalo;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры два целых числа и
// выводит на экран следующие значения (каждое в отдельной строке):
//квадрат каждого числа (отдельно) и сумму квадратов введенных чисел.
public class Nachalo15 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a * a;
        int d = b * b;
        int f = c + d;
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
    }
}
