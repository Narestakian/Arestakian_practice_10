import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class AnnotationsAndStreamApi3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Eve", "Charlie", "Daniel");
        Collections.sort(names);
        int i = 0;
        while (i < names.size()) {
            System.out.println(names.get(i));
            i++;
    }
}
}
