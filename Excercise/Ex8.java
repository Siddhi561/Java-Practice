//Write a program in Java to display n terms of natural numbers and their sum.
import java.util.Scanner;

 class Exercise
 {
   public static void main(String args[])
   { 
    System.out.println("Enter number:  ");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    System.out.println("\nThe first n natural terms are: "+num);
    int sum=0;
    for(int i=1;i<=num;i++)
    {
      System.out.println(i);
      sum+=i;
    }
    System.out.println("\nSum of n Natural Numbers are:"+sum);
   }
 }
