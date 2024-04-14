package les16.homework;

public class Hw16 {
    public void test (String mail){
        int a = 0;
        int b = 0;
        int c = 0;

        while (c < mail.length() - 1){
            a = mail.indexOf('@', c);
            b = mail.indexOf('.', c);
            c = mail.indexOf(';', c + 1);
            System.out.println(mail.substring(a + 1, b));
        }
    }
    public static void main(String[] args) {
        Hw16 hw16 = new Hw16();
        hw16.test("yashnov@mail.ru;  on@yahoo.com;  on@gmail.com;");
    }
}
