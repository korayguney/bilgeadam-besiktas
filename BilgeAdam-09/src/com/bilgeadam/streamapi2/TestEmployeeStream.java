package com.bilgeadam.streamapi2;

import sun.reflect.generics.tree.Tree;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class TestEmployeeStream {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Koray", "Guney", 8000, "IT"));
        employees.add(new Employee("Hasan", "Kaya", 5000, "IT"));
        employees.add(new Employee("Ayşe", "Sen", 9000, "HR"));
        employees.add(new Employee("Fatma", "Yagmur", 4500, "Sales"));
        employees.add(new Employee("Kemal", "Guney", 6900, "IT"));
        employees.add(new Employee("Ece", "Guney", 10000, "Sales"));
        employees.add(new Employee("Ece", "Guney", 10000, "Sales"));
        employees.add(new Employee("Ece", "Guney", 10000, "Sales"));
        employees.add(new Employee("Ece", "Gunes", 10000, "IT"));

        // display all employees
        System.out.println("==== EMPLOYEES ====");
        employees.forEach(System.out::println);

        // Predicate that returns true for salaries in the range of 4000-7000
        Predicate<Employee> filteredSalaries = e -> e.getSalary() >= 4000 && e.getSalary() <= 7000;

        // display all employees with salaries in the range of 4000-7000
        // sorted into ascending order by salary
        System.out.println("==== EMPLOYEES with salaries in the range of 4000-7000 ====");
        employees.stream().filter(filteredSalaries).sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).forEach(System.out::println);

        // display first employees with salaries in the range of 4000-7000
        System.out.println("==== First EMPLOYEE with salaries in the range of 4000-7000 ====");
        Employee e = employees.stream().filter(filteredSalaries).sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .findFirst().get();
        System.out.println(e);


        // Functions for getting first and last names form an Employee
        Function<Employee, String> byFirstName = employee -> employee.getFirstname();
        Function<Employee, String> byLastName = Employee::getLastname;

        // Comparator for comparing employees by firstname and then lastname
        Comparator<Employee> employeeComparator = Comparator.comparing(byFirstName).thenComparing(byLastName);
        System.out.println("====== Compare for comparing employees by firstname and then lastname ===== ");
        employees.stream().sorted(employeeComparator).forEach(System.out::println);

        // Comparator for comparing employees by lastname and then firstname
        System.out.println("====== Compare for comparing employees by firstname and then lastname ===== ");
        employees.stream().sorted(employeeComparator.reversed()).forEach(System.out::println);

        // display unique employee last names sorted
        System.out.println("==== display unique employee last names sorted ====");
        employees.stream().map(Employee::getLastname).sorted().distinct().forEach(System.out::println);

        // display only employee's first and last names
        System.out.println("==== display only employee's first and last names ====");
        employees.stream().map(e1 -> e1.getFirstname() + " " + e1.getLastname()).forEach(s -> System.out.println(s));

        // group employees by department
        System.out.println("====== group employees by department ====== ");
        Map<String, List<Employee>> empByDepartment = employees.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment()));
        empByDepartment.forEach(new BiConsumer<String, List<Employee>>() {
            @Override
            public void accept(String department, List<Employee> employees) {
                System.out.println("===== DEPARTMENT : " + department + " =======");
                employees.forEach(System.out::println);
            }
        });

        // count number of Emplyees into each department
        System.out.println("===== count number of Emplyees into each department ======");
        Map<String, Long> empCountByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new, Collectors.counting()));

        empCountByDepartment.forEach((department, count) -> System.out.println(department + " has " + count + " employee(s)"));

        // sum of Employees salaries with DoubleStream sum method
        System.out.println("====== SUM OF SALARIES ======");
        double salaryTotal = employees.stream().mapToDouble(emp -> emp.getSalary()).reduce(0, (a, b) -> a + b);
        System.out.println("Total salaries amount : " + salaryTotal);

        // average of Employees salaries average method
        System.out.println("====== AVERAGE OF SALARIES ======");
        OptionalDouble averageResult = employees.stream().mapToDouble(Employee::getSalary).average();
        System.out.printf("Average : %.02f TL", averageResult.getAsDouble());
    }
}
