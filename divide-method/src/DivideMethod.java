import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        double a = s.nextDouble();
        System.out.println("Enter another number:");
        double b = s.nextDouble();

        divide(a,b);
    }

    public static void divide(double a, double b){
        System.out.println(a + " / " + b + " = " + (a/b));
    }
}
