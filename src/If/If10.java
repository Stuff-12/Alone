package If;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое число и выводит на экран его квадрат,
// но только в случае, если введенное число отрицательно.
// В противном случае - на экран выводится сообщение Ошибка.
public class If10 {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        if (chislo > 0) {
            System.out.println("Ошибка");
        } else if (chislo < 0) {
            System.out.println(chislo * chislo);
        }else {
            System.out.println("Ошибка");
        }

    }
}
