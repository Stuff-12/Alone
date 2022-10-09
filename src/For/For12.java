package For;
//Вычислить: 1+2+4+8+...+2048
public class For12 {
    public static void main(String[] args) {
        int summa = 0;
        for (int i = 1; i <=2048 ; i*=2) {
            summa+=i;//0=+1   1= 1+2  3= 3+4   7= 7+8
            System.out.print(summa+" ");
        }
    }
}
