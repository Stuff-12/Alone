package For;
//Напишите класс, который выводит на экран в строку все трехзначные положительные числа (в убывающем порядке).
// Числа должны отделяться друг от друга знаком «пробел».
// Перед началом вывода на экран(в отдельной строке) следует вывести слово Начало,
// а после окончания вывода чисел (тоже в отдельной строке) - слово Завершено.
public class For9 {
    public static void main(String[] args) {
        System.out.print("Начало : ");
        for (int i = 998; i >= 100; i-=2) {
            System.out.print(i+" ");
        }
        System.out.print("Завершено");
    }
}