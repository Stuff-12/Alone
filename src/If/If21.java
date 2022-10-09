package If;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое положительное число и изменяет его следующим образом:
//•для четного числа - увеличивает его до ближайшего «круглого» и выводит новое значение на экран вместе с сообщением Up to."
//•для нечетного числа - уменьшает его до ближайшего «круглого» и выводит новое значение на экран вместе с сообщением Down to".
//Например, для введенного значения 433 на экран выводится Down to 430, а для 56 выводится Up to 60.
public class If21 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        int edenica = chislo % 10;
        if (edenica == 1) {
            System.out.println(chislo - 1 + " Down to");
        } else if (edenica == 2) {
            System.out.println(chislo + 8 + " Up to");
        } else if (edenica == 3) {
            System.out.println(chislo - 3 + " Down to");
        } else if (edenica == 4) {
            System.out.println(chislo + 6 + " Up to");
        } else if (edenica == 5) {
            System.out.println(chislo - 5 + " Down to");
        } else if (edenica == 6) {
            System.out.println(chislo + 4 + " Up to");
        } else if (edenica == 7) {
            System.out.println(chislo - 7 + " Down to");
        } else if (edenica == 8) {
            System.out.println(chislo + 2 + " Up to");
        } else if (edenica == 9) {
            System.out.println(chislo - 9 + " Down to");
        } else {
            System.out.println(chislo);
        }
    }
}