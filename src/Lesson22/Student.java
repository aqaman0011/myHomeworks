package Lesson22;


public class Student {

    private String sureName;
    private int averageRating;

    public Student(String sureName, int averageRating) {
        this.sureName = sureName;
        this.averageRating = averageRating;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sureName='" + sureName + '\'' +
                ", averageRating='" + averageRating + '\'' +
                '}';
    }

}
