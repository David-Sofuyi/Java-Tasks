import java.util.Scanner;
public class SumOfFirstAndLast {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a 5-digit number: ");
int num = input.nextInt();
int lastDigit = num % 10;
int firstDigit = num / 10000;
int sum = firstDigit + lastDigit;
System.out.println("Sum: " + sum);
}
}
