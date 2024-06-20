
import java.util.*;

public class Merge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a[" + i + "] :");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter b[" + i + "] :");
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            c[i] = a[i];
        }
        // int k = 0;
        for (int i = 5; i < 10; i++) {
            c[i] = b[i-a.length];
            // k++;
        }
        System.out.println("New array");
        for (int i = 0; i < 10; i++) {
            System.out.println("c[" + i + "] = " + c[i]);

        }
    }

}
