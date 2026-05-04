// write a program that simulate the catching of a thief.
// hint the program ends when the user input thief
import java.util.Scanner;
public class ThiefCatcher{
    public static void main(String[] args){
        
        while(true){
        String stopWord = "thief";
        Scanner inputCollector = new Scanner(System.in);
        //System.out.println("Enter thief to stop ");
        String stopPhrase = inputCollector.nextLine().toLowerCase();
        
        if(stopPhrase.replaceAll(" ", "").equals(stopWord)) break;
        System.out.println("WARNING!!!");
        }
    }
}


