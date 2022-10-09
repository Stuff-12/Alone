package If;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры положительное целое число
// и выводит на экран ближайшее к нему «круглое число».
//Например, для введенного значения 433 выводится на экран 430, а для 56 выводится 60.
public class If20 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        int edenica = chislo % 10;
        if(edenica==1){
            System.out.println(chislo-1);
        }else if (edenica==2){
            System.out.println(chislo-2);
        } else if (edenica==3) {
            System.out.println(chislo-3);
        } else if (edenica==4) {
            System.out.println(chislo-4);
        } else if (edenica==5) {
            System.out.println(chislo-5);
        } else if (edenica==6) {
            System.out.println(chislo+4);
        } else if (edenica==7) {
            System.out.println(chislo+3);
        } else if (edenica==8) {
            System.out.println(chislo+2);
        } else if (edenica==9) {
            System.out.println(chislo+1);
        }else {
            System.out.println(chislo);
        }
    }
}
