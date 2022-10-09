package If;

import java.util.Scanner;

//В переменную записываем число. Надо вывести на экран сколько в этом числе цифр
// и положительное оно или отрицательное. Например, "это однозначное положительное число".
// Достаточно будет определить, является
//ли число однозначным, двухзначным или трехзначным и более.
public class If24 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        if (chislo >= 10 && chislo < 100) {
            System.out.println("число двухзначное положительное");
        } else if (chislo >= 0 && chislo < 10){
            System.out.println("число однозначное положительное");
        } else if (chislo>99&&chislo<1000) {
            System.out.println("число трехзначное положительное");
        } else if (chislo>999) {
            System.out.println("число многозначное положительное");
        } else if (chislo<0&&chislo>-10) {
            System.out.println("число однозначное отрицательное");
        } else if (chislo<-10&&chislo>-100) {
            System.out.println("число двухзначное отрицательное");
        } else if (chislo<-100&&chislo>-1000) {
            System.out.println("число трехзначное отрицательное");
        } else if (chislo<-1000) {
            System.out.println("число многозначное отрицательное");
        }
    }
}
