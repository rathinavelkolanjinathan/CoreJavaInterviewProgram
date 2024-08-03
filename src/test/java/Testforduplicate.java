import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testforduplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userName = sc.nextLine();
        System.out.print("Input valaues :: " + userName);

       Map<String,Long> map =  Arrays.stream(userName.split(""))

                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.print(map);

    }
}
