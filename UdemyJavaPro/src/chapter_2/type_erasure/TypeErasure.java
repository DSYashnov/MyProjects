package chapter_2.type_erasure;



public class TypeErasure {
        public static void main(String[] args) {
//            Info<String> info = new Info<String>("Hello World");
//            System.out.println(info);
//            String s = info.getValue();
//
//            Info<Integer> info2 = new Info<>(18);
//            System.out.println(info2);
//            Integer i = info2.getValue();
        }
//        public void abc(Info<String> info){
//            String s = info.getValue();
//        }
//        public void abc(Info<Integer> info){
//            Integer i = info.getValue();
//        }
    }
    class Info<T>{
        private T value;
        public Info(T value) {
            this.value = value;
        }
        public String toString() {
            return "{[" + value + "]}";
        }

        public T getValue() {
            return value;
        }
    }
class Parent{
    public void abc(Info<String> info){
        String s = info.getValue();
    }
}
class Child extends Parent{
    public void abc(Info<String> info){
        String s = info.getValue();
    }
}