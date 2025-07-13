package July11thTasks;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ReversedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        System.out.println(ll);
       ll.sort(Comparator.reverseOrder());
        System.out.println(ll);
    }
}
