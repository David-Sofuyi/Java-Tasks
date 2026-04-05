import java.util.Scanner;
public class AreaOfHexagon{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the side length: ");
double s = input.nextDouble();
double area = (3 * Math.sqrt(3) / 2) * s * s;
System.out.println("Area of the hexagon: " + area);
}
}
