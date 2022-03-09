package ie.gmit.SAT;


public class Employee {
    private String name;
    private String employeeNumber;

    public Employee(String n, String E) {
        if(E.contains(".[a-z].*") && E.length() > 6){
            throw new IllegalArgumentException("Invalid Employee Number");
        }
        else{
            employeeNumber = E;
        }
        if(n.length() > 10){
            throw new IllegalArgumentException("Invalid Name Length");
        }
        else{
            name = n;
        }
    }


    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    class Employeelist {
        void addEmployee(Employee e){

        }

    }

}

