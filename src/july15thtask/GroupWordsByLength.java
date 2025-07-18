package july15thtask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupWordsByLength {

    public static void main(String[] args) {
        String[] input = {"Java", "is", "fun", "cool", "Hi"};
        HashMap<Integer, List<String>> map = new HashMap<>();
        for (String s : input) {
//      can also use       map.put(s.length(), map.getOrDefault(s.length(), new ArrayList<>()));
            map.putIfAbsent(s.length(), new ArrayList<>());
            map.get(s.length()).add(s);
        }
        System.out.println(map);
    }
}
