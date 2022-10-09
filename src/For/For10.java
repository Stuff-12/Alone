package For;

//Начав тренировки, спортсмен в первый день пробежал 10 км.
// Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
// Какой суммарный путь пробежит спортсмен за 7 дней?
public class For10 {
    public static void main(String[] args) {
        double summa = 0;
        double rasoyanie = 10;
        for (int i = 1; i <= 7; i++) {
            summa +=rasoyanie;
            rasoyanie*=1.1;
            System.out.println(summa+" ");
        }
        System.out.println(summa);
    }
}
