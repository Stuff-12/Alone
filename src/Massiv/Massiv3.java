package Massiv;

import java.util.Arrays;

//Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
// массива на экран сначала в строку, отделяя один элемент от другого пробелом,
//а затем в столбик (отделяя один элемент от другого началом новой строки).
// Перед созданием массива подумайте, какого он будет размера.
public class Massiv3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

        int[] massive = new int[count];
        int index = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                massive[index] = i;
                System.out.println(massive[index]);
                index++;
            }
        }
        System.out.print(Arrays.toString(massive));

    }


}
