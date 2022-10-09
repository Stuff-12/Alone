package If;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры двузначное положительное число и проверяет,
// является ли в нем первая цифра (десятов) больше второй (единиц).
// В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
public class If14 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        int desytki = chislo / 10;
        int edenici = chislo % 10;
        if (desytki > edenici) {
            System.out.println("Первая цифра больше второй");
        } else if (desytki < edenici) {
            System.out.println("Первая цифра меньше втрой");
        } else {
            System.out.println("Цифры одинаковые");
        }
    }

}
