import java.util.HashMap;

public class EmployeeManager {
    private final HashMap<Integer, Employee> employees = new HashMap<>();  // key and value pairs
    private final HashMap<Integer, Department> departments = new HashMap<>(); // key and value pairs

    //to map the employees with their employee ID
    public void mapEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    //to map the departments with their department ID
    public void mapDepartment(Department department) {
        departments.put(department.getDepartmentId(), department);
    }

    //calculation logic for total salary expenditure
    public double calculateTotalSalaryExpenditure() {
        double totalSalary = 0.0d;
        for (Employee e : employees.values()) {   // use of for each loop for getting the values of map easily
            totalSalary += e.getSalary();
        }
        return totalSalary;
    }

    // calculation logic for finding highest and lowest salary
    public void findHighestAndLowestSalary() {
        if (employees.isEmpty()) {     // making sure we don't have empty hashMap
            System.out.println("No employees available.");
            return;
        }

        Employee highestSalaryEmployee = null;  // making Employee type variable to fill the employee after getting the highest salaried person
        Employee lowestSalaryEmployee = null;   // // making Employee type variable to fill the employee after getting the lowest salaried person

        for (Employee e : employees.values()) {
            if (highestSalaryEmployee == null || e.getSalary() > highestSalaryEmployee.getSalary()) {
                highestSalaryEmployee = e;
            }
            if (lowestSalaryEmployee == null || e.getSalary() < lowestSalaryEmployee.getSalary()) {
                lowestSalaryEmployee = e;
            }
        }

        System.out.println("Highest Salary Employee: " + highestSalaryEmployee);
        System.out.println("Lowest Salary Employee: " + lowestSalaryEmployee);
    }


    // calculation logic for finding average salary by department
    public void calculateAverageSalaryByDepartment() {
        if (employees.isEmpty()) {   // making sure we don't have empty hashMap
            System.out.println("No employees available.");
            return;
        }


        HashMap<Department, Double> totalSalaryByDepartment = new HashMap<>();    //HashMap to store department-wise total salary
        HashMap<Department, Integer> employeeCountByDepartment = new HashMap<>();  //HashMap to store department-wise employee count

        // for each employee get salary and count by department
        for (Employee employee : employees.values()) {
            Department department = employee.getDepartment();   // for every employee getting his/her dept and storing its data into the local var

            //checking if there is no key with any guy from the department
            if (!totalSalaryByDepartment.containsKey(department)) {
                totalSalaryByDepartment.put(department, 0.0); // if there is no one then the salary will be 0
            }
            double currentTotalSalary = totalSalaryByDepartment.get(department);
            totalSalaryByDepartment.put(department, currentTotalSalary + employee.getSalary()); // if the key is present then we will put the value of salary in the value

            //checking if there is no key with any guy from the department
            if (!employeeCountByDepartment.containsKey(department)) {
                employeeCountByDepartment.put(department, 0);   // if there is no one then the count will be 0
            }
            int currentEmployeeCount = employeeCountByDepartment.get(department);
            employeeCountByDepartment.put(department, currentEmployeeCount + 1);  // if the key is present then we will increase the head count
        }

        // calculating average salary for each department and print
        for (Department department : totalSalaryByDepartment.keySet()) {
            double totalSalary = totalSalaryByDepartment.get(department);
            int employeeCount = employeeCountByDepartment.get(department);
            double averageSalary = totalSalary / employeeCount;

            System.out.println("Department: " + department.getDepartmentName() + ", Average Salary: " + averageSalary);
        }
    }


    // calculation logic for employee tenure and long service award eligibility
    public void calculateEmployeeTenure() {
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }

        for (Employee employee : employees.values()) {
            int tenure = employee.getTenure();
            System.out.println("Employee: " + employee.getName() + ", Tenure: " + tenure + " years");


        }
        for (Employee employee : employees.values()) {
            int tenure = employee.getTenure();
            if (tenure >= 10) {    // just assumption that 10 year is enough to clear eligibility
                System.out.println( employee.getName() + " is eligible for long service award.");
            }
        }
    }

}

