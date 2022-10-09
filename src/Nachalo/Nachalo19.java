package Nachalo;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое число,
// представляющее собой расстояние в единицах, принятых на флоте -в кабельтовых.
//После этого следует вывести на экран это же расстояние в метрах и километрах.
// Известно, что 1кабельтов=185.2 метра
public class Nachalo19 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        double b = a * 185.2;
        double c = b;
        double d = b / 1000;
        System.out.println("Расстояние в метрах: "+c);
        System.out.println("Расстояние в киллометрах: "+d);
    }
}

