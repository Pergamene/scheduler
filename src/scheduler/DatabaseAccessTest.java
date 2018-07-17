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
    }

    @Test
    void getEmployee() {
        e = dba.getEmployee(804);
        assertTrue(e.toString().equals("Employee{" +
                "name='" + "Austin" + '\'' +
                ", id='" + "804" + '\'' +
                ", phoneNumber=" + 801434343 +
                ", hoursScheduled=" + 0 +
                ", hourCap=" + 1 +
                ", overtime=" + 0 +
                '}'));
    }

    @Test
    void getEmployee1() {
    }

    @Test
    void getEmployees() {
    }

    @Test
    void addEmployee() {
    }
}