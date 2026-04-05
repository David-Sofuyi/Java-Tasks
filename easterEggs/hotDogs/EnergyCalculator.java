import java.util.Scanner;
public class EnergyCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter water mass (kg): ");
double m = input.nextDouble();
System.out.print("Enter initial temperature: ");
double initialTemp = input.nextDouble();
System.out.print("Enter final temperature: ");
double finalTemp = input.nextDouble();
double Q = m * (finalTemp - initialTemp) * 4184;
System.out.println("Energy needed: " + Q);
    }
}
