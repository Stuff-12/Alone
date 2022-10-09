package For;

import java.util.Random;
import java.util.Scanner;

//Составьте программу, вычисляющую A*B, не пользуясь операцией умножения
public class For13 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int pervoeChislo = scanner.nextInt();
        int vtoroeChislo = scanner.nextInt();
        int summa = 0;
        for (int i = 1; i<=pervoeChislo; i++) {
            summa+=vtoroeChislo;
        }
        System.out.println(summa);
    }
}
