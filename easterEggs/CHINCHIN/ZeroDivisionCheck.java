import java.util.Scanner;
public class ZeroDivisionCheck {
public static void main (String[] args) {
double s = new Scanner(System.in).nextDouble();
double d = new Scanner(System.in).nextDouble();
if(d==0){
System.out.println("Error");
}
else { 
System.out.println((double)s/d);
}
}
}
