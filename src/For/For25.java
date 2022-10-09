package For;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое число
// и выводит на экран 25 последующих ему нечетных чисел.
public class For25 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        int vtoroeChislo = 0;
        for (int i = 0; i < 25; i++) {
            if (chislo % 2 == 0) {
                System.out.print((chislo += 1) + " ");
            } else {
                System.out.print((chislo += 2) + " ");
            }
        }
    }
}
