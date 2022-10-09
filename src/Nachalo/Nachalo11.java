package Nachalo;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое число и
// вы­водит на экран следующие три значения (все - в одной строке, раз­деленные пробелом): число,
// меньше введенного с клавиатуры на 1, число, введенное с клавиатуры,
// и число, больше введенного с клавиа­туры на 1.
public class Nachalo11 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        int b = a - 1;
        int d = a + 1;
        System.out.println(b + " " + a + " " + d);
    }
}
