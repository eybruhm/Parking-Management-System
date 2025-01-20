package pmsPractice;


import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import pms.FloorOneButtons;

import java.awt.Font;


public class pmsDisplayTimer extends JFrame {

    public static final long serialVersionUID = 1L;
    public JPanel contentPane;

    public JPanel monitorPage;
    public JPanel floorOnePage;
    public JPanel floorTwoPage;
    public JPanel floorThreePage;
    public JPanel floorFourPage;
    public JPanel startParkBox;
    public JPanel endParkBox;;
    public JPanel navigationBox;
    public JButton lastClickedButton;
    public JLabel slotClicked;
    public JLabel slotClickedEnd;
    public JButton btnEndCancel;
    public JButton btnEnd;
    public JLabel endTimeIn;
    public JLabel startSlotType;
    public JLabel endTimer;
    
    // Declare a member variable to hold reference to FloorOneButtons
    public FloorOneButtons floorOneButtons;
    private JLabel endTimeInLabel;
    private JLabel endTimerLabel;
    private JLabel endSlotTypeLabel;
    private JLabel endSlotType;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    pmsDisplayTimer frame = new pmsDisplayTimer();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    
    
    /**
     * Create the frame.
     */
    public pmsDisplayTimer() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 700);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // RIGHT CONTAINER || RIGHT CONTAINER || RIGHT CONTAINER || RIGHT CONTAINER || RIGHT CONTAINER || RIGHT CONTAINER ||
        JLayeredPane rightContainer = new JLayeredPane();
        rightContainer.setBounds(0, 0, 220, 661);
        contentPane.add(rightContainer);
        
        
        // ENDPARK BOX || ENDPARK BOX || ENDPARK BOX || ENDPARK BOX || ENDPARK BOX || ENDPARK BOX ||
        // ENDPARK BOX || ENDPARK BOX || ENDPARK BOX || ENDPARK BOX || ENDPARK BOX || ENDPARK BOX || 
	    endParkBox = new JPanel();
	    endParkBox.setBounds(0, 0, 220, 661);
	    endParkBox.setBackground(Color.WHITE);
	    rightContainer.add(endParkBox);
	    endParkBox.setLayout(null);
	    endParkBox.setVisible(false);
	    
	    JLabel endQuestion = new JLabel("DO YOU WANT TO END SESSION WITH");
	    endQuestion.setFont(new Font("Source Code Pro Semibold", Font.BOLD, 10));
	    endQuestion.setHorizontalAlignment(SwingConstants.CENTER);
	    endQuestion.setBounds(10, 21, 200, 70);
	    endParkBox.add(endQuestion);
	    
	    slotClickedEnd = new JLabel("slot");
	    slotClickedEnd.setFont(new Font("Source Code Pro Black", Font.PLAIN, 25));
	    slotClickedEnd.setHorizontalAlignment(SwingConstants.CENTER);
	    slotClickedEnd.setBounds(39, 70, 134, 40);
	    endParkBox.add(slotClickedEnd);
        
        endTimeInLabel = new JLabel("Time In:");
        endTimeInLabel.setFont(new Font("Source Code Pro Black", Font.PLAIN, 12));
        endTimeInLabel.setBounds(10, 250, 100, 14);
        endParkBox.add(endTimeInLabel);
                
        endTimeIn = new JLabel("YYYY-DD-MM   HH-MM-SS");
        endTimeIn.setFont(new Font("Source Code Pro Semibold", Font.BOLD, 15));
        endTimeIn.setBounds(10, 263, 190, 17);
        endParkBox.add(endTimeIn);
        
        endTimerLabel = new JLabel("Park Time:");
        endTimerLabel.setFont(new Font("Source Code Pro Black", Font.PLAIN, 12));
        endTimerLabel.setBounds(10, 300, 100, 14);
        endParkBox.add(endTimerLabel);
        
        endTimer = new JLabel("HH-MM-SS");
        endTimer.setFont(new Font("Source Code Pro Semibold", Font.BOLD, 15));
        endTimer.setBounds(10, 313, 190, 17);
        endParkBox.add(endTimer);
                
        // STARTPARK BOX || STARTPARK BOX || STARTPARK BOX || STARTPARK BOX || STARTPARK BOX || STARTPARK BOX ||
        // STARTPARK BOX || STARTPARK BOX || STARTPARK BOX || STARTPARK BOX || STARTPARK BOX || STARTPARK BOX ||
        // Initialize the startParkBox panel
        startParkBox = new JPanel();
        startParkBox.setBounds(0, 0, 220, 661);
        startParkBox.setBackground(Color.CYAN);
        rightContainer.add(startParkBox);
        startParkBox.setLayout(null);

        JLabel lblNewLabel = new JLabel("Start Parking");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(42, 37, 140, 21);
        startParkBox.add(lblNewLabel);

        JButton btnPark = new JButton("Park");
        btnPark.setBounds(10, 531, 89, 23);
        startParkBox.add(btnPark);

        JButton btnParkCancel = new JButton("Cancel");
        btnParkCancel.setBounds(121, 580, 89, 23);
        startParkBox.add(btnParkCancel);

        slotClicked = new JLabel("slot");
        slotClicked.setBounds(83, 102, 70, 70);
        startParkBox.add(slotClicked);

        startSlotType = new JLabel("type");
        startSlotType.setBounds(22, 322, 100, 20);
        startParkBox.add(startSlotType);

        // Set the startParkBox panel invisible initially
        startParkBox.setVisible(false);

        // Add action listeners to the startParkBox buttons
        btnParkCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startParkBox.setVisible(false);
                navigationBox.setVisible(true); // Display the navigation box
            }
        });

        // Modify the action listener for btnPark to insert data into the database
        btnPark.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                if (lastClickedButton != null) {
                	lastClickedButton.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                }
                
                // Insert data into the database
                insertParked(lastClickedButton);
                
                // Insert data into the database
                toPark(lastClickedButton);

                // Hide the startParkBox panel and display the navigation box
                startParkBox.setVisible(false);
                navigationBox.setVisible(true);
            }
        });
        
        // NAVIGATION BOX || NAVIGATION BOX || NAVIGATION BOX || NAVIGATION BOX || NAVIGATION BOX || NAVIGATION BOX ||
        // NAVIGATION BOX || NAVIGATION BOX || NAVIGATION BOX || NAVIGATION BOX || NAVIGATION BOX || NAVIGATION BOX ||
        navigationBox = new JPanel();
        navigationBox.setBounds(0, 0, 220, 661);
        rightContainer.add(navigationBox);
        navigationBox.setLayout(null);

        JButton navBtnMonitor = new JButton("Monitor");
        navBtnMonitor.setBounds(0, 243, 220, 30);
        navigationBox.add(navBtnMonitor);
        navBtnMonitor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel(monitorPage);
            }
        });

        JButton navBtnFloorOne = new JButton("1st Floor");
        navBtnFloorOne.setBounds(0, 270, 220, 30);
        navigationBox.add(navBtnFloorOne);
        navBtnFloorOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel(floorOnePage);
            }
        });

        JButton navBtnFloorTwo = new JButton("2nd Floor");
        navBtnFloorTwo.setBounds(0, 297, 220, 30);
        navigationBox.add(navBtnFloorTwo);
        navBtnFloorTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel(floorTwoPage);
            }
        });

        JButton navBtnFloorThree = new JButton("3rd Floor");
        navBtnFloorThree.setBounds(0, 324, 220, 30);
        navigationBox.add(navBtnFloorThree);
        navBtnFloorThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel(floorThreePage);
            }
        });

        JButton navBtnFloorFour = new JButton("4th Floor");
        navBtnFloorFour.setBounds(0, 351, 220, 30);
        navigationBox.add(navBtnFloorFour);
        navBtnFloorFour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel(floorFourPage);
            }
        });

        JPanel navLogo = new JPanel();
        navLogo.setBounds(42, 23, 134, 30);
        navigationBox.add(navLogo);
        
        // RIGHT CONTAINER || RIGHT CONTAINER || RIGHT CONTAINER || RIGHT CONTAINER || RIGHT CONTAINER || RIGHT CONTAINER ||
        rightContainer = new JLayeredPane();
        rightContainer.setBounds(220, 0, 664, 661);
        contentPane.add(rightContainer);
        
        // Populate the list of parked slots from the database
        ArrayList<String> parkedSlots = getParkedSlots();
        
        // 1ST FLOOR || 1ST FLOOR || 1ST FLOOR || 1ST FLOOR || 1ST FLOOR || 1ST FLOOR || 1ST FLOOR || 1ST FLOOR ||
        floorOnePage = new JPanel();
        floorOnePage.setBounds(0, 0, 664, 661);
        floorOnePage.setBackground(new Color(255, 255, 255));
        rightContainer.add(floorOnePage);
        floorOnePage.setLayout(null);
        
        // Initialize FloorOneButtons passing a reference to this main class
        floorOneButtons = new FloorOneButtons(this);
        setButtonsTransparentBackground(floorOnePage);

        // Update button colors based on parked slots
        updateButtonColors(parkedSlots, floorOnePage);

        // MONITOR || MONITOR || MONITOR || MONITOR || MONITOR || MONITOR || MONITOR || MONITOR || MONITOR ||
        monitorPage = new JPanel();
        monitorPage.setBounds(0, 0, 664, 661);
        monitorPage.setBackground(Color.DARK_GRAY);
        rightContainer.add(monitorPage);
        
        // 2ND FLOOR || 2ND FLOOR || 2ND FLOOR || 2ND FLOOR || 2ND FLOOR || 2ND FLOOR || 2ND FLOOR || 2ND FLOOR ||
        floorTwoPage = new JPanel();
        floorTwoPage.setBounds(0, 0, 664, 661);
        floorTwoPage.setBackground(Color.GREEN);
        rightContainer.add(floorTwoPage);
        
        // 3RD FLOOR || 3RD FLOOR || 3RD FLOOR || 3RD FLOOR || 3RD FLOOR || 3RD FLOOR || 3RD FLOOR || 3RD FLOOR ||
        floorThreePage = new JPanel();
        floorThreePage.setBounds(0, 0, 664, 661);
        floorThreePage.setBackground(Color.RED);
        rightContainer.add(floorThreePage);

        // 4TH FLOOR || 4TH FLOOR || 4TH FLOOR || 4TH FLOOR || 4TH FLOOR || 4TH FLOOR || 4TH FLOOR || 4TH FLOOR ||	
        floorFourPage = new JPanel();
        floorFourPage.setBounds(0, 0, 664, 661);
        floorFourPage.setBackground(Color.ORANGE);
        rightContainer.add(floorFourPage);

        
        // Set the monitor page as default
        showPanel(monitorPage);
        
        // slotClickedEnd = slotClicked
        slotClickedEnd.setText("9Z");
        
        btnEnd = new JButton("END");
        btnEnd.setFont(new Font("Maiandra GD", Font.BOLD, 20));
        btnEnd.setBounds(36, 500, 150, 40);
        endParkBox.add(btnEnd);
        
        btnEndCancel = new JButton("CANCEL");
        btnEndCancel.setFont(new Font("Maiandra GD", Font.BOLD, 20));
        btnEndCancel.setBounds(36, 560, 150, 40);
        endParkBox.add(btnEndCancel);
        
        endSlotTypeLabel = new JLabel("Slot Type:");
        endSlotTypeLabel.setFont(new Font("Source Code Pro Black", Font.PLAIN, 12));
        endSlotTypeLabel.setBounds(10, 353, 70, 14);
        endParkBox.add(endSlotTypeLabel);
        
        endSlotType = new JLabel("Regular");
        endSlotType.setFont(new Font("Source Code Pro Semibold", Font.BOLD, 15));
        endSlotType.setBounds(10, 368, 190, 17);
        endParkBox.add(endSlotType);
        
        btnEndCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	endParkBox.setVisible(false);
                navigationBox.setVisible(true); // Display the navigation box
                    }
                });
        
        btnEnd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	if (lastClickedButton != null) {
            		lastClickedButton.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
        }
	 
        // Remove the parked slot from the database
        removeParked(lastClickedButton);
        
        // Update data in the database
        endPark(lastClickedButton);
    	
    	// Hide the endParkBox panel and display the navigation box
        endParkBox.setVisible(false);
        navigationBox.setVisible(true);
            }
        });
      
    } // public class

    // Method for navigation. Ano ang lalabas sa rightContainer
    public void showPanel(JPanel panel) {
        monitorPage.setVisible(false);
        floorOnePage.setVisible(false);
        floorTwoPage.setVisible(false);
        floorThreePage.setVisible(false);
        floorFourPage.setVisible(false);
        startParkBox.setVisible(false); // Hide the startParkBox panel

        panel.setVisible(true);
    }
    
    // Method na nag-iinput ng parked slots sa database / park in method
    public void insertParked(JButton button) {
        String parkedSlot = button.getName(); // Get the name of the button
        String url = "jdbc:mysql://localhost:3306/pmsdb";
        String username = "root";
        String password = "";

        try {
            // Establish connection to the database
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare the SQL statement to insert data into the parked table
            String sql = "INSERT INTO parked (Slot_Name) VALUES (?)";
            PreparedStatement statement = con.prepareStatement(sql);

            // Set the button variable name as the value for the Slot_Name column
            statement.setString(1, parkedSlot);

            // Execute the SQL statement to insert data
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println(parkedSlot + " has been parked.");
            }

            // Close the connection
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
    
    // Method na nag-reremove ng parked slots database / park out method
    public void removeParked(JButton button) {
        String parkedSlot = button.getName(); // Get the name of the button
        String url = "jdbc:mysql://localhost:3306/pmsdb";
        String username = "root";
        String password = "";

        try {
            // Establish connection to the database
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare the SQL statement to remove the parked slot from the parked table
            String sql = "DELETE FROM parked WHERE Slot_Name = ?";
            PreparedStatement statement = con.prepareStatement(sql);

            // Set the button variable name as the value for the Slot_Name column
            statement.setString(1, parkedSlot);

            // Execute the SQL statement to remove the parked slot
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println(parkedSlot + " has been removed from parked slots.");
            } else {
                System.out.println(parkedSlot + " is not found in parked slots.");
            }

            // Close the connection
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Method na nag-iinput ng slot at timein sa database
    public void toPark(JButton button) {
        String parkedSlot = button.getName(); // Get the name of the button
        String url = "jdbc:mysql://localhost:3306/pmsdb";
        String username = "root";
        String password = "";

        try {
            // Establish connection to the database
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare the SQL statement to insert data
            String sql = "INSERT INTO trypms (Slot, Time_In) VALUES (?, NOW())";
            PreparedStatement statement = con.prepareStatement(sql);

            // Set values for the parameters in the SQL statement
            statement.setString(1, parkedSlot);

            // Execute the SQL statement to insert data
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println(parkedSlot + " has been parked.");
            }

            // Close the connection
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Method na nag-iinput ng timeout at rate sa database
    public void endPark(JButton button) {
        String parkedSlot = button.getName(); // Get the name of the button
        String url = "jdbc:mysql://localhost:3306/pmsdb";
        String username = "root";
        String password = "";

        try {
            // Establish connection to the database
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare the SQL statement to update the latest record for the given slot in the trypms table
            String sql = "UPDATE trypms SET Time_Out = ?, Rate = ? WHERE Slot = ? AND Time_Out IS NULL";
            PreparedStatement statement = con.prepareStatement(sql);

            // Set values for the parameters in the SQL statement
            statement.setTimestamp(1, new Timestamp(System.currentTimeMillis())); // Set current time as Time_Out
            statement.setInt(2, 50); // Set the rate as 50 (or adjust as needed)
            statement.setString(3, parkedSlot);

            // Execute the SQL statement to update the record
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Parking out recorded for slot: " + parkedSlot);
            } else {
                System.out.println("No active parking record found for slot: " + parkedSlot);
            }

            // Close the connection
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Method na mag-reretrieve at mag-sstore ng mga parked slots sa database
    public ArrayList<String> getParkedSlots() {
        ArrayList<String> parkedSlots = new ArrayList<>();

        String url = "jdbc:mysql://localhost:3306/pmsdb";
        String username = "root";
        String password = "";

        try {
            // Establish connection to the database
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare the SQL statement to retrieve parked slots
            String sql = "SELECT Slot_Name FROM parked";
            PreparedStatement statement = con.prepareStatement(sql);

            // Execute the SQL statement
            ResultSet resultSet = statement.executeQuery();

            // Retrieve the parked slots and add them to the ArrayList
            while (resultSet.next()) {
                parkedSlots.add(resultSet.getString("Slot_Name"));
            }

            // Close the connection
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return parkedSlots;
    }
    
    
    // Method to update button border colors based on parked slots
    public void updateButtonColors(ArrayList<String> parkedSlots, JPanel panel) {
        Component[] components = panel.getComponents();
        for (Component component : components) {
            if (component instanceof JButton) {
                JButton button = (JButton) component;
                String buttonName = button.getName(); // Get the name of the button
                Border border = BorderFactory.createLineBorder(Color.RED, 3); // Default red border for parked slots
                if (!parkedSlots.contains(buttonName)) {
                    border = BorderFactory.createLineBorder(Color.GREEN, 3); // Green border for non-parked slots
                }
                button.setBorder(border);
            }
        }
    }
    
    // Method na mag-hahide ng startParkBox at endParkBox
    public void isParked(JButton button) {
        if (button.getBorder() != null && ((LineBorder) button.getBorder()).getLineColor().equals(Color.RED)) {
            // IF PARKED
            startParkBox.setVisible(false);
            navigationBox.setVisible(false);
            endParkBox.setVisible(true);
            System.out.println("This button has a red border and it is Parked");
        } else {
            // IF NOT PARKED
            startParkBox.setVisible(true);
            navigationBox.setVisible(false);
            endParkBox.setVisible(false);
            System.out.println("This button has a green border and it is not Parked");
        }

        lastClickedButton = button;
    }
        
    // Method to check if the last clicked button is parked and update endTimeIn if it is
    public void updateTimeIn(JButton button) {
        String parkedSlot = button.getName(); // Get the name of the button
        String url = "jdbc:mysql://localhost:3306/pmsdb";
        String username = "root";
        String password = "";

        try {
            // Establish connection to the database
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare the SQL statement to retrieve the parking time (Time_In)
            String sql = "SELECT Time_In FROM trypms WHERE Slot = ? AND Time_Out IS NULL ORDER BY Time_In DESC LIMIT 1";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, parkedSlot);

            // Execute the SQL statement
            ResultSet resultSet = statement.executeQuery();

            // If a result is found, update the endTimeIn label
            if (resultSet.next()) {
                Timestamp timeIn = resultSet.getTimestamp("Time_In");
                // Update endTimeIn label with the retrieved Time_In value
                endTimeIn.setText(timeIn.toString()); // or format the timestamp as needed
            } else {
                // If no result found, indicate that no parking record was found
                endTimeIn.setText("No parking record found for slot " + parkedSlot);
            }

            // Close the connection
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // If an exception occurs, indicate that an error occurred
            endTimeIn.setText("Error retrieving parking record");
        }
    }


    // Method na nag-didisplay ng Slot na napindot
    public void updateSlotLabels(String text) {
        slotClicked.setText(text);
        slotClickedEnd.setText(text);
    }
    
    // Method na gagawing transparent ang bg ng button ng isang panel
    public void setButtonsTransparentBackground(JPanel panel) {
        Component[] components = panel.getComponents();
        for (Component component : components) {
            if (component instanceof JButton) {
                JButton button = (JButton) component;
                button.setOpaque(false); // Set button background to transparent
                button.setContentAreaFilled(false); // Also set content area filled to false
            }
        }
    }
    
    
    public void startLiveTimer(JButton button) {
        String parkedSlot = button.getName(); // Get the name of the button
        String url = "jdbc:mysql://localhost:3306/pmsdb";
        String username = "root";
        String password = "";

        try {
            // Establish connection to the database
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare the SQL statement to retrieve the parking time (Time_In)
            String sql = "SELECT Time_In FROM trypms WHERE Slot = ? AND Time_Out IS NULL";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, parkedSlot);

            // Execute the SQL statement
            ResultSet resultSet = statement.executeQuery();

            // If a result is found, calculate the time difference
            if (resultSet.next()) {
                Timestamp timeIn = resultSet.getTimestamp("Time_In");
                long timeInMillis = timeIn.getTime(); // Time in milliseconds
                long currentTime = System.currentTimeMillis();
                final long[] elapsedTime = {currentTime - timeInMillis}; // Array to hold elapsed time

                // Start a timer to update the endTimer label every second
                Timer timer = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Calculate elapsed time in seconds, minutes, and hours
                        long seconds = (elapsedTime[0] / 1000) % 60;
                        long minutes = (elapsedTime[0] / (1000 * 60)) % 60;
                        long hours = (elapsedTime[0] / (1000 * 60 * 60)) % 24;

                        // Update the endTimer label with the elapsed time
                        endTimer.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));

                        // Increment the elapsed time by one second
                        elapsedTime[0] += 1000;
                    }
                });

                // Start the timer
                timer.start();
            }

            // Close the connection
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            // If an exception occurs, indicate that an error occurred
            endTimer.setText("Error retrieving parking record");
        }
    }
    
} // public class


















//
//public class FloorOneButtons {
//	 private practiceGround mainClass;
//	
//	 public FloorOneButtons(practiceGround mainClass) {
//	     this.mainClass = mainClass;
//	     initializeButtons();
//	 }
//	
//	 private void initializeButtons() {
//	    
//	    JButton btn1A = new JButton("1A");
//        btn1A.setName("btn1A"); // Set the name of the button
//        btn1A.setBounds(79, 86, 89, 23);
//        mainClass.floorOnePage.add(btn1A);
//        btn1A.addActionListener(e -> {
//        	 
//	         mainClass.updateTimeIn(btn1A);
//	         mainClass.startLiveTimer(btn1A);
//	         mainClass.isParked(btn1A);
//	         mainClass.updateSlotLabels("1A");
//	         mainClass.startSlotType.setText("Regular");
//	     });
//    
//        JButton btn1B = new JButton("1B");
//        btn1B.setName("btn1B");
//        btn1B.setBounds(79, 128, 89, 23);
//        mainClass.floorOnePage.add(btn1B);
//        btn1B.addActionListener(e -> {
//        	
//	         mainClass.updateTimeIn(btn1B);
//	         mainClass.startLiveTimer(btn1B);
//	         mainClass.isParked(btn1B);
//	         mainClass.updateSlotLabels("1B");
//	         mainClass.startSlotType.setText("Regular");
//	     });
//
//        JButton btn1C = new JButton("1C");
//        btn1C.setName("btn1C");
//        btn1C.setBounds(79, 176, 89, 23);
//        mainClass.floorOnePage.add(btn1C);
//        btn1C.addActionListener(e -> {
//        	
//	         mainClass.updateTimeIn(btn1C);
//	         mainClass.startLiveTimer(btn1C);
//	         mainClass.isParked(btn1C);
//	         mainClass.updateSlotLabels("1C");
//	         mainClass.startSlotType.setText("Regular");
//	     });
//
//        JButton btn1D = new JButton("1D");
//        btn1D.setName("btn1D");
//        btn1D.setBounds(79, 231, 89, 23);
//        mainClass.floorOnePage.add(btn1D);
//        btn1D.addActionListener(e -> {
//   
//	         mainClass.updateTimeIn(btn1D);
//	         mainClass.startLiveTimer(btn1D);
//	         mainClass.isParked(btn1D);
//	         mainClass.updateSlotLabels("1D");
//	         mainClass.startSlotType.setText("PWD");
//	     });
//
//        JButton btn1E = new JButton("1E");
//        btn1E.setName("btn1E");
//        btn1E.setBounds(79, 287, 89, 23);
//        mainClass.floorOnePage.add(btn1E);
//        btn1E.addActionListener(e -> {
//        	 
//	         mainClass.updateTimeIn(btn1E);
//	         mainClass.startLiveTimer(btn1E);
//	         mainClass.isParked(btn1E);
//	         mainClass.updateSlotLabels("1E");
//	         mainClass.startSlotType.setText("PWD");
//	     });
//	     
//	     
//	 }
//}


    

