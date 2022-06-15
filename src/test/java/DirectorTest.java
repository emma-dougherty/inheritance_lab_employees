import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    
    Director director;
    Developer developer;
    
    @Before
    public void before() {
        director = new Director("Michael Scott", "US765", 50000, "Sales", 2500.50);
        developer = new Developer ("Maurice Moss", "CB123", 30000);
    
    }
    
    @Test
    public void hasName() {
        assertEquals("Michael Scott", director.getName());
    }
    
    @Test
    public void hasNINumber() {
        assertEquals("US765", director.getNINumber());
    }
    
    @Test
    public void hasSalary() {
        assertEquals(50000, director.getSalary(), 0.00);
    }
    
    @Test
    public void hasDebtName() {
        assertEquals("Sales", director.getDeptName());
    }
    
    @Test
    public void hasBudget() {
        assertEquals(2500.50, director.getBudget(), 0.00);
    }
    
    @Test
    public void canGetPayBonus() {
        assertEquals(500.00, director.payBonus(),0.00);
    }
    @Test
    public void canRaiseSalary() {
        director.raiseSalary(500.00);
        assertEquals(50500.00, director.getSalary(), 0.00);
    }
    
    @Test
    public void cannotRaiseSalaryIfNegativeValue() {
        director.raiseSalary(-55000);
        assertEquals(50000, director.getSalary(), 0.00);
    }
    
    @Test
    public void canChangeEmployeeName() {
        developer.setName("Moss");
        assertEquals("Moss", developer.getName());
    }
}
