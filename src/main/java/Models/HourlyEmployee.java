package Models;

import java.util.Date;
import java.util.UUID;

public class HourlyEmployee extends Employee {

    private int hoursOfWork;
    private double hourlyCost;

    private HourlyEmployee(String name, String lastName, String address, int hoursOfWork, double hourlyCost) {
        super(name, lastName, address);
        this.hoursOfWork = hoursOfWork;
        this.hourlyCost = hourlyCost;
    }

    public double calculatePaycheck() {
        return hourlyCost * hoursOfWork;
    }

    void editData() {

    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + getName()
                + " " + getLastName()
                + ", " + getAddress()
                + ", ID:  " + getId()
                + ", birth at: " + getDateOfBirth() +
                ", hoursOfWork = " + hoursOfWork +
                ", hourlyCost = " + hourlyCost +
                '}';
    }

    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(int hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

    public double getHourlyCost() {
        return hourlyCost;
    }

    public void setHourlyCost(double hourlyCost) {
        this.hourlyCost = hourlyCost;
    }

    public static class HourlyEmployeeBuilder {

        private String name;
        private String lastName;
        private String address;
        private Date dateOfBirth;
        private int age;
        private UUID id;
        private int hoursOfWork;
        private double hourlyCost;

        public HourlyEmployeeBuilder name(String name) {
            this.name = name;
            return this;
        }

        public HourlyEmployeeBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public HourlyEmployeeBuilder address(String address) {
            this.address = address;
            return this;
        }

        public HourlyEmployeeBuilder hoursOfWork(int hoursOfWork) {
            this.hoursOfWork = hoursOfWork;
            return this;
        }

        public HourlyEmployeeBuilder hourlyCost(double hourlyCost) {
            this.hourlyCost = hourlyCost;
            return this;
        }

        public HourlyEmployee build() {
            return new HourlyEmployee(name, lastName, address, hoursOfWork, hourlyCost);
        }
    }
}
