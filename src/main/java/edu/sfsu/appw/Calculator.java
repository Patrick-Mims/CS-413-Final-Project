package edu.sfsu.appw;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame implements Money {
    public Calculator() {
        System.out.println("Calculator");
    }

    static JPanel nPanel = new JPanel();
    static JPanel iPanel = new JPanel();
    static JPanel pPanel = new JPanel();
    static JPanel pmtPanel = new JPanel();
    static JPanel fPanel = new JPanel();

    static void createTabs(final JFrame frame) {
        JTabbedPane tp = new JTabbedPane(JTabbedPane.TOP);

        tp.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        nPanel.setLayout(new FlowLayout((FlowLayout.CENTER)));

        nPanel.add(new JLabel("I/Y(Interest per year) "));
        nPanel.add(new JTextField(10));

        nPanel.add(new JLabel("PV (Present Value)"));
        nPanel.add(new JTextField(10));

        nPanel.add(new JLabel("PMT (Periodic Payment)"));
        nPanel.add(new JTextField(10));

        nPanel.add(new JLabel("FV (Future Value)"));
        nPanel.add(new JTextField(10));

        iPanel.add(new JLabel("Interest"));
        pPanel.add(new JLabel("Present Value"));
        pmtPanel.add(new JLabel("Payment"));
        fPanel.add(new JLabel("Future Value"));

        tp.add("N", nPanel);
        tp.add("I/Y", iPanel);
        tp.add("PV", pPanel);
        tp.add("PMT", pmtPanel);
        tp.add("FV", fPanel);

        frame.add(tp, BorderLayout.CENTER);
    }

    void createWindow() {
        JFrame frame = new JFrame("SFSU TVM Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        createTabs(frame);

        frame.setSize(500, 400);
        frame.setVisible(true);
    }

    @Override
    public void showForm() {

    }

    @Override
    public void calculate() {
        System.out.println("calculate total");
    }

    @Override
    public void clear() {
        System.out.println("clear form");
    }
}