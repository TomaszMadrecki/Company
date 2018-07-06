package models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public abstract class Employee {
    private String name;
    private String lastName;
    private String address;
    private Date dateOfBirth;
    private int age;
    private UUID id;

    SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");

    Employee(String name, String lastName, String address) {
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

    public Date getDateOfBirth() {
        return dateOfBirth;
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
