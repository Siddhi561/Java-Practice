//Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.

import java.util.Scanner;


 class Exercise
 {
   public static String getDayName(int day){
     String dayName;
     switch(day){
      case 1:dayName=("Sunday");
      break;
      case 2:dayName=("Monday");
      break;
      case 3:dayName=("Tuesday");
      break;
      case 4:dayName=("Wednesday");
      break;
      case 5:dayName=("Thursday");
      break;
      case 6:dayName=("Friday");
      break;
      case 7:dayName=("Saturday");
      break;
      default:dayName=("Invaild Choice");
     }
     return dayName;
   }
   public static void main(String args[])
   { 
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any number between 1 and 7 = ");
    int day = s.nextInt();
    System.out.print(getDayName(day));
    
   }
 }
