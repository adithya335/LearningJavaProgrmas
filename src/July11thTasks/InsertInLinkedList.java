package July11thTasks;

import java.util.LinkedList;
import java.util.List;

public class InsertInLinkedList {

    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>(List.of("Apple", "Banana", "Mango"));
        System.out.println(ll);
        ll.add(1,"Orange");
        System.out.println(ll);
    }
}
