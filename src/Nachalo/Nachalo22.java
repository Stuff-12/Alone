package Nachalo;

import java.util.Scanner;

//Кинетическая энергия тела подсчитывается как половина произведения массы тела на квадрат скорости тела.
//Напишите класс, который принимает с клавиатуры два числа, первое из которых - масса тела, а второе - его скорость.
//Класс должен подсчитать и вывести на экран значение кинетической энергии тела.
public class Nachalo22 {
    static Scanner in=new Scanner(System.in);

    public static void main(String[] args) {
        int masTela = in.nextInt();
        int skorTela = in.nextInt();
        int kvadratSkorostiTela = skorTela*skorTela;
        int kinetic = (masTela*kvadratSkorostiTela)/2;
        System.out.println(kinetic);
    }
}
