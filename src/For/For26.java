package For;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое число и выводит
// на экран 10 предшествующих ему чисел, причем разница между значениями этих чисел должна быть равна 6.
public class For26 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            if(chislo>i){
                System.out.print((chislo-=6)+" ");
            }
        }
    }
}
