package For;

//Напишите класс, который выводит на экран (в строку с пробелами) все двузначные целые положительные числа,
// соответствующие следующему требованию:
//и цифра единиц, и цифра десятков делятся на три с разными остатками.
public class For32 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            int decytki = i / 10;
            int edenici = i % 10;
            if (decytki % 2 != 0 && edenici%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
