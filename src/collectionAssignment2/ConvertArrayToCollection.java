package collectionAssignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConvertArrayToCollection {

    public static void main(String[] args) {
        // Int Array
        int[] num_array = {1,3,5,6,7,9,2};

        // Converting to ArrayList using Java 8 Stream API
        Arrays.stream(num_array).boxed().collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("\n");
        System.out.println("###########################################################");

        // String array
        String[] names = {"Ram","Shyam","Maya","Sita","Dan"};

        // Converting to List using Java 9 List.of() method
        List<String> namesList = List.of(names);
        System.out.println("List of names: " + namesList);
    }
}