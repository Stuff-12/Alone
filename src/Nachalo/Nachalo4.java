package Nachalo;

import java.util.Scanner;

//Напишите класс, который присваивает переменной х значение 9, а за­тем выводит на экран:
// в первой строке -это значение с поясняющей
//надписью (например, «значение х равно 9»),
// а во второй -квадрат этого значения (тоже с поясняющей надписью).
public class Nachalo4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 9;
        System.out.println("значение х равно " + x);
        System.out.println("квадрат  х равно " + (x*x));
    }

}
