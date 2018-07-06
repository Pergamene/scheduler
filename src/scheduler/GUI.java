package scheduler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class GUI {

    private Employee employee = new Employee();
    private Availability availability = new Availability();
    private Time time = new Time();
    private DayProfile dayProfile = new DayProfile();
    private Shift shift = new Shift();


    private JPanel Employee;
    private JPanel panelControl;
    private JPanel Week;
    private JPanel Schedule;
    private JButton buttonE1;
    private JButton buttonW1;
    private JButton buttonS1;
    private JLabel nameLabel;
    private JLabel idLabel;
    private JLabel phoneLabel;
    private JLabel hrsPerWeekLabel;
    private JTextField nameTextField;
    private JTextField IDTextField;
    private JTextField phoneTextField;
    private JTextField hrsPerWeekTextField;
    private JButton addEmployeeButton;
    private JButton editEmployeeButton;
    private JLabel tuesdayLabel;
    private JLabel wednesdayLabel;
    private JLabel mondayLabel;
    private JLabel thursdayLabel;
    private JLabel sundayLabel;
    private JLabel fridayLabel;
    private JLabel saturdayLabel;
    private JButton buttonE2;
    private JButton buttonW2;
    private JButton buttonS2;
    private JButton buttonE3;
    private JButton buttonW3;
    private JButton buttonS3;

    private JLabel availabilityLabel;
    private JButton buttonSetWeekNeeds;
    private JButton buttonNewDayNeeds;
    private JButton buttonEditDayNeeds;
    private JLabel sundayLabelW1;
    private JLabel mondayLabelW1;
    private JLabel tuesdayLabelW1;
    private JLabel wednesdayLabelW1;
    private JLabel thursdayLabelW1;
    private JLabel fridayLabelW1;
    private JLabel saturdayLabelW1;

    //Sunday-Saturday WeekDataSetWeek
    private JComboBox comboBox8;
    private JComboBox comboBox9;
    private JComboBox comboBox10;
    private JComboBox comboBox11;
    private JComboBox comboBox12;
    private JComboBox comboBox13;
    private JComboBox comboBox14;
    private JComboBox comboBoxNDDay;
    private JComboBox comboBox16;
    private JTextField textField2;
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
    private JComboBox comboBoxNDArea;
    private JComboBox comboBoxNDRank;
    private JComboBox comboBoxNDStartTime;
    private JComboBox comboBoxNDEndTime;
    private JTextField textFieldNDDayName;
    private JTextField textFieldNDStartTime;
    private JTextField textFieldNDEndTime;
    private JTextField textFieldNDNumberShifts;
    private JButton addShiftButtonND;
    private JButton viewShiftButton;

    public GUI() {
        buttonE1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Clicked on Employee Data from Employee Data Screen");

            }
        });
        buttonW1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("GUI");
                frame.setContentPane(new GUI().panelControl);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);

            }
        });
        nameTextField.addActionListener(new ActionListener() { //nameTextField in Employee
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(nameTextField.getText());


            }
        });

        /*
         ADD EMPLOYEE
         */
        addEmployeeButton.addActionListener(new ActionListener() { //add employee button
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    System.out.println(nameTextField.getText());
                    System.out.println(IDTextField.getText());
                    System.out.println(Long.parseLong(phoneTextField.getText()));
                    System.out.println(Integer.parseInt(hrsPerWeekTextField.getText()));
                    System.out.println(Integer.parseInt(sun1.getText()));
                    System.out.println(sunAMPM1.getSelectedItem());//AM or PM for First Sunday value

                    employee.setName(nameTextField.getText());
                    employee.setID(IDTextField.getText());
                    employee.setPhoneNumber(Long.parseLong(phoneTextField.getText()));
                    employee.setHourCap(Integer.parseInt(hrsPerWeekTextField.getText()));

                    Integer s1 = 0; Integer s2 = 0;
                    Integer m1; Integer m2;
                    Integer t1; Integer t2;
                    Integer w1; Integer w2;
                    Integer r1; Integer r2;
                    Integer f1; Integer f2;
                    Integer ss1; Integer ss2;


                    //Sunday Availability
                    if (sunAMPM1.getSelectedItem() == "AM" && sunAMPM2.getSelectedItem() == "AM") {
                        availability.addAvailableDay(Day.SUNDAY, new Time(Integer.parseInt(sun1.getText()), Integer.parseInt(sun2.getText())));
                        s1 = Integer.parseInt(sun1.getText()); s2 = Integer.parseInt(sun2.getText());
                    } else if (sunAMPM1.getSelectedItem() == "AM" && sunAMPM2.getSelectedItem() == "PM") {
                        availability.addAvailableDay(Day.SUNDAY, new Time(Integer.parseInt(sun1.getText()), (Integer.parseInt(sun2.getText()) + 12)));
                        s1 = Integer.parseInt(sun1.getText()); s2 = Integer.parseInt(sun2.getText()) + 12;
                    } else if (sunAMPM1.getSelectedItem() == "PM" && sunAMPM2.getSelectedItem() == "PM") {
                        availability.addAvailableDay(Day.SUNDAY, new Time((Integer.parseInt(sun1.getText()) + 12), (Integer.parseInt(sun2.getText()) + 12)));
                        s1 = Integer.parseInt(sun1.getText()) + 12; s2 = Integer.parseInt(sun2.getText()) + 12;
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


                    /*
                    THIS IS ONLY RELEVANT TO EXCEL FUNCTIONALITY
                     */
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


                } catch (IOException x) {
                    x.printStackTrace();
                    System.out.println("ERROR");
                }
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
        addShiftButtonND.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textFieldNDDayName.getText()); //name of the new day
                System.out.println(comboBoxNDDay.getSelectedItem()); //day of the week
                System.out.println(textFieldNDNumberShifts.getText()); //number of duplicate shifts to be made.
                System.out.println(comboBoxNDArea.getSelectedItem()); //area of shift
                System.out.println(comboBoxNDRank.getSelectedItem()); //rank of shift
                System.out.println(textFieldNDStartTime.getText()); //start time of new shift
                System.out.println(comboBoxNDStartTime.getSelectedItem()); //AM or PM of start shift
                System.out.println(textFieldNDEndTime.getText()); //end time of new shift
                System.out.println(comboBoxNDEndTime.getSelectedItem()); //AM or PM of end shift

                /*
                SET UP OUR TIME FROM VARIABLES
                 */
                if (comboBoxNDStartTime.getSelectedItem() == "AM" && comboBoxNDEndTime.getSelectedItem() == "AM") {
                    shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime.getText()), Integer.parseInt(textFieldNDEndTime.getText())));
                } else if (comboBoxNDStartTime.getSelectedItem() == "AM" && comboBoxNDEndTime.getSelectedItem() == "PM") {
                    shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime.getText()), (Integer.parseInt(textFieldNDEndTime.getText()) + 12)));
                } else if (comboBoxNDStartTime.getSelectedItem() == "PM" && comboBoxNDEndTime.getSelectedItem() == "PM") {
                    shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime.getText()) + 12), (Integer.parseInt(textFieldNDEndTime.getText()) + 12)));
                }


                dayProfile.setLabel(textFieldNDDayName.getText());
                //dayProfile.setDay(Day.valueOf(comboBoxNDDay.getSelectedItem()));
                for(int i = 0; i < Integer.parseInt(textFieldNDNumberShifts.getText()); i++) //create loop for all duplicate shifts
                {
                    String shiftName = String.valueOf(i) + comboBoxNDArea.getSelectedItem() + comboBoxNDRank.getSelectedItem() + textFieldNDStartTime.getText()
                            + comboBoxNDStartTime.getSelectedItem() + textFieldNDEndTime.getText() + comboBoxNDEndTime.getSelectedItem();
                    System.out.println(shiftName);
                    shift.setShiftName(shiftName);
                    Area areaEnum = Area.valueOf(comboBoxNDArea.getSelectedItem().toString());
                    Rank rankEnum = Rank.valueOf(comboBoxNDRank.getSelectedItem().toString());
                    shift.setRequiredWorkProfile(areaEnum, rankEnum);
                    System.out.println("W1");
                    dayProfile.addShift(shift); //PROBLEM: this doesn't seem to work. Debug can't find error but normal execution always ends in
                                                // "Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException"
                    System.out.println("W2");
                }

                System.out.println(dayProfile.getDay());
                System.out.println(dayProfile.getLabel());
                System.out.println(dayProfile.getShifts());



            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Scheduler"); //Name of Program
        frame.setContentPane(new GUI().panelControl);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
