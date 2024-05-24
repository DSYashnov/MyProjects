package chapter_2.parameterized_class;

public class ParameterizedClass1 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("Hello", 20);
        System.out.println("Value double: first = " + pair.getFirstValue() +
                ", second = " + pair.getSecondValue());
        Pair<Integer, Double> pair1 = new Pair<Integer, Double>(156, 3.14);
        System.out.println("Value double: first = " + pair1.getFirstValue() +
                ", second = " + pair1.getSecondValue());
        OtherPair<String> otherPair = new OtherPair<String>("Hello", "World");
        System.out.println(otherPair.getFirstValue() + " " + otherPair.getSecondValue());
    }
}
class Pair<V1, V2>{
    private V1 first;
    private V2 second;

    public Pair(V1 first, V2 second) {
        this.first = first;
        this.second = second;
    }

    public V1 getFirstValue(){
        return first;
    }
    public V2 getSecondValue(){
        return second;
    }
}
class OtherPair<V>{
    private V first;
    private V second;

    public <V> V abc(V val){
        return val;
    }

    public OtherPair(V first, V second) {
        this.first = first;
        this.second = second;
    }

    public V getFirstValue(){
        return first;
    }
    public V getSecondValue(){
        return second;
    }
}
