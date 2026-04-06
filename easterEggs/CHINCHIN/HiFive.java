import java.util.Scanner;
public class HiFive {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int n = new Scanner(System.in).nextInt();
if (n % 5 == 0) System.out.println("HiFive");
if (n % 2 == 0) System.out.println("HiEven");
}
}
