import java.util.Scanner;

public class AverageMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        double x = s.nextDouble();
        System.out.println("Enter a number:");
        double y = s.nextDouble();
        System.out.println("Enter a number:");
        double z = s.nextDouble();

        System.out.println(average(x,y,z));
    }
    public static double sum(double x, double y, double z){
        return x + y + z;
    }
    public static double average(double x, double y, double z){
        return sum(x, y, z)/3;
    }
}
