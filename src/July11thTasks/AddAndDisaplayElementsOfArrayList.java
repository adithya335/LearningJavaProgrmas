package July11thTasks;

import java.util.ArrayList;
import java.util.List;

public class AddAndDisaplayElementsOfArrayList {

    public static void main(String[] args) {
        ArrayList<String > list=new ArrayList<>(List.of("Dipak", "Ravi", "Sneha", "Priya", "Anjali"));
        list.forEach(e-> System.out.println(e));
    }
}
