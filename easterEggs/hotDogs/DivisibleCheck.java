import java.util.Scanner;
public class DivisibleCheck{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter an integer :");
int num = input.nextInt();
if (num % 2 == 0) {
System.out.println(num + " is divisible by 2");
}
else {
System.out.println(num + " is not divisible by 2");
}

if (num % 3 == 0) {
System.out.println(num + " is divisible by 3");
}
else {
System.out.println(num + " is not divisible by 3");
}

if (num % 5 == 0) {
System.out.println(num + " is divisible by 5");
}
else {
System.out.println(num + " is not divisible by 5");
}

if (num % 7 == 0) {
System.out.println(num + " is divisible by 7");
}
else {
System.out.println(num + " is not divisible by 7");

  }
}
}
