package If;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры два числа и проверяет, равны они друг другу или нет.
public class If6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        stuffDvaChisla(firstNumber, secondNumber);

    }

    public static void stuffDvaChisla(int firstNumber, int secondNumber) {
        if ((firstNumber > secondNumber) || (firstNumber < secondNumber)) {
            System.out.println("Числа не равны");
        }else {
            System.out.println("Числа равны");
        }

    }
}
