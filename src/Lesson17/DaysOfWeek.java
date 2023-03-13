package Lesson17;

public enum DaysOfWeek {

    MONDAY(),
    TUESDAY(),
    WEDNESDAY(),
    THURSDAY(),
    FRIDAY(),
    SATURDAY(),
    SUNDAY();

    public void printDays (int numberDays) {
        if (numberDays == 1) {
            System.out.println(MONDAY);
        } else if (numberDays == 2) {
            System.out.println(TUESDAY);
        } else if (numberDays == 3) {
            System.out.println(WEDNESDAY);
        } else if (numberDays == 4) {
            System.out.println(THURSDAY);
        } else if (numberDays == 5) {
            System.out.println(FRIDAY);
        } else if (numberDays == 6) {
            System.out.println(SATURDAY);
        } else if (numberDays == 7) {
            System.out.println(SUNDAY);
        } else {
            System.out.println("The number does not match the day of the week! Please enter a number from 1 to 7!");
        }
    }

}
