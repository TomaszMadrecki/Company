package strategy;

import models.ContractEmployee;
import models.Employee;

import java.util.Scanner;

public class ContractEmployeeStrategy implements Strategy {
    public Employee buildEmployee() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String lastName = scanner.nextLine();
        System.out.println("Podaj adres");
        String address = scanner.nextLine();
        System.out.println("Podaj pensję");
        double contractCost = scanner.nextDouble();

        return new ContractEmployee.ContractEmployeeBuilder().name(name).lastName(lastName).address(address).contractCost(contractCost).build();
    }
}
