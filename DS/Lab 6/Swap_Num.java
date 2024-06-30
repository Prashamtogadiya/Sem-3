import java.util.*;
public class Swap_Num{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number n1 : ");
        int n1 = sc.nextInt();

        System.out.println("Enter the number n2 : ");
        int n2 = sc.nextInt();

        System.out.println("---Before---");
        System.out.println("num1 : "+n1);
        System.out.println("num2 : "+n2);

        Swap_Number(n1,n2);

    }

    public static void Swap_Number(int a,int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("---After---");
        System.out.println("num1 : "+a);
        System.out.println("num2 : "+b);
    }
}