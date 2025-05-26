package com.mycompany.econosky;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.CountDownLatch;
import java.util.ArrayList;

public class gui {
    private JFrame frame;
    private JTextField dateField;
    private JTextField passengersField;
    private JLabel messageLabel;
    private String[] result;
    private String output;
    private CountDownLatch latch;
    private String selectedDestination;

    public gui() {
        result = new String[2];
        latch = new CountDownLatch(1);
    }

    public void message(String message)
    { 
        CountDownLatch dropdownLatch = new CountDownLatch(1);
        frame = new JFrame("Error");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,700);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
        panel.add(new JLabel(message));
        
               JButton submitButton = new JButton("Submit");
        panel.add(submitButton);

        messageLabel = new JLabel(" ");
        panel.add(messageLabel);

        submitButton.addActionListener(e -> {
        dropdownLatch.countDown();
        frame.dispose();
    });

        frame.setVisible(true);

        try {
            latch.await();  // Wait until submit button is pressed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
    }
    
    
    public String[] start(String input1, String input2, String mes) {
        frame = new JFrame("Airline Booking System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,700);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);

        panel.add(new JLabel(mes));

        panel.add(new JLabel(input1));
        dateField = new JTextField(20);
        panel.add(dateField);

        panel.add(new JLabel(input2));
        passengersField = new JTextField(20);
        panel.add(passengersField);

        JButton submitButton = new JButton("Submit");
        panel.add(submitButton);

        messageLabel = new JLabel(" ");
        panel.add(messageLabel);

        submitButton.addActionListener(e -> {
            result[0] = dateField.getText();
            result[1] = passengersField.getText();
            messageLabel.setText("Submitted.");
            latch.countDown();  // Release the wait
            frame.dispose();    // Close the GUI
        });

        frame.setVisible(true);

        try {
            latch.await();  // Wait until submit button is pressed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return result;
    }
    
    public String start(String input1, String mes) {
            CountDownLatch dropdownLatch = new CountDownLatch(1);
    JFrame frame = new JFrame(mes);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(900,700);

    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  // Add padding
    frame.add(panel);

    JLabel label = new JLabel(mes);
    label.setAlignmentX(Component.CENTER_ALIGNMENT);
    panel.add(label);

        panel.add(new JLabel(input1));
        dateField = new JTextField(20);
        panel.add(dateField);

    JButton confirmButton = new JButton("Confirm");
    confirmButton.setAlignmentX(Component.CENTER_ALIGNMENT);
    confirmButton.setMaximumSize(new Dimension(100, 30));  // Size the button
    panel.add(Box.createRigidArea(new Dimension(0, 10))); // Add spacing
    panel.add(confirmButton);

    confirmButton.addActionListener(e -> {
        selectedDestination = dateField.getText();
        dropdownLatch.countDown();
        frame.dispose();
    });

    frame.setVisible(true);

    try {
        dropdownLatch.await();  // Wait for user to confirm
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    return selectedDestination;
    }
    
    public String select(ArrayList<String> locations, String type) {
    CountDownLatch dropdownLatch = new CountDownLatch(1);
    JFrame frame = new JFrame("Select " + type);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(900,700);

    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  // Add padding
    frame.add(panel);

    JLabel label = new JLabel("Choose your " + type + ":");
    label.setAlignmentX(Component.CENTER_ALIGNMENT);
    panel.add(label);

    String[] destinations = locations.toArray(new String[0]);
    JComboBox<String> destinationDropdown = new JComboBox<>(destinations);
    destinationDropdown.setMaximumSize(new Dimension(200, 25));
    destinationDropdown.setAlignmentX(Component.CENTER_ALIGNMENT);
    panel.add(destinationDropdown);

    JButton confirmButton = new JButton("Confirm");
    confirmButton.setAlignmentX(Component.CENTER_ALIGNMENT);
    confirmButton.setMaximumSize(new Dimension(100, 30));  // Size the button
    panel.add(Box.createRigidArea(new Dimension(0, 10))); // Add spacing
    panel.add(confirmButton);

    confirmButton.addActionListener(e -> {
        selectedDestination = (String) destinationDropdown.getSelectedItem();
        dropdownLatch.countDown();
        frame.dispose();
    });

    frame.setVisible(true);

    try {
        dropdownLatch.await();  // Wait for user to confirm
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    return selectedDestination;
}

         public String tell(ArrayList<String> path1, String mes1,ArrayList<String> path2, String mes2,ArrayList<String> path3, String mes3) {
            CountDownLatch dropdownLatch = new CountDownLatch(1);
    JFrame frame = new JFrame("Price and Path Overview");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);

    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  // Add padding
    frame.add(panel);
    
    JLabel label = new JLabel("Price and Path Overview");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label);
    for (int i = 0; i < path1.size(); i++) {
        JLabel label2 = new JLabel(path1.get(i));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label2);
    }
       JLabel labelx = new JLabel("Price is " + mes1);
        labelx.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(labelx);
    
    for (int i = 0; i < path2.size(); i++) {
        JLabel label3 = new JLabel(path2.get(i));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label3);
    }
     JLabel labely = new JLabel("Price is " + mes2);
        labely.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(labely);
     for (int i = 0; i < path3.size(); i++) {
        JLabel label4 = new JLabel(path3.get(i));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label4);
    }
      JLabel labelz = new JLabel("Price is " + mes3);
        labelz.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(labelz);
     
     
    

        panel.add(new JLabel("Select an Itenary, 1 for Star Alliance, 2 for SkyTeam, 3 for OneWorld"));
        dateField = new JTextField(20);
        panel.add(dateField);

    JButton confirmButton = new JButton("Confirm");
    confirmButton.setAlignmentX(Component.CENTER_ALIGNMENT);
    confirmButton.setMaximumSize(new Dimension(100, 30));  // Size the button
    panel.add(Box.createRigidArea(new Dimension(0, 10))); // Add spacing
    panel.add(confirmButton);

    confirmButton.addActionListener(e -> {
        selectedDestination = dateField.getText();
        dropdownLatch.countDown();
        frame.dispose();
    });

    frame.setVisible(true);

    try {
        dropdownLatch.await();  // Wait for user to confirm
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    return selectedDestination;
    }
        
     }
        
        
        

