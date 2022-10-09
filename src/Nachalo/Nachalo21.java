package Nachalo;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры два целых числа,
// образующих ответ на вопрос «который час?» (первое - часы, второе -минуты, например, 15 и 42)
// и выводит на экран следующие значения(каждое в отдельной строке):
// сколько секунд прошло с полуночи до «данного момента» и сколько минут прошло за это же время,
// а также сколько минут осталось до полуночи.
public class Nachalo21 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int chasi = in.nextInt();
        int minut = in.nextInt();
        int chas = 60;
        int vseMinuti = (chasi * 60) + minut;
        int sekundi = vseMinuti * 60;
        int vseVremy = chas * 24;
        int minOstalos = vseVremy-vseMinuti;
        System.out.println("прошло секунд с полуночи да этого времени: "+sekundi);
        System.out.println("прошло минут с полуночи за это время: "+vseMinuti);
        System.out.println("осталось до полуночи: "+minOstalos+"минут");


    }
}
