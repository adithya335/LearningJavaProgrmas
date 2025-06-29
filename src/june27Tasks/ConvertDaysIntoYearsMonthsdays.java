package june27Tasks;

import java.util.Scanner;

public class ConvertDaysIntoYearsMonthsdays {

    public static void main(String[] args) {
        System.out.println("Enter days to convert into days years months");
        int days = new Scanner(System.in).nextInt();
        int years = 0;
        int months = 0;
        if (days > 365){
            years=days/365;
            days=days%365;
        }
        if(days>30){
            months=days/30;
            days=days%30;
        }

        System.out.printf("Years: %d, months: %d, days: %d",years,months,days);
    }
}
