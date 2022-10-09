package For;

import java.util.Scanner;

//Напишите класс, который:
//•сначала вводит с клавиатуры целое положительное двузначное число;
//• затем выводит на экран (в строку с пробелами) трехзначные целые положительные числа,
// в которых предварительно введенное двузначное число является «внутренней» частью
//(как, например, 23 для 123 или 623).
public class For34 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        int decytkaChisla = chislo / 10;
        int edenicaChisla = chislo % 10;
        for (int i = 100; i < 1000; i++) {
            int decytka = (i / 10) % 10;
            int edenica = i % 10;

            if (decytka == decytkaChisla && edenica == edenicaChisla) {
                System.out.print(i+" ");
            }
        }
    }
}
