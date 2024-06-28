package chapter_6.streams.parallelStream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamExample {

    //1 2 3 4 5 6.....1000000000
    // 1 250.000000
    // 2 250.000001 500.000000
    // 3 500.000000 750.000000
    // 4 750.000000 10000000000
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

//        double sumResult = list.parallelStream()
//                .reduce((a, e) -> a+e).get();
//        System.out.println("sumResult: " + sumResult);

                double divisionResult = list.parallelStream()
                .reduce((a, e) -> a/e).get();
        System.out.println("sumResult: " + divisionResult);
    }
}

