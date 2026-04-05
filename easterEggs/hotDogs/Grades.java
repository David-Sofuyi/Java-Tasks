import java.util.Scanner;
public class Grades{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter your score:");
int score = input.nextInt();
if(score >= 90 && score <= 100){
System.out.println("Grade A%n");
}
else if( score >= 80 && score <= 89){
System.out.println("Grade B%n");
}
else if( score >=70 && score <= 79){
System.out.println("Grade C%n");
}
else if( score >= 60 && score <= 69){
System.out.println("Grade D%n");
}
else if( score <= 60){
System.out.printf("Grade F%n");
    }
}
}
