
import java.util.*;

public class Sorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a[" + i + "] ");
            a[i] = sc.nextInt();
        }
        // Arrays.sort(a);

        System.out.println("Enter element which you want to insert");
        int neww = sc.nextInt();
        int[] b = new int[size + 1];
        int i = 0;
        while (a[i] < neww) {
            b[i] = a[i];
            i++;
        }
        b[i]=neww;
        while(i<b.length-1){
            b[i+1]=a[i];
            i++;
        }

       System.out.println("New array");
        for (i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] = " + b[i]);

        }

    }
}
