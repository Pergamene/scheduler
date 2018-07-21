package scheduler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Simple test class to verify access to database.
 */
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
        e = dba.getEmployee("Bob Rice");
        System.out.println(e);
        assertTrue(true);
    }

    @Test
    void getEmployeesTest() {
        List<Employee> employees = dba.getEmployees();
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