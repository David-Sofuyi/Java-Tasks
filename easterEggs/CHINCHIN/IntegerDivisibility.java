import java.util.Scanner;
public class IntegerDivisibility {
public static void main (String[] args) {
int a = new Scanner(System.in).nextInt();
System.out.println(a%4==0 && a%5==0);
System.out.println(a%4==0 || a%5==0);
System.out.println((a%4==0) ^ (a%5==0));
}
}
