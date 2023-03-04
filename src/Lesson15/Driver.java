package Lesson15;

public class Driver extends Human{
    @Override
    public void driver() {
        System.out.print("I am a car driver and can drive at maximum speed. ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("My top speed is 300 kilometers per hour.");
    }
}
