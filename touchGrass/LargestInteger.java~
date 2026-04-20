import java.util.Scanner;
public class LargestInteger{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        
        int largestNum = 0;
        int frequency = 0;
        
        System.out.print("Enter a value: ");
        int number = inputCollector.nextInt();
        
        int counter = 0;
        while(counter <= number){
            if(number >= largestNum){
                largestNum = number;
                frequency = frequency + 1;
            }
            }
            counter++;
            
            System.out.print("Enter a value: ");
            number = inputCollector.nextInt();
            
            if(number == 0){
            System.out.printf("The largest number is %d and it occurs %d times", largestNum, frequency);
                break;
            }            
        }
    }
}
