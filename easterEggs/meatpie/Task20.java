import java.util.Scanner; 
public class Task20 {
public static void main (String[] args) {
Scanner valueCollector = new Scanner(System.in);
System.out.println("What's your length?");
int length = valueCollector.nextInt();    
System.out.println("What's your width?");
int width = valueCollector.nextInt();
int area = length * width;
System.out.printf("The area of your length:%d and the width:%d is %d %n%n", length,width,area);                   
 }
}
