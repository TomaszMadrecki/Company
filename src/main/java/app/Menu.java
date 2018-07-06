package app;

import strategy.ContractEmployeeStrategy;
import strategy.HourlyEmployeeStrategy;
import strategy.SalariedEmployeeStrategy;
import strategy.Strategy;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("1. Dodaj pracownika");
        System.out.println("2. Usuń pracownika");
        System.out.println("3. Edytuj pracownika");
        System.out.println("4. Płace");
        firstUserChoiceMenu();
    }

    private void firstUserChoiceMenu() {
        Company company = Company.getInstance();
        Strategy strategy;
        switch (scanner.nextInt()) {
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
                switch ()
        }
    }

    public int firstPickInStartMenu() {
        System.out.println("1. Stwórz stałego pracownika");
        System.out.println("2. Stwórz pracownika godzinowego");
        System.out.println("3. Stwórz pracownika kontraktowego");
        return scanner.nextInt();
    }

    public int fourthPickInStartMenu() {
        return scanner.nextInt();
    }
}
