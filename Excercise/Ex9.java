//Write a program in Java to display the cube of the number upto given an integer.
import java.util.Scanner;

 class Exercise
 {
   public static void main(String args[])
   { 
    System.out.println("Enter any Interger:");
    Scanner s = new Scanner(System.in);
    int num=s.nextInt();
    for(int i=1;i<=num;i++)
    {
      System.out.println("\nNumber: "+i+"| The cube of Number "+i+" is "+i*i*i);
    }
   }
 }
