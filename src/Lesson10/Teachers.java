package Lesson10;

public class Teachers {

    private String nameTeachers;
    private String surnameTeachers;
    private int ageTeachers;

    public void teachers() {

        System.out.println("Name of our teachers " + nameTeachers + ", last name of our teachers " + surnameTeachers + ", teachers age " + ageTeachers + ".");

    }

    public String getNameTeachers() {
        return nameTeachers;
    }

    public void setNameTeachers(String nameTeachers) {
        this.nameTeachers = nameTeachers;
    }

    public String getSurnameTeachers() {
        return surnameTeachers;
    }

    public void setSurnameTeachers(String surnameTeachers) {
        this.surnameTeachers = surnameTeachers;
    }

    public int getAgeTeachers() {
        return ageTeachers;
    }

    public void setAgeTeachers(int ageTeachers) {
        this.ageTeachers = ageTeachers;
    }
}
