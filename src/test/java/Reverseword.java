import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Stack;

public class Reverseword {

    public static void main(String[] args) {
        String st = "kolanji is attending";
        char[] c = st.toCharArray();

        Stack stack = new Stack();
        for (int i = 0; i < c.length; i++) {

            stack.push(c);
        }

        System.out.println(stack.pop().toString());
    }

    int[] list = {100, 300, 200, 500, 600, 300, 800, 100, 400, 200};

//  Arrays.strem(list).distinct().boxed().sorted(comparator.reverseOrder()).skip(3).findfirst().get();


}

 