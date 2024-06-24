package chapter_7.threadMethods.callableANDfuture;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialCalc factorialCalc = new FactorialCalc(5);
        Future<Integer> future = executorService.submit(factorialCalc);
        try {
            factorialResult = future.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}

class FactorialCalc implements Callable<Integer> {
    int f;
    public FactorialCalc(int f) {
        this.f = f;
    }
    @Override
    public Integer call() throws Exception {
        if (f<=0){
            throw new Exception("You need to enter a positive number");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }
}