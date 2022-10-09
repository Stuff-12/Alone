package Massiv;

//Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем,
//что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих
public class Massiv9 {
    public static void main(String[] args) {
        int[] fibonnachi = new int[20];

        fibonnachi[0]=1;
        fibonnachi[1]=1;

        System.out.print(fibonnachi[0] + " ");
        System.out.print(fibonnachi[1] + " ");

        for (int i = 2; i < fibonnachi.length; i++) {

            fibonnachi[i] = fibonnachi[0] + fibonnachi[1];

            System.out.print(fibonnachi[i] + " ");

            fibonnachi[0] = fibonnachi[1];

            fibonnachi[1] = fibonnachi[i];
        }
    }
}
