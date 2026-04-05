import java.util.Scanner;
public class RunwayLenght{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter take-off speed (v): ");
double v = input.nextDouble();
System.out.print("Enter acceleration (a): ");
double a = input.nextDouble();
double length = (v * v) / (2 * a);
System.out.println("Minimum runway length: " + length);
    }
}
