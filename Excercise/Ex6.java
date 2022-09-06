//Write a program in Java to input 5 numbers from keyboard and find their sum and average.
import java.util.Scanner;

 class Exercise
 {
   public static void main(String args[])
   { 
   
    System.out.println("Enter any 5 Numbers: ");
    int sum=0;
    int n=0;
   for(int i=0;i<5;i++)
  { Scanner s = new Scanner(System.in);
    n = s.nextInt();
    
    sum+=n;
    }
    double avg = sum/5;
    System.out.println("Sum = "+sum+" Avg= "+avg);
  
   }
 }
