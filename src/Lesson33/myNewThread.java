package Lesson33;

import java.util.Random;

public class myNewThread implements Runnable{

    @Override
    public void run() {
        int i =1;

        while (true) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
            i++;
            if (i > 10) {
                i = 1;
            }
        }
    }
}
