package scheduler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class GUI {


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
    private JTextField hrsPWeekTextField;
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

    //Sunday-Saturday Employee
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JComboBox comboBox6;
    private JComboBox comboBox7;

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
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Scheduler"); //Name of Program
        frame.setContentPane(new GUI().panelControl);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
