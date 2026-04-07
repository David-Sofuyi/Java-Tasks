import java.util.Scanner;
public class DayOfWeek {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a day : ");
int day = input.nextInt();
if (day == 0) {
System.out.println("Monday");
}
else if (day == 1) {
System.out.println("Tuesday");
}
else if (day == 2) {
System.out.println("wednesday");
}
else if (day == 3) {
System.out.println("Thursday");
}
else if (day == 4) {
System.out.println("Friday");
}
else if (day == 5) {
System.out.println("saturday");
}
else if (day == 6) {
System.out.println("Sunday");
}
else {
System.out.println("Invalid day number");
}
}
}
