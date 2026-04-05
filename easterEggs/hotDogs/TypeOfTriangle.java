import java.util.Scanner;
public class TypeOfTriangle{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter side 1:");
double a = input.nextDouble();
System.out.print("Enter side 2:");
double b = input.nextDouble();
System.out.print("Enter side 3:");
double c = input.nextDouble();
if(a == b && b == c){
System.out.printf("The triangle is EQUILATERAL.%n");
}
if(a == b && b != c){
System.out.printf("The triangle is ISOSCELES.%n");
}
if(a != b && b != c && a != c){
System.out.printf("The triangle is SCALENE.%n");
    }
}
}
