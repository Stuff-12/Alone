package Massiv;

//Создайте массив из 8 случайных целых чисел из отрезка [1;10].
// Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
// Снова выведете массив на экран на отдельной строке.
public class Massiv6 {
    public static void main(String[] args) {
        int[] massive = new int[8];
        int count = 0;
        for (int i = 0; i < 8; i++) {
            massive[i] = (int) (Math.random() * 10);
            System.out.print(massive[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 != 0) {
                massive[i] = 0;
                count++;
            }
            System.out.print(massive[i]+" ");
        }
    }
}
