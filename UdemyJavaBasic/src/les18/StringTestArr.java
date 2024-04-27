package les18;

import org.w3c.dom.ls.LSOutput;

public class StringTestArr {
    public static void main(String[] args) {
        char [] array = {'p', 'r', 'i', 'v', 'e', 't'};
        String str = new String(array);
        System.out.println(str);

        StringBuilder sb = new StringBuilder("Hello World");
        sb.append(array, 2, 3);
        System.out.println(sb);


        StringBuilder sb2 = new StringBuilder("Hello World");
        sb2.insert(2, array, 1, 3);
        System.out.println(sb2);
    }

}
