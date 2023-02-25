package Lesson12;

public class InitializationExample {
    private static int counter = 0;
    private int instanceNumber;

    static {
        counter++;
        System.out.println("Static initialization block number = " + counter);
    }

    {
        instanceNumber = counter++;
        System.out.println("Instance initialization block number = " + instanceNumber);
    }

    public InitializationExample() {
        System.out.println("Serial number " + instanceNumber);
    }
}
