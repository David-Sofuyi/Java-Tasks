import java.util.Scanner;
public class TaskOne{
    public static void main(String[] args){
                Scanner inputCollector = new Scanner(System.in);
                int totalSum= 0;
                
                for (int count = 1; count <= 10; count++){
                System.out.print( "Enter your score" + count + ":");
                int sum = inputCollector.nextInt();
                totalSum+=sum;
                }
                System.out.println("your total score is " + totalSum);
 }
}
