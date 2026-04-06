import java.util.Scanner;
public class FlipCoin {
public static void main (String[] args) {
Scanner userInput = new Scanner(System.in);
System.out.println("Pick a number between 0 (head) and 1 (tail) to flip the coin");
int guess = new Scanner(System.in).nextInt();
int flip = (int)(Math.random()*2);
System.out.println(guess == flip ? "Correct" : "Wrong");
}
}
