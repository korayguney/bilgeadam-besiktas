package com.bilgeadam.listenerexample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataSourceListener extends JFrame {

    // create 4 buttons
    JButton jbtNew = new JButton("New");
    JButton jbtPrint = new JButton("Print");
    JButton jbtOpen = new JButton("Open");
    JButton jbtSave = new JButton("Save");

    public DataSourceListener() {
        // create a panel to put buttons
        JPanel jPanel = new JPanel();
        jPanel.add(jbtNew);
        jPanel.add(jbtPrint);
        jPanel.add(jbtOpen);
        jPanel.add(jbtSave);
        add(jPanel);

        //create a listener
        ButtonListener listener = new ButtonListener();

        // Anonymous inner (nested) class
        jbtNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The jbtNew is clicked from anonymous class");
            }
        });
        jbtPrint.addActionListener(e -> System.out.println("The jbtPrint is clicked from anonymous class"));
        jbtOpen.addActionListener(listener);
        jbtSave.addActionListener(listener);
    }


    // member inner class
    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jbtNew) {
                System.out.println("The jbtNew is clicked");
            } else if (e.getSource() == jbtPrint) {
                System.out.println("The jbtPrint is clicked");
            } else if (e.getSource() == jbtOpen) {
                System.out.println("The jbtOpen is clicked");
            } else if (e.getSource() == jbtSave) {
                System.out.println("The jbtSave is clicked");
            }
        }
    }


    public static void main(String[] args) {

        JFrame frame = new DataSourceListener();
        frame.setSize(400, 200);
        frame.setTitle("My button listener example");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
