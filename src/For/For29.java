package For;

//Напишите класс, который выводит на экран все целые трехзначные числа
// (и положительные, и отрицательные), соответствующие следующему требованию:
//эти числа делятся без остатка на сумму собственных цифр.
public class For29 {
    public static void main(String[] args) {
        for (int i = -999; i < 999; i++) {
            int cotka = i / 100;
            int decytka = (i / 10) % 10;
            int edenica = i % 10;
            if ((i!=0)&&(((i % (cotka + decytka + edenica) == 0) && (i < -99)) || ((i % (cotka + decytka + edenica) == 0) && (i > 99)))){
                System.out.print(i + " ");
            }
        }
    }
}
