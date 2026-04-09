import java.util.Scanner;
public class PrintUserNeg {
        public static void main (String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter your number!");
        int userInput = inputCollector.nextInt();
        for (int i = 1; i <=userInput; i--) System.out.println(i+userInput);
 }
}
