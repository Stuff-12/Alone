package Human;

public class StartHuman {
    public static void main(String[] args) {
        Human vasy = new Human("Гело", 481, 67, 23);
        vasy.vesHuman = 76;
        vasy.areHuman = 32;
        vasy.nameHuman = "Олег";
        vasy.rostHuman = 184;
        int a = 10;

        System.out.println(a);

        Human vova = new Human("Валентина", 205, 150, 450);

        System.out.println(vasy.imya());
        System.out.println(vasy.vozrats());
        System.out.println(vasy.dannie());
        System.out.println(vova.dannie());

    }
}
