package Massiv;

//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
// выведите массивы на экран в двух отдельных строках.
// Посчитайте среднее арифметическое элементов каждого массива и сообщите,
// для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
public class Massiv7 {
    public static void main(String[] args) {
        int[] perviMassive = new int[5];
        int[] vtoroiMassiv = new int[5];
        double sum = 0;
        double sum1 = 0;

        for (int chislo1 : perviMassive) {
            perviMassive[chislo1] = (int) (Math.random() * 6);
            System.out.print(perviMassive[chislo1] + " ");
            sum = sum + perviMassive[chislo1];
        }
        System.out.println();
        System.out.print(sum/5);

        System.out.println();

        for (int chislo : vtoroiMassiv) {
            vtoroiMassiv[chislo] = (int) (Math.random() * 6);
            System.out.print(vtoroiMassiv[chislo] + " ");
            sum1 = sum1 + vtoroiMassiv[chislo];
        }
        System.out.println();
        System.out.print(sum1/5);

        System.out.println();

        if (sum > sum1) {
            System.out.println("Первый массив больше");
        } else if (sum<sum1) {
            System.out.println("Второй массив больше");
        }else {
            System.out.println("Массивы одинаковы");
        }

    }
}
