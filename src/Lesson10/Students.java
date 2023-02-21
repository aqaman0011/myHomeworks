package Lesson10;

public class Students {

    private String nameStudents;
    private String surnameStudents;
    private int age;
    private int courseNumbers;

    public void students() {

        System.out.println("Name of our student " + nameStudents + ", last name of our student " + surnameStudents + ", student age " + age + ", the course in which the student is studying " + courseNumbers + ".");

    }

    public String getNameStudents() {
        return nameStudents;
    }

    public void setNameStudents(String nameStudents) {
        this.nameStudents = nameStudents;
    }

    public String getSurnameStudents() {
        return surnameStudents;
    }

    public void setSurnameStudents(String surnameStudents) {
        this.surnameStudents = surnameStudents;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourseNumbers() {
        return courseNumbers;
    }

    public void setCourseNumbers(int courseNumbers) {
        this.courseNumbers = courseNumbers;
    }

}
