package Nachalo;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое число и
// выводит на экран число, которое больше введенного с клавиатуры на 10.
public class Nachalo6 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        System.out.println(a+10);
    }
}
