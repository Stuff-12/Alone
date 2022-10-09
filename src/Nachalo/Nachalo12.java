package Nachalo;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое число
// и выводит на экран следующие значения (каждое в отдельной строке):
// снова введенное число и число, противоположное введенному числу.
public class Nachalo12 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        System.out.println(a);
        System.out.println(-a);
    }
}
