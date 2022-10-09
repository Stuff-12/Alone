package Inter;

//создать конструктор который принимает два целочисленных значения, и создать метод, в котором первый параметр возводит в квадрат, а второй
// увеличивается в 10раз. Нужно создать втрой метод в котором первый параметр это количество итераций, а второй параметр будет выводится в консоль
// с каждой итерацией.
public class Inter {
    int one;
    int two;

    public Inter(int one, int two) {
        this.one = one;
        this.two = two;
    }
    public static void main(String[] args) {
        Inter proverka = new Inter(5, 10);
        proverka.itog(proverka);
        proverka.perebor(proverka);
    }

    public void itog(Inter chislo) {
        int a = chislo.one*chislo.one;
        int b = chislo.two*10;
        System.out.println(a+" "+b);
    }
    public void perebor(Inter chi){
        for (int i = 0; i < chi.one; i++) {
            System.out.print(chi.two+" ");
        }
    }
}
