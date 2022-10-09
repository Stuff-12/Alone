package For;

import java.util.Scanner;

//Напишите класс, который вначале принимает с клавиатуры целое положительное число.
//Затем класс выводит на экран в строку положительные трехзначные числа, в которых последняя цифра такая же,
// как и последняя цифра в значении, введенном с клавиатуры.
//Числа должны отделяться друг от друга знаком «пробел».
public class For23 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        for (int i = 100; i < 999; i++) {
            int edenica = i % 10;
            if(chislo==edenica){
                System.out.print(i+" ");
            }
        }
    }
}
