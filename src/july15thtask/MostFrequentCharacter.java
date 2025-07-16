package july15thtask;

import java.util.HashMap;

public class MostFrequentCharacter {

    public static void main(String[] args) {
        String string = "aaaabbbcc";
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : string.split("")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int max = 0;
        for (int v : map.values()) {
            max = Math.max(max, v);
        }
        System.out.println(max);
    }
}
