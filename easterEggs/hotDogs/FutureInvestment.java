import java.util.Scanner;
public class FutureInvestment {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter investment amount: ");
double investment = input.nextDouble();
System.out.print("Enter annual interest rate : ");
double annualRate = input.nextDouble();
System.out.print("Enter number of years: ");
int years = input.nextInt();
double monthlyRate = annualRate / 1200;
double futureValue = investment * Math.pow(1 + monthlyRate, years * 12);
System.out.println("Future investment value: " + futureValue);
}
}
