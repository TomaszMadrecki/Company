import models.ContractEmployee;
import models.HourlyEmployee;
import models.SalariedEmployee;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void given_SalariedEmployee_When_CalculatePaycheck_Then_ReturnCorrectSalary() {
        SalariedEmployee salariedEmployee = new SalariedEmployee.SalariedEmployeeBuilder().name("Tomo").lastName("Komo").address("ul. Legnicka 35").monthlySalary(9670).build();

        assertEquals(8412.9, salariedEmployee.calculatePaycheck(), 1);
    }

    @Test
    public void given_HourlyEmployee_When_CalculatePaycheck_Then_ReturnCorrectSalary() {
        HourlyEmployee hourlyEmployee = new HourlyEmployee.HourlyEmployeeBuilder().name("Justysia").lastName("Sisi").address("ul. Kowalska 15").hoursOfWork(140).hourlyCost(70).build();

        assertEquals(9800, hourlyEmployee.calculatePaycheck(), 1);
    }

    @Test
    public void given_ContractEmployee_When_CalculatePaycheck_Then_ReturnCorrectSalary() {
        ContractEmployee contractEmployee = new ContractEmployee.ContractEmployeeBuilder().name("Gosia").lastName("Samosia").address("ul. Mydlana 12/2").contractCost(7340).build();

        assertEquals(6239, contractEmployee.calculatePaycheck(), 1);
    }

}
