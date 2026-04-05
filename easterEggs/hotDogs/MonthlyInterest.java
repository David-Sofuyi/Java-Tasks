import java.util.Scanner;
public class MonthlyInterest {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter balance: ");
double balance = input.nextDouble();
System.out.print("Enter annual interest rate (in %): ");
double annualRate = input.nextDouble();
double interest = balance * (annualRate / 1200);
System.out.println("The interest for the next month is: " + interest);
}
}
