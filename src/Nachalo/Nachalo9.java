package Nachalo;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое число и за­тем выводит на экран его квадрат.
public class Nachalo9 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        System.out.println(a*a);
    }
}
