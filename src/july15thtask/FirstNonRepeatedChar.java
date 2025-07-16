package july15thtask;

import java.util.HashMap;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {
        String string = "aabbccdeeff";
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : string.split("")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for(String s: map.keySet()){
            if(map.get(s)==1){
                System.out.println(s);
            }
        }
    }
}
