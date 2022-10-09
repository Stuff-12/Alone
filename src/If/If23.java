package If;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое трехзначное положительное число и изменяет его следующим образом:
//•для чисел, больших 500, переставляет местами числа единиц и сотен (вместо 672 -276);
//•в остальных числах переставляются местами числа десятков и единиц (вместо 363 -336).
//Программа должна вывести на экран новое значение переменной.
public class If23 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chislo = scanner.nextInt();
        int cotka = chislo / 100;
        int desytka = (chislo / 10) % 10;
        int edenica = chislo % 10;
        if(chislo>500){
            System.out.println(edenica+""+desytka+""+cotka);
        }else{
            System.out.println(cotka+""+edenica+""+desytka);
        }
    }
}
