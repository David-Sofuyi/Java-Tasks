import java.util.Scanner;
public class PerfectSquare {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a positive integer: ");
int num = input.nextInt();
int sqrt = (int) Math.sqrt(num);
if (sqrt * sqrt == num) {
System.out.println("Perfect square");
}
else {
System.out.println("Not a perfect square");
}
}
}
