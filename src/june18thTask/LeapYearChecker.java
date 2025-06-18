package june18thTask;

import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        System.out.println("Enter a year to check for leap year");
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Year "+year+" is a leap year");
                }
                else{
                    System.out.println("Year "+year+" is not a leap year");
                }
                return;
            }
            System.out.println("Year "+year+" is a leap year");

        }
        else{
            System.out.println("Year "+year+" is not a leap year");
        }
    }
}
