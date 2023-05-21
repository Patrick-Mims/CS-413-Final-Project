package edu.sfsu.appw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    public Calculator() {
        System.out.println("Calculator Running...");
    }
    void addComponentsToPane(Container pane) {

        JLabel fv_label;
        JTextField fv_textField;

        JLabel iy_label;
        JTextField iy_textField;

        JLabel n_label;
        JTextField n_textField;

        JLabel pmt_label;
        JTextField pmt_textField;

        JLabel pv_label;
        JTextField pv_textField;

        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;

        n_label = new JLabel("N (Number of terms)");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 2;
        c.weightx = 0.0;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(n_label, c);

        n_textField = new JTextField(7);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 1;
        c.weightx = 0.0;
        pane.add(n_textField, c);

        iy_label = new JLabel("I/Y (Interest Rate)");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 0.0;
        pane.add(iy_label, c);

        iy_textField = new JTextField(10);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 2;
        c.weightx = 0.0;
        pane.add(iy_textField, c);

        pv_label = new JLabel("PV (Present Value)");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 3;
        c.weightx = 0.0;
        pane.add(pv_label, c);

        pv_textField = new JTextField(10);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 3;
        c.weightx = 0.0;
        pane.add(pv_textField, c);

        pmt_label = new JLabel("PMT (Payment)");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 4;
        c.weightx = 0.0;
        pane.add(pmt_label, c);

        pmt_textField = new JTextField(10);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 4;
        c.weightx = 0.0;
        pane.add(pmt_textField, c);

        JButton submitButton = new JButton("Calculate");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 5;
        c.weightx = 0.0;
        pane.add(submitButton, c);

        JLabel resultItem = new JLabel();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 6;
        c.weightx = 0.0;
        pane.add(resultItem, c);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(n_textField.getText().equals("") ||
                   iy_textField.getText().equals("") ||
                   pv_textField.getText().equals("") ||
                   pmt_textField.getText().equals("")) {
                   JOptionPane.showMessageDialog(pane, "Error: Incomplete.");
                } else {
                    // convert String to Int
                    int term = Integer.parseInt(n_textField.getText());
                    int interest = Integer.parseInt(iy_textField.getText());
                    int present_value = Integer.parseInt(pv_textField.getText());
                    int pmt = Integer.parseInt(pmt_textField.getText());

                    System.out.println("Number: " + term);
                    System.out.println("Interest: " + interest);
                    System.out.println("Present Value: " + present_value);
                    System.out.println("Payment: " + pmt);

                    // convert Int to Sting
                    resultItem.setText("Future Value: $" + String.valueOf(Math.pow(present_value * (1 + interest), 2)));
                }
            }
        });
    }
    void createWindow() {
        JFrame frame = new JFrame("Financial Calculator");
        JPanel panel = new JPanel();

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JMenuBar menuBar = new JMenuBar();

        // Main Menu
        JMenu jMenu = new JMenu("File");

        JMenuItem itemOpen = new JMenuItem("Open");
        JMenuItem itemClose = new JMenuItem("Close");
        JMenuItem itemExit = new JMenuItem("Exit");

        jMenu.add(itemOpen);
        jMenu.add(itemClose);
        jMenu.add(itemExit);

        menuBar.add(jMenu);

        // About
        JMenu menuAbout = new JMenu("About");
        JMenuItem jmiProfile = new JMenuItem("Version 0.1.3");
        menuAbout.add(jmiProfile);
        menuBar.add(menuAbout);

        addComponentsToPane(frame.getContentPane());

        frame.add(panel);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}