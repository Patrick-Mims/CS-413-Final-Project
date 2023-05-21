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

        n_label = new JLabel("N");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 2;
        c.weightx = 0.0;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(n_label, c);

        n_textField = new JTextField(10);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 1;
        c.weightx = 0.0;
        pane.add(n_textField, c);

        iy_label = new JLabel("I/Y");
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

        pv_label = new JLabel("PV");
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

        pmt_label = new JLabel("PMT");
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

        fv_label = new JLabel("FV");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 5;
        c.weightx = 0.0;
        pane.add(fv_label, c);

        fv_textField = new JTextField(10);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 5;
        c.weightx = 0.0;
        pane.add(fv_textField, c);

        JButton submitButton = new JButton("Calculate");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 6;
        c.weightx = 0.0;
        pane.add(submitButton, c);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(n_textField.getText().equals("") ||
                   iy_textField.getText().equals("") ||
                   pv_textField.getText().equals("") ||
                   pmt_textField.getText().equals("") ||
                   fv_textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(pane, "Error: Incomplete.");
                }
            }
        });
    }
    void createWindow() {
        JFrame frame = new JFrame("Financial Calculator");
        JPanel panel = new JPanel();

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 300);

        JMenuBar menuBar = new JMenuBar();

        // Main Menu
        JMenu jmFile = new JMenu("File");

        JMenuItem jmiOpen = new JMenuItem("Open");
        JMenuItem jmiClose = new JMenuItem("Close");
        JMenuItem jmiExit = new JMenuItem("Exit");

        jmFile.add(jmiOpen);
        jmFile.add(jmiClose);
        jmFile.add(jmiExit);

        menuBar.add(jmFile);

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