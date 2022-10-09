package If;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры два целых числа и,
// если первое больше второго, выводит на экран их сумму, если же на
//оборот - выводит на экран их произведение. В случае же, если числа одинаковы,
// программа выводит на экран сообщение Числа равны.
public class If2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        int b = in.nextInt();
        if(a>b){
            System.out.println(a+b);
        } else if (a<b) {
            System.out.println(a*b);
        }else {
            System.out.println("Числа равны.");
        }
    }
}
