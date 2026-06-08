package Lab4;

import javax.swing.*;
import java.awt.event.*;
import java.util.HashSet;

public class StudentEnrollmentApp extends JFrame implements ActionListener {

    private JLabel lblEnterStudent;
    private JTextField txtEnterStudent;

    private JButton btnEnroll, btnWithdraw, btnView, btnLOA;

    private JList<String> listStudents;
    private JScrollPane scrollPane;
    private DefaultListModel<String> listModel;
    private HashSet<String> students;

    StudentEnrollmentApp() {

        students = new HashSet<>();
        listModel = new DefaultListModel<>();

        setTitle("Student Enrollment System");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        txtEnterStudent = new JTextField();
        txtEnterStudent.setBounds(20, 50, 150, 30);
        add(txtEnterStudent);

        lblEnterStudent = new JLabel("Enter Student Name");
        lblEnterStudent.setBounds(180, 50, 150, 30);
        add(lblEnterStudent);

        btnEnroll = new JButton("Enroll");
        btnEnroll.setBounds(180, 100, 150, 30);
        add(btnEnroll);

        btnWithdraw = new JButton("Withdraw");
        btnWithdraw.setBounds(180, 150, 150, 30);
        add(btnWithdraw);

        btnLOA = new JButton("Leave of Absence");
        btnLOA.setBounds(180, 200, 150, 30);
        add(btnLOA);

        btnView = new JButton("View Enrolled");
        btnView.setBounds(180, 250, 150, 30);
        add(btnView);

        listStudents = new JList<>(listModel);
        scrollPane = new JScrollPane(listStudents);
        scrollPane.setBounds(20, 100, 150, 180);
        add(scrollPane);

        btnEnroll.addActionListener(this);
        btnWithdraw.addActionListener(this);
        btnLOA.addActionListener(this);
        btnView.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String studentName = txtEnterStudent.getText().trim();

        // ENROLL
        if (e.getSource() == btnEnroll) {

            if (!studentName.isEmpty()) {

                if (students.add(studentName)) {
                    listModel.addElement(studentName);
                    txtEnterStudent.setText("");
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Student already enrolled",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this,
                        "Student name cannot be empty",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        // WITHDRAW
        else if (e.getSource() == btnWithdraw) {

            int index = listStudents.getSelectedIndex();

            if (index != -1) {

                String oldStudent = listModel.getElementAt(index);

                listModel.remove(index);
                students.remove(oldStudent);

            } else {
                JOptionPane.showMessageDialog(this,
                        "Select a student to withdraw",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        // LEAVE OF ABSENCE (NEW)
        else if (e.getSource() == btnLOA) {

            int index = listStudents.getSelectedIndex();

            if (index != -1) {

                String oldStudent = listModel.getElementAt(index);

                if (!oldStudent.contains("(LOA)")) {

                    String newStudent = oldStudent + " (LOA)";

                    // update UI
                    listModel.set(index, newStudent);

                    // update HashSet
                    students.remove(oldStudent);
                    students.add(newStudent);
                }

            } else {
                JOptionPane.showMessageDialog(this,
                        "Select a student to mark as LOA",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        // VIEW
        else if (e.getSource() == btnView) {

            String text = "";

            for (String student : students) {
                text += student + "\n";
            }

            JOptionPane.showMessageDialog(this,
                    "Enrolled Students:\n" + text,
                    "Enrolled Students",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new StudentEnrollmentApp();
    }
}