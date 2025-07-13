package July11thTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindElement {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(List.of("Mumbai", "Delhi", "Pune"));
        System.out.println("Enter a city");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(al.contains(input)){
            System.out.printf("%s is in the list",input);
        }
        else{
            System.out.println("not found in list");
        }
        scanner.close();

    }
}
