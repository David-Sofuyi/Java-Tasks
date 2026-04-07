import java.util.Scanner;
public class ClosestToZero {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter two integers: ");
int a = input.nextInt();
int b = input.nextInt();
int absA = Math.abs(a);
int absB = Math.abs(b);
if (absA < absB) {
System.out.println(a + " is closer to zero");
}
else if (absB < absA){
System.out.println(b + " is closer to zero");
} 
else {
System.out.println("Both are equally close to zero");
}
}
}
