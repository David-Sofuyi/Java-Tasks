import java.util.Scanner;
public class DigitComparison {
public static void main (String[] args) {
int n = new Scanner(System.in).nextInt();
int tens = n/10;
int units = n%10;
if(tens>units){
System.out.println("Tens greater");
}
else if(tens<units){
System.out.println("Units greater");
}
else {
System.out.println("Equal");
}
}
}
