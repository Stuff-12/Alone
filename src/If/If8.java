package If;

import java.util.Scanner;

//Напишите программу, которая принимает с клавиатуры число и
// превращает его в положительное, если оно отрицательное, либо в ноль во всех остальных случаях
public class If8 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        chislo(chislo);
    }

    public static void chislo(int chislo) {
        if (chislo >= 0) {
            System.out.println(chislo-chislo);
        } else {
            System.out.println(chislo*chislo);
        }
    }
}
