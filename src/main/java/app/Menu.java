package app;

import models.Employee;
import strategy.ContractEmployeeStrategy;
import strategy.HourlyEmployeeStrategy;
import strategy.SalariedEmployeeStrategy;
import strategy.Strategy;

import java.util.Map;
import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    public void start() {
        Company company = Company.getInstance();
        Strategy strategy;



        int choice;
        do {

            System.out.println("1. Dodaj pracownika");
            System.out.println("2. Usuń pracownika");
            System.out.println("3. Edytuj pracownika");
            System.out.println("4. Płace");
            System.out.println("0. Koniec programu");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    switch (firstPickInStartMenu()) {
                        case 1:
                            strategy = new SalariedEmployeeStrategy();
                            break;
                        case 2:
                            strategy = new HourlyEmployeeStrategy();
                            break;
                        case 3:
                            strategy = new ContractEmployeeStrategy();
                            break;
                        default:
                            return;
                    }
                    company.addEmployee(strategy.buildEmployee());
                    break;
                case 2:
                    System.out.println("Podaj numer (indeks) pracownika");
                    company.removeEmployee(scanner.nextInt());
                    break;
                case 3:
                    break;
                case 4:
                    switch (fourthPickInStartMenu()) {
                        case 1:
                            System.out.println("Podaj numer (index) pracownika");
                            System.out.println(company.getPaycheck(scanner.nextInt()));
                            break;
                        case 2:
                            for (Map.Entry<Employee, Double> entry : company.payrollReport().entrySet()) {
                                System.out.println("Pracownik: " + entry.getKey() + ", do wypłaty: " + entry.getValue());
                            }
                            break;
                    }
            }
        } while (choice != 0);
    }

    public int firstPickInStartMenu() {
        System.out.println("1. Stwórz stałego pracownika");
        System.out.println("2. Stwórz pracownika godzinowego");
        System.out.println("3. Stwórz pracownika kontraktowego");
        return scanner.nextInt();
    }

    public int fourthPickInStartMenu() {
        System.out.println("1. Pobierz wynagrodzenie pracownika");
        System.out.println("2. Stwórz raport płacowy");

        return scanner.nextInt();
    }
}
