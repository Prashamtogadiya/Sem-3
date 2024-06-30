import java.util.*;
public class Temperature{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temp in Celsius : ");
        double c = sc.nextDouble();

        System.out.println("Enter the temp in Fahrenhit : ");
        double f = sc.nextDouble();

        public static double celsius(double c){
            return (c * 9/5) + 32;
        }

        public static double celsius(double f){
            return (f * 9/5) + 32;
        }
    }
}
