package For;
//Напишите класс, который выводит на экран в строку все
// положительные двузначные числа (в возрастающем порядке).
// Числа должны отделяться друг от друга знаком «пробел».
//Рядом с числом, которое делится на 4, следует вывести знак «#» (решетка) без пробела между числом и знаком.
//Перед началом и после окончания вывода серии чисел на экран вывода следует вывести текстовые сообщения (по выбору).
public class For18 {
    public static void main(String[] args) {
        System.out.print("Начало мучений: ");
        for (int i = 2; i <= 98; i += 2) {
            if (i % 4 == 0) {
                System.out.print(i + "# ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println(" : конец мучений.");
    }
}