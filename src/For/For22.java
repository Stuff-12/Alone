package For;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое положительное число,
// а затем выводит на экран все целые положительные трехзначные числа,
//сумма цифр которых равна введенному с клавиатуры
//значению.
public class For22 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        for (int i = 100; i <= 999; i++) {
            int sotka = i / 100;
            int desytka = (i / 10) % 10;
            int edenica = i % 10;
            if(chislo==(sotka+desytka+edenica)){
                System.out.print(i+" ");
            }

        }
    }
}
