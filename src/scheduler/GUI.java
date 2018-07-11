package scheduler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

/*import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;*/


public class GUI extends Container {

    private Employee employee = new Employee();
    private Availability availability = new Availability();
    private Time time = new Time();
    private DayProfile dayProfile = new DayProfile();
    private Shift shift = new Shift();
    private String shiftName = new String();

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
    private JButton viewShiftButton;
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

    public GUI() {
        buttonE1.addActionListener(new ActionListener() { //Employee Button in Employee View
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Clicked on Employee Data from Employee Data Screen");

            }
        });
        buttonW1.addActionListener(new ActionListener() { //Week Button in Employee View
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("Week"); //Name of Program
                frame.setContentPane(new GUI().Week);
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

                //try {

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
                if (comboBoxNDStartTime1.getSelectedItem() == "AM" && comboBoxNDEndTime1.getSelectedItem() == "AM") {
                    shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime1.getText()), Integer.parseInt(textFieldNDEndTime1.getText())));
                } else if (comboBoxNDStartTime1.getSelectedItem() == "AM" && comboBoxNDEndTime1.getSelectedItem() == "PM") {
                    shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime1.getText()), (Integer.parseInt(textFieldNDEndTime1.getText()) + 12)));
                } else if (comboBoxNDStartTime1.getSelectedItem() == "PM" && comboBoxNDEndTime1.getSelectedItem() == "PM") {
                    shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime1.getText()) + 12), (Integer.parseInt(textFieldNDEndTime1.getText()) + 12)));
                }

                if (comboBoxNDStartTime2.getSelectedItem() == "AM" && comboBoxNDEndTime2.getSelectedItem() == "AM") {
                    shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime2.getText()), Integer.parseInt(textFieldNDEndTime2.getText())));
                } else if (comboBoxNDStartTime2.getSelectedItem() == "AM" && comboBoxNDEndTime2.getSelectedItem() == "PM") {
                    shift.setTime(new Time(Integer.parseInt(textFieldNDStartTime2.getText()), (Integer.parseInt(textFieldNDEndTime2.getText()) + 12)));
                } else if (comboBoxNDStartTime2.getSelectedItem() == "PM" && comboBoxNDEndTime2.getSelectedItem() == "PM") {
                    shift.setTime(new Time((Integer.parseInt(textFieldNDStartTime2.getText()) + 12), (Integer.parseInt(textFieldNDEndTime2.getText()) + 12)));
                }

                int num = 0;

                dayProfile.setLabel(textFieldNDDayName.getText());
                System.out.println(dayProfile.getLabel());
                //dayProfile.setDay(Day.valueOf(comboBoxNDDay.getSelectedItem()));

                /*shiftName = String.valueOf(num) + comboBoxNDArea1.getSelectedItem() + comboBoxNDRank1.getSelectedItem() + textFieldNDStartTime1.getText()
                        + comboBoxNDStartTime1.getSelectedItem() + textFieldNDEndTime1.getText() + comboBoxNDEndTime1.getSelectedItem();
                System.out.println(shiftName);
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




                for(int i = 0; i < Integer.parseInt(textFieldNDNumberShifts1.getText()); i++) //create loop for all duplicate shifts
                {
                    shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea1.getSelectedItem() + comboBoxNDRank1.getSelectedItem() + textFieldNDStartTime1.getText()
                            + comboBoxNDStartTime1.getSelectedItem() + textFieldNDEndTime1.getText() + comboBoxNDEndTime1.getSelectedItem();
                    System.out.println(shiftName);
                    System.out.println("WA");
                    shift.setShiftName(shiftName);
                    System.out.println("WB");
                    shift.setRequiredWorkProfile(Area.valueOf(comboBoxNDArea1.getSelectedItem().toString()), Rank.valueOf(comboBoxNDRank1.getSelectedItem().toString()));
                    System.out.println("W1");
                    dayProfile.addShift(shift); //PROBLEM: this doesn't seem to work. Debug can't find error but normal execution always ends in
                                                // "Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException"
                    System.out.println("W2");
                    num++;
                }
                /*
                for(int i = 0; i < Integer.parseInt(textFieldNDNumberShifts2.getText()); i++) //create loop for all duplicate shifts
                {
                    String shiftName = String.valueOf(num) + String.valueOf(i) + comboBoxNDArea2.getSelectedItem() + comboBoxNDRank2.getSelectedItem() + textFieldNDStartTime2.getText()
                            + comboBoxNDStartTime2.getSelectedItem() + textFieldNDEndTime2.getText() + comboBoxNDEndTime2.getSelectedItem();
                    System.out.println(shiftName);
                    shift.setShiftName(shiftName);
                    areaEnum = Area.valueOf(comboBoxNDArea2.getSelectedItem().toString());
                    rankEnum = Rank.valueOf(comboBoxNDRank2.getSelectedItem().toString());
                    shift.setRequiredWorkProfile(areaEnum, rankEnum);
                    System.out.println("W1");
                    dayProfile.addShift(shift); //PROBLEM: this doesn't seem to work. Debug can't find error but normal execution always ends in
                    // "Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException"
                    System.out.println("W2");
                    num++;
                }
                */

                System.out.println(dayProfile.getDay());
                System.out.println(dayProfile.getLabel());
                System.out.println(dayProfile.getShifts());



            }
        });
        comboBox8.addActionListener(new ActionListener() { //THIS IS THE SUNDAY DAY PROFILES
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox8.addItem("Test");
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Scheduler"); //Name of Program
        //JComboBox comboBox8 = new JComboBox();
        //comboBox8.addItem("test1");
        //comboBox8.addItem("test2");
        frame.setContentPane(new GUI().panelControl);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
