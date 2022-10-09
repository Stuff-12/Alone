package If;

import java.util.Scanner;

//Дано целое число. Если оно является положительным, то прибавить к нему 1.
// Если отрицательным, то вычесть из него 2.
// Если нулевым, то заменить его на 10.
// Вывести полученное число
public class If26 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        if (chislo>0){
            System.out.println(chislo+1);
        } else if (chislo<0) {
            System.out.println(chislo-2);
        }else {
            System.out.println(chislo+10);
        }
    }
}
