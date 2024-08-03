import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class optionaltest {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        int[] num = {10, 15, 8, 49, 25, 98, 32};
        List<String> lis = Arrays.stream(num).boxed().map(s -> s + "").filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());
        System.out.print(lis);

        List<String> lis1 = myList.stream().map(s -> s + "").filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());
        System.out.print(lis1);


        //List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);


        // myList.stream().sorted(Comparator.reverseOrder()).findFirst().get();

        // System.out.print(myList);

        // [1:17 PM] Amit Rai2
        //  Ques 1 : write a program in java to add prefix and suffix in a given String  use StringJoiner class, a newly added in Java 8.
        String a1 = "Amit";
        String a2 = "Vimal";
        String a3 = "Punit";

        List<String> re = Arrays.asList(a1, a2, a3);

        String result = String.join("#", re);


        //System.out.print(result);

        //Expected output should be = #Amit,Vimal,Punit#


        /*String[] words = new String[10];

                Optional<String> opt = Optional.ofNullable(words[5].toLowerCase());
                if(opt.isPresent()){
                    System.out.print(opt.get());

                }*/

    }
}



