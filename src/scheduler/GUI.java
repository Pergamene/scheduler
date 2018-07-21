package scheduler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
//Excel functionality was placed at bottom commented out @# is a key to know where they go should it be desired again.
//@1

/**
 * GUI is the interface the user interacts with. All controls the user uses are stored and manipulated in GUI.
 */
public class GUI extends Container {

    private Employee employee = new Employee();
    private Employee employeeTest = new Employee();
    private List<Employee> employeeList = new ArrayList<Employee>();
    private Availability availability = new Availability();
    private Time time = new Time();
    private DayProfile dayProfile = new DayProfile();
    private List<DayProfile> dayProfiles = new ArrayList<>();
    private String[] weekProfile = new String[7];
    private Shift shift = new Shift();
    private String shiftName = new String();
    private DatabaseAccess databaseAccess = new DatabaseAccess();
    private WorkProfile workProfile = new WorkProfile();
    private List<WorkProfile> workProfiles = new ArrayList<>();

    private List<Employee> employeeListS = new ArrayList<Employee>();
    private List<Employee> employeeListS1 = new ArrayList<Employee>();
    private String displayEmployees = new String();

    private List<DayProfile> dayProfilesDefault = new ArrayList<>();
    private Schedule schedule = new Schedule();
    //private JFrame frameTest = new JFrame("Test");


    private JPanel Employee;
    private JPanel panelControl;
    private JPanel Week;
    private JPanel Schedule;
    private JButton buttonE1;
    private JButton buttonW1;
    private JLabel nameLabel;
    private JLabel phoneLabel;
    private JLabel hrsPerWeekLabel;
    private JTextField nameTextField;
    private JTextField IDTextField;
    private JTextField phoneTextField;
    private JTextField hrsPerWeekTextField;
    private JButton addEmployeeButton;
    private JButton viewEmployeeButton;
    private JLabel tuesdayLabel;
    private JLabel wednesdayLabel;
    private JLabel mondayLabel;
    private JLabel thursdayLabel;
    private JLabel sundayLabel;
    private JLabel fridayLabel;
    private JLabel saturdayLabel;
    private JButton buttonE2;
    private JButton buttonS2;

    private JLabel availabilityLabel;
    private JButton buttonSetWeekNeeds;
    private JLabel sundayLabelW1;
    private JLabel mondayLabelW1;
    private JLabel tuesdayLabelW1;
    private JLabel wednesdayLabelW1;
    private JLabel thursdayLabelW1;
    private JLabel fridayLabelW1;
    private JLabel saturdayLabelW1;

    //Sunday-Saturday WeekDataSetWeek
    private JComboBox comboBoxSunday;
    private JComboBox comboBoxMonday;
    private JComboBox comboBoxTuesday;
    private JComboBox comboBoxWednesday;
    private JComboBox comboBoxThursday;
    private JComboBox comboBoxFriday;
    private JComboBox comboBoxSaturday;
    private JComboBox comboBoxNDDay;
    private JButton createScheduleButton;
    private JButton saveScheduleButton;
    private JTextField sun1;
    private JTextField sun2;
    private JTextField mon1;
    private JTextField mon2;
    private JComboBox sunAMPM1;
    private JComboBox monAMPM1;
    private JTextField tue1;
    private JTextField tue2;
    private JTextField wed1;
    private JTextField wed2;
    private JTextField thur1;
    private JTextField thur2;
    private JTextField fri1;
    private JTextField fri2;
    private JTextField sat1;
    private JTextField sat2;
    private JComboBox tueAMPM1;
    private JComboBox wedAMPM1;
    private JComboBox thurAMPM1;
    private JComboBox friAMPM1;
    private JComboBox satAMPM1;
    private JComboBox sunAMPM2;
    private JComboBox monAMPM2;
    private JComboBox tueAMPM2;
    private JComboBox wedAMPM2;
    private JComboBox thurAMPM2;
    private JComboBox friAMPM2;
    private JComboBox satAMPM2;
    private JComboBox comboBoxNDArea1;
    private JComboBox comboBoxNDRank1;
    private JComboBox comboBoxNDStartTime1;
    private JComboBox comboBoxNDEndTime1;
    private JTextField textFieldNDDayName;
    private JTextField textFieldNDStartTime1;
    private JTextField textFieldNDEndTime1;
    private JTextField textFieldNDNumberShifts1;
    private JButton addShiftButtonND;
    private JComboBox comboBoxNDArea2;
    private JComboBox comboBoxNDRank2;
    private JComboBox comboBoxNDStartTime2;
    private JComboBox comboBoxNDEndTime2;
    private JComboBox comboBoxNDArea3;
    private JComboBox comboBoxNDRank3;
    private JComboBox comboBoxNDStartTime3;
    private JComboBox comboBoxNDEndTime3;
    private JComboBox comboBoxNDArea4;
    private JComboBox comboBoxNDRank4;
    private JComboBox comboBoxNDStartTime4;
    private JComboBox comboBoxNDEndTime4;
    private JComboBox comboBoxNDArea5;
    private JComboBox comboBoxNDRank5;
    private JComboBox comboBoxNDStartTime5;
    private JComboBox comboBoxNDEndTime5;
    private JComboBox comboBoxNDArea6;
    private JComboBox comboBoxNDRank6;
    private JComboBox comboBoxNDStartTime6;
    private JComboBox comboBoxNDEndTime6;
    private JComboBox comboBoxNDArea7;
    private JComboBox comboBoxNDRank7;
    private JComboBox comboBoxNDStartTime7;
    private JComboBox comboBoxNDEndTime7;
    private JComboBox comboBoxNDArea8;
    private JComboBox comboBoxNDRank8;
    private JComboBox comboBoxNDStartTime8;
    private JComboBox comboBoxNDEndTime8;
    private JComboBox comboBoxNDArea9;
    private JComboBox comboBoxNDRank9;
    private JComboBox comboBoxNDStartTime9;
    private JComboBox comboBoxNDEndTime9;
    private JComboBox comboBoxNDArea10;
    private JComboBox comboBoxNDRank10;
    private JComboBox comboBoxNDStartTime10;
    private JComboBox comboBoxNDEndTime10;
    private JComboBox comboBoxNDArea11;
    private JComboBox comboBoxNDRank11;
    private JComboBox comboBoxNDStartTime11;
    private JComboBox comboBoxNDEndTime11;
    private JComboBox comboBoxNDArea12;
    private JComboBox comboBoxNDRank12;
    private JComboBox comboBoxNDStartTime12;
    private JComboBox comboBoxNDEndTime12;
    private JComboBox comboBoxNDArea13;
    private JComboBox comboBoxNDRank13;
    private JComboBox comboBoxNDStartTime13;
    private JComboBox comboBoxNDEndTime13;
    private JComboBox comboBoxNDArea14;
    private JComboBox comboBoxNDRank14;
    private JComboBox comboBoxNDStartTime14;
    private JComboBox comboBoxNDEndTime14;
    private JComboBox comboBoxNDArea15;
    private JComboBox comboBoxNDRank15;
    private JComboBox comboBoxNDStartTime15;
    private JComboBox comboBoxNDEndTime15;
    private JComboBox comboBoxNDArea16;
    private JComboBox comboBoxNDRank16;
    private JComboBox comboBoxNDStartTime16;
    private JComboBox comboBoxNDEndTime16;
    private JComboBox comboBoxNDEndTime17;
    private JComboBox comboBoxNDStartTime17;
    private JComboBox comboBoxNDRank17;
    private JComboBox comboBoxNDArea17;
    private JComboBox comboBoxNDEndTime18;
    private JComboBox comboBoxNDStartTime18;
    private JComboBox comboBoxNDRank18;
    private JComboBox comboBoxNDArea18;
    private JComboBox comboBoxNDEndTime19;
    private JComboBox comboBoxNDStartTime19;
    private JComboBox comboBoxNDRank19;
    private JComboBox comboBoxNDArea19;
    private JComboBox comboBoxNDEndTime20;
    private JComboBox comboBoxNDStartTime20;
    private JComboBox comboBoxNDRank20;
    private JComboBox comboBoxNDArea20;
    private JTextField textFieldNDNumberShifts2;
    private JTextField textFieldNDNumberShifts3;
    private JTextField textFieldNDNumberShifts4;
    private JTextField textFieldNDNumberShifts5;
    private JTextField textFieldNDNumberShifts6;
    private JTextField textFieldNDNumberShifts7;
    private JTextField textFieldNDNumberShifts8;
    private JTextField textFieldNDNumberShifts9;
    private JTextField textFieldNDNumberShifts10;
    private JTextField textFieldNDNumberShifts11;
    private JTextField textFieldNDNumberShifts12;
    private JTextField textFieldNDNumberShifts13;
    private JTextField textFieldNDNumberShifts14;
    private JTextField textFieldNDNumberShifts15;
    private JTextField textFieldNDNumberShifts16;
    private JTextField textFieldNDNumberShifts17;
    private JTextField textFieldNDNumberShifts18;
    private JTextField textFieldNDNumberShifts19;
    private JTextField textFieldNDNumberShifts20;
    private JTextField textFieldNDEndTime20;
    private JTextField textFieldNDEndTime19;
    private JTextField textFieldNDEndTime18;
    private JTextField textFieldNDEndTime17;
    private JTextField textFieldNDEndTime16;
    private JTextField textFieldNDEndTime15;
    private JTextField textFieldNDEndTime14;
    private JTextField textFieldNDEndTime13;
    private JTextField textFieldNDEndTime12;
    private JTextField textFieldNDEndTime11;
    private JTextField textFieldNDEndTime10;
    private JTextField textFieldNDEndTime9;
    private JTextField textFieldNDEndTime8;
    private JTextField textFieldNDEndTime7;
    private JTextField textFieldNDEndTime6;
    private JTextField textFieldNDEndTime5;
    private JTextField textFieldNDEndTime4;
    private JTextField textFieldNDEndTime3;
    private JTextField textFieldNDEndTime2;
    private JTextField textFieldNDStartTime2;
    private JTextField textFieldNDStartTime3;
    private JTextField textFieldNDStartTime4;
    private JTextField textFieldNDStartTime5;
    private JTextField textFieldNDStartTime6;
    private JTextField textFieldNDStartTime7;
    private JTextField textFieldNDStartTime8;
    private JTextField textFieldNDStartTime9;
    private JTextField textFieldNDStartTime10;
    private JTextField textFieldNDStartTime11;
    private JTextField textFieldNDStartTime12;
    private JTextField textFieldNDStartTime13;
    private JTextField textFieldNDStartTime14;
    private JTextField textFieldNDStartTime15;
    private JTextField textFieldNDStartTime20;
    private JTextField textFieldNDStartTime19;
    private JTextField textFieldNDStartTime18;
    private JTextField textFieldNDStartTime17;
    private JTextField textFieldNDStartTime16;
    private JButton loadWeekNeedsButton;
    private JPanel Test1;
    private JPanel WeekCard;
    private JPanel EmployeeCard;
    private JPanel ScheduleCard;
    private JComboBox comboBoxEmployeeArea;
    private JComboBox comboBoxEmployeeRank;
    private JLabel labelTest;
    private JPanel SchedulePrime;
    private JComboBox comboBoxSundaySchedule;
    private JComboBox comboBoxMondaySchedule;
    private JComboBox comboBoxTuesdaySchedule;
    private JComboBox comboBoxWednesdaySchedule;
    private JComboBox comboBoxThursdaySchedule;
    private JComboBox comboBoxFridaySchedule;
    private JComboBox comboBoxSaturdaySchedule;
    private JComboBox comboBoxViewEmployees;
    private JButton defaultWeekNeedsButton;
    private JButton createDefaultScheduleButton;

    public GUI() {
        nameTextField.addActionListener(new ActionListener() { //nameTextField in Employee
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(nameTextField.getText());
            }
        });

        /*
         ADD EMPLOYEE
         */
        /**
         * The addEmployeeButton ActionListener takes all inserted data and puts it into the SQL database.
         */
        addEmployeeButton.addActionListener(new ActionListener() { //ADD EMPLOYEE BUTTON
            @Override
            public void actionPerformed(ActionEvent e) {

                //try {

                    System.out.println(nameTextField.getText());
                    System.out.println(IDTextField.getText());
                    System.out.println(Long.parseLong(phoneTextField.getText()));
                    System.out.println(Integer.parseInt(hrsPerWeekTextField.getText()));
                    System.out.println(Integer.parseInt(sun1.getText()));
                    System.out.println(sunAMPM1.getSelectedItem());//AM or PM for First Sunday value


                    employee.setName(nameTextField.getText());
                    employee.setId(IDTextField.getText());
                    employee.setPhoneNumber(Long.parseLong(phoneTextField.getText()));
                    employee.setHourCap(Integer.parseInt(hrsPerWeekTextField.getText()));

                    //Sunday Availability
                    if (sunAMPM1.getSelectedItem() == "AM" && sunAMPM2.getSelectedItem() == "AM") {
                        availability.addAvailableDay(Day.SUNDAY, new Time(Integer.parseInt(sun1.getText()), Integer.parseInt(sun2.getText())));
                    } else if (sunAMPM1.getSelectedItem() == "AM" && sunAMPM2.getSelectedItem() == "PM") {
                        availability.addAvailableDay(Day.SUNDAY, new Time(Integer.parseInt(sun1.getText()), (Integer.parseInt(sun2.getText()) + 12)));
                    } else if (sunAMPM1.getSelectedItem() == "PM" && sunAMPM2.getSelectedItem() == "PM") {
                        availability.addAvailableDay(Day.SUNDAY, new Time((Integer.parseInt(sun1.getText()) + 12), (Integer.parseInt(sun2.getText()) + 12)));
                    } System.out.println(availability.getTotalHours());

                    //Monday Availability
                    if (monAMPM1.getSelectedItem() == "AM" && monAMPM2.getSelectedItem() == "AM") {
                        availability.addAvailableDay(Day.MONDAY, new Time(Integer.parseInt(mon1.getText()), Integer.parseInt(mon2.getText())));
                    } else if (monAMPM1.getSelectedItem() == "AM" && monAMPM2.getSelectedItem() == "PM") {
                        availability.addAvailableDay(Day.MONDAY, new Time(Integer.parseInt(mon1.getText()), (Integer.parseInt(mon2.getText()) + 12)));
                    } else if (monAMPM1.getSelectedItem() == "PM" && monAMPM2.getSelectedItem() == "PM") {
                        availability.addAvailableDay(Day.MONDAY, new Time((Integer.parseInt(mon1.getText()) + 12), (Integer.parseInt(mon2.getText()) + 12)));
                    } System.out.println(availability.getTotalHours());

                    //Tuesday Availability
                    if (tueAMPM1.getSelectedItem() == "AM" && tueAMPM2.getSelectedItem() == "AM") {
                        availability.addAvailableDay(Day.TUESDAY, new Time(Integer.parseInt(tue1.getText()), Integer.parseInt(tue2.getText())));
                    } else if (tueAMPM1.getSelectedItem() == "AM" && tueAMPM2.getSelectedItem() == "PM") {
                        availability.addAvailableDay(Day.TUESDAY, new Time(Integer.parseInt(tue1.getText()), (Integer.parseInt(tue2.getText()) + 12)));
                    } else if (tueAMPM1.getSelectedItem() == "PM" && tueAMPM2.getSelectedItem() == "PM") {
                        availability.addAvailableDay(Day.TUESDAY, new Time((Integer.parseInt(tue1.getText()) + 12), (Integer.parseInt(tue2.getText()) + 12)));
                    } System.out.println(availability.getTotalHours());

                    //Wednesday Availability
                    if (wedAMPM1.getSelectedItem() == "AM" && wedAMPM2.getSelectedItem() == "AM") {
                        availability.addAvailableDay(Day.WEDNESDAY, new Time(Integer.parseInt(wed1.getText()), Integer.parseInt(wed2.getText())));
                    } else if (wedAMPM1.getSelectedItem() == "AM" && wedAMPM2.getSelectedItem() == "PM") {
                        availability.addAvailableDay(Day.WEDNESDAY, new Time(Integer.parseInt(wed1.getText()), (Integer.parseInt(wed2.getText()) + 12)));
                    } else if (wedAMPM1.getSelectedItem() == "PM" && wedAMPM2.getSelectedItem() == "PM") {
                        availability.addAvailableDay(Day.WEDNESDAY, new Time((Integer.parseInt(wed1.getText()) + 12), (Integer.parseInt(wed2.getText()) + 12)));
                    } System.out.println(availability.getTotalHours());

                    //Thursday Availability
                    if (thurAMPM1.getSelectedItem() == "AM" && thurAMPM2.getSelectedItem() == "AM") {
                        availability.addAvailableDay(Day.THURSDAY, new Time(Integer.parseInt(thur1.getText()), Integer.parseInt(thur2.getText())));
                    } else if (thurAMPM1.getSelectedItem() == "AM" && thurAMPM2.getSelectedItem() == "PM") {
                        availability.addAvailableDay(Day.THURSDAY, new Time(Integer.parseInt(thur1.getText()), (Integer.parseInt(thur2.getText()) + 12)));
                    } else if (thurAMPM1.getSelectedItem() == "PM" && thurAMPM2.getSelectedItem() == "PM") {
                        availability.addAvailableDay(Day.THURSDAY, new Time((Integer.parseInt(thur1.getText()) + 12), (Integer.parseInt(thur2.getText()) + 12)));
                    } System.out.println(availability.getTotalHours());

                    //Friday Availability
                    if (friAMPM1.getSelectedItem() == "AM" && friAMPM2.getSelectedItem() == "AM") {
                        availability.addAvailableDay(Day.FRIDAY, new Time(Integer.parseInt(fri1.getText()), Integer.parseInt(fri2.getText())));
                    } else if (friAMPM1.getSelectedItem() == "AM" && friAMPM2.getSelectedItem() == "PM") {
                        availability.addAvailableDay(Day.FRIDAY, new Time(Integer.parseInt(fri1.getText()), (Integer.parseInt(fri2.getText()) + 12)));
                    } else if (friAMPM1.getSelectedItem() == "PM" && friAMPM2.getSelectedItem() == "PM") {
                        availability.addAvailableDay(Day.FRIDAY, new Time((Integer.parseInt(fri1.getText()) + 12), (Integer.parseInt(fri2.getText()) + 12)));
                    } System.out.println(availability.getTotalHours());

                    //Saturday Availability
                    if (satAMPM1.getSelectedItem() == "AM" && satAMPM2.getSelectedItem() == "AM") {
                        availability.addAvailableDay(Day.SATURDAY, new Time(Integer.parseInt(sat1.getText()), Integer.parseInt(sat2.getText())));
                    } else if (satAMPM1.getSelectedItem() == "AM" && satAMPM2.getSelectedItem() == "PM") {
                        availability.addAvailableDay(Day.SATURDAY, new Time(Integer.parseInt(sat1.getText()), (Integer.parseInt(sat2.getText()) + 12)));
                    } else if (satAMPM1.getSelectedItem() == "PM" && satAMPM2.getSelectedItem() == "PM") {
                        availability.addAvailableDay(Day.SATURDAY, new Time((Integer.parseInt(sat1.getText()) + 12), (Integer.parseInt(sat2.getText()) + 12)));
                    } System.out.println(availability.getTotalHours());

                    workProfile.setWorkProfile(comboBoxEmployeeArea.getSelectedItem().toString(), comboBoxEmployeeRank.getSelectedItem().toString());
                    workProfiles.add(workProfile);
                    employee.setWorkProfile(workProfiles);
                    employee.setAvailability(availability);
                    employeeList.add(employee);

                    //ADD EMPLOYEE TO DATABASE
                    databaseAccess.addEmployee(employee);

                    //TEST RETRIVAL OF NEW EMPLOYEE
                    System.out.println("database get employee");
                    employeeTest = databaseAccess.getEmployee(employee.getName());
                    System.out.println(employeeTest.getName());
                    System.out.println(employeeTest.getId());
                    System.out.println(employeeTest.getHourCap());
                    System.out.println(employeeTest.getPhoneNumber());
                System.out.println(employeeTest.getWorkProfile());

                    //@2
            }
        });
        IDTextField.addActionListener(new ActionListener() { //IDTextField
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        /*
        THIS ADDS EACH SHIFT TO A DAYPROFILE ONE AT A TIME.
         */
        /**
         * The addShiftButtonND ActionListener takes all inserted data into the addShift section of controls and
         * puts them into a list of dayProfiles. Time constrains prevented us from integrating them into the database.
         */
        addShiftButtonND.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textFieldNDDayName.getText()); //name of the new day
                System.out.println(comboBoxNDDay.getSelectedItem()); //day of the week
                System.out.println(textFieldNDNumberShifts1.getText()); //number of duplicate shifts to be made.
                System.out.println(comboBoxNDArea1.getSelectedItem()); //area of shift
                System.out.println(comboBoxNDRank1.getSelectedItem()); //rank of shift
                System.out.println(textFieldNDStartTime1.getText()); //start time of new shift
                System.out.println(comboBoxNDStartTime1.getSelectedItem()); //AM or PM of start shift
                System.out.println(textFieldNDEndTime1.getText()); //end time of new shift
                System.out.println(comboBoxNDEndTime1.getSelectedItem()); //AM or PM of end shift

                /*
                SET UP OUR TIME FROM VARIABLES
                 */

                int num = 0;
                dayProfile.setLabel(textFieldNDDayName.getText());
                dayProfile.setDay(comboBoxNDDay.getSelectedItem().toString());

                //SHIFT 1
                if(!textFieldNDNumberShifts1.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts1.getText());
                    if (comboBoxNDStartTime1.getSelectedItem() == "AM" && comboBoxNDEndTime1.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime1.getText()), Integer.parseInt(textFieldNDEndTime1.getText())));
                    } else if (comboBoxNDStartTime1.getSelectedItem() == "AM" && comboBoxNDEndTime1.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime1.getText()), (Integer.parseInt(textFieldNDEndTime1.getText()) + 12)));
                    } else if (comboBoxNDStartTime1.getSelectedItem() == "PM" && comboBoxNDEndTime1.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime1.getText()) + 12), (Integer.parseInt(textFieldNDEndTime1.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts1.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea1.getSelectedItem() + comboBoxNDRank1.getSelectedItem() + textFieldNDStartTime1.getText()
                                + comboBoxNDStartTime1.getSelectedItem() + textFieldNDEndTime1.getText() + comboBoxNDEndTime1.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        ////System.out.println("HERE " + comboBoxNDArea1.getSelectedItem().toString() + " " + comboBoxNDRank1.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea1.getSelectedItem().toString(), comboBoxNDRank1.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                        dayProfile.display();
                    }
                    num++;

                }
                //SHIFT 2
                if(!textFieldNDNumberShifts2.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts2.getText());
                    if (comboBoxNDStartTime2.getSelectedItem() == "AM" && comboBoxNDEndTime2.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime2.getText()), Integer.parseInt(textFieldNDEndTime2.getText())));
                    } else if (comboBoxNDStartTime2.getSelectedItem() == "AM" && comboBoxNDEndTime2.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime2.getText()), (Integer.parseInt(textFieldNDEndTime2.getText()) + 12)));
                    } else if (comboBoxNDStartTime2.getSelectedItem() == "PM" && comboBoxNDEndTime2.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime2.getText()) + 12), (Integer.parseInt(textFieldNDEndTime2.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts2.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea2.getSelectedItem() + comboBoxNDRank2.getSelectedItem() + textFieldNDStartTime2.getText()
                                + comboBoxNDStartTime2.getSelectedItem() + textFieldNDEndTime2.getText() + comboBoxNDEndTime2.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea2.getSelectedItem().toString() + " " + comboBoxNDRank2.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea2.getSelectedItem().toString(), comboBoxNDRank2.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                        dayProfile.display();
                    }
                    num++;

                }

                //SHIFT 3
                if(!textFieldNDNumberShifts3.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts3.getText());
                    if (comboBoxNDStartTime3.getSelectedItem() == "AM" && comboBoxNDEndTime3.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime3.getText()), Integer.parseInt(textFieldNDEndTime3.getText())));
                    } else if (comboBoxNDStartTime3.getSelectedItem() == "AM" && comboBoxNDEndTime3.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime3.getText()), (Integer.parseInt(textFieldNDEndTime3.getText()) + 12)));
                    } else if (comboBoxNDStartTime3.getSelectedItem() == "PM" && comboBoxNDEndTime3.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime3.getText()) + 12), (Integer.parseInt(textFieldNDEndTime3.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts3.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea3.getSelectedItem() + comboBoxNDRank3.getSelectedItem() + textFieldNDStartTime3.getText()
                                + comboBoxNDStartTime3.getSelectedItem() + textFieldNDEndTime3.getText() + comboBoxNDEndTime3.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea3.getSelectedItem().toString() + " " + comboBoxNDRank3.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea3.getSelectedItem().toString(), comboBoxNDRank3.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                        dayProfile.display();
                    }
                    num++;

                }

                //SHIFT 4
                if(!textFieldNDNumberShifts4.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts4.getText());
                    if (comboBoxNDStartTime4.getSelectedItem() == "AM" && comboBoxNDEndTime4.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime4.getText()), Integer.parseInt(textFieldNDEndTime4.getText())));
                    } else if (comboBoxNDStartTime4.getSelectedItem() == "AM" && comboBoxNDEndTime4.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime4.getText()), (Integer.parseInt(textFieldNDEndTime4.getText()) + 12)));
                    } else if (comboBoxNDStartTime4.getSelectedItem() == "PM" && comboBoxNDEndTime4.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime4.getText()) + 12), (Integer.parseInt(textFieldNDEndTime4.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts4.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea4.getSelectedItem() + comboBoxNDRank4.getSelectedItem() + textFieldNDStartTime4.getText()
                                + comboBoxNDStartTime4.getSelectedItem() + textFieldNDEndTime4.getText() + comboBoxNDEndTime4.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea4.getSelectedItem().toString() + " " + comboBoxNDRank4.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea4.getSelectedItem().toString(), comboBoxNDRank4.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                    }
                    num++;
                }

                //SHIFT 5
                if(!textFieldNDNumberShifts5.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts5.getText());
                    if (comboBoxNDStartTime5.getSelectedItem() == "AM" && comboBoxNDEndTime5.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime5.getText()), Integer.parseInt(textFieldNDEndTime5.getText())));
                    } else if (comboBoxNDStartTime5.getSelectedItem() == "AM" && comboBoxNDEndTime5.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime5.getText()), (Integer.parseInt(textFieldNDEndTime5.getText()) + 12)));
                    } else if (comboBoxNDStartTime5.getSelectedItem() == "PM" && comboBoxNDEndTime5.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime5.getText()) + 12), (Integer.parseInt(textFieldNDEndTime5.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts5.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea5.getSelectedItem() + comboBoxNDRank5.getSelectedItem() + textFieldNDStartTime5.getText()
                                + comboBoxNDStartTime5.getSelectedItem() + textFieldNDEndTime5.getText() + comboBoxNDEndTime5.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea5.getSelectedItem().toString() + " " + comboBoxNDRank5.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea5.getSelectedItem().toString(), comboBoxNDRank5.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                    }
                    num++;
                }

                //SHIFT 6
                if(!textFieldNDNumberShifts6.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts6.getText());
                    if (comboBoxNDStartTime6.getSelectedItem() == "AM" && comboBoxNDEndTime6.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime6.getText()), Integer.parseInt(textFieldNDEndTime6.getText())));
                    } else if (comboBoxNDStartTime6.getSelectedItem() == "AM" && comboBoxNDEndTime6.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime6.getText()), (Integer.parseInt(textFieldNDEndTime6.getText()) + 12)));
                    } else if (comboBoxNDStartTime6.getSelectedItem() == "PM" && comboBoxNDEndTime6.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime6.getText()) + 12), (Integer.parseInt(textFieldNDEndTime6.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts6.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea6.getSelectedItem() + comboBoxNDRank6.getSelectedItem() + textFieldNDStartTime6.getText()
                                + comboBoxNDStartTime6.getSelectedItem() + textFieldNDEndTime6.getText() + comboBoxNDEndTime6.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea6.getSelectedItem().toString() + " " + comboBoxNDRank6.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea6.getSelectedItem().toString(), comboBoxNDRank6.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                    }
                    num++;
                }

                //SHIFT 7
                if(!textFieldNDNumberShifts7.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts7.getText());
                    if (comboBoxNDStartTime7.getSelectedItem() == "AM" && comboBoxNDEndTime7.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime7.getText()), Integer.parseInt(textFieldNDEndTime7.getText())));
                    } else if (comboBoxNDStartTime7.getSelectedItem() == "AM" && comboBoxNDEndTime7.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime7.getText()), (Integer.parseInt(textFieldNDEndTime7.getText()) + 12)));
                    } else if (comboBoxNDStartTime7.getSelectedItem() == "PM" && comboBoxNDEndTime7.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime7.getText()) + 12), (Integer.parseInt(textFieldNDEndTime7.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts7.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea7.getSelectedItem() + comboBoxNDRank7.getSelectedItem() + textFieldNDStartTime7.getText()
                                + comboBoxNDStartTime7.getSelectedItem() + textFieldNDEndTime7.getText() + comboBoxNDEndTime7.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea7.getSelectedItem().toString() + " " + comboBoxNDRank7.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea7.getSelectedItem().toString(), comboBoxNDRank7.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                    }
                    num++;
                }

                //SHIFT 8
                if(!textFieldNDNumberShifts8.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts8.getText());
                    if (comboBoxNDStartTime8.getSelectedItem() == "AM" && comboBoxNDEndTime8.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime8.getText()), Integer.parseInt(textFieldNDEndTime8.getText())));
                    } else if (comboBoxNDStartTime8.getSelectedItem() == "AM" && comboBoxNDEndTime8.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime8.getText()), (Integer.parseInt(textFieldNDEndTime8.getText()) + 12)));
                    } else if (comboBoxNDStartTime8.getSelectedItem() == "PM" && comboBoxNDEndTime8.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime8.getText()) + 12), (Integer.parseInt(textFieldNDEndTime8.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts8.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea8.getSelectedItem() + comboBoxNDRank8.getSelectedItem() + textFieldNDStartTime8.getText()
                                + comboBoxNDStartTime8.getSelectedItem() + textFieldNDEndTime8.getText() + comboBoxNDEndTime8.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea8.getSelectedItem().toString() + " " + comboBoxNDRank8.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea8.getSelectedItem().toString(), comboBoxNDRank8.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                    }
                    num++;
                }

                //SHIFT 9
                if(!textFieldNDNumberShifts9.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts9.getText());
                    if (comboBoxNDStartTime9.getSelectedItem() == "AM" && comboBoxNDEndTime9.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime9.getText()), Integer.parseInt(textFieldNDEndTime9.getText())));
                    } else if (comboBoxNDStartTime9.getSelectedItem() == "AM" && comboBoxNDEndTime9.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime9.getText()), (Integer.parseInt(textFieldNDEndTime9.getText()) + 12)));
                    } else if (comboBoxNDStartTime9.getSelectedItem() == "PM" && comboBoxNDEndTime9.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime9.getText()) + 12), (Integer.parseInt(textFieldNDEndTime9.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts9.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea9.getSelectedItem() + comboBoxNDRank9.getSelectedItem() + textFieldNDStartTime9.getText()
                                + comboBoxNDStartTime9.getSelectedItem() + textFieldNDEndTime9.getText() + comboBoxNDEndTime9.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea9.getSelectedItem().toString() + " " + comboBoxNDRank9.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea9.getSelectedItem().toString(), comboBoxNDRank9.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                    }
                    num++;
                }

                //SHIFT 10
                if(!textFieldNDNumberShifts10.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts10.getText());
                    if (comboBoxNDStartTime10.getSelectedItem() == "AM" && comboBoxNDEndTime10.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime10.getText()), Integer.parseInt(textFieldNDEndTime10.getText())));
                    } else if (comboBoxNDStartTime10.getSelectedItem() == "AM" && comboBoxNDEndTime10.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime10.getText()), (Integer.parseInt(textFieldNDEndTime10.getText()) + 12)));
                    } else if (comboBoxNDStartTime10.getSelectedItem() == "PM" && comboBoxNDEndTime10.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime10.getText()) + 12), (Integer.parseInt(textFieldNDEndTime10.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts10.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea10.getSelectedItem() + comboBoxNDRank10.getSelectedItem() + textFieldNDStartTime10.getText()
                                + comboBoxNDStartTime10.getSelectedItem() + textFieldNDEndTime10.getText() + comboBoxNDEndTime10.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea10.getSelectedItem().toString() + " " + comboBoxNDRank10.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea10.getSelectedItem().toString(), comboBoxNDRank10.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                    }
                    num++;
                }

                //SHIFT 11
                if(!textFieldNDNumberShifts11.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts11.getText());
                    if (comboBoxNDStartTime11.getSelectedItem() == "AM" && comboBoxNDEndTime11.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime11.getText()), Integer.parseInt(textFieldNDEndTime11.getText())));
                    } else if (comboBoxNDStartTime11.getSelectedItem() == "AM" && comboBoxNDEndTime11.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime11.getText()), (Integer.parseInt(textFieldNDEndTime11.getText()) + 12)));
                    } else if (comboBoxNDStartTime11.getSelectedItem() == "PM" && comboBoxNDEndTime11.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime11.getText()) + 12), (Integer.parseInt(textFieldNDEndTime11.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts11.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea11.getSelectedItem() + comboBoxNDRank11.getSelectedItem() + textFieldNDStartTime11.getText()
                                + comboBoxNDStartTime11.getSelectedItem() + textFieldNDEndTime11.getText() + comboBoxNDEndTime11.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea11.getSelectedItem().toString() + " " + comboBoxNDRank11.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea11.getSelectedItem().toString(), comboBoxNDRank11.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                    }
                    num++;
                }

                //SHIFT 12
                if(!textFieldNDNumberShifts12.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts12.getText());
                    if (comboBoxNDStartTime12.getSelectedItem() == "AM" && comboBoxNDEndTime12.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime12.getText()), Integer.parseInt(textFieldNDEndTime12.getText())));
                    } else if (comboBoxNDStartTime12.getSelectedItem() == "AM" && comboBoxNDEndTime12.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime12.getText()), (Integer.parseInt(textFieldNDEndTime12.getText()) + 12)));
                    } else if (comboBoxNDStartTime12.getSelectedItem() == "PM" && comboBoxNDEndTime12.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime12.getText()) + 12), (Integer.parseInt(textFieldNDEndTime12.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts12.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea12.getSelectedItem() + comboBoxNDRank12.getSelectedItem() + textFieldNDStartTime12.getText()
                                + comboBoxNDStartTime12.getSelectedItem() + textFieldNDEndTime12.getText() + comboBoxNDEndTime12.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea12.getSelectedItem().toString() + " " + comboBoxNDRank12.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea12.getSelectedItem().toString(), comboBoxNDRank12.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                    }
                    num++;
                }

                //SHIFT 13
                if(!textFieldNDNumberShifts13.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts13.getText());
                    if (comboBoxNDStartTime13.getSelectedItem() == "AM" && comboBoxNDEndTime13.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime13.getText()), Integer.parseInt(textFieldNDEndTime13.getText())));
                    } else if (comboBoxNDStartTime13.getSelectedItem() == "AM" && comboBoxNDEndTime13.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime13.getText()), (Integer.parseInt(textFieldNDEndTime13.getText()) + 12)));
                    } else if (comboBoxNDStartTime13.getSelectedItem() == "PM" && comboBoxNDEndTime13.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime13.getText()) + 12), (Integer.parseInt(textFieldNDEndTime13.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts13.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea13.getSelectedItem() + comboBoxNDRank13.getSelectedItem() + textFieldNDStartTime13.getText()
                                + comboBoxNDStartTime13.getSelectedItem() + textFieldNDEndTime13.getText() + comboBoxNDEndTime13.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea13.getSelectedItem().toString() + " " + comboBoxNDRank13.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea13.getSelectedItem().toString(), comboBoxNDRank13.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                    }
                    num++;
                }

                //SHIFT 14
                if(!textFieldNDNumberShifts14.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts14.getText());
                    if (comboBoxNDStartTime14.getSelectedItem() == "AM" && comboBoxNDEndTime14.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime14.getText()), Integer.parseInt(textFieldNDEndTime14.getText())));
                    } else if (comboBoxNDStartTime14.getSelectedItem() == "AM" && comboBoxNDEndTime14.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime14.getText()), (Integer.parseInt(textFieldNDEndTime14.getText()) + 12)));
                    } else if (comboBoxNDStartTime14.getSelectedItem() == "PM" && comboBoxNDEndTime14.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime14.getText()) + 12), (Integer.parseInt(textFieldNDEndTime14.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts14.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea14.getSelectedItem() + comboBoxNDRank14.getSelectedItem() + textFieldNDStartTime14.getText()
                                + comboBoxNDStartTime14.getSelectedItem() + textFieldNDEndTime14.getText() + comboBoxNDEndTime14.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea14.getSelectedItem().toString() + " " + comboBoxNDRank14.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea14.getSelectedItem().toString(), comboBoxNDRank14.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                    }
                    num++;
                }

                //SHIFT 15
                if(!textFieldNDNumberShifts15.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts15.getText());
                    if (comboBoxNDStartTime15.getSelectedItem() == "AM" && comboBoxNDEndTime15.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime15.getText()), Integer.parseInt(textFieldNDEndTime15.getText())));
                    } else if (comboBoxNDStartTime15.getSelectedItem() == "AM" && comboBoxNDEndTime15.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime15.getText()), (Integer.parseInt(textFieldNDEndTime15.getText()) + 12)));
                    } else if (comboBoxNDStartTime15.getSelectedItem() == "PM" && comboBoxNDEndTime15.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime15.getText()) + 12), (Integer.parseInt(textFieldNDEndTime15.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts15.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea15.getSelectedItem() + comboBoxNDRank15.getSelectedItem() + textFieldNDStartTime15.getText()
                                + comboBoxNDStartTime15.getSelectedItem() + textFieldNDEndTime15.getText() + comboBoxNDEndTime15.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea15.getSelectedItem().toString() + " " + comboBoxNDRank15.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea15.getSelectedItem().toString(), comboBoxNDRank15.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                    }
                    num++;
                }

                //SHIFT 16
                if(!textFieldNDNumberShifts16.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts16.getText());
                    if (comboBoxNDStartTime16.getSelectedItem() == "AM" && comboBoxNDEndTime16.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime16.getText()), Integer.parseInt(textFieldNDEndTime16.getText())));
                    } else if (comboBoxNDStartTime16.getSelectedItem() == "AM" && comboBoxNDEndTime16.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime16.getText()), (Integer.parseInt(textFieldNDEndTime16.getText()) + 12)));
                    } else if (comboBoxNDStartTime16.getSelectedItem() == "PM" && comboBoxNDEndTime16.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime16.getText()) + 12), (Integer.parseInt(textFieldNDEndTime16.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts16.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea16.getSelectedItem() + comboBoxNDRank16.getSelectedItem() + textFieldNDStartTime16.getText()
                                + comboBoxNDStartTime16.getSelectedItem() + textFieldNDEndTime16.getText() + comboBoxNDEndTime16.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea16.getSelectedItem().toString() + " " + comboBoxNDRank16.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea16.getSelectedItem().toString(), comboBoxNDRank16.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                    }
                    num++;
                }

                //SHIFT 17
                if(!textFieldNDNumberShifts17.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts17.getText());
                    if (comboBoxNDStartTime17.getSelectedItem() == "AM" && comboBoxNDEndTime17.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime17.getText()), Integer.parseInt(textFieldNDEndTime17.getText())));
                    } else if (comboBoxNDStartTime17.getSelectedItem() == "AM" && comboBoxNDEndTime17.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime17.getText()), (Integer.parseInt(textFieldNDEndTime17.getText()) + 12)));
                    } else if (comboBoxNDStartTime17.getSelectedItem() == "PM" && comboBoxNDEndTime17.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime17.getText()) + 12), (Integer.parseInt(textFieldNDEndTime17.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts17.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea17.getSelectedItem() + comboBoxNDRank17.getSelectedItem() + textFieldNDStartTime17.getText()
                                + comboBoxNDStartTime17.getSelectedItem() + textFieldNDEndTime17.getText() + comboBoxNDEndTime17.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea17.getSelectedItem().toString() + " " + comboBoxNDRank17.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea17.getSelectedItem().toString(), comboBoxNDRank17.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                    }
                    num++;
                }

                //SHIFT 18
                if(!textFieldNDNumberShifts18.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts18.getText());
                    if (comboBoxNDStartTime18.getSelectedItem() == "AM" && comboBoxNDEndTime18.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime18.getText()), Integer.parseInt(textFieldNDEndTime18.getText())));
                    } else if (comboBoxNDStartTime18.getSelectedItem() == "AM" && comboBoxNDEndTime18.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime18.getText()), (Integer.parseInt(textFieldNDEndTime18.getText()) + 12)));
                    } else if (comboBoxNDStartTime18.getSelectedItem() == "PM" && comboBoxNDEndTime18.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime18.getText()) + 12), (Integer.parseInt(textFieldNDEndTime18.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts18.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea18.getSelectedItem() + comboBoxNDRank18.getSelectedItem() + textFieldNDStartTime18.getText()
                                + comboBoxNDStartTime18.getSelectedItem() + textFieldNDEndTime18.getText() + comboBoxNDEndTime18.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea18.getSelectedItem().toString() + " " + comboBoxNDRank18.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea18.getSelectedItem().toString(), comboBoxNDRank18.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                    }
                    num++;
                }

                //SHIFT 19
                if(!textFieldNDNumberShifts19.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts19.getText());
                    if (comboBoxNDStartTime19.getSelectedItem() == "AM" && comboBoxNDEndTime19.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime19.getText()), Integer.parseInt(textFieldNDEndTime19.getText())));
                    } else if (comboBoxNDStartTime19.getSelectedItem() == "AM" && comboBoxNDEndTime19.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime19.getText()), (Integer.parseInt(textFieldNDEndTime19.getText()) + 12)));
                    } else if (comboBoxNDStartTime19.getSelectedItem() == "PM" && comboBoxNDEndTime19.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime19.getText()) + 12), (Integer.parseInt(textFieldNDEndTime19.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts19.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea19.getSelectedItem() + comboBoxNDRank19.getSelectedItem() + textFieldNDStartTime19.getText()
                                + comboBoxNDStartTime19.getSelectedItem() + textFieldNDEndTime19.getText() + comboBoxNDEndTime19.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea19.getSelectedItem().toString() + " " + comboBoxNDRank19.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea19.getSelectedItem().toString(), comboBoxNDRank19.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                    }
                    num++;
                }

                //SHIFT 20
                if(!textFieldNDNumberShifts20.getText().contains("0")) {
                    System.out.println(textFieldNDNumberShifts20.getText());
                    if (comboBoxNDStartTime20.getSelectedItem() == "AM" && comboBoxNDEndTime20.getSelectedItem() == "AM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime20.getText()), Integer.parseInt(textFieldNDEndTime20.getText())));
                    } else if (comboBoxNDStartTime20.getSelectedItem() == "AM" && comboBoxNDEndTime20.getSelectedItem() == "PM") {
                        shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime20.getText()), (Integer.parseInt(textFieldNDEndTime20.getText()) + 12)));
                    } else if (comboBoxNDStartTime20.getSelectedItem() == "PM" && comboBoxNDEndTime20.getSelectedItem() == "PM") {
                        shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime20.getText()) + 12), (Integer.parseInt(textFieldNDEndTime20.getText()) + 12)));
                    }
                    for (int i = 0; i < Integer.parseInt(textFieldNDNumberShifts20.getText()); i++) //create loop for all duplicate shifts
                    {
                        shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea20.getSelectedItem() + comboBoxNDRank20.getSelectedItem() + textFieldNDStartTime20.getText()
                                + comboBoxNDStartTime20.getSelectedItem() + textFieldNDEndTime20.getText() + comboBoxNDEndTime20.getSelectedItem();
                        //System.out.println(shiftName);
                        shift.setShiftName(shiftName);
                        //shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                        //System.out.println("HERE " + comboBoxNDArea20.getSelectedItem().toString() + " " + comboBoxNDRank20.getSelectedItem().toString());
                        shift.setRequiredWorkProfile(comboBoxNDArea20.getSelectedItem().toString(), comboBoxNDRank20.getSelectedItem().toString());
                        dayProfile.addShift(shift);
                    }
                    num++;
                }



                dayProfile.display(); //SHOW CONTENTS OF DAY PROFILE
                dayProfiles.add(dayProfile);
                //@3


                //@4

                //System.out.println(dayProfile.getDay());
                //System.out.println(dayProfile.getLabel());
                //System.out.println(dayProfile.getShifts());

            }
        });
        /**
         * The loadWeekNeedsButton ActionListener loads inserted dayProfiles inserted into the day profile selection
         * comboBoxes
         */
        loadWeekNeedsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBoxSunday.removeAllItems();
                for (int i = 0; i < dayProfiles.size(); i++) {
                    System.out.println("test" + dayProfiles.get(i).getDay().toString());
                    if (dayProfiles.get(i).getDay().toString() == "SUNDAY") {
                            comboBoxSunday.addItem(dayProfiles.get(i).getLabel().toString());
                    }
                }
                comboBoxMonday.removeAllItems();
                for (int i = 0; i < dayProfiles.size(); i++) {
                    if (dayProfiles.get(i).getDay().toString() == "MONDAY") {
                        boolean match = false;
                        if (match == false) {
                            comboBoxMonday.addItem(dayProfiles.get(i).getLabel().toString());
                        }
                    }
                }

                comboBoxTuesday.removeAllItems();
                for (int i = 0; i < dayProfiles.size(); i++) {
                    if (dayProfiles.get(i).getDay().toString() == "TUESDAY") {
                        boolean match = false;
                        if (match == false) {
                            comboBoxTuesday.addItem(dayProfiles.get(i).getLabel().toString());
                        }
                    }
                }

                comboBoxWednesday.removeAllItems();
                for (int i = 0; i < dayProfiles.size(); i++) {
                    if (dayProfiles.get(i).getDay().toString() == "WEDNESDAY") {
                        boolean match = false;
                        if (match == false) {
                            comboBoxWednesday.addItem(dayProfiles.get(i).getLabel().toString());
                        }
                    }
                }

                comboBoxThursday.removeAllItems();
                for (int i = 0; i < dayProfiles.size(); i++) {
                    if (dayProfiles.get(i).getDay().toString() == "THURSDAY") {
                        boolean match = false;
                        if (match == false) {
                            comboBoxThursday.addItem(dayProfiles.get(i).getLabel().toString());
                        }
                    }
                }

                comboBoxFriday.removeAllItems();
                for (int i = 0; i < dayProfiles.size(); i++) {
                    if (dayProfiles.get(i).getDay().toString() == "FRIDAY") {
                        boolean match = false;
                        if (match == false) {
                            comboBoxFriday.addItem(dayProfiles.get(i).getLabel().toString());
                        }
                    }
                }

                comboBoxSaturday.removeAllItems();
                for (int i = 0; i < dayProfiles.size(); i++) {
                    if (dayProfiles.get(i).getDay().toString() == "SATURDAY") {
                        boolean match = false;
                        if (match == false) {
                            comboBoxSaturday.addItem(dayProfiles.get(i).getLabel().toString());
                        }
                    }
                }

                /*comboBoxSunday.addItem("Test0");
                comboBoxMonday.addItem("Test1");
                comboBoxTuesday.addItem("Test2");
                comboBoxWednesday.addItem("Test3");
                comboBoxThursday.addItem("Test4");
                comboBoxFriday.addItem("Test5");
                comboBoxSaturday.addItem("Test6");*/
            }
        });

        comboBoxSunday.addActionListener(new ActionListener() { //THIS IS THE SUNDAY DAY PROFILES
            @Override
            public void actionPerformed(ActionEvent e) {
                weekProfile[0] = comboBoxSunday.getSelectedItem().toString();
                System.out.println(weekProfile[0]);
            }
        });
        comboBoxMonday.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weekProfile[1] = comboBoxMonday.getSelectedItem().toString();
            }
        });
        comboBoxTuesday.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weekProfile[2] = comboBoxTuesday.getSelectedItem().toString();
                System.out.println(weekProfile[2]);
            }
        });
        comboBoxWednesday.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weekProfile[3] = comboBoxWednesday.getSelectedItem().toString();
            }
        });
        comboBoxThursday.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weekProfile[4] = comboBoxThursday.getSelectedItem().toString();
            }
        });
        comboBoxFriday.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weekProfile[5] = comboBoxFriday.getSelectedItem().toString();
            }
        });
        comboBoxSaturday.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weekProfile[6] = comboBoxSaturday.getSelectedItem().toString();
            }
        });
        //PREVIOUSLY USED FOR SEPARATE VIEWS OF ADD EMPLOYEE ETC. THERE WAS A PROBLEM WITH MAINTAINING DATA BETWEEN
        //WINDOWS SO IT WAS REMOVED FOR THE MOMENT
        /*buttonE2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*frameTest = new JFrame("Employee DataXX");
                frameTest.setContentPane(new GUI().Week);
                frameTest.pack();
                frameTest.setVisible(true);

                System.out.println("pressed E2");
                JFrame frame = new JFrame("Employee Data");
                frame.setContentPane(new GUI().Employee);
                frame.pack();
                frame.setVisible(true);
            }
        });*/
/*        buttonS2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*frameTest = new JFrame("Schedule WeekXX");
                frameTest.setContentPane(new GUI().Schedule);
                frameTest.pack();
                frameTest.setVisible(true);



                System.out.println("pressed E2");
                JFrame frame = new JFrame("Schedule Week");
                frame.setContentPane(new GUI().Schedule);
                frame.pack();
                frame.setVisible(true);
            }
        });*/
        //CREATE SCHEDULE BUTTON IN SCHEDULE
        createScheduleButton.addActionListener(new ActionListener() { //BROKEN
            @Override
            public void actionPerformed(ActionEvent e) {

                employeeListS = databaseAccess.getEmployees();
                for(int i = 0; i < employeeListS.size(); i++) {
                    displayEmployees = (employeeListS.get(i).getName() + " " + employeeListS.get(i).getId() + " " + employeeListS.get(i).getPhoneNumber() + " " +
                            employeeListS.get(i).getAvailability().getTotalHours());
                    comboBoxSundaySchedule.addItem(displayEmployees);
                }


            }
        });
        viewEmployeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                employeeListS1 = databaseAccess.getEmployees();
                comboBoxViewEmployees.removeAllItems();
                for(int i = 0; i < employeeListS1.size(); i++) {
                    displayEmployees = (employeeListS1.get(i).getName() + " " + employeeListS1.get(i).getId() + " " + employeeListS1.get(i).getPhoneNumber() + " " +
                            employeeListS1.get(i).getAvailability().getTotalHours());
                    comboBoxViewEmployees.addItem(displayEmployees);
                }
            }
        });
        /**
         * Inserts the default weeks needs. This should represent an average week needed by Boondocks
         */
        defaultWeekNeedsButton.addActionListener(new ActionListener() { //THIS CREATES THE DEFAULT SCHEDULE FOR THE GENERATOR.
            @Override
            public void actionPerformed(ActionEvent e) {
                dayProfile = new DayProfile();
                dayProfile.setLabel("Default Sunday"); //DEFAULT SUNDAY
                dayProfile.setDay("SUNDAY");

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(6, 14);
                shift.setShiftName("sun1");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(6, 14);
                shift.setShiftName("sun2");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(12, 20);
                shift.setShiftName("sun3");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(14, 22);
                shift.setShiftName("sun4");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("CASHIER", "TEAM_MEMBER");
                shift.setTime(14, 22);
                shift.setShiftName("sun5");
                dayProfile.addShift(shift);

                dayProfilesDefault.add(dayProfile);
                comboBoxSunday.addItem(dayProfile.getLabel());
                schedule.addDayProfile(dayProfile.getDay(), dayProfile);

                dayProfile = new DayProfile();
                dayProfile.setLabel("Default Monday"); //DEFAULT MONDAY
                dayProfile.setDay("MONDAY");

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(6, 14);
                shift.setShiftName("mon1");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(6, 14);
                shift.setShiftName("mon2");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(12, 20);
                shift.setShiftName("mon3");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(14, 22);
                shift.setShiftName("mon4");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "SHIFT_MANAGER");
                shift.setTime(14, 22);
                shift.setShiftName("mon5");
                dayProfile.addShift(shift);

                dayProfilesDefault.add(dayProfile);
                comboBoxMonday.addItem(dayProfile.getLabel());
                schedule.addDayProfile(dayProfile.getDay(), dayProfile);

                dayProfile = new DayProfile();
                dayProfile.setLabel("Default Tuesday");  //DEFAULT TUESDAY
                dayProfile.setDay("TUESDAY");

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(6, 14);
                shift.setShiftName("tue1");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(6, 14);
                shift.setShiftName("tue2");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("COOK", "TEAM_MEMBER");
                shift.setTime(12, 20);
                shift.setShiftName("tue3");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "SUPERVISOR");
                shift.setTime(14, 22);
                shift.setShiftName("tue4");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(14, 22);
                shift.setShiftName("tue5");
                dayProfile.addShift(shift);

                dayProfilesDefault.add(dayProfile);
                comboBoxTuesday.addItem(dayProfile.getLabel());
                schedule.addDayProfile(dayProfile.getDay(), dayProfile);

                dayProfile = new DayProfile();
                dayProfile.setLabel("Default Sunday"); //DEFAULT WEDNESDAY
                dayProfile.setDay("WEDNESDAY");

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(6, 14);
                shift.setShiftName("wed1");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_LEADER");
                shift.setTime(6, 14);
                shift.setShiftName("wed2");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(12, 20);
                shift.setShiftName("wed3");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("SERVER", "TEAM_MEMBER");
                shift.setTime(14, 22);
                shift.setShiftName("wed4");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(14, 22);
                shift.setShiftName("wed5");
                dayProfile.addShift(shift);

                dayProfilesDefault.add(dayProfile);
                comboBoxWednesday.addItem(dayProfile.getLabel());
                schedule.addDayProfile(dayProfile.getDay(), dayProfile);

                dayProfile = new DayProfile();
                dayProfile.setLabel("Default Thursday"); //DEFAULT THURSDAY
                dayProfile.setDay("THURSDAY");

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(6, 14);
                shift.setShiftName("thur1");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(6, 14);
                shift.setShiftName("thur2");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(12, 20);
                shift.setShiftName("thur3");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(14, 22);
                shift.setShiftName("thur4");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(14, 22);
                shift.setShiftName("thur5");
                dayProfile.addShift(shift);

                dayProfilesDefault.add(dayProfile);
                comboBoxThursday.addItem(dayProfile.getLabel());
                schedule.addDayProfile(dayProfile.getDay(), dayProfile);

                dayProfile = new DayProfile();
                dayProfile.setLabel("Default Friday"); //DEFAULT FRIDAY
                dayProfile.setDay("FRIDAY");

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(6, 14);
                shift.setShiftName("fri1");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(6, 14);
                shift.setShiftName("fri2");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(14, 22);
                shift.setShiftName("fri3");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(14, 22);
                shift.setShiftName("fri4");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(12, 20);
                shift.setShiftName("fri5");
                dayProfile.addShift(shift);

                dayProfilesDefault.add(dayProfile);
                comboBoxFriday.addItem(dayProfile.getLabel());
                schedule.addDayProfile(dayProfile.getDay(), dayProfile);

                dayProfile = new DayProfile();
                dayProfile.setLabel("Default Saturday");  //DEFAULT SATURDAY
                dayProfile.setDay("SATURDAY");

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(10, 16);
                shift.setShiftName("sat1");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(10, 16);
                shift.setShiftName("sat2");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(12, 20);
                shift.setShiftName("sat3");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(14, 23);
                shift.setShiftName("sat4");
                dayProfile.addShift(shift);

                shift = new Shift();
                shift.setRequiredWorkProfile("ARCADE", "TEAM_MEMBER");
                shift.setTime(14, 22);
                shift.setShiftName("sat5");
                dayProfile.addShift(shift);

                dayProfilesDefault.add(dayProfile);
                comboBoxSaturday.addItem(dayProfile.getLabel());
                schedule.addDayProfile(dayProfile.getDay(), dayProfile);
            }
        });

        /**
         * Takes the default Schedule and database of employees to generate the week's schedule
         */
        createDefaultScheduleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                employeeListS = databaseAccess.getEmployees();
                GenerateSchedule generateSchedule = new GenerateSchedule(employeeListS, schedule);
                generateSchedule.generate();
                //for(int i = 0; i < employeeListS.size(); i++) {
                //    displayEmployees = (employeeListS.get(i).getName() + " " + employeeListS.get(i).getId() + " " + employeeListS.get(i).getPhoneNumber() + " " +
                //            employeeListS.get(i).getAvailability().getTotalHours());
                //    comboBoxSundaySchedule.addItem(displayEmployees);
                //}

            }
        });
    }

    /**
     * Sets up GUI work environment so that the user can insert data.
     * @param args
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Week Scheduler");
        frame.setContentPane(new GUI().panelControl);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}




//EXCEL FUNCTIONALITY
//@1
                    /*import org.apache.poi.hssf.usermodel.HSSFCell;
                    import org.apache.poi.hssf.usermodel.HSSFRow;
                    import org.apache.poi.hssf.usermodel.HSSFSheet;
                    import org.apache.poi.hssf.usermodel.HSSFWorkbook;*/

//@2
                    /*
                    THIS IS ONLY RELEVANT TO EXCEL FUNCTIONALITY
                     *//*
                    String fileName = "employee.xls";
                    File file = new File(fileName);
                    HSSFRow row;
                    HSSFWorkbook workbook;
                    HSSFSheet sheet;

                    if (!file.exists()) { //If the user has never used this before, create a new excel sheet to work with.
                        workbook = new HSSFWorkbook();
                        sheet = workbook.createSheet("EmployeeSheet1");
                        row = sheet.createRow(0);//row will change based on case of employee (bob, joe, etc)
                        HSSFCell cellA = row.createCell(0);//column will change based on data piece (Name, ID, etc)
                        HSSFCell cellB = row.createCell(1);
                        HSSFCell cellC = row.createCell(2);
                        HSSFCell cellD = row.createCell(3);
                        HSSFCell cellE = row.createCell(4);
                        HSSFCell cellF = row.createCell(5);
                        HSSFCell cellG = row.createCell(6);
                        HSSFCell cellH = row.createCell(7);
                        HSSFCell cellI = row.createCell(8);
                        HSSFCell cellJ = row.createCell(9);
                        HSSFCell cellK = row.createCell(10);
                        HSSFCell cellL = row.createCell(11);
                        HSSFCell cellM = row.createCell(12);
                        HSSFCell cellN = row.createCell(13);
                        HSSFCell cellO = row.createCell(14);
                        HSSFCell cellP = row.createCell(15);
                        HSSFCell cellQ = row.createCell(16);
                        HSSFCell cellR = row.createCell(17);
                        HSSFCell cellS = row.createCell(18);

                        cellA.setCellValue(2);
                        cellB.setCellValue("Name");
                        cellC.setCellValue("ID");
                        cellD.setCellValue("Phone");
                        cellE.setCellValue("Hours per Week");
                        cellF.setCellValue("Sunday1");
                        cellG.setCellValue("Sunday2");
                        cellH.setCellValue("Monday1");
                        cellI.setCellValue("Monday2");
                        cellJ.setCellValue("Tuesday1");
                        cellK.setCellValue("Tuesday2");
                        cellL.setCellValue("Wednesday1");
                        cellM.setCellValue("Wednesday2");
                        cellN.setCellValue("Thursday1");
                        cellO.setCellValue("Thursday2");
                        cellP.setCellValue("Friday1");
                        cellQ.setCellValue("Friday2");
                        cellR.setCellValue("Saturday1");
                        cellS.setCellValue("Saturday2");

                        workbook.write(new FileOutputStream(fileName));

                    }
                    //if (file.exists()) {
                    //    row = sheet.createRow()
                    //}
                    //If there is a preexisting sheet set row to the row that we need to insert data
                    workbook = new HSSFWorkbook(new FileInputStream(fileName));
                    sheet = workbook.getSheet("EmployeeSheet1");

                    //For some reason, row is
                    row = sheet.createRow(sheet.getFirstRowNum());//get the row that the new employee needs to be entered at.
                    System.out.println("A1");
                    HSSFCell cellA = row.createCell(0);//column will change based on data piece (Name, ID, etc)
                    System.out.println("A2");
                    HSSFCell cellB = row.createCell(1);
                    System.out.println("A3");
                    HSSFCell cellC = row.createCell(2);
                    HSSFCell cellD = row.createCell(3);
                    HSSFCell cellE = row.createCell(4);
                    HSSFCell cellF = row.createCell(5);
                    HSSFCell cellG = row.createCell(6);
                    HSSFCell cellH = row.createCell(7);
                    HSSFCell cellI = row.createCell(8);
                    HSSFCell cellJ = row.createCell(9);
                    HSSFCell cellK = row.createCell(10);
                    HSSFCell cellL = row.createCell(11);
                    HSSFCell cellM = row.createCell(12);
                    HSSFCell cellN = row.createCell(13);
                    HSSFCell cellO = row.createCell(14);
                    HSSFCell cellP = row.createCell(15);
                    HSSFCell cellQ = row.createCell(16);
                    HSSFCell cellR = row.createCell(17);
                    HSSFCell cellS = row.createCell(18);


                    cellA.setCellValue(row.getCell(0).getNumericCellValue() + 1);
                    cellB.setCellValue(nameTextField.getText());
                    cellC.setCellValue(IDTextField.getText());
                    cellD.setCellValue(Long.parseLong(phoneTextField.getText()));
                    cellE.setCellValue(Integer.parseInt(hrsPerWeekTextField.getText()));
                    cellF.setCellValue(s1);
                    cellG.setCellValue(s2);
                    cellH.setCellValue("Monday1");
                    cellI.setCellValue("Monday2");
                    cellJ.setCellValue("Tuesday1");
                    cellK.setCellValue("Tuesday2");
                    cellL.setCellValue("Wednesday1");
                    cellM.setCellValue("Wednesday2");
                    cellN.setCellValue("Thursday1");
                    cellO.setCellValue("Thursday2");
                    cellP.setCellValue("Friday1");
                    cellQ.setCellValue("Friday2");
                    cellR.setCellValue("Saturday1");
                    cellS.setCellValue("Saturday2");

                    System.out.println("here" + row.getCell(0).getNumericCellValue() + "there" + sheet.getRow(0).getPhysicalNumberOfCells());


                    workbook.write(new FileOutputStream(fileName));
                    workbook.close();

                */
                /*} catch (IOException x) {
                    x.printStackTrace();
                    System.out.println("ERROR");
                }*/

//@3
                //dayProfile.setDay(Day.valueOf(comboBoxNDDay.getSelectedItem()));

                /*shiftName = String.valueOf(num) + comboBoxNDArea1.getSelectedItem() + comboBoxNDRank1.getSelectedItem() + textFieldNDStartTime1.getText()
                        + comboBoxNDStartTime1.getSelectedItem() + textFieldNDEndTime1.getText() + comboBoxNDEndTime1.getSelectedItem();
                //System.out.println(shiftName);
                System.out.println("WA1");
                shift.setShiftName(shiftName);
                System.out.println("WB1");
                Area areaEnum = Area.valueOf(comboBoxNDArea1.getSelectedItem().toString());
                System.out.println("WC1");
                Rank rankEnum = Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString());
                System.out.println("WD1");
                shift.setRequiredWorkProfile(areaEnum, rankEnum);
                System.out.println("W11");
                dayProfile.addShift(shift); //PROBLEM: this doesn't seem to work. Debug can't find error but normal execution always ends in
                // "Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException"
                System.out.println("W21");
                num++;*/

//@4
                /*
                for(int i = 0; i < Integer.parseInt(textFieldNDNumberShifts2.getText()); i++) //create loop for all duplicate shifts
                {
                    String shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea2.getSelectedItem() + comboBoxNDRank2.getSelectedItem() + textFieldNDStartTime2.getText()
                            + comboBoxNDStartTime2.getSelectedItem() + textFieldNDEndTime2.getText() + comboBoxNDEndTime2.getSelectedItem();
                    //System.out.println(shiftName);
                    shift.setShiftName(shiftName);
                    areaEnum = Area.valueOf(comboBoxNDArea2.getSelectedItem().toString());
                    rankEnum = Rank.valueOf(comboBoxNDRank2.getSelectedItem().toString());
                    shift.setRequiredWorkProfile(areaEnum, rankEnum);

                    dayProfile.addShift(shift); //PROBLEM: this doesn't seem to work. Debug can't find error but normal execution always ends in
                    // "Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException"

                    num++;
                }
                */