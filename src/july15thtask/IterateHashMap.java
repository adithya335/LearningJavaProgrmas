package july15thtask;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Name", "Dipak");
        map.put("Role", "Tester");
        map.put("Level", "Senior");

        for(Map.Entry<String,String> e :map.entrySet()){
            System.out.println( e.getKey()+"___"+e.getValue());
        }

        for(String s: map.keySet()){
            System.out.println(s+"___"+map.get(s));
        }

        Iterator<String > iterator=map.keySet().iterator();
        while(iterator.hasNext()){
            String key=iterator.next();
            System.out.println(key+"____"+map.get(key));
        }
    }

}
