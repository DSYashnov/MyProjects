package les2;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte a1 = 12;
        byte a2 = 0b1100;
        byte a3 = 014;
        byte a4 = 0xC;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        short b1 = 1300;
        short b2 = 0b010100010100;
        short b3 = 0x514;
        short b4 = 02424;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        int c1 = 0;
        int c2 = 0b0;
        int c3 = 00;
        int c4 = 0x0;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        long d1 = 123456789;
        long d2 = 0b0111010110111100110100010101;
        long d3 = 0726746425;
        long d4 = 0x75BCD15;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);

        float e1 = 23.5F;
        float e2 = 23.5f;
        System.out.println(e1);
        System.out.println(e2);

        double f1 = 25.5D;
        double f2 = 25.5d;
        System.out.println(f1);
        System.out.println(f2);

        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1);
        System.out.println(bool2);
    }
}
