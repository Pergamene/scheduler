package scheduler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class GUI {

    private Employee employee = new Employee();
    private Availability availability = new Availability();
    private Time time = new Time();

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
    private JComboBox comboBox15;
    private JTextField textField1;
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
        addEmployeeButton.addActionListener(new ActionListener() { //add employee button
            @Override
            public void actionPerformed(ActionEvent e) {
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


            }
        });
        IDTextField.addActionListener(new ActionListener() { //IDTextField
            @Override
            public void actionPerformed(ActionEvent e) {

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
