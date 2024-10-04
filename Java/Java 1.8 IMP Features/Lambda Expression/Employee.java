public class Employee {
    private int eid;
    private String name;

    private int salary;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int eid, String name, int salary) {
        this.name = name;
        this.eid = eid;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ["+"EmployeeID : "+getEid()+", EmployeeName "+getName()+", Employee Salary : "+getSalary() + " ]";
    }
}
