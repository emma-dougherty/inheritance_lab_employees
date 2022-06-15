import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    
    Manager manager;
    
    @Before
    public void before() {
        manager = new Manager("Michael Scott", "US765", 50000, "Sales");
    }
    
    @Test
    public void hasName() {
        assertEquals("Michael Scott", manager.getName());
    }
    
    @Test
    public void hasNINumber() {
        assertEquals("US765", manager.getNINumber());
    }
    
    @Test
    public void hasSalary() {
        assertEquals(50000, manager.getSalary());
    }
    
    @Test
    public void hasDebtName() {
        assertEquals("Sales", manager.getDeptName());
    }
    
    @Test
    public void canGetPayBonus() {
        assertEquals(500.00, manager.payBonus(),0.00);
    }
    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(500.00);
        assertEquals(50500.00, manager.getSalary(), 0.00);
    }
    
}
