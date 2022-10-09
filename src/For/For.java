package For;

//Вывести на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что:
//
//первый и второй член последовательности равны единицам;
//а каждый следующий - сумме двух предыдущих;
//
//то есть числа Фибоначчи - это 1 1 2 3 5 8 13 21 34 55 89 и т.д.
public class For {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 1;
        int summaFibo = 0;
        stuffFibo(firstNumber, secondNumber, summaFibo);


    }

    public static void stuffFibo(int firstNumber, int secondNumber, int summaFibo) {
        System.out.print(firstNumber + " " + secondNumber + " ");
        for (int i = 3; i <= 11; i++) {
            summaFibo = firstNumber + secondNumber;
            System.out.print(summaFibo + " ");
            firstNumber = secondNumber;
            secondNumber = summaFibo;
        }
    }
}
