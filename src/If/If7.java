package If;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры два числа,
// первое из которых - количество учеников в классе,
// а второе - количество стульев в классной комнате.
// Программа должна проверить, всем ли ученикам будет, где сесть.
public class If7 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int ucheniki = scanner.nextInt();
        int stulia = scanner.nextInt();
        uchenikStul(ucheniki, stulia);

    }public static void uchenikStul(int ucheniki,int stulia ){
        if(ucheniki>stulia){
            System.out.println("учеников больше чем стульев");
        }else if (ucheniki<stulia){
            System.out.println("стульев больше чем учеников");
        }else {
            System.out.println("учеников чтолько же, сколько стульев");
        }
    }
}
