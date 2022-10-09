package Nachalo;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры два целых числа,
// первое из которых представляет собой год рождения, а второе -нынешний (текущий) год.
// Класс должен вывести на экран возраст (в целых годах).
public class Nachalo17 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = b-a;
        System.out.println("Ваш текущий возраст: "+c);
    }
}
