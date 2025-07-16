package july15thtask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupWordsByLength {

    public static void main(String[] args) {
        String[] input = {"Java", "is", "fun", "cool", "Hi"};
        List<String> two = new ArrayList<>();
        List<String> three = new ArrayList<>();
        List<String> four = new ArrayList<>();
        HashMap<Integer, List<String>> map = new HashMap<>();
        for (String s : input) {
            if (s.length() == 2) {
                two.add(s);
                map.put(s.length(), two);
            }
            if (s.length() == 3) {
                three.add(s);
                map.put(s.length(), three);
            }
            if (s.length() == 4) {
                four.add(s);
                map.put(s.length(), four);
            }
        }
        System.out.println(map);
    }
}
