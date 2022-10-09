package If;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры трехзначное положительное число и проверяет,
// содержится ли в нем хотя бы один ноль.
//По результатам проверки надо вывести на экран соответствующее текстовое сообщение.
public class If19 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        int cotka = chislo / 100;
        int desytka = (chislo / 10) % 10;
        int edenica = chislo % 10;
        if ((cotka == 0) || (desytka == 0) || (edenica == 0)) {
            System.out.println("Число содержит цифру ноль");
        }else {
            System.out.println("Число не содержит цифру ноль");
        }
        }
    }
