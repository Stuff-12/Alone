package Nachalo;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое число и
// выводит на экран следующие значения (каждое в отдельной строке):
// трицелых числа, следующих за значением, введенным с клавиатуры.
public class Nachalo13 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        int b = a + 1;
        int c = a + 2;
        int d = a + 3;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
