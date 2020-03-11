package chapter3;

import java.util.Scanner;

public class IfStatements
{public static void main(System args[])


{


    //Initialise known values
    int weeklyPayment = 1000;
    int quota = 10;
    int bonus  = 250;

System.out.println("How many sales did you make this week");
    Scanner scanner = new Scanner(System.in);
    int noOfSales = scanner.nextInt();
    scanner.close();
    if (noOfSales>quota) {
        weeklyPayment = weeklyPayment+bonus;
    }
System.out.println("The employee's pay is £"+ weeklyPayment);
}
}
