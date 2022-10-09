package If;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры оценку ученика (целое число) и проверяет,
// не является ли введенное значение ошибочным.
//На экран должно выводиться соответствующее текстовое сообщение.
public class If12 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int ocenka = scanner.nextInt();
        if ((ocenka > 0) && (ocenka <= 10)){
            System.out.println("Оценка в предалах допустимого");
        }else {
            System.out.println("Не допустимое значение оценки");
        }
    }
}
