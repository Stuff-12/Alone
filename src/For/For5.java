package For;

import java.util.Scanner;

//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
//
//Например:
//если пользователь введет число 3. Программа должна посчитать сумму чисел от 1 до 3, то есть 1+2+3 и выдать ответ 6;
//если пользователь введет число 5. Программа должна посчитать сумму чисел от 1 до 5, то есть 1+2+3+4+5 и выдать ответ 15;
public class For5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        int summ = 0;
        for (int i = 1; i <= chislo; i++) {
            summ+=i;
        }
        System.out.print(summ);
    }
}