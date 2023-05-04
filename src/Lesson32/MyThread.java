package Lesson32;

public class MyThread implements Runnable{

    private String myNameThread;

    public MyThread(String myNameThread) {
        this.myNameThread = myNameThread;
    }



    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(myNameThread + ": " + i);
        }
    }
}
