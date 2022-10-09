package If;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры два целых числа и,
// если оба имеют одинаковый знак, на экран выводится сообщение
//Один и тот же знак, а если разный, то на экран выводится сообщение Разные знаки.
// Если же хотя бы одно из чисел равно О, выводится сообщение Некорректно.
public class If5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();
        stuff(firstNumber, secondNumber);
    }

    public static void stuff(int firstNumber, int secondNumber) {
        if (firstNumber == 0 || secondNumber == 0) {
            System.out.println("некорректно");
        } else {
            if ((firstNumber > 0 && secondNumber > 0) || (firstNumber < 0 && secondNumber < 0)) {
                System.out.println("знаки одинаковые");
            } else {
                System.out.println("знаки неодинаковые");
            }
        }
    }
}
