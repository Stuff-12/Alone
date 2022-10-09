package If;

import java.util.Scanner;

//Четырехзначное число называется «парно-симметричным»,
// если две его первых цифры и две его последних цифры образуют одинаковые числа (например -5252).
//Напишите класс, который принимает с клавиатуры четырехзначное положительное число и определяет,
// является ли оно «парно-симметричным».
// В соответствии с результатом проверки надо вывести на
//экран соответствующее текстовое сообщение.
public class If18 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        int tisycha = chislo / 1000;
        int cotka = (chislo / 100) % 10;
        int desytka = (chislo / 10) % 10;
        int edenica = chislo % 10;
        if((tisycha==desytka)&&(cotka==edenica)){
            System.out.println("Число парно-семметрично");
        }else {
            System.out.println("Число непарно-семметрично");
        }
    }
}
