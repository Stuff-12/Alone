package Nachalo;
//1.
//Укажите, какая информация будет выводиться на экран, если с клавиатуры введено значение 6? Объясните ответ.
//2.
//Укажите, какая информация будет выводиться на экран, если с клавиатуры введено значение -6? Объясните ответ.
//3.
//Предложите изменения в программе, чтобы ввод и вывод выгля­дели более «дружественно».
import java.util.Scanner;

public class Nachalo {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        System.out.println("a*a=" + (a * a));
        System.out.println("a*1O=" + (a * 10));
    }
}

