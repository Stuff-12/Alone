package If;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое число и,
// если оно положительное, увеличивает его вдвое. Класс должен выводить на экран новое значение.
public class If {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        if (a > 0) {
            System.out.println(a*a);
        }else {
            System.out.println("число отрицательное");
        }
    }
}
