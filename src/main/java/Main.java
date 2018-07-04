import Models.ContractEmployee;
import Models.HourlyEmployee;
import Models.SalariedEmployee;

public class Main {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee.SalariedEmployeeBuilder().name("Tomo").lastName("Komo").address("ul. Legnicka 35").monthlySalary(10000).build();
        HourlyEmployee hourlyEmployee = new HourlyEmployee.HourlyEmployeeBuilder().name("Justysia").lastName("Sisi").address("ul. Kowalska 15").hoursOfWork(35).hourlyCost(70).build();
        ContractEmployee contractEmployee = new ContractEmployee.ContractEmployeeBuilder().name("Gosia").lastName("Samosia").address("ul. Mydlana 12/2").contractCost(7340).build();

        System.out.println(salariedEmployee);
        System.out.println(hourlyEmployee);
        System.out.println(contractEmployee);

    }
}
