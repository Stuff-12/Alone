package Nachalo;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры два целых числа,
// каждое из которых представляет собой размер одной из сторон прямо­угольника
//и выводит на экран следующие значения (каждое в отдель­ной строке):
// площадь прямоугольника и его периметр.
public class Nachalo16 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a*b;
        int d = (a*2)+(b*2);
        System.out.println(c);
        System.out.println(d);
    }
}
