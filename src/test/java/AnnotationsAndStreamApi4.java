import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnnotationsAndStreamApi4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dog", "cat", "elephant", "tiger", "lion", "ant");
        List<String> filteredSortedWords = words.stream()
                .filter(word -> word.length() > 4)
                .map(String::toLowerCase)
                .sorted()
                .collect(Collectors.toList());
        filteredSortedWords.forEach(System.out::println);
    }
}
