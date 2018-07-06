package app;

import models.Employee;
import strategy.ContractEmployeeStrategy;
import strategy.HourlyEmployeeStrategy;
import strategy.SalariedEmployeeStrategy;
import strategy.Strategy;

import java.util.ArrayList;
import java.util.List;


public class Company {

    List<Employee> employees = new ArrayList<Employee>();
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


}
