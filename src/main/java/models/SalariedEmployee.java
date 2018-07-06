package models;

import java.util.Date;
import java.util.UUID;

public class SalariedEmployee extends Employee {

    private double monthlySalary;

    private SalariedEmployee(String name, String lastName, String address, double monthlySalary) {
        super(name, lastName, address);
        this.monthlySalary = monthlySalary;

    }

    public String employeeToJson() {
        return gson.toJson(this);
    }

    public double calculatePaycheck() {
        return monthlySalary * 0.87;
    }

    public void editData() {

    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + getName()
                + " " + getLastName()
                + ", " + getAddress()
                + ", ID:  " + getId()
                + ", birth at: " + getDateOfBirth() +
                ", monthlySalary = " + monthlySalary +
                '}';
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public static class SalariedEmployeeBuilder {

        private String name;
        private String lastName;
        private String address;
        private Date dateOfBirth;
        private int age;
        private UUID id;
        private double monthlySalary;

        public SalariedEmployeeBuilder name(String name) {
            this.name = name;
            return this;
        }

        public SalariedEmployeeBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public SalariedEmployeeBuilder address(String address) {
            this.address = address;
            return this;
        }

        public SalariedEmployeeBuilder monthlySalary(double monthlySalary) {
            this.monthlySalary = monthlySalary;
            return this;
        }

        public SalariedEmployee build() {
            return new SalariedEmployee(name, lastName, address, monthlySalary);
        }
    }
}
