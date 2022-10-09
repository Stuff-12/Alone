package Massiv;

//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
// а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
public class Massiv4 {
    public static void main(String[] args) {
        int chislo = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                chislo++;
            }
        }
        System.out.println(chislo);
        int[] massiv = new int[chislo];
        int index = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                massiv[index] = i;
                System.out.print(massiv[index] + " ");
                index++;
            }
        }
        System.out.println();
        int[] massiv1 = new int[chislo];
        int index1 = 0;
        for (int i = 100; i >= 1; i--) {
            if (i % 2 != 0) {
                massiv1[index1] = i;
                System.out.print(massiv1[index1] + " ");
                index1++;
            }
        }
    }
}