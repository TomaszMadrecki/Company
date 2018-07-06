package strategy;

import models.Employee;
import models.HourlyEmployee;

import java.util.Scanner;

public class HourlyEmployeeStrategy implements Strategy {

    public Employee buildEmployee() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String lastName = scanner.nextLine();
        System.out.println("Podaj adres");
        String address = scanner.nextLine();
        System.out.println("Podaj liczbę godzin pracy");
        double hourlyCost = scanner.nextDouble();
        System.out.println("Podaj stawkę za godzinę pracy");
        int hoursOfWork = scanner.nextInt();

        return new HourlyEmployee.HourlyEmployeeBuilder().name(name).lastName(lastName)
                .address(address).hourlyCost(hourlyCost).hoursOfWork(hoursOfWork).build();
    }
}
