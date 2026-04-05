import java.util.Scanner;
public class CurrencyConverter {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter exchange rate (USD to RMB): ");
double rate = input.nextDouble();
System.out.print("Enter 0 to convert USD to RMB or 1 for RMB to USD: ");
int choice = input.nextInt();
if (choice == 0) {
System.out.print("Enter amount in USD: ");
double usd = input.nextDouble();
double rmb = usd * rate;
System.out.println("Converted amount: " + rmb + " RMB");
} 
else if (choice == 1) {
System.out.print("Enter amount in RMB: ");
double rmb = input.nextDouble();
double usd = rmb / rate;
System.out.println("Converted amount: " + usd + " USD");
}
else {
System.out.println("Invalid choice.");
 }
}
}
