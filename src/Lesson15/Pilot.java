package Lesson15;

public class Pilot extends Human implements PilotSkills{

    private final String englishLevel = "and I have high level of English language proficiency!";
    @Override
    public void driver() {
        System.out.print("I am an airplane pilot and I can fly at high speed. ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("My maximum flight speed is 1000 kilometers per hour.");
    }

    @Override
    public void health() {
        System.out.print("I have an excellent health ");
    }

    @Override
    public void experience() {
        System.out.println("I have over 10,000 hours of flying experience! Welcome aboard!!!");
    }

    @Override
    public String highLevelEnglish() {
        return englishLevel;
    }
}
