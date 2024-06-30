
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int size = sc.nextInt();
        String[] a = new String[5];
        int ran = ((int) Math.random() * size);
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Word at a[" + i + "] : ");
            a[i] = sc.next();
        }
        String ranword = a[ran];
        System.out.println("Random Word is : "+ranword);

        System.out.println("Enter Any word ");
        String user = sc.next();

        char[] arr = ranword.toCharArray();
        char[] arr2 = user.toCharArray();
        if (ranword.length() == user.length()) {

            Arrays.sort(arr);
            Arrays.sort(arr2);

        } else {
            System.out.println("Length of both words are not same so not anagram");
            return;
        }
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                c++;
            }
        }
        if (c == 0) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }
    }
}
