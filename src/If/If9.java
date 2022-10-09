package If;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры два различных числа.
// Класс должен вывести на экран эти числа в порядке возрастания в одной строке,
// а в другой - их же, но в порядке убывания.
public class If9 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chisloPervoe = scanner.nextInt();
        int chisloVtoroe = scanner.nextInt();
        vozrostanie(chisloPervoe, chisloVtoroe);
    }

    public static void vozrostanie(int chisloPervoe, int chisloVtoroe) {
        if (chisloPervoe > chisloVtoroe) {
            System.out.println(chisloVtoroe + " " + chisloPervoe);
            System.out.println(chisloPervoe + " " + chisloVtoroe);
        } else if (chisloPervoe < chisloVtoroe) {
            System.out.println(chisloPervoe + " " + chisloVtoroe);
            System.out.println(chisloVtoroe + " " + chisloPervoe);
        }

    }
}
