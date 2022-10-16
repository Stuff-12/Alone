package TwoMassive;

public class Massive {
    public static void main(String[] args) {
        int[][] massive = new int[3][4];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                massive[i][j]=(int)(Math.random()*10)+11;
                System.out.print(massive[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < massive[0].length; i++) {
            for (int j = 0; j < massive.length; j++) {
                System.out.print(massive[j][i]+" ");
            }
            System.out.println();
        }
    }
}
