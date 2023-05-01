package edu.sfsu.appw;

import javax.swing.*;
import java.awt.*;

public class CTimePeriod implements Money {
    public JPanel panel;

    public CTimePeriod() {
        panel = new JPanel();
    }
    @Override
    public void showForm() {
        JTabbedPane tp = new JTabbedPane(JTabbedPane.TOP);
        tp.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        panel.setLayout(new FlowLayout((FlowLayout.CENTER)));
        panel.add(new JLabel("I/Y(Interest per year) "));
        panel.add(new JTextField(10));
    }
    @Override
    public void calculate() {

    }

    @Override
    public void clear() {

    }
}