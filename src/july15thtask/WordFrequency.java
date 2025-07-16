package july15thtask;

import java.util.HashMap;

public class WordFrequency {

    public static void main(String[] args) {
        String input = "java is easy and java is powerful";
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : input.split(" ")) {
           map.put(s,map.getOrDefault(s,0)+1);
        }
        System.out.println(map);
    }
}
