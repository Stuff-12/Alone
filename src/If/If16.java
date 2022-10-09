package If;

import java.util.Scanner;

//Трехзначное число называется «дважды четным», если и оно само, и сумма его цифр - четные.
//Напишите класс, который принимает с клавиатуры трехзначное положительное число и проверяет, является ли оно «дважды четным».
//В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
public class If16 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        int sotki = chislo / 100;
        int desytki = (chislo / 10) % 10;
        int edenici = chislo % 10;
        int summaCifr = sotki + desytki + edenici;
        if ((summaCifr % 2 == 0) && (chislo % 2 == 0)) {
            System.out.println("Число дважды четное");
        }else {
            System.out.println("Число не дважды четное");
        }
    }
}
