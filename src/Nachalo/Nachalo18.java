package Nachalo;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое число,
// представляющее собой массу тела в граммах, и выводящую на экран массу этого тела в килограммах.
public class Nachalo18 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число в граммах: ");
        int a = in.nextInt();
        int b = a/1000;
        System.out.println(b+"кг");
    }
}

