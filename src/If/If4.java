package If;

import java.util.Scanner;

//Напишите программу (класс), которая принимает с клавиатуры двузначное число
// и проверяет, что больше: само это число или произведение его цифр.
public class If4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        int b = a / 10;
        int c = a % 10;
        if(a>(b*c)){
            System.out.println("Число больше");
        }else {
            System.out.println("Произведение больше");
        }
    }
}
