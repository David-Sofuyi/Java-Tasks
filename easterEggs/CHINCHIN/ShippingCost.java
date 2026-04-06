import java.util.Scanner;
public class ShippingCost {
public static void main (String[] args) {
double s = new Scanner(System.in).nextDouble();
if (s <= 2) System.out.println(2.5);
else if (s <= 4) System.out.println(4.5);
else if (s <= 10) System.out.println(7.5);
else if (s <= 20) System.out.println(10.5);
else System.out.println("Cannot be shipped");
}
}
