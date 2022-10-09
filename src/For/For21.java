package For;

import java.util.Scanner;

//Напишите класс, который вначале принимает с клавиатуры целое положительное число (в переменную х).
//Затем класс выводит на экран в строку все целые числа из диапазона -x...x (не включая крайние значения диапазона).
//Числа должны отделяться друг от друга знаком «пробел». Перед началом и после
// окончания вывода серии чисел на экран вывода следует вывести текстовые сообщения (по выбору).
public class For21 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        for (int i = -chislo+1; i < chislo; i++) {

            System.out.print(i+" ");
        }
    }
}
