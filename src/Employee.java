import java.time.LocalDate;


public class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;
    private Department department;
    private LocalDate joiningDate;
//constructor



    public Employee(int id, String name, String designation, double salary, Department department, LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.department = department;
        this.joiningDate = joiningDate;
    }


// Getter and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    // Logic below to get the tenure of person using Local Date of now and joining date
    public int getTenure() {
        LocalDate now = LocalDate.now();
        int years = now.getYear() - joiningDate.getYear();
        return years;
    }

    //toString function to get the data back in json look-like format
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                ", joiningDate=" + joiningDate +
                '}';
    }
}
