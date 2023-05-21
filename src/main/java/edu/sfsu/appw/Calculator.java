package edu.sfsu.appw;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    public Calculator() {
        System.out.println("Calculator Running...");
    }
    void addComponentsToPane(Container pane) {
        JLabel n_label;
        JLabel iy_label;
        JTextField n_textField;
        JTextField iy_textField;

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
    }
    void createWindow() {
        JFrame frame = new JFrame("Financial Calculator");
        JPanel panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 400);

        addComponentsToPane(frame.getContentPane());

        frame.add(panel);
        frame.setVisible(true);
    }
}