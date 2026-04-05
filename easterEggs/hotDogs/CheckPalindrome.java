import java.util.Scanner;
public class CheckPalindrome{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a three-digit integer :");
int num = input.nextInt();
double price1 = input.nextDouble();
System.out.print("Enter weight of 2nd package :");
double weight2 = input.nextDouble();
System.out.print("Enter price of 2nd package:");
double price2 = input.nextDouble();
if (num < 100 && num > 999){
System.out.print("Invalid:");
else if ("firstDigit == lastDigit"){ 
int firstDigit = num / 100 ;
int lastDigit = num % 10;
System.out.println(number + "is a palindrome.");
else if(firstDigit != lastDigit){ 
int firstDigit = num / 100 ;
int lastDigit = num % 10;
System.out.println(number + "is not a palindrome.");
}
}
}
