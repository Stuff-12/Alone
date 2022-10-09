package Nachalo;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое число,
// представляющее собой промежуток времени в часах,
// и выводит на экран этот же промежуток времени, но
//выраженный в секундах.
public class Nachalo20 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        int b = a * 60;
        int c = b * 60;
        System.out.println(c+" секунд");
    }
}
