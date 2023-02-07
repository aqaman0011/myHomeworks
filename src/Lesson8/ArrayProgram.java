package Lesson8;

public class ArrayProgram {

    public static void main(String[] args) {

        //Create our random array
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100);
        }

        //Output our array in console
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //Find the minimum number of an array
        System.out.println(getMinValue(array));

        //Find the max number of an array
        System.out.println(getMaxValue(array));

        //Find the average of an array
        System.out.println(getAverageArray(array));

        //Find the sum of an array
        System.out.println(getSumArray(array));


    }

    //Method getting the minimum value
    static int getMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    //Method getting the max value
    static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    // Method getting average of an array
    static int getAverageArray(int[] array) {
        int sum = 0;
        int average;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        average = (int) sum / array.length;
        return average;

    }

    // Method getting sum of an array
    static int getSumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; sum += array[i++]);
        return sum;
    }

}
