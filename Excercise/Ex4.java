//Write a Java program to find the number of days in a month.
import java.util.Scanner;

 class Exercise
 {
   public static void main(String args[])
   { 
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a month number: ");
    int Month = s.nextInt();
    System.out.println("Enter a Year: ");
    int Year = s.nextInt();
    int Number_ofdays=0;
    String MonthName="";
    switch(Month){
      case 1 : 
        MonthName="Janurary";
        Number_ofdays=31;
        break;
      case 2 : 
        MonthName="Feburary";
        if((Year%400==0)||((Year%4==0)&&(Year%100!=0))){
          Number_ofdays=28;
        }
        else
        {
          Number_ofdays=29;
        }
        break;
       case 3: 
        MonthName="March";
        Number_ofdays=31;
        break;
       case 4 : 
        MonthName="April";
        Number_ofdays=30;
        break;
       case 5 : 
        MonthName="May";
        Number_ofdays=31;
        break;
       case 6 : 
        MonthName="June";
        Number_ofdays=30;
        break;
       case 7 : 
        MonthName="July";
        Number_ofdays=31;
        break;
       case 8 : 
        MonthName="August";
        Number_ofdays=31;
        break;
       case 9 : 
        MonthName="September";
        Number_ofdays=30;
        break;
       case 10 : 
        MonthName="October";
        Number_ofdays=31;
        break;
       case 11 : 
        MonthName="November";
        Number_ofdays=30;
        break;
       case 12: 
        MonthName="December";
        Number_ofdays=31;
        break;
       default: System.out.println("Invalid Case");
    }
    System.out.println(MonthName+" "+Year+" "+"has "+Number_ofdays+" days.");
   }
 }
