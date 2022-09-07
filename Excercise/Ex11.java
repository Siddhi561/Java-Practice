//Write a program in Java to display the n terms of odd natural number and their sum.
import java.util.Scanner;

 class Exercise
 {
   public static void main(String args[])
   { 
    Scanner s = new Scanner(System.in);
    System.out.println("Enter n of Odd terms you want to print: ");
    int num = s.nextInt();
    int sum = 0;
    System.out.println("\n");
    System.out.println("These are n number of odd terms:");
    for(int i=1; i<=num;i++)
    { 
      System.out.println(2*i-1);
      sum+=2*i-1;  
   }
    System.out.println("\nSum of n Odd terms are: "+sum);
   }
 }
