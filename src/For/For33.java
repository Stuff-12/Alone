package For;

//Напишите класс, который выводит на экран (в строку с пробелами) все трехзначные целые положительные числа,
// соответствующие следующему требованию:
//две последних цифры (десятков и единиц) образуют двузначное число,
// делящееся без остатка на первую цифру (сотен).
public class For33 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int cotka = i / 100;
            int decytka = (i / 10) % 10;
            int edenica = i % 10;
            int summa = 0;
            if (((decytka + edenica) > 10)) {
                summa += (decytka+edenica);
                if(summa%cotka==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
