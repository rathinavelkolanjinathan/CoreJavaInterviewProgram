import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestSubstring {
    public static void main(String[] args) {

        int[] shashank = new int[]{};
        List<String> st = Stream.of("1", "2", "3").collect(Collectors.toList());

        List<String> name = Arrays.asList("Kolanji", "Shashank");
        String result = name.stream().map(m -> m.startsWith("k")).toString();
        System.out.println(result);

        //List.of("Kolanji", "Shashank").map();

        String S1 = "ABBCD";
        TestSubstring.getString(S1, "");

    }

    public static String getString(String input, String space) {

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            return getString(input, ch + "");

        }
        return "";
    }
}
