package les28.homework;

public class Homework {

}

class NeMyasoException extends RuntimeException {
    NeMyasoException(String msg) {
        super(msg);
    }
}

class NeVodaException extends Exception {
    NeVodaException(String msg) {
        super(msg);
    }
}

class Tiger {
    void eat(String s) {
        String s1 = "myaso";
        if (!s.equals(s1)) {
            throw new NeMyasoException("Tiger no eat " + s);
        }
            System.out.println("Tiger eat meat");
        }


    void drink(String s) throws Exception {
        String s1 = "voda";
        if (!s.equals(s1)) {
            throw new NeVodaException("Tiger is not drink " + s);
        }
            System.out.println("Tiger drinking water");
    }
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("myaso");
        try {
            tiger.drink("voda");
            try {
                tiger.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            }finally {
                    System.out.println("this is inner finally block");
                }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
