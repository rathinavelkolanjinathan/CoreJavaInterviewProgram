public class Employee {

    private String name;

    private int empID;

    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Employee(String name, int empID, String deptName, int age) {
        this.name = name;
        this.empID = empID;
        this.deptName = deptName;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getEmpID() {
        return empID;
    }

    public int getAge() {
        return age;
    }

    private int age;
}
