package Massiv;

import java.util.Arrays;

//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
// а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
public class Massiv {
    public static void main(String[] args) {
        int chetchik = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                chetchik++;
            }
        }
        System.out.println(chetchik);
        int[] massiv = new int[chetchik];
        int peremennay = 1;
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = peremennay;
            peremennay += 2;
            System.out.print(massiv[i]+" ");
        }
        System.out.println();
        for (int i = massiv.length-1; i >=0 ; i--) {
            System.out.print(massiv[i]+" ");
        }
    }
}
