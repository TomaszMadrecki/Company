package Models;

public class ContractEmployee extends Employee {

    double contractCost;

    public ContractEmployee(String name, String lastName, String address, double contractCost) {
        super(name, lastName, address);
        this.contractCost = contractCost;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" + getName() + " " + getLastName() + ", " + getAddress() + ", ID:  " + getId() +
                ", contractCost = " + contractCost +
                '}';
    }

    double calculatePaycheck() {
        return contractCost * 0.85;
    }

    void editData() {

    }

    public double getContractCost() {
        return contractCost;
    }

    public void setContractCost(double contractCost) {
        this.contractCost = contractCost;
    }
}
