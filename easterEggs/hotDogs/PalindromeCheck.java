import java.util.Scanner;
public class PalindromeCheck {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a three-digit integer: ");
int number = input.nextInt();
number = Math.abs(number);
if (number < 100 || number > 999) {
System.out.println("Invalid input.");
}
else {
int first = number / 100;
int last = number % 10;
if (first == last) {
System.out.println(number + " is a palindrome.");
}
else {
System.out.println(number + " is not a palindrome.");
            }
        }
    }
}
