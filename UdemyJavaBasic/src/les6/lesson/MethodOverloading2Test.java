package les6.lesson;

class MethodOverloading2Test {
    public static void main(String[] args) {
        MethodOverloading2 mO2 = new MethodOverloading2();
        int a = mO2.sum(5, 7);
        System.out.println(a);
        String s = mO2.sum("Privet,", " moy drug");
        System.out.println(s);
    }
}
