package If;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры два целых числа и изменяет их следующим образом:
//•при разных значениях, большее число уменьшается на 1, а меньшее - увеличивается на 1;
//•при одинаковых значениях чисел оба увеличиваются на 1.
//Программа должна вывести на экран новые значения переменных.
public class If22 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chisloPervoe = scanner.nextInt();
        int chisloVtoroe = scanner.nextInt();
        if (chisloPervoe > chisloVtoroe) {
            System.out.println(chisloPervoe - 1 + " " + (chisloVtoroe + 1));
        } else if (chisloPervoe < chisloVtoroe) {
            System.out.println(chisloPervoe + 1 + " " + (chisloVtoroe - 1));
        } else {
            System.out.println(chisloPervoe + 1 + " " + (chisloVtoroe + 1));
        }
    }
}
