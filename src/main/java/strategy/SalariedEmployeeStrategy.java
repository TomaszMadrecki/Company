package strategy;

import models.Employee;
import models.SalariedEmployee;

import java.util.Scanner;

public class SalariedEmployeeStrategy implements Strategy {
    public Employee buildEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String lastName = scanner.nextLine();
        System.out.println("Podaj adres");
        String address = scanner.nextLine();
        System.out.println("Podaj pensję");
        int salary = scanner.nextInt();

        return new SalariedEmployee.SalariedEmployeeBuilder().name(name).lastName(lastName).address(address).monthlySalary(salary).build();
    }
}
