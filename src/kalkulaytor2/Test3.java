package kalkulaytor2;

import static kalkulaytor2.Test2.scannerInt;

public class Test3 {
    static int pervoeChislo;
    static int vtoroeChislo;

    public static void vvod() {

        System.out.println("Введите число: ");
        pervoeChislo = scannerInt();
        System.out.println("Введите число: ");
        vtoroeChislo = scannerInt();

    }

    public Test3(int pervoeChislo, int vtoroeChislo) {
        Test3.pervoeChislo = pervoeChislo;
        Test3.vtoroeChislo = vtoroeChislo;
    }
}
