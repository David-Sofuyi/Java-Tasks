import java.util.Scanner;
public class Task26{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("What is your name?");
String userInput = input.nextLine();
System.out.printf("Hello %s %n", userInput);
System.out.println("How old are you?");
int ageInput= input.nextInt();
System.out.printf("I am %s and i am %d years old%n", userInput , ageInput);
    }
}
