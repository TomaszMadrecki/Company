package Models;

public class SalariedEmployee extends Employee {

    private double monthlySalary;

    public SalariedEmployee(String name, String lastName, String address, double monthlySalary) {
        super(name, lastName, address);
        this.monthlySalary = monthlySalary;

    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + getName() + " " + getLastName() + ", " + getAddress() + ", ID:  " + getId() +
                ", monthlySalary = " + monthlySalary +
                '}';
    }

    double calculatePaycheck() {
        return monthlySalary * 0.87;
    }

    void editData() {

    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
