package For;

//Напишите программу печати таблицы перевода расстояний из дюймов
// в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
public class For14 {
    public static void main(String[] args) {
        double santimetr = 0;
        double duim = 2.54;
        for (int i = 1; i < 20; i++) {
            santimetr += duim;
            System.out.println(i + " см " + " = " + santimetr + " дюйма");
        }
    }
}
