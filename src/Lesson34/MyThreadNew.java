package Lesson34;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyThreadNew implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        int randomNumber = random.nextInt(50) + 1;
        return randomNumber;
    }
}
