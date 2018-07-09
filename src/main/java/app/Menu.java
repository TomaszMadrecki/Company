package app;

import models.ContractEmployee;
import models.Employee;
import models.HourlyEmployee;
import models.SalariedEmployee;
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
            System.out.println("1. Pracownicy");
            System.out.println("2. Płace");
            System.out.println("0. Koniec programu");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    switch (forstPickInStartMenu()) {
                        case 1:
                            switch (firstPickInEmployeesMenu()) {
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
                            System.out.println("Podaj numer (index) pracownika");
                            Employee employee = company.employees.get(scanner.nextInt());
                            System.out.println(employee);
                            System.out.println("Podaj nowe imię");
                            employee.setName(scanner.nextLine());
                            System.out.println("Podaj nowe nazwisko");
                            employee.setLastName(scanner.nextLine());
                            System.out.println("Podaj nowy adres");
                            employee.setAddress(scanner.nextLine());
                            if (employee instanceof SalariedEmployee) {
                                System.out.println("Podaj nowa miesięczną pensję");
                                ((SalariedEmployee) employee).setMonthlySalary(scanner.nextInt());
                            } else if (employee instanceof HourlyEmployee) {
                                System.out.println("Podaj nową liczbę godzin");
                                ((HourlyEmployee) employee).setHoursOfWork(scanner.nextInt());
                                System.out.println("Podaj nowy koszt godzinowy");
                                ((HourlyEmployee) employee).setHourlyCost(scanner.nextDouble());
                            } else if (employee instanceof ContractEmployee) {
                                System.out.println("Podaj nowy koszt kontraktu");
                                ((ContractEmployee) employee).setContractCost(scanner.nextDouble());
                            }
                            break;
                        case 4:
                            System.out.println("Podaj numer (index) pracownika");
                            System.out.println(company.employees.get(scanner.nextInt()));
                            break;
                    }
                    break;
                case 2:
                    switch (secondPickInStartMenu()) {
                        case 1:
                            System.out.println("Podaj numer (index) pracownika");
                            System.out.println(company.getPaycheck(scanner.nextInt()));
                            break;
                        case 2:
                            for (Map.Entry<Employee, Double> entry : company.payrollReport().entrySet()) {
                                System.out.println("Pracownik: " + entry.getKey() + ", do wypłaty: " + entry.getValue());
                            }
                            System.out.println(company.payrollToJson());
                            break;
                    }
            }
        } while (choice != 0);
    }

    public int forstPickInStartMenu() {
        System.out.println("1. Dodaj pracownika");
        System.out.println("2. Usuń pracownika");
        System.out.println("3. Edytuj pracownika");
        System.out.println("4. Wyświetl dane pracownika");
        System.out.println("5. Eksportuj pracownika do JSONa");
        return scanner.nextInt();
    }

    public int firstPickInEmployeesMenu() {
        System.out.println("1. Stwórz stałego pracownika");
        System.out.println("2. Stwórz pracownika godzinowego");
        System.out.println("3. Stwórz pracownika kontraktowego");
        return scanner.nextInt();
    }

    public int secondPickInStartMenu() {
        System.out.println("1. Pobierz wynagrodzenie pracownika");
        System.out.println("2. Stwórz raport płacowy wszystkich pracowników");

        return scanner.nextInt();
    }
}
