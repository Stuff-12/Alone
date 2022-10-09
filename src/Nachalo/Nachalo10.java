package Nachalo;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое число и
// за­тем выводит на экран его квадрат и его же куб, а между ними знак &.
public class Nachalo10 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        System.out.println((a * a) + " & " + (a * a * a));
    }
}
