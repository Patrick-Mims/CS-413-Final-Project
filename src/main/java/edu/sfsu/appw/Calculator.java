package edu.sfsu.appw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Calculator implements Calculate {
    public Calculator() {
        System.out.println("Calculator");
    }

    // why protected?
    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);

        return panel;
    }

    /* Create Interface / GUI */
    void createWindow() {
        JFrame frame = new JFrame("SFSU Financial Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setLocationRelativeTo(null);

        /*
        JPanel jPanel = new JPanel();
        JTabbedPane jTabbedPane = new JTabbedPane();


        JComponent panel_1 = makeTextPanel("Panel #1");
        tabbedPane.addTab("Tab 1", panel_1);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        tp.add("main", p1);


        jPanel.setLayout(new GridBagLayout());
        frame.add(tp);
        */

        //frame.add(jPanel);
        frame.setVisible(true);
    }

    @Override
    public void calculate() {

    }
}