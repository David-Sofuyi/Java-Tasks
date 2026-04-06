import java.util.Scanner;
public class Lottery{
public static void main (String[] args) {
Scanner userInput = new Scanner(System.in);
System.out.println("Enter your first one digit number");
int pOne = userInput.nextInt();
int rOne = (int)(Math.random() * 10) + 1;
System.out.println("Enter your second one digit number");
int pTwo = userInput.nextInt();
int rTwo = (int)(Math.random() * 10) + 1;
if(rOne == pOne && rTwo == pTwo) {
System.out.printf("Lottery number: %d%d  player number: %d%d %n Congratulations you have won $10,000 %n",rOne,rTwo, pOne,pTwo);
} else if(rOne == pOne || rOne == pTwo || rTwo == pOne || rTwo == pTwo) {
System.out.printf("Lottery number: %d%d  player number: %d%d %n Congratulations you have won $1,000 %n",rOne,rTwo, pOne,pTwo);        
} else if(rOne != pOne || rOne != pTwo || rTwo != pOne || rTwo != pTwo) {
System.out.printf("Your lost %n");        
}
}
}
