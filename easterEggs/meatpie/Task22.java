import java.util.Scanner; 
public class Task22 {
public static void main (String[] args) {
Scanner valueCollector = new Scanner(System.in);
System.out.println("What's your radius?");
double radius = valueCollector.nextInt();  
System.out.println(3.142 * radius * radius);   
 }
}
