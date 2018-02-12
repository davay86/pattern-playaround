public class EmployeeProxy implements EmployeeInterface{

    EmployeeInterface target;
    public EmployeeProxy(Employee employee) {
        this.target = employee;
    }

    public String getEmployeeDetails() {
        System.out.println("........pre-processing");
        return this.target.getEmployeeDetails();
    }
}
