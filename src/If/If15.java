package If;

import java.util.Scanner;

//Трехзначное число называется «симметричным», если первая и последняя его цифры одинаковы.
//Напишите класс, который принимает с клавиатуры трехзначное положительное число и проверяет, является ли оно «симметричным».
// В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
public class If15 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        int sotki = chislo / 100;
        int edenici = chislo % 10;
        if(sotki==edenici){
            System.out.println("Число семметричное");
        }else {
            System.out.println("Число несемметричное");
        }
    }
}
