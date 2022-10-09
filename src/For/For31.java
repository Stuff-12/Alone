package For;
//Напишите класс, который выводит на экран (в строку с пробелами) все двузначные целые положительные числа,
// в которых и цифра единиц, и цифра десятков делятся на три с одинаковым остатком.
public class For31 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            int decytka = i / 10;
            int edenica = i % 10;
            if (decytka % 3 == edenica % 3 )
                System.out.print(i+" ");
        }
    }
}
