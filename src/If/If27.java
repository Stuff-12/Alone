package If;

import java.util.Scanner;

//Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
public class If27 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pervoeChislo = scanner.nextInt();
        int vtoroeChislo = scanner.nextInt();
        int tretbeChislo = scanner.nextInt();
        if (pervoeChislo > 0 && vtoroeChislo > 0 && tretbeChislo > 0) {
            System.out.println("три положительных числа");
        } else if ((pervoeChislo > 0 && vtoroeChislo > 0 && tretbeChislo < 0) || (pervoeChislo > 0 && vtoroeChislo < 0 && tretbeChislo > 0) || (pervoeChislo < 0 && vtoroeChislo > 0 && tretbeChislo > 0)) {
            System.out.println("два положительных числа");
        } else if ((pervoeChislo > 0 && vtoroeChislo < 0 && tretbeChislo < 0) || (pervoeChislo < 0 && vtoroeChislo > 0 && tretbeChislo < 0) || (pervoeChislo < 0 && vtoroeChislo < 0 && tretbeChislo > 0)) {
            System.out.println("одно положительное число");
        }else {
            System.out.println("нет положительных чисел");
        }
    }
}
