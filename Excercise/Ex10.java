//Write a program in Java to display the multiplication table of a given integer.
import java.util.Scanner;

 class Exercise
 {
   public static void main(String args[])
   { 
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number of which you want table: ");
    int t= s.nextInt();
    System.out.println("\nEnter the number of terms: ");
    int n = s.nextInt();
    for(int i=1;i<=n;i++)
    {
      System.out.println(t+" X "+i+" = "+t*i);
    }
    
   }
 }
