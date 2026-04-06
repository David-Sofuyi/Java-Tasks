import java.util.Scanner;
public class PerimeterOfRectangle {
public static void main (String[] args) {
double a = new Scanner(System.in).nextDouble();
double b = new Scanner(System.in).nextDouble();
if (a != b) System.out.println(2*(a+b));
else System.out.println("Invalid");
}
}
