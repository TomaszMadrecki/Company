package app;

import models.Employee;
import strategy.Strategy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Company {

    List<Employee> employees = new ArrayList<Employee>();
    Map<Employee, Double> payroll = new HashMap<Employee, Double>();
    private Strategy strategy;
    private static Company company = null;

    private Company() {
    }

    public static Company getInstance() {
        if (company == null) {
            company = new Company();
        }
        return company;
    }

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public void removeEmployee(int index) {
        employees.remove(index);
    }

    public void editEmployee() {

    }

    public double getPaycheck(int index) {
        return employees.get(index).calculatePaycheck();
    }

    public Map<Employee, Double> payrollReport() {
        for (Employee employee : employees) {
            payroll.put(employee, employee.calculatePaycheck());
        }
        return payroll;
    }


}
