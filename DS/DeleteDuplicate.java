import java.util.Scanner;

public class DeleteDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        int size = arr.length;
        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) {
                if (arr[i]==arr[j]) {
                    for (int k = j; k < size-1; k++) {
                        arr[k] = arr[k+1];
                    }
                    size--;
                    j--;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
