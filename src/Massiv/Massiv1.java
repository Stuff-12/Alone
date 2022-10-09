package Massiv;

import java.util.Arrays;

//Создать массив типа String с размером 7.
//Записать в него значения дней недели.
//Вывести на консоль значение последнего элемента.
public class Massiv1 {
    public static void main(String[] args) {
        String[] nedelya = new String[7];
        nedelya[0] = "Понедельник";
        nedelya[1] = "Вторник";
        nedelya[2] = "Среда";
        nedelya[3] = "Четверг";
        nedelya[4] = "Пятница";
        nedelya[5] = "Суббота";
        nedelya[6] = "Воскресенье";
        System.out.println(nedelya[nedelya.length - 3]);
    }
}
