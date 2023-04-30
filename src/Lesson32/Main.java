package Lesson32;

public class Main {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyThread("Thread first "));
        Thread thread2 = new Thread(new MyThread("Thread second "));

        thread1.start();
        thread2.start();
    }
}
