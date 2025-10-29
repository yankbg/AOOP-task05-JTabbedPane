package org.example;

import javax.swing.*;

public class TabbedApp extends JFrame {

    public TabbedApp() {
        setTitle("Tabbed Application Example");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel tab1 = createUserFormTab();
        JPanel tab2 = createCalculatorTab();
        JPanel tab3 = createImageTab();
        JPanel tab4 = createSettingsTab();
        JPanel tab5 = createAboutTab();

        tabbedPane.addTab("User Form", tab1);
        tabbedPane.addTab("Calculator", tab2);
        tabbedPane.addTab("Image", tab3);
        tabbedPane.addTab("Settings", tab4);
        tabbedPane.addTab("About", tab5);

        add(tabbedPane);

        setVisible(true);
    }

    private JPanel createUserFormTab() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Name:"));
        panel.add(new JTextField(15));
        panel.add(new JButton("Submit"));
        return panel;
    }

    private JPanel createCalculatorTab() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter Number 1:"));
        panel.add(new JTextField(5));
        panel.add(new JLabel("Enter Number 2:"));
        panel.add(new JTextField(5));
        panel.add(new JButton("Add"));
        return panel;
    }

    private JPanel createImageTab() {
        JPanel panel = new JPanel();
        panel.add(new JLabel(new ImageIcon("your_image.png"))); // make sure this file exists
        return panel;
    }

    private JPanel createSettingsTab() {
        JPanel panel = new JPanel();
        panel.add(new JCheckBox("Enable Dark Mode"));
        panel.add(new JRadioButton("Option 1"));
        panel.add(new JRadioButton("Option 2"));
        return panel;
    }

    private JPanel createAboutTab() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("This is a sample application."));
        return panel;
    }
}


