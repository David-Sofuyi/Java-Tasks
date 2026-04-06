import java.util.Scanner;
public class ScissorsRockPaper {
public static void main (String[] args) {
int user = new Scanner(System.in).nextInt();
int comp = (int)(Math.random()*3);
if (user == comp);{
System.out.println("Draw");
}
if (user==0 && comp==2);{
System.out.println("You win");
}
if (user==1 && comp==0);{
System.out.println("You lose");
}
if (user==2 && comp==1){
System.out.println("You win");
}
}
}
