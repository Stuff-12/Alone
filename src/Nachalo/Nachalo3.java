package Nachalo;

import java.util.Scanner;

//апишите класс, который присваивает переменной х значение 6, а за­тем выводит на экран: в первой строке -
//это значение, во второй -квадрат этого значения, в третьей - куб этого значения.
public class Nachalo3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        System.out.println("a = " + (a));
        System.out.println("a = " + (a * a));
        System.out.println("a = " + (a * a * a));
    }
}
