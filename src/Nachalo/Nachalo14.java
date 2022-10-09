package Nachalo;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры два целых числа и
// выводит на экран следующие значения (каждое в отдельной строке):
// сумму введенных чисел, их произведение,
// разницу между первым и вторым, разницу между вторым и первым.
public class Nachalo14 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a + b;
        int d = a * b;
        int f = a - b;
        int g = b - a;
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
    }
}
