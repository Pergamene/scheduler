package scheduler;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DatabaseAccess interacts with the set up MySQL database so that data may persist between sessions.
 */
public class DatabaseAccess {

    private MysqlDataSource dataSource;

    /**
     * Sets database to the precreated database.
     */
    public DatabaseAccess() {
        dataSource = new MysqlDataSource();
        dataSource.setUser("austin");
        dataSource.setPassword("filler");    // @TODO: Fill password
        dataSource.setServerName("shardrealms.com");
        dataSource.setDatabaseName("austin_stuff");
    }

    /**
     * Interacts with the database to get a specific employee based ont the name provided. Returns employee
     * @param employeeName
     * @return
     */
    public Employee getEmployee(String employeeName) {
        Employee employee = new Employee();
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employees WHERE name = '" + employeeName + "'");
            while(rs.next()) {
                employee.setId(rs.getString("employeeId"));
                employee.setName(rs.getString("name"));
                employee.setPhoneNumber(rs.getLong("phoneNumber"));
                employee.setHoursScheduled(rs.getInt("hoursScheduled"));
                employee.setHourCap(rs.getInt("hourCap"));
                employee.setOvertime(rs.getBoolean("overtime"));
                employee.setTaps(rs.getBoolean("taps"));
                employee.setWorkProfile(getWorkProfiles(employee.getId()));
                employee.setAvailability(getAvailability(employee.getId()));
            }
            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    /**
     * Interacts with the database to get a specific employee based ont the ID provided. Returns employee
     * @param employeeId
     * @return
     */
    public Employee getEmployee(int employeeId) {
        Employee employee = new Employee();
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employees WHERE employeeid = " + employeeId);
            while(rs.next()) {
                employee = getEmployee(rs.getString("employeeId"));
            }
            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    /**
     * Returns all employees found in the database. Returns employees (list)
     * @return
     */
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        Employee employee;
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employees");
            while(rs.next()) {
                employee = getEmployee(rs.getString("name"));
                employees.add(employee);
            }
            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    /**
     * Takes an employee value and adds it to the database.
     * @param employee
     */
    public void addEmployee(Employee employee) {
        try {
            Connection connection = dataSource.getConnection();
            //Populate employees table
            String query = "INSERT INTO employees(employeeId, name, hourCap, overtime, phoneNumber) " +
                    "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setInt(3, employee.getHourCap());
            preparedStatement.setBoolean(4, employee.getOvertime());
            preparedStatement.setLong(5, employee.getPhoneNumber());
            preparedStatement.execute();
            //Populate workProfiles table
            query = "INSERT INTO workProfiles(employeeId, rank, area) " +
                    "VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(query);
            for(WorkProfile profile: employee.getWorkProfile()) {
                preparedStatement.setString(1, employee.getId());
                preparedStatement.setString(2, "" + profile.getRank());
                preparedStatement.setString(3, "" + profile.getArea());
                preparedStatement.execute();
            }
            //Populate availability table
            query = "INSERT INTO availability(employeeId, dayOfWeek, startTime, endTime, totalHours) " +
                    "VALUES (?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(query);
            Availability a = employee.getAvailability();
            if(a != null) {
                for (Day d : a.getAvailableDays().keySet()) {
                    preparedStatement.setString(1, employee.getId());
                    preparedStatement.setString(2, "" + d);
                    preparedStatement.setInt(3, a.getDay(d).getStartTime());
                    preparedStatement.setInt(4, a.getDay(d).getEndTime());
                    preparedStatement.setInt(5, a.getDay(d).getTotalHours());
                    preparedStatement.execute();
                }
            }
            //Populate requestedTimeOff table
            query = "INSERT INTO requestedTimeOff(employeeId, dayOfMonth, month, year) " +
                    "VALUES (?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(query);
            if(a.getRo() != null) {
                for (Date d : a.getRo()) {
                    preparedStatement.setString(1, employee.getId());
                    preparedStatement.setInt(2, d.getDay());
                    preparedStatement.setString(3, "" + d.getMont());
                    preparedStatement.setInt(4, d.getYear());
                    preparedStatement.execute();
                }
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Receives an employee and then allows edits of that employee
     * @param employee
     */
    public void updateEmployee(Employee employee) {
        try {
            Connection connection = dataSource.getConnection();
            //Populate employees table
            String query = "UPDATE employees SET employeeId = ?, name = ?, hourCap = ?, overtime = ?" +
                    "phoneNumber = ?, taps = ?" +
                    "WHERE employeeId = " + employee.getId();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setInt(3, employee.getHourCap());
            preparedStatement.setBoolean(4, employee.getOvertime());
            preparedStatement.setLong(5, employee.getPhoneNumber());
            preparedStatement.setBoolean(6, employee.getTaps());
            preparedStatement.execute();
            //Populate workProfiles table
            query = "UPDATE workProfiles SET employeeId = ?, rank = ?, area = ?" +
                    "WHERE employeeId = " + employee.getId() + " AND area = ?";
            preparedStatement = connection.prepareStatement(query);
            for(WorkProfile profile: employee.getWorkProfile()) {
                preparedStatement.setString(1, employee.getId());
                preparedStatement.setString(2, "" + profile.getRank());
                preparedStatement.setString(3, "" + profile.getArea());
                preparedStatement.setString(4, "" + profile.getArea());
                preparedStatement.execute();
            }
            //Populate availability table
            query = "UPDATE availability SET employeeId = ?, dayOfWeek = ?, startTime = ?, endTime = ?, totalHours = ?" +
                    "WHERE employeeId = " + employee.getId() + " AND dayOfWeek = ?";
            preparedStatement = connection.prepareStatement(query);
            Availability a = employee.getAvailability();
            if(a != null) {
                for (Day d : a.getAvailableDays().keySet()) {
                    preparedStatement.setString(1, employee.getId());
                    preparedStatement.setString(2, "" + d);
                    preparedStatement.setInt(3, a.getDay(d).getStartTime());
                    preparedStatement.setInt(4, a.getDay(d).getEndTime());
                    preparedStatement.setInt(5, a.getDay(d).getTotalHours());
                    preparedStatement.setString(6, "" + d);
                    preparedStatement.execute();
                }
            }
            //Populate requestedTimeOff table
            query = "UPDATE requestedTimeOff SET employeeId = ?, dayOfMonth = ?, month = ?, year = ?" +
                    "WHERE employeeId = " + employee.getId() + " AND dayOfMonth = ? AND month = ?";
            preparedStatement = connection.prepareStatement(query);
            if(a.getRo() != null) {
                for (Date d : a.getRo()) {
                    preparedStatement.setString(1, employee.getId());
                    preparedStatement.setInt(2, d.getDay());
                    preparedStatement.setString(3, "" + d.getMont());
                    preparedStatement.setInt(4, d.getYear());
                    preparedStatement.setInt(5, d.getDay());
                    preparedStatement.setString(6, "" + d.getMont());
                    preparedStatement.execute();
                }
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns a dayProfile that matches the given profileLabel received.
     * @param profileLabel
     * @return
     */
    public DayProfile getDayProfile(String profileLabel) {
        DayProfile profile = new DayProfile(profileLabel);
        Shift s;
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM dayProfiles WHERE profileLabel = '"
                    + profileLabel + "'");
            while(rs.next()) {
                s = getShift(rs.getString("shiftName"), rs.getInt("shiftKey"));
                profile.addShift(s);
            }
            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return profile;
    }

    /**
     * Receives the name and key of a shift and then returns the matching shift in the database
     * @param shiftName
     * @param shiftKey
     * @return
     */
    private Shift getShift(String shiftName, int shiftKey) {
        Shift s = new Shift();
        Rank r;
        Area a;
        Time t;
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM shifts WHERE shiftName = '" + shiftName + "'");
            while(rs.next()) {
                s.setShiftName(rs.getString("shiftName"));
                r = Rank.valueOf(rs.getString("rank"));
                a = Area.valueOf(rs.getString("area"));
                s.setRequiredWorkProfile(new WorkProfile(r, a));
                t = new Time(rs.getInt("startTime"), rs.getInt("endTime"));
                s.setTime(t);
            }
            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return s;
    }

    /**
     * Receives an employeeID and returns the list of employee workProfiles in the database.
     * @param employeeId
     * @return
     */
    private List<WorkProfile> getWorkProfiles(String employeeId) {
        List<WorkProfile> profiles = new ArrayList<WorkProfile>();
        WorkProfile profile;
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM workProfiles WHERE employeeId = " + employeeId);
            while(rs.next()) {
                profile = new WorkProfile(Rank.valueOf(rs.getString("rank")),
                        Area.valueOf(rs.getString("area")));
                profiles.add(profile);
            }
            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return profiles;
    }

    /**
     * Receives an employeeID and returns the employee's availability in the database.
     * @param employeeId
     * @return
     */
    private Availability getAvailability(String employeeId) {
        Availability a = new Availability();
        Day d;
        Time t;
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM availability WHERE employeeId = " + employeeId);
            while(rs.next()) {
                d = Day.valueOf(rs.getString("dayOfWeek"));
                t = new Time(rs.getInt("startTime"), rs.getInt("endTime"));
                a.addRequestedTimeOff(getRo(employeeId));
                a.addAvailableDay(d, t);
            }
            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }

    /**
     * Receives an employeeID and returns the list of requested time off by the employee in the database.
     * @param employeeId
     * @return
     */
    private List<Date> getRo(String employeeId) {
        List<Date> roDates = new ArrayList<Date>();
        Date d;
        int dayOfMonth;
        Month m;
        int y;
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM requestedTimeOff WHERE employeeId = "
                    + employeeId);
            while (rs.next()) {
                dayOfMonth = rs.getInt("dayOfMonth");
                m = Month.valueOf(rs.getString("month"));
                y = rs.getInt("year");
                d = new Date(dayOfMonth, m, y);
                roDates.add(d);
            }
            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return roDates;
    }
}