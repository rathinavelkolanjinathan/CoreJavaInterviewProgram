import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class testclass {

    public static void main(String[] args) {

        Employee emplList = new Employee("emp1", 1, "HR", 26);
        Employee emplList1 = new Employee("emp2", 3, "IT", 28);

        ArrayList<Employee> list = new ArrayList<>();

        Map<Integer, Employee> map = new HashMap<>();
        //

        list.add(emplList);
        list.add(emplList1);
        List<String> ll = list.stream().filter(x -> x.getDeptName().equals("HR"))
                .map(e -> e.getDeptName()).collect(Collectors.toList());


        System.out.println(ll);

    }


}

interface employee {


    public List<Employee> get(int id);
}


class testrepository {
    String query = "select * from  employee where age >25";


}
