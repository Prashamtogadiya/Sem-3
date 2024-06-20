
import java.util.*;

public class Del {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a[" + i + "] ");

            a[i] = sc.nextInt();
        }
        System.out.println("Enter index where you want to delete a element");
        int del = sc.nextInt();
        int []b = new int[size - 1];
        for (int i = 0; i < b.length; i++) {
            if (i < del) {
                b[i] = a[i];
            } else {
                b[i] = a[i + 1];
            }
        }

        System.out.println("New array");
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] = " + b[i]);

        }

    }
}
