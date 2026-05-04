import java.util.Scanner;
public class TaskOne{
    public static void main(String [] args){
    Scanner inputCollector = new Scanner(System.in);
     int[] array = new int [10];
      for (int count = 0; count < 10; count++){
       System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();
        array[count]= number;
        }
        for(int out = 0; out < array.length; out++){
 System.out.print(array[out] + ": ");
     }
    }        
}

