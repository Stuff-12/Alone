package Metod;

//Напишите метод, который получает в качестве параметра два числа (А и В)
// и выводит на экран все четные числа из диапазона А ... В.
public class Metod {
    public static void main(String[] args) {
        int a = 0;
        int b = 100;


    }

    public static void metod(int a, int b){
        for (int i = a; i <=b ; i+=2) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
