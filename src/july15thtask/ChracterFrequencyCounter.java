package july15thtask;

import java.util.HashMap;

public class ChracterFrequencyCounter {

    public static void main(String[] args) {
        String string = "aabbccddeeff";
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : string.split("")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        System.out.println(map);
    }
}
