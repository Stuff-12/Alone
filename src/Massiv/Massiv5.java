package Massiv;

import java.util.Random;

//Создайте массив из 15 случайных целых чисел из отрезка [0;9].
// Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов
// и выведете это количество на экран на отдельной строке.
public class Massiv5 {
    public static void main(String[] args) {
        Random random = new Random();

        int schetchik = 0;
        int[] sluchainoeChislo = new int[15];
        for (int i = 0; i < 15; i++) {
            sluchainoeChislo[i] = random.nextInt(10);
            System.out.print(sluchainoeChislo[i] + " ");


        }
        System.out.println();
        for (int i = 0; i < sluchainoeChislo.length; i++) {
            if (sluchainoeChislo[i] % 2 == 0) {
                schetchik++;
            }
        }
        System.out.print(schetchik + " ");
    }

}

