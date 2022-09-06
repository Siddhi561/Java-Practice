//Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.Scanner;

 class Exercise
 {
   public static void main(String args[])
   { 
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any number: ");
    int a = s.nextInt();
    if(a>0){
      System.out.println("Positive Number");
     }
     else if(a<0){
     System.out.println("Negative Number");
     }
     else{
     System.out.println("Number is zero");
     }
   }
 }
