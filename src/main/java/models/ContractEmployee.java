package models;

import java.util.Date;
import java.util.UUID;

public class ContractEmployee extends Employee {

    private double contractCost;

    private ContractEmployee(String name, String lastName, String address, double contractCost) {
        super(name, lastName, address);
        this.contractCost = contractCost;
    }

    public double calculatePaycheck() {
        return contractCost * 0.85;
    }

    public String employeeToJson() {
        return gson.toJson(this);
    }

    public void editData() {
    }


    @Override
    public String toString() {
        return "ContractEmployee{" + getName()
                + " " + getLastName()
                + ", " + getAddress()
                + ", ID:  " + getId()
                + ", birth at: " + getDateOfBirth() +
                ", contractCost = " + contractCost +
                '}';
    }

    public double getContractCost() {
        return contractCost;
    }

    public void setContractCost(double contractCost) {
        this.contractCost = contractCost;
    }

    public static class ContractEmployeeBuilder {
        private String name;
        private String lastName;
        private String address;
        private Date dateOfBirth;
        private int age;
        private UUID id;
        private double contractCost;

        public ContractEmployeeBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ContractEmployeeBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ContractEmployeeBuilder address(String address) {
            this.address = address;
            return this;
        }

        public ContractEmployeeBuilder contractCost(double contractCost) {
            this.contractCost = contractCost;
            return this;
        }

        public ContractEmployee build() {
            return new ContractEmployee(name, lastName, address, contractCost);
        }
    }
}
