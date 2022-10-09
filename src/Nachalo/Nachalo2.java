package Nachalo;
//1.Укажите, какая информация будет выводиться на экран, если с клавиатуры введено значение 8? Объясните ответ.
//2.Укажите, какая информация будет выводиться на экран, если с клавиатуры введено значение О? Объясните ответ.
//3.Предложите изменения в программе, чтобы ввод и вывод выгля­дели более «дружественно».
import java.util.Scanner;

public class Nachalo2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        System.out.print(" " + (a));
        System.out.print(" " + (a + 1));
        System.out.print(" " + (a - 2));
    }
}
