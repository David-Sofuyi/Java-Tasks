import java.util.Scanner;
public class AreaVolumeOfCylinder {
public static void main (String[] args) {
double r=new Scanner(System.in).nextDouble();
double h=new Scanner(System.in).nextDouble();
System.out.println("Area="+2*Math.PI*r*(r+h));
System.out.println("Volume="+Math.PI*r*r*h);
}
}
