package Massiv;

//Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
// Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
//Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
public class Massiv11 {
    public static void main(String[] args) {
        int[] massive = new int[11];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 3) - 1;
            System.out.print(massive[i] + " ");
        }
        System.out.println();
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == -1) {
                count++;
            } else if (massive[i] == 0) {
                count1++;
            } else if (massive[i] == 1) {
                count2++;
            }
        }
        if (count > count1 && count > count2) {
            System.out.println("отрицательного значения больше");
        } else if (count1 > count && count1 > count2) {
            System.out.println("нулевого значения больше");
        } else if (count2 > count && count2 > count1) {
            System.out.println("положительного значения больше");
        } else {

        }
    }
}
