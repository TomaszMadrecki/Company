package Models;

import java.util.UUID;

public abstract class Employee {
    private String name;
    private String lastName;
    private String address;
    private String dateOfBirth;
    private int age;
    private UUID id;

    public Employee(String name, String lastName, String address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.id = UUID.randomUUID();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return id != null ? id.equals(employee.id) : employee.id == null;
    }

    abstract double calculatePaycheck();

    abstract void editData();

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public UUID getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
