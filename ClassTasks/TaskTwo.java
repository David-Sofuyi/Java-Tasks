import java.util.Scanner;
public class TaskTwo{
    public static void main(String [] args){
    Scanner inputCollector = new Scanner(System.in);
     int[] array = new int [10];
      for (int count = 0; count < 10; count++){
       System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();
        array[count]= number;
        }
        for(int out = 0; out < array.length; out++){
 // System.out.println(array[out] + " ");
       int value = array [out];
       System.out.print(value + " ");
     }
    }        
}
   
      //   for (int row = 0; row <= 10; row++);{
        
      //   int value = array [out];
      //   System.out.print(value + " ");
      // }
