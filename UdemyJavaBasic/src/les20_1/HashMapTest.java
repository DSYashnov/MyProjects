package les20_1;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(777, "Yashnov Stanislav");
        map.put(778, "Yashnova Anastsiya");
        map.put(779, "Yashnov Msksim");
        map.put(780, "Yashnov Jora");
        map.put(781, "Roberto Carlos");
        map.remove(781);
        System.out.println("map = " + map);
    }
}
