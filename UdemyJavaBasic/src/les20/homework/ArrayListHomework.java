package les20.homework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListHomework {
    public static ArrayList abc(String... a) {
        ArrayList<String> list = new ArrayList<>();
            for(String s : a){
                if(!list.contains(s)){
                    list.add(s);

            }
        }
        Collections.sort(list);
        System.out.println(list);
        return list;
    }
        public static void main (String[]args){
            abc("a", "c", "r", "b", "a", "b", "r", "b", "a", "b");
        }
    }
