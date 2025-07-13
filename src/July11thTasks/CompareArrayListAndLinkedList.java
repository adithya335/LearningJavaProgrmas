package July11thTasks;

import java.util.ArrayList;
import java.util.LinkedList;

public class CompareArrayListAndLinkedList {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();

        long startTime=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            al.add(i);
        }
        long endTime=System.currentTimeMillis();
        System.out.printf("Time taken= %d%n",endTime-startTime);

        startTime=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            ll.add(i);
        }
        endTime=System.currentTimeMillis();
        System.out.printf("Time taken= %d%n",endTime-startTime);
    }
}
