package app;


import models.Employee;
import strategy.ContractEmployeeStrategy;
import strategy.HourlyEmployeeStrategy;
import strategy.SalariedEmployeeStrategy;
import strategy.Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Strategy strategy;

        System.out.println("1. Zbuduj Salaried Employee");
        System.out.println("2. Zbuduj Hourly Employee");
        System.out.println("3. Zbuduj Contract Employee");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch (input) {
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

        Employee employee = strategy.buildEmployee();
        System.out.println(employee.toString());

    }
}
