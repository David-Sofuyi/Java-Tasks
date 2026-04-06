import java.util.Scanner;
public class Temprature {
public static void main (String[] args) {
int t = new Scanner(System.in).nextInt();
if(t<0){
System.out.println("Freezing");
}
else if(t<=15){
System.out.println("Cold");
}
else if(t<=25){
System.out.println("Warm");
}
else{
System.out.println("Hot");
}
}
}
