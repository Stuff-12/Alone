package If;

import java.util.Scanner;

//Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей. Определить существует ли такой треугольник.
//Дано: a, b, c –стороны предполагаемого треугольника. Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
//Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами несуществует.
public class If25 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pervayStorona = scanner.nextInt();
        int vtorayStorona = scanner.nextInt();
        int tretbyStorona = scanner.nextInt();
        if((pervayStorona+vtorayStorona)<tretbyStorona||(pervayStorona+tretbyStorona)<vtorayStorona||(vtorayStorona+tretbyStorona)<pervayStorona){
            System.out.println("такого треугольника не существует");
        }else {
            System.out.println("такой треугольник существует");
        }
    }
}
