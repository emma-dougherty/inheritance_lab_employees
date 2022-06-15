import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    
    DatabaseAdmin databaseAdmin;
    
    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin ("Maurice Moss", "CB123", 40000);
    }
    
    @Test
    public void hasName() {
        assertEquals("Maurice Moss", databaseAdmin.getName());
    }
    
    @Test
    public void hasNINumber() {
        assertEquals("CB123", databaseAdmin.getNINumber());
    }
    
    @Test
    public void hasSalary() {
        assertEquals(40000, databaseAdmin.getSalary(), 0.00);
    }
    
    @Test
    public void canGetPayBonus() {
        assertEquals(400.00, databaseAdmin.payBonus(),0.00);
    }
    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(400.00);
        assertEquals(40400.00, databaseAdmin.getSalary(), 0.00);
    }
    
}
