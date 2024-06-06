import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class HRISGUI extends JFrame{
    private JFrame frame;

    private JComboBox<String> departementComboBox;
    private JComboBox<String> posisiComboBox;
    private JTextField nameField;
    private JTextField tglField;
    private JButton addEmployeeButton;
    private JButton cancelButton;

    private JTextArea displayArea;
    private JTextField findIdField;

    private JButton addButton;
    private JButton backButton;
    private JButton showAllButton;

    public HRISGUI() {
        frame = new JFrame("HRIS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        showMainPanel();
        frame.add(showMainPanel(), BorderLayout.CENTER);
        frame.pack();
        frame.setSize(600, 400);
        frame.setVisible(true);
    }

    private JPanel showMainPanel() {
        addButton = new JButton("Add Data");
        showAllButton = new JButton("Show Data");

        JPanel buttonPanel = new JPanel(new GridLayout(2, 1));
        buttonPanel.add(addButton);
        buttonPanel.add(showAllButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaintPanel(showInputPanel());
            }
        });

        showAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaintPanel(showAllDataPanel());
            }
        });

        return buttonPanel;

    }


    //Complete show all data employee panel
    private JPanel showAllDataPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel(new GridLayout(1, 1));

        findIdField = new JTextField(15);
        topPanel.add(findIdField);

        cancelButton = new JButton("Cancel");
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(cancelButton);


        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i<3; i++){
            strBuilder.append(i + "\n");
        }
        displayArea = new JTextArea(strBuilder.toString());
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);


        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);
        panel.add(scrollPane, BorderLayout.SOUTH);
                cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaintPanel(showMainPanel());
            }
        });
        return panel;
    }

    // method refresh panel
    private void repaintPanel(JPanel newPanel){
        frame.getContentPane().removeAll();
        frame.getContentPane().add(newPanel);
        frame.revalidate();
        frame.repaint();
    }

    //Complete show employee input panel
    private JPanel showInputPanel() {
        JPanel inputPanel = new JPanel(new GridLayout(5, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(15);

        JLabel tglLabel = new JLabel("Tanggal Lahir:");
        tglField = new JTextField(15);


        JLabel departementLabel = new JLabel("Departement:");
        String[] departments = Employee.getDepartment();
        departementComboBox = new JComboBox<>(departments);

        JLabel posisiLabel = new JLabel("Posisi :");
        String[] posisi = Employee.getJobs();
        posisiComboBox = new JComboBox<>(posisi);


        addEmployeeButton = new JButton("Add Data");
        backButton = new JButton("Back");

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(tglLabel);
        inputPanel.add(tglField);
        inputPanel.add(departementLabel);
        inputPanel.add(departementComboBox);
        inputPanel.add(posisiLabel);
        inputPanel.add(posisiComboBox);
        inputPanel.add(addEmployeeButton);
        inputPanel.add(backButton);
        inputPanel.add(cancelButton);

        //complete add employee logic
        addEmployeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String department = departementComboBox.getSelectedItem().toString();

                JOptionPane.showMessageDialog(HRISGUI.this, "Employee added : " + name + "," + department );
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaintPanel(showMainPanel());
            }
        });
//        cancelButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                repaintPanel(showMainPanel());
//            }
//        });

        return inputPanel;
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HRISGUI();
            }
        });
    }
}




//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.util.Random;
//
//public class HRISGUI extends JFrame {
//    private JFrame frame;
//    private JComboBox<String> departmentComboBox;
//    private JComboBox<String> positionComboBox;
//    private JTextField nameField;
//    private JTextField dobField;
//    private JButton addEmployeeButton;
//    private JButton cancelButton;
//    private JTextArea displayArea;
//    private JTextField findIdField;
//    private JButton addButton;
//    private JButton showAllButton;
//    private ArrayList<Employee> employees;
//
//    public HRISGUI() {
//        employees = new ArrayList<>();
//
//        frame = new JFrame("HRIS");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(new FlowLayout());
//        frame.add(showMainPanel(), BorderLayout.CENTER);
//        frame.pack();
//        frame.setSize(600, 400);
//        frame.setVisible(true);
//    }
//
//    private JPanel showMainPanel() {
//        addButton = new JButton("Add Data");
//        showAllButton = new JButton("Show Data");
//
//        JPanel buttonPanel = new JPanel(new GridLayout(2, 1));
//        buttonPanel.add(addButton);
//        buttonPanel.add(showAllButton);
//
//        addButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                repaintPanel(showInputPanel());
//            }
//        });
//
//        showAllButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                repaintPanel(showAllDataPanel());
//            }
//        });
//
//        return buttonPanel;
//    }
//
//    private JPanel showAllDataPanel() {
//        JPanel panel = new JPanel(new BorderLayout());
//        JPanel topPanel = new JPanel(new GridLayout(1, 1));
//
//        findIdField = new JTextField(15);
//        topPanel.add(findIdField);
//
//        cancelButton = new JButton("Cancel");
//        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//        buttonPanel.add(cancelButton);
//
//        StringBuilder strBuilder = new StringBuilder();
//        for (Employee emp : employees) {
//            strBuilder.append(emp.toString()).append("\n");
//        }
//        displayArea = new JTextArea(strBuilder.toString());
//        displayArea.setEditable(false);
//        JScrollPane scrollPane = new JScrollPane(displayArea);
//
//        panel.add(topPanel, BorderLayout.NORTH);
//        panel.add(buttonPanel, BorderLayout.CENTER);
//        panel.add(scrollPane, BorderLayout.SOUTH);
//
//        cancelButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                repaintPanel(showMainPanel());
//            }
//        });
//
//        return panel;
//    }
//
//    private void repaintPanel(JPanel newPanel) {
//        frame.getContentPane().removeAll();
//        frame.getContentPane().add(newPanel);
//        frame.revalidate();
//        frame.repaint();
//    }
//
//    private JPanel showInputPanel() {
//        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
//
//        JLabel nameLabel = new JLabel("Name:");
//        nameField = new JTextField(15);
//
//        JLabel dobLabel = new JLabel("Date of Birth (DDMMYYYY):");
//        dobField = new JTextField(15);
//
//        JLabel departmentLabel = new JLabel("Department:");
//        String[] departments = Employee.getDepartment();
//        departmentComboBox = new JComboBox<>(departments);
//
//        JLabel positionLabel = new JLabel("Position:");
//        String[] positions = Employee.getJobs();
//        positionComboBox = new JComboBox<>(positions);
//
//        addEmployeeButton = new JButton("Add Data");
//
//        inputPanel.add(nameLabel);
//        inputPanel.add(nameField);
//        inputPanel.add(dobLabel);
//        inputPanel.add(dobField);
//        inputPanel.add(departmentLabel);
//        inputPanel.add(departmentComboBox);
//        inputPanel.add(positionLabel);
//        inputPanel.add(positionComboBox);
//        inputPanel.add(addEmployeeButton);
//
//        addEmployeeButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String name = nameField.getText();
//                String dob = dobField.getText();
//                String department = departmentComboBox.getSelectedItem().toString();
//                String position = positionComboBox.getSelectedItem().toString();
//                String id = generateUniqueId(department, dob);
//
//                Employee employee = createEmployee(name, dob, department, position, id);
//                employees.add(employee);
//
//                JOptionPane.showMessageDialog(HRISGUI.this, "Employee added: " + employee);
//            }
//        });
//
//        return inputPanel;
//    }
//
//    private String generateUniqueId(String department, String dob) {
//        String departmentCode = department.equals("Product") ? "PROD" : "HR";
//        int randomNum = new Random().nextInt(1000);
//        return String.format("000%s%s%03d", departmentCode, dob, randomNum);
//    }
//
//    private Employee createEmployee(String name, String dob, String department, String position, String id) {
//        switch (position) {
//            case "Manager":
//                return new Manager(name, dob, department, id);
//            case "Developer":
//                return new Developer(name, dob, department, id);
//            case "HR Staff":
//                return new HRStaff(name, dob, department, id);
//            default:
//                throw new IllegalArgumentException("Invalid position: " + position);
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new HRISGUI();
//            }
//        });
//    }
//}
