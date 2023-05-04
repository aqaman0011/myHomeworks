package Lesson34;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {

        int numberOfThread = 10;

        ExecutorService executor = Executors.newFixedThreadPool(numberOfThread);

        Callable<Integer> callable = new MyThreadNew();

        for (int i = 0; i < numberOfThread; i++) {

            Future<Integer> future = executor.submit(callable);
            System.out.println(future.get());
        }

        executor.shutdown();

    }
}
