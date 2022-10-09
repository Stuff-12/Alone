package Nachalo;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое число
// и вы­водит на экран новое число, которое больше введенного с клавиатуры в 10 раз.
public class Nachalo7 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        System.out.println(a*10);
    }

}

