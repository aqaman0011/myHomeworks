package Lesson10;

import java.util.Arrays;
import java.util.Random;

public class ReceivesArrayWithRandomNumberAndSortsAndOutputsConsole {

    private int[] array;

    public void numberArray(int size) {
        array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(100);
        }
    }

    public void sortArray() {
        Arrays.sort(array);
    }

    public void sortArrayReverse() {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public void printArray() {
        System.out.println("Arrays: " + Arrays.toString(array));
    }

}
