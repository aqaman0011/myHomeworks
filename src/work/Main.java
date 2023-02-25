package work;

import work.domain.Employee;
import work.service.EmployeeService;

public class Main {

    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();
        employeeService.printEmployees();
        Employee employeeWithMaxSalary  = employeeService.findEmployeeWithMaxSalary(employeeService.findAll());
        System.out.println();
        System.out.println("Employee with max salary: ");
        employeeService.printEmployee(employeeWithMaxSalary);
        Employee employeeWithMinSalary = employeeService.findEmployeeWithMinSalary(employeeService.findAll());
        System.out.println();
        System.out.println("Employee with min salary: ");
        employeeService.printEmployee(employeeWithMinSalary);
        System.out.println();
        System.out.println("Taxes: " + employeeService.calculateTaxes(employeeService.findAll()));
    }
}
