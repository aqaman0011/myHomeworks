package Lesson15;

public class Main {

    public static void main(String[] args) {

        ProcessDriver driverMan = new Driver();
        Pilot pilotMan = new Pilot();

        driverMan.driver();
        driverMan.maxSpeed();
        pilotMan.driver();
        pilotMan.maxSpeed();
        pilotMan.health();
        System.out.println(pilotMan.highLevelEnglish());
        pilotMan.experience();

    }

}
