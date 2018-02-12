public class ProxyMain {

    public static void main(String[] args){
        EmployeeProxy employeeProxy = new EmployeeProxy(new Employee("David","111","sales"));
        System.out.println(employeeProxy.getEmployeeDetails());
    }
}
