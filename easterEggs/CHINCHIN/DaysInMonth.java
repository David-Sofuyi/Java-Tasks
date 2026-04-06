import java.util.Scanner;
public class DaysInMonth {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int month = sc.nextInt(), year = sc.nextInt();
boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
int days = switch (month) {
case 1,3,5,7,8,10,12 -> 31;
case 4,6,9,11 -> 30;
case 2 -> leap ? 29 : 28;
default -> -1;
};
System.out.println(days == -1 ? "Invalid month" : days);
}
}
