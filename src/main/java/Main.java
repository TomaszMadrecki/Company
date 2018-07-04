import Models.ContractEmployee;
import Models.HourlyEmployee;
import Models.SalariedEmployee;

public class Main {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee("Tomo", "Komo", "ul. Legnicka 35", 10000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Justysia", "Sisi", "ul. Kowalska 15", 35, 40);
        ContractEmployee contractEmployee = new ContractEmployee("Gosia", "Samosia", "ul. Mydlana 12/2", 7340);

        System.out.println(salariedEmployee);
        System.out.println(hourlyEmployee);
        System.out.println(contractEmployee);

    }
}
