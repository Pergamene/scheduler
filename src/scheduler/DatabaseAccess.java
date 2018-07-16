package scheduler;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseAccess {

    private MysqlDataSource dataSource;

    public DatabaseAccess() {
        dataSource = new MysqlDataSource();
        dataSource.setUser("austin");
        dataSource.setPassword("ret2fli9");
        dataSource.setServerName("shardrealms.com");
        dataSource.setDatabaseName("austin_stuff");
    }

    public Employee getEmployee(String employeeName) {
        Employee employee = new Employee();
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employees WHERE name = '" + employeeName + "'");
            employee.setId(rs.getString("employeeId"));
            employee.setName(rs.getString("name"));
            employee.setPhoneNumber(rs.getLong("phoneNumber"));
            employee.setHoursScheduled(rs.getInt("hoursScheduled"));
            employee.setHourCap(rs.getInt("hourCap"));
            employee.setOvertime(rs.getBoolean("overtime"));
            employee.setTaps(rs.getBoolean("taps"));
            employee.setWorkProfile(getWorkProfiles(employee.getId()));
            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    public Employee getEmployee(int employeeId) {
        Employee employee = new Employee();
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employees WHERE employeeid = " + employeeId);
            employee = getEmployee(rs.getString("employeeId"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        Employee employee;
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employees");
            while (rs.next()) {
                employee = getEmployee(rs.getString("employeeName"));
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

    private List<WorkProfile> getWorkProfiles(String employeeId) {
        List<WorkProfile> profiles = new ArrayList<WorkProfile>();
        WorkProfile profile;
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM workProfiles WHERE employeeId = " + employeeId);
            while (rs.next()) {
                profile = setProfile(rs.getString("rank"), rs.getString("area"));
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

    private WorkProfile setProfile(String rank, String area) {
        Rank r;
        Area a;
        rank = rank.toLowerCase();
        area = area.toLowerCase();
        if(rank.equals("team member")) {
            r = Rank.TEAM_MEMBER;
        }
        else if(rank.equals("team leader")) {
            r = Rank.TEAM_LEADER;
        }
        else if(rank.equals("supervisor")) {
            r = Rank.SUPERVISOR;
        }
        else {
            r = Rank.SHIFT_MANAGER;
        }
        if(area.equals("cashier")) {
            a = Area.CASHIER;
        }
        else if(area.equals("arcade")) {
            a = Area.ARCADE;
        }
        else if(area.equals("outside")) {
            a = Area.OUTSIDE;
        }
        else if(area.equals("server")) {
            a = Area.SERVER;
        }
        else {
            a = Area.COOK;
        }
        return new WorkProfile(r, a);
    }

    private Availability getAvailability(String employeeId) {
        Availability a = new Availability();
        Day d;
        Time t;
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM workProfiles WHERE employeeId = " + employeeId);
            while (rs.next()) {
                d = getDay(rs.getString("dayOfWeek"));
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

    private Day getDay(String dayOfWeek) {
        Day d;
        switch(dayOfWeek) {
            case "Sunday":
                d = Day.SUNDAY;
                break;
            case "Monday":
                d = Day.MONDAY;
                break;
            case "Tuesday":
                d = Day.TUESDAY;
                break;
            case "Wednesday":
                d = Day.WEDNESDAY;
                break;
            case "Thursday":
                d = Day.THURSDAY;
                break;
            case "Friday":
                d = Day.FRIDAY;
                break;
            default:
                d = Day.SATURDAY;
        }
        return d;
    }

    private List<Date> getRo(String employeeId) {
        List<Date> roDates = new ArrayList<Date>();
        Date d;
        int dayOfMonth;
        Month m;
        int y;
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM requestedTimeOff WHERE employeeid = " + employeeId);
            while (rs.next()) {
                dayOfMonth = rs.getInt("dayOfMonth");
                m = setMonth(rs.getString("month"));
                y = rs.getInt("year");
                d = new Date(dayOfMonth, m, y);
                roDates.add(d);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return roDates;
    }

    private Month setMonth(String month) {
        Month m;
        switch(month) {
            case "January":
                m = Month.JANUARY;
                break;
            case "February":
                m = Month.FEBRUARY;
                break;
            case "March":
                m = Month.MARCH;
                break;
            case "April":
                m = Month.APRIL;
                break;
            case "May":
                m = Month.MAY;
                break;
            case "June":
                m = Month.JUNE;
                break;
            case "July":
                m = Month.JULY;
                break;
            case "August":
                m = Month.AUGUST;
                break;
            case "September":
                m = Month.SEPTEMBER;
                break;
            case "October":
                m = Month.OCTOBER;
                break;
            case "November":
                m = Month.NOVEMBER;
                break;
            default:
                m = Month.DECEMBER;
        }
        return m;
    }
}