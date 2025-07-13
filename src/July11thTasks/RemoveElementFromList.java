package July11thTasks;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementFromList {

    public static void main(String[] args) {
        ArrayList<String > list=new ArrayList<>(List.of("Amit", "Neha", "Suresh"));
        list.remove("Neha");
        list.forEach(e-> System.out.println(e));
    }
}
