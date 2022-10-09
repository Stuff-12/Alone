package For;

import java.util.Scanner;

//Напишите класс, который вначале принимает с клавиатуры целое положительное число.
//Затем класс выводит на экран в строку положительные двузначные числа,
// произведение цифр которых меньше введенного с клавиатуры значения.
//Числа должны отделяться друг от друга знаком «пробел».
public class For24 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        for (int i = 10; i < 99; i++) {
            int desytka = i / 10;
            int edenica = i % 10;
            if(chislo>(desytka*edenica)){
                System.out.print(i+" ");
            }
        }
    }
}
