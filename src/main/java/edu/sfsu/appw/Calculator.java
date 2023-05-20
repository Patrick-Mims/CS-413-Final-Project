package edu.sfsu.appw;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    public Calculator() {
        System.out.println("Calculator");
    }
    static JPanel pPanel = new JPanel();
    static JPanel fPanel = new JPanel();
    static JPanel controlPanel = new JPanel();

    static JPanel buttonPanel = new JPanel();
    void createWindow() {
        JButton jb = new JButton("Calculate");
        JFrame frame = new JFrame("SFSU TVM Calculator");

        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setLayout(new GridLayout(3,1));

        JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP);
        tab.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        tab.add("PV", pPanel); // present value tab
        tab.add("FV", fPanel); // future value tab

        // present value
        pPanel.add(new JLabel("Present Value"));
        pPanel.add(new JLabel("N"));
        pPanel.add(new JTextField(10));

        pPanel.add(new JLabel("I/Y"));
        pPanel.add(new JTextField(10));

        pPanel.add(new JLabel("PV"));
        pPanel.add(new JTextField(10));

        pPanel.add(new JLabel("PMT"));
        pPanel.add(new JTextField(10));

        // Future Value
        // fPanel.add(new JLabel("Future Value"));
        // fPanel.add(new JTextField(10));

        add(jb);

        controlPanel.setLayout(new GridLayout());

       /* The calculate button will have two settings, one for PV and the other for FV.
        * A flag will be set for equalsIgnoreCase(), for the two states of the button: PV, FV.
        * The PV subclass will render the computation for the PV and FS as well.
        * * */

        frame.add(tab, BorderLayout.CENTER);
        frame.add(controlPanel);
        frame.setVisible(true);
    }
}