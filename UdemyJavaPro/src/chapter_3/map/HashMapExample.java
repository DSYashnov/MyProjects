package chapter_3.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(12312, "Stanislav");
        map.put(456789, "Mary");
        map.put(789, "John");
        map.put(64343, "Jacob");
        map.put(null, "Oleg");
        map.putIfAbsent(12312, "Oleg");
        System.out.println(map);
        System.out.println(map.get(12312));
        //map.remove(12312);
        //System.out.println(map);
        System.out.println(map.containsValue("Stanislav"));
        System.out.println(map.containsKey(12312));
        System.out.println(map.keySet());
        System.out.println(map.values());


        Map<String, String> map1 = new HashMap<>();
        map1.put("Sasha", "Pidor");
        map1.put("Masha", "Mary");
        System.out.println(map1);

        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);
    }
}
