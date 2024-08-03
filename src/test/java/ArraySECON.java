import java.util.Arrays;
import java.util.Comparator;

public class ArraySECON {

    public static void main(String[] args) {

        int arr[] = {9, 10, 6, 9, 1};

        Integer second = Arrays.stream(arr)
                .boxed()
                .sorted()
                .skip(1)
                .findFirst()
                .get();
        System.out.println(second);
    }
}
