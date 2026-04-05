import java.util.Scanner;
public class GratuityCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter subtotal: ");
double subtotal = input.nextDouble();
System.out.print("Enter gratuity rate: ");
double rate = input.nextDouble();
double gratuity = subtotal * (rate / 100);
double total = subtotal + gratuity;
System.out.println("Gratuity: #" + gratuity);
System.out.println("Total: #" + total);
    }
}
