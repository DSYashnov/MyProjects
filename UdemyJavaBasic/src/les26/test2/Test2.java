package les26.test2;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        int a = list.get(0);
        System.out.println(a);

//        Number b;
//        int c = b;
//        switch (b){
//
//        }
//        System.out.println(b);
        String s1 = "50";
        String s2 = "true";
        String s3 = "3.14";
        Boolean b1 = Boolean.parseBoolean(s2);
        int i1 = Integer.parseInt(s1);
        double d1 = Double.parseDouble(s3);
        System.out.println(s3);
        System.out.println(b1);
        Integer i3 = Integer.valueOf(10);
        Double d3 = Double.valueOf(s3);
        Byte b3 = Byte.valueOf((byte) 10);
        Integer i4 = Integer.valueOf(10);
        System.out.println(b3.equals(i4));
    }
}
