package june25thTask;

import java.util.Scanner;

public class ElectricityBillCalculation {

    public static void main(String[] args) {
        System.out.println("Enter the number of units");
        int units = new Scanner(System.in).nextInt();
        double cost = 0;
        int loop = 0;
        while (units > 0) {
            if (loop == 0) {
                cost += (100 * 0.5);
                units -= 100;
                loop++;
                continue;
            }
            if (loop == 1) {
                cost += (100 * 0.75);
                units -= 100;
                loop++;
                continue;
            }
            if (loop == 2) {
                cost += (100 * 1.2);
                units -= 100;
                loop++;
                continue;
            }
            if (loop == 3) {
                cost += (units * 1.5);
                break;
            }
        }
        System.out.println(cost);
    }
}
