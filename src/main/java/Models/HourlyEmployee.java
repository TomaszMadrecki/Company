package Models;

public class HourlyEmployee extends Employee {

    int hoursOfWork;
    double hourlyCost;

    public HourlyEmployee(String name, String lastName, String address, int hoursOfWork, double hourlyCost) {
        super(name, lastName, address);
        this.hoursOfWork = hoursOfWork;
        this.hourlyCost = hourlyCost;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + getName() + " " + getLastName() + ", " + getAddress() + ", ID:  " + getId() +
                ", hoursOfWork = " + hoursOfWork +
                ", hourlyCost = " + hourlyCost +
                '}';
    }

    double calculatePaycheck() {
        return hourlyCost * hoursOfWork;
    }

    void editData() {

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
}
