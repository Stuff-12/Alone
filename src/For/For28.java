package For;

//Напишите класс, который выводит на экран целые положительные
// трехзначные числа, составленные целиком из четных цифр.
public class For28 {
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            int cotka = i / 100;
            int decytka = (i / 10) % 10;
            int edenica = i % 10;
            if (cotka % 2 == 0 && decytka % 2 == 0 && edenica % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
