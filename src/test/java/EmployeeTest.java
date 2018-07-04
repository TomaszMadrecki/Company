import Models.ContractEmployee;
import Models.HourlyEmployee;
import Models.SalariedEmployee;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void given_SalariedEmployee_When_CalculatePaycheck_Then_ReturnCorrectSalary() {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Justysia", "Sisi", "ul. Kowalska 15", 9480);

        assertEquals(8247.6, salariedEmployee.calculatePaycheck(), 1);
    }

    @Test
    public void given_HourlyEmployee_When_CalculatePaycheck_Then_ReturnCorrectSalary() {
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Justysia", "Sisi", "ul. Kowalska 15", 140, 95);

        assertEquals(13300, hourlyEmployee.calculatePaycheck(), 1);
    }

    @Test
    public void given_ContractEmployee_When_CalculatePaycheck_Then_ReturnCorrectSalary() {
        ContractEmployee contractEmployee = new ContractEmployee("Gosia", "Samosia", "ul. Mydlana 12/2", 7340);

        assertEquals(6239, contractEmployee.calculatePaycheck(), 1);
    }
}
