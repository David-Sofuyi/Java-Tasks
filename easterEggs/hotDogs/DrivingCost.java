import java.util.Scanner;
public class DrivingCost {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter distance to drive: ");
double distance = input.nextDouble();
System.out.print("Enter fuel efficiency: ");
double mpg = input.nextDouble();
System.out.print("Enter price per gallon: ");
double price = input.nextDouble();
double cost = (distance / mpg) * price;
System.out.println("Cost of driving: " + cost);
}
}
