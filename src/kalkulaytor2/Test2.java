package kalkulaytor2;

import java.util.Scanner;

public class Test2 {
    static Scanner scanner = new Scanner(System.in);

    public static void vibor() {

        System.out.println("1.Умножение");
        System.out.println("2.Деление");
        System.out.println("3.Сложение");
        System.out.println("4.Вычитание");
        System.out.println("5.Выход из программы");


        int minus = scannerInt();
        switch (minus) {
            case 1:
                Test3.vvod();
                System.out.println("Ответ: " + (Test3.pervoeChislo * Test3.vtoroeChislo));
                break;
            case 2:
                Test3.vvod();
                if (Test3.vtoroeChislo == 0) {
                    System.out.println("Делить на ноль нельзя");
                    break;
                }
                System.out.println("Ответ: " + (Test3.pervoeChislo / Test3.vtoroeChislo));
                break;
            case 3:
                Test3.vvod();
                System.out.println("Ответ: " + (Test3.pervoeChislo + Test3.vtoroeChislo));
                break;
            case 4:
                Test3.vvod();
                System.out.println("Ответ: " + (Test3.pervoeChislo - Test3.vtoroeChislo));
                break;
            case 5:
                return;
            default:
                System.out.println("Введено неверное число");
                vibor();
        }
        vibor();
    }

    static int scannerInt() {
        return scanner.nextInt();
    }


}
