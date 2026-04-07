import java.util.Scanner;
public class TimeAddition {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter first time (HH MM): ");
int h1 = input.nextInt();
int m1 = input.nextInt();
System.out.print("Enter second time (HH MM): ");
int h2 = input.nextInt();
int m2 = input.nextInt();
int totalMinutes = m1 + m2;
int totalHours = h1 + h2 + (totalMinutes / 60);
totalMinutes = totalMinutes % 60;
System.out.println("Total time: " + totalHours + ":" + totalMinutes);
}
}
