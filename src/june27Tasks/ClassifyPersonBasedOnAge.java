package june27Tasks;

import java.util.Scanner;

public class ClassifyPersonBasedOnAge {

    public static void main(String[] args) {
        int age = new Scanner(System.in).nextInt();

        if (age > 64) {
            System.out.println("Senior citizen");
            return;
        }
        if (age > 19) {
            System.out.println("adult");
            return;
        }
        if (age > 12) {
            System.out.println("Teenager");
            return;
        }
        if(age>0){
            System.out.println("Child");
        }

    }
}
