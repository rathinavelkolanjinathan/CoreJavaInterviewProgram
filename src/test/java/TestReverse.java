import java.util.Stack;
import java.util.StringTokenizer;

public class TestReverse {
    public static void main(String[] args) {
        String st = "Java is a wonderful language";
        String reverseWord = reverseWord(st);
        System.out.println("Reverse string{}: " + reverseWord);
        int length = st.length();
        String rev = "";

        for (int i = length - 1; i >= 0; i--) {

            char c = st.charAt(i);
            // System.out.println("Reverse string " + c);
            rev = rev + c;
        }
        //System.out.println("Reverse string{}: " + rev);

    }


    public static String reverseWord(String st) {
        StringTokenizer tocken = new StringTokenizer(st, "");
        StringBuilder builder = new StringBuilder();
        Stack stack = new Stack();

        while (tocken.hasMoreTokens()) {

                stack.push(tocken.nextToken());
        }

        while (!stack.isEmpty()) {

                builder.append(stack.pop());
        }


        String result = builder.reverse().toString();

        return result;
    }
}
