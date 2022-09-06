//Take three numbers from the user and print the greatest number. 
import java.util.Scanner;

 class Exercise
 {
   public static void main(String args[])
   { 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter any three numbers: ");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    
    int r =(a>b)?(a>c?a:c):(a>b?b:c);
    System.out.println("Greatest number among these three numbers is "+r);
   }
 }
