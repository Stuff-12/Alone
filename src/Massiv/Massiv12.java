package Massiv;
//Напишите класс, который заполняет случайными числами массив, размер которого при
// инициализации определяется случайным числом в диапазоне О ... 99.
public class Massiv12 {
    public static void main(String[] args) {
        int[] massive = new int[(int) (Math.random()*99)];
        for (int i = 0; i < massive.length; i++) {
            massive[i]=(int)(Math.random()*99);
            System.out.print(massive[i]+" ");
        }
    }
}
