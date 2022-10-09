package Massiv;

//Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент
// является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
public class Massiv10 {
    public static void main(String[] args) {


        int[] massive = new int[12];
        int count = 0;
        int index = 0;
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 43) - 21;
            System.out.print(massive[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] >= count) {
                count = massive[i];
                index=i;
            }

        }
        System.out.println(index);
    }
}
