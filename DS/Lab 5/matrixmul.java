
import java.util.Scanner;

public class matrixmul {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][2];
        int[][] b = new int[2][3];
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
