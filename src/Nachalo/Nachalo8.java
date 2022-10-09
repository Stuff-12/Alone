package Nachalo;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое число и вы­водит
// на экран два новых числа (каждое в отдельное строке): число,
//больше введенного с клавиатуры на 6, и число, меньше введенного с клавиатуры на 12.
public class Nachalo8 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        System.out.println(a+6);
        System.out.println(a-12);
    }
}
