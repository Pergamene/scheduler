package scheduler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseAccessTest {

    private DatabaseAccess dba;
    private Employee e;

    @BeforeEach
    void setUp() {
        dba = new DatabaseAccess();
        e = new Employee("Nena", "812", 888888888, new WorkProfile(Rank.SHIFT_MANAGER, Area.CASHIER));
    }

    @Test
    void getEmployeeTest() {
        e = dba.getEmployee("Austin");
        System.out.println(e);
        assertTrue(true);
    }

    @Test
    void addEmployeeTest() {
        dba.addEmployee(e);
    }

    @Test
    void getDayProfileTest() {
        DayProfile profile = dba.getDayProfile("Monday Morning");
    }
}