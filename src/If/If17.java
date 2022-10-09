package If;

import java.util.Scanner;

//Назовем «степенью четности» числа количество четных цифр в его составе (например, степень четности для 2346 равна 3).
//Напишите класс, который принимает с клавиатуры трехзначное положительное число и определяет, какова его «степень четностю>.
// В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
public class If17 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        int cotki = chislo / 100;
        int desytki = (chislo / 10) % 10;
        int edenici = chislo % 10;
        if ((cotki % 2 == 0) && (desytki % 2 == 0) && (edenici % 2 == 0)){
            System.out.println("Число трижды четное");
        } else if (((cotki%2==0)&&(desytki%2==0))||((cotki%2==0)&&(edenici%2==0))||((desytki%2==0)&&(edenici%2==0))) {
            System.out.println("Число дважды четное");
        } else if ((cotki%2==0)||(desytki%2==0)||edenici%2==0) {
            System.out.println("Степень четности числа один");
        }else {
            System.out.println("Степень четности числа ноль");
        }
    }
}
