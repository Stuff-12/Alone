package For;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры два целых положительных числа:
// N и М (неизвестно, какое из введенных чисел больше).
//Класс должен вывести на экран все целые числа между наименьшим и наибольшим значениями, введенными с клавиатуры.
public class For35 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pervoeChislo = scanner.nextInt();
        int vtoroeChislo = scanner.nextInt();
        int posledovatelnost = 0;
        if (pervoeChislo > vtoroeChislo) {
            for (int i = vtoroeChislo + 1; i < pervoeChislo; i++) {
                posledovatelnost = i;
                System.out.print(posledovatelnost + " ");
            }
        } else if (pervoeChislo < vtoroeChislo) {
            for (int i = pervoeChislo + 1; i < vtoroeChislo; i++) {
                posledovatelnost = i;
                System.out.print(posledovatelnost + " ");
            }
        }
    }
}

