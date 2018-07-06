package scheduler;

//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("austin");
        dataSource.setPassword("ret2fli9");
        dataSource.setServerName("shardrealms.com");
        dataSource.setDatabaseName("austin_stuff");
        List<Employee> employees;
        try {
            employees = getEmployees(dataSource);
            System.out.print(employees);
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }

    /*private static List<Employee> getEmployees(MysqlDataSource dataSource) throws SQLException {
        List<Employee> employees = new ArrayList<Employee>();
        Connection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM employees;");

        while (rs.next()) {
            Employee employee = new Employee();
            employee.setID(rs.getString("employeeId"));
            employee.setName(rs.getString("name"));
            employee.setPhoneNumber(rs.getLong("phoneNumber"));
            employee.setHoursScheduled(rs.getInt("hoursScheduled"));
            employee.setHourCap(rs.getInt("hourCap"));
            employee.setOvertime(rs.getBoolean("overtime"));
            employees.add(employee);
        }

        rs.close();
        stmt.close();
        conn.close();

        return employees;
    }*/

}
