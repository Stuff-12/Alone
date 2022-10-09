package If;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры двузначное положительное число и проверяет,
// составлено ли оно из одинаковых цифр.
//В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
public class If13 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        int desytki = chislo / 10;
        int edenici = chislo % 10;
        if (desytki > edenici || desytki < edenici){
            System.out.println("Цифры в числе неодинаковые");
        }else {
            System.out.println("Цифры одинаковые");
        }
    }
}
