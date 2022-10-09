package If;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры два числа:
// первое - количество учеников в классе, второе - количество стульев в классной комнате.
//Программа проверит соответствие между этими двумя значениями и выведет на экран соответствующую информацию
// (например, для значений 35 и 39 на экран выводится 4 стула лишних).
public class If11 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int ucheniki = scanner.nextInt();
        int stulia = scanner.nextInt();
        int lishnie = 0;
        if (ucheniki > stulia) {
            lishnie = ucheniki - stulia;
            System.out.println(lishnie+" стульев не хватает");
        } else if (ucheniki<stulia) {
            lishnie=stulia-ucheniki;
            System.out.println(lishnie+" стулья лишние");
        }
    }
}
