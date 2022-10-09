package For;

//Напишите класс, который выводит на экран все положительные двузначные числа
// (выберите самостоятельно - в возрастающем или убывающем порядке),
//произведение цифр которых является тоже двузначным числом.
public class For27 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            int decytka = i / 10;
            int edenica = i % 10;
            if((edenica*decytka)>10){
                System.out.print(i+" ");
            }
        }
    }
}
