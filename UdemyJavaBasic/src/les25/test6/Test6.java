package les25.test6;

public class Test6 {
    public static void main(String[] args) {
//        byte b = 10;
//        int a = b;
//        System.out.println(7);
//        int i1 = 3;
//        short s1 = (short) i1;
//        byte b2 = 3;
//        short s2 = -6;
//        char c1 = 100;
//        long l1 = 1;
//        int i2 = (int)l1;
//        int i10 = 111111;
//        short s10 = (short)i10;
//        System.out.println(s10);
//
//        char c10 = (char)-8;
//        System.out.println(c10);
//        int i = Integer.MAX_VALUE;
//        System.out.println(i+1);

        int i = 5;
        long l = 10;
        i*=l;
        System.out.println(i+l);

        float f = 3.14f;
        int i2 = 10;
        System.out.println(f + i2);

        byte b = 3;
        short s = 10;
        char c = 5;
        System.out.println(b+s+c);
        System.out.println(b++);

        byte b2 = 10;
        float f2 = 7;
        double d2 = 2.0;
        double i5 = b2 + f2 - d2;
        System.out.println(b2+f2- d2);

        double d10 = 3.14;
        float f10 = 6.28f;

        float f11 = 0 * 1.5f;
        float f12 = 0 * (float) 1.5;

    }
}
