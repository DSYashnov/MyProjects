public class Hw19 {
    public static String[] abc (String ... a){
       String [] s = new String [a.length];
       for (int i = 0; i < a.length; i++){
           s[i] = a[i];
       }
        for (String b : s){
            System.out.print(b + ", ");
        }
        System.out.println();
        return s;
    }
    public static void main(String[] args) {
        abc("Hello", "Hello", "bye");
        abc(null, null, null);
        }
    }