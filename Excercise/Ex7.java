//Write a Java program that takes a year from user and print whether that year is a leap year or not.
import java.util.Scanner;

 class Exercise
 {
   public static void main(String args[])
   { 
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any year: ");
    int Year = s.nextInt();
    if((Year%400==0)||((Year%4==0)&&(Year%100!=0)))
    {
      System.out.println(Year+" is a leap year.");
    }
    else
    {
      System.out.println("\n"+Year+" is not a leap year.");
    }
   }
 }
