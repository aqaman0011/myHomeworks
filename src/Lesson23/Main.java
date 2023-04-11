package Lesson23;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Task1
        List<String> surNames = new ArrayList<>();

        surNames.add("Smith");
        surNames.add("Smith");
        surNames.add("Smith");
        surNames.add("Williams");
        surNames.add("Williams");
        surNames.add("Williams");
        surNames.add("Anderson");
        surNames.add("Williams");
        surNames.add("Thompson");
        surNames.add("Thompson");
        surNames.add("Anderson");
        surNames.add("Thompson");
        surNames.add("Martin");
        surNames.add("SmiAndersonth");
        surNames.add("Martin");
        surNames.add("Martin");
        surNames.add("Martin");
        surNames.add("Thompson");
        surNames.add("Smith");
        surNames.add("Martin");

        Map<String, Integer> surnameKey = surNames.stream()
                .collect(Collectors.toMap(
                        surname -> surname,
                        surname -> 1,
                        Integer :: sum
                ));

        System.out.println(surnameKey);


        //Task2
        List<Integer> sumNumb = List.of(1, 5, 7, 4, 3, 7, 8, 9, 6, 5, 4, 3);

        int sumResult = sumNumb.stream().reduce(0, Integer :: sum);

        System.out.println(sumResult);


    }

}
