package Lesson33;

public class Main {

    public static void main(String[] args) {

        Thread thread = new Thread( new myNewThread());

        thread.start();
    }
}
