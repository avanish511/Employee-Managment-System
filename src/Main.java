import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {
            EmployeeManager manager = new EmployeeManager();

            // adding departments
            Department dept1 = new Department(1, "Human Resources");
            Department dept2 = new Department(2, "Engineering");
            Department dept3 = new Department(3, "Finance");
            Department dept4 = new Department(4, "Marketing");
            Department dept5 = new Department(5, "Operations");

            manager.mapDepartment(dept1);
            manager.mapDepartment(dept2);
            manager.mapDepartment(dept3);
            manager.mapDepartment(dept4);
            manager.mapDepartment(dept5);

            //adding employee
            manager.mapEmployee(new Employee(1, "Aditi", "Manager", 75000, dept1, LocalDate.of(2015, 1, 10)));
            manager.mapEmployee(new Employee(2, "Bhargav", "Developer", 50000, dept2, LocalDate.of(2012, 3, 15)));
            manager.mapEmployee(new Employee(3, "Chaitanya", "Analyst", 45000, dept1, LocalDate.of(2018, 7, 21)));
            manager.mapEmployee(new Employee(4, "Diya", "HR Specialist", 60000, dept1, LocalDate.of(2013, 9, 5)));
            manager.mapEmployee(new Employee(5, "Eshaan", "Software Engineer", 60000, dept2, LocalDate.of(2023, 5, 12)));
            manager.mapEmployee(new Employee(6, "Farah", "Marketing Executive", 55000, dept4, LocalDate.of(2020, 8, 30)));
            manager.mapEmployee(new Employee(7, "Ganesh", "Finance Manager", 80000, dept3, LocalDate.of(2011, 11, 25)));
            manager.mapEmployee(new Employee(8, "Himanshu", "Operations Lead", 70000, dept5, LocalDate.of(2017, 4, 17)));
            manager.mapEmployee(new Employee(9, "Isha", "Customer Support", 45000, dept5, LocalDate.of(2019, 2, 8)));
            manager.mapEmployee(new Employee(10, "Jagdish", "Sales Executive", 55000, dept4, LocalDate.of(1999, 6, 19)));
            // Perform operations
            System.out.println("Total Salary Expenditure: " + manager.calculateTotalSalaryExpenditure());
            manager.findHighestAndLowestSalary();
            manager.calculateAverageSalaryByDepartment();
            manager.calculateEmployeeTenure();
        }
    }