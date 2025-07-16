package july15thtask;

import java.util.HashMap;

public class FilterStudentsStartingWithA {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Anjali");
        map.put(102, "Dipak");
        map.put(103, "Aman");
        map.put(104, "Ravi");

        map.forEach((k, v) -> {
            if (v.startsWith("A")) {
                System.out.println(v);
            }


        });
    }
}
