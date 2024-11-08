import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class AnnotationsAndStreamApi1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Eve", " Charlie", "Daniel");
        Stream<String> stream = names.stream();
        List <String> listFiltered = stream.filter(item -> item.contains("e"))
                .collect(Collectors.toList());
        System.out.println(listFiltered);
        names.stream()
                .filter(name -> name.contains("e"))
                .forEach(System.out::println);
    }

}


