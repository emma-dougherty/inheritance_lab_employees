import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    
    Developer developer;
    
    @Before
    public void before() {
        developer = new Developer ("Maurice Moss", "CB123", 40000);
    }
    
    @Test
    public void hasName() {
        assertEquals("Maurice Moss", developer.getName());
    }
    
    @Test
    public void hasNINumber() {
        assertEquals("CB123", developer.getNINumber());
    }
    
    @Test
    public void hasSalary() {
        assertEquals(40000, developer.getSalary(), 0.00);
    }
    
    @Test
    public void canGetPayBonus() {
        assertEquals(400.00, developer.payBonus(),0.00);
    }
    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(400.00);
        assertEquals(40400.00, developer.getSalary(), 0.00);
    }
    
}
