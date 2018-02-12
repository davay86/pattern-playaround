public class Employee implements EmployeeInterface {

    private String name;
    private String id;
    private String department;

    public Employee(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getEmployeeDetails(){
        return "ID: "+ id + " Name: " + name + " Department: " + department;
    }
}
