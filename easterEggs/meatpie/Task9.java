import java.util.Scanner;
public class Task9 {
public static void main (String [] args){
Scanner colorCollector = new Scanner(System.in);
System.out.print("What is your favourite colour?");
String color = colorCollector.nextLine();
System.out.printf("you just said your favourite color is %s %n\n%n" ,color);
}
}
