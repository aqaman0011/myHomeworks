package Lesson10;

public class Main {

    public static void main(String[] args) {

        Students students = new Students();

        students.setNameStudents("Jon");
        students.setSurnameStudents("Sina");
        students.setAge(19);
        students.setCourseNumbers(2);
        students.students();

        Teachers teachers = new Teachers();

        teachers.setNameTeachers("Severus");
        teachers.setSurnameTeachers("Snape");
        teachers.setAgeTeachers(333);
        teachers.teachers();

        ReceivesArrayWithRandomNumberAndSortsAndOutputsConsole worksWithArray = new ReceivesArrayWithRandomNumberAndSortsAndOutputsConsole();

        worksWithArray.numberArray(10);
        worksWithArray.sortArray();
        worksWithArray.printArray();
        worksWithArray.sortArrayReverse();
        worksWithArray.printArray();




    }
}
