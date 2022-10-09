package If;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое число и,
// если оно равно нулю, выводит на экран сообщение Ноль.
public class If1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        if(a==0){
            System.out.println("Ноль");
        }else {
            System.out.println("Число больше нуля, либо число меньше нуля");
        }
    }
}
