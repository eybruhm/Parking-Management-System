package pms;


// LAGAY PWD SA PARKED SLOTS DB
// PARA MACOUNT ILAN ANG AVAILABLE NA PWD SLOTS
// 

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
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
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

import java.awt.Font;
import java.awt.Image;


public class pms extends JFrame {

    public static final long serialVersionUID = 1L;
    public JPanel contentPane;
    
    // Right Container
    public JPanel monitorPage;
    public JPanel floorOnePage;
    public JPanel floorTwoPage;
    public JPanel floorThreePage;
    public JPanel floorFourPage;
    
    // Left Container
    public JPanel startParkBox;
    public JPanel endParkBox;;
    public JPanel navigationBox;
    public StartPark startPark;
    public EndPark endPark;
    public NavigationPanel navPanel;
    
    public JButton lastClickedButton;
    
    // Start Park Box
    public JLabel slotClicked;
    public JLabel startSlotType;
    public JLabel startTypeLabel;
    public JLabel startPositionLabel;
    public JLabel startPosition;
    
    
    // End Park Box
    public JLabel slotClickedEnd;
    public JButton btnEndCancel;
    public JButton btnEnd;
    public JLabel endTimeIn;
    public JLabel endTimeInLabel;
    public JLabel endTimerLabel;
    public JLabel endSlotTypeLabel;
    public JLabel endSlotType;
    public JLabel endTimer;
    public JLabel endPosition;
    public JLabel endPositionLabel;
    
    // Monitor Page
    public int floorOneTotal = 16;
    public int floorTwoTotal = 19;
    public int floorThreeTotal = 22;
    public int floorFourTotal = 24;
    public int floorOnePwdTotal = 4;
    public int floorTwoPwdTotal = 2;
    public int floorThreePwdTotal = 2;
    public int floorFourPwdTotal = 2;
    public int floorDb = 0;
    public JLabel floorOneTotalText = new JLabel("");
    public JLabel floorTwoTotalText = new JLabel("");
    public JLabel floorThreeTotalText = new JLabel("");
    public JLabel floorFourTotalText = new JLabel("");
    public JLabel floorOnePwdTotalText = new JLabel("");
    public JLabel floorTwoPwdTotalText = new JLabel("");
    public JLabel floorThreePwdTotalText = new JLabel("");
    public JLabel floorFourPwdTotalText = new JLabel(""); 
    public MonitorPanel monitorPanel;
    
    // Declare a member variable to hold reference to FloorOneButtons
    public FloorOneButtons floorOneButtons;
    public FloorTwoButtons floorTwoButtons;
    public FloorThreeButtons floorThreeButtons;
    public FloorFourButtons floorFourButtons;
    
    
    public JLayeredPane leftContainer;
    public Timer currentTimer;  
    public Timer rateUpdateTimer;

    
    // Rate parameters
    public static final LocalTime START_RATE_HOUR = LocalTime.of(23, 0); 
    public static final LocalTime END_RATE_HOUR = LocalTime.of(9, 0); 
    public static final int RATE_PER_TIME = 20; 
    public static final Duration RATE_TIME_UNIT = Duration.ofHours(1); 

    // JLabel to display the end rate
    public JLabel endRate = new JLabel();


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    pms frame = new pms();
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
    public pms() {
    	 setTitle("Parking Management System"); 
         setIconImage(new ImageIcon("D:\\ALMM\\Programming\\Java\\PMS\\src\\pms\\pms-icon.jpg").getImage()); 

        setLocationRelativeTo(null);// Center the frame on the screen
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(230, 20, 900, 700);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // RIGHT CONTAINER || RIGHT CONTAINER || RIGHT CONTAINER || RIGHT CONTAINER || RIGHT CONTAINER || RIGHT CONTAINER ||
        JLayeredPane rightContainer;
        leftContainer = new JLayeredPane();
        leftContainer.setBounds(0, 0, 220, 661);
        leftContainer.setLayout(null);
        contentPane.add(leftContainer);
	    
        // STARTPARK BOX || STARTPARK BOX || STARTPARK BOX || STARTPARK BOX || STARTPARK BOX || STARTPARK BOX ||
        // STARTPARK BOX || STARTPARK BOX || STARTPARK BOX || STARTPARK BOX || STARTPARK BOX || STARTPARK BOX ||
        // Initialize the startParkBox panel
        startParkBox = new JPanel();
        startParkBox.setBounds(0, 0, 220, 661);
        startParkBox.setBackground(Color.decode("#B6FFA1"));
        leftContainer.add(startParkBox);
        startParkBox.setLayout(null);       
        startParkBox.setVisible(false);
        startPark = new StartPark(this);

        // ENDPARK BOX || ENDPARK BOX || ENDPARK BOX || ENDPARK BOX || ENDPARK BOX || ENDPARK BOX ||
        // ENDPARK BOX || ENDPARK BOX || ENDPARK BOX || ENDPARK BOX || ENDPARK BOX || ENDPARK BOX || 
	    endParkBox = new JPanel();
	    endParkBox.setBounds(0, 0, 220, 661);
	    endParkBox.setBackground(Color.decode("#FF8D8D"));
	    leftContainer.add(endParkBox);
	    endParkBox.setLayout(null);
	    endParkBox.setVisible(false);
	    endPark = new EndPark(this);
	     
	   
        // NAVIGATION BOX || NAVIGATION BOX || NAVIGATION BOX || NAVIGATION BOX || NAVIGATION BOX || NAVIGATION BOX ||
        // NAVIGATION BOX || NAVIGATION BOX || NAVIGATION BOX || NAVIGATION BOX || NAVIGATION BOX || NAVIGATION BOX ||
        navigationBox = new JPanel();
        navigationBox.setBounds(0, 0, 220, 661);
        navigationBox.setBackground(Color.decode("#ff8109"));
        leftContainer.add(navigationBox);
        navigationBox.setLayout(null);
        navPanel = new NavigationPanel(this);
        
        // RIGHT CONTAINER || RIGHT CONTAINER || RIGHT CONTAINER || RIGHT CONTAINER || RIGHT CONTAINER || RIGHT CONTAINER ||
        rightContainer = new JLayeredPane();
        rightContainer.setBounds(220, 0, 664, 661);
        contentPane.add(rightContainer);
        
        // MONITOR || MONITOR || MONITOR || MONITOR || MONITOR || MONITOR || MONITOR || MONITOR || MONITOR ||
        monitorPage = new JPanel();
        monitorPage.setBounds(0, 0, 664, 661);
        monitorPage.setBackground(Color.DARK_GRAY);
        monitorPage.setLayout(null);
        rightContainer.add(monitorPage);
        monitorPanel = new MonitorPanel(this);
        
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
        
        // 2ND FLOOR || 2ND FLOOR || 2ND FLOOR || 2ND FLOOR || 2ND FLOOR || 2ND FLOOR || 2ND FLOOR || 2ND FLOOR ||
        floorTwoPage = new JPanel();
        floorTwoPage.setBounds(0, 0, 664, 661);
        floorTwoPage.setBackground(Color.GREEN);
        rightContainer.add(floorTwoPage);
        floorTwoPage.setLayout(null);
        floorTwoButtons = new FloorTwoButtons(this);
        setButtonsTransparentBackground(floorTwoPage);
        updateButtonColors(parkedSlots, floorTwoPage);
        
        // 3RD FLOOR || 3RD FLOOR || 3RD FLOOR || 3RD FLOOR || 3RD FLOOR || 3RD FLOOR || 3RD FLOOR || 3RD FLOOR ||
        floorThreePage = new JPanel();
        floorThreePage.setBounds(0, 0, 664, 661);
        floorThreePage.setBackground(Color.RED);
        rightContainer.add(floorThreePage);
        floorThreePage.setLayout(null);
        floorThreeButtons = new FloorThreeButtons(this);
        setButtonsTransparentBackground(floorThreePage);
        updateButtonColors(parkedSlots, floorThreePage);
        
        // 4TH FLOOR || 4TH FLOOR || 4TH FLOOR || 4TH FLOOR || 4TH FLOOR || 4TH FLOOR || 4TH FLOOR || 4TH FLOOR ||	
        floorFourPage = new JPanel();
        floorFourPage.setBounds(0, 0, 664, 661);
        floorFourPage.setBackground(Color.ORANGE);
        rightContainer.add(floorFourPage);
        floorFourPage.setLayout(null);
        floorFourButtons = new FloorFourButtons(this);
        setButtonsTransparentBackground(floorFourPage);
        updateButtonColors(parkedSlots, floorFourPage);
        
        // Set the monitor page as default
        showPanel(monitorPage);
        
        // Floor sa Database
        floorBtnsDb(floorOnePage, 1);
        floorBtnsDb(floorTwoPage, 2);
        floorBtnsDb(floorThreePage, 3);
        floorBtnsDb(floorFourPage, 4);
        
        updateFloorTotals();
       
        
    } // public class
    
    // METHODS || METHODS || METHODS || METHODS || METHODS || METHODS || METHODS || METHODS || METHODS || METHODS || METHODS || METHODS || 
    // METHODS || METHODS || METHODS || METHODS || METHODS || METHODS || METHODS || METHODS || METHODS || METHODS || METHODS || METHODS || 
    
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
    
    // Define a method to update the end slot type based on the start slot type
    public void updateTypeLocation(String slotType, String slotLocation) {
    	startSlotType.setText(slotType);
        endSlotType.setText(slotType);
        
        startPosition.setText(slotLocation);
        endPosition.setText(slotLocation);
    }
    
    // Method na nag-iinput ng parked slots sa database / park in method
    public void insertParked(JButton button, String slotType) {
        String parkedSlot = button.getName(); // Get the name of the button
        String url = "jdbc:mysql://localhost:3306/pmsdb";
        String username = "root";
        String password = "";

        try {
            // Establish connection to the database
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare the SQL statement to insert data into the parked table
            String sql = "INSERT INTO parked (Slot_Name, Floor, Slot_Type) VALUES (?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);

            // Set the button variable name as the value for the Slot_Name column
            statement.setString(1, parkedSlot);
            
            // Set the floorDb value as the value for the Floor column
            statement.setInt(2, floorDb);

            // Set the slotType value as the value for the Slot_Type column
            statement.setString(3, slotType);

            // Execute the SQL statement to insert data
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
            	System.out.println();
                // System.out.println(parkedSlot + " has been parked on floor " + floorDb + " with type: " + slotType);
            	System.out.println(parkedSlot + " is now occupied.");
            }

            // Close the connection
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public void floorBtnsDb(JPanel panel, int floorDbValue) {
    	for (Component component : panel.getComponents()) {
            if (component instanceof JButton) {
                JButton button = (JButton) component;
                button.addActionListener(e -> {
                    floorDb = floorDbValue;
                });
            }
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
            	System.out.println();
                System.out.println(parkedSlot + " is now available.");
            } else {
            	System.out.println();
                System.out.println(parkedSlot + " is not found in parked slots.");
            }

            // Close the connection
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Method to park a slot in the database
    public void toPark(JButton button) {
        String parkedSlot = button.getName(); // Get the name of the button
        String url = "jdbc:mysql://localhost:3306/pmsdb";
        String username = "root";
        String password = "";

        try {
            // Establish connection to the database
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare the SQL statement to insert data
            String sql = "INSERT INTO pms_day1 (Slot, Time_In) VALUES (?, NOW())"; // Use MySQL's NOW() function to get current time
            PreparedStatement statement = con.prepareStatement(sql);

            // Set values for the parameters in the SQL statement
            statement.setString(1, parkedSlot);

            // Execute the SQL statement to insert data
            int rowsInserted = statement.executeUpdate();
//            if (rowsInserted > 0) {
//                System.out.print(parkedSlot + " has been parked.");
//            }

            // Close the connection
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to park out a slot in the database
    public void endPark(JButton button) {
        String parkedSlot = button.getName(); // Get the name of the button
        String url = "jdbc:mysql://localhost:3306/pmsdb";
        String username = "root";
        String password = "";

        try {
            // Establish connection to the database
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare the SQL statement to retrieve the parking time (Time_In)
            String sqlSelect = "SELECT Time_In FROM pms_day1 WHERE Slot = ? AND Time_Out IS NULL";
            PreparedStatement statementSelect = con.prepareStatement(sqlSelect);
            statementSelect.setString(1, parkedSlot);

            // Execute the SQL statement
            ResultSet resultSet = statementSelect.executeQuery();

            if (resultSet.next()) {
                Timestamp timeIn = resultSet.getTimestamp("Time_In");
                LocalDateTime timeInLDT = timeIn.toLocalDateTime();
                LocalDateTime timeOutLDT = LocalDateTime.now(); // Use current time as Time_Out

                // Calculate the rate
                long totalRate = calculateRate(timeInLDT, timeOutLDT);

                // Update the Rate column in the database
                String sqlUpdateRate = "UPDATE pms_day1 SET Time_Out = ?, Rate = ? WHERE Slot = ? AND Time_Out IS NULL";
                PreparedStatement statementUpdateRate = con.prepareStatement(sqlUpdateRate);

                // Set values for the parameters in the SQL statement
                statementUpdateRate.setTimestamp(1, Timestamp.valueOf(timeOutLDT)); // Set current time as Time_Out
                statementUpdateRate.setLong(2, totalRate); // Set the calculated rate
                statementUpdateRate.setString(3, parkedSlot);

                // Execute the SQL statement to update the record with Time_Out and Rate
                int rowsUpdatedRate = statementUpdateRate.executeUpdate();
//                if (rowsUpdatedRate > 0) {
//                    System.out.println(parkedSlot + " has been parked out. Rate: " + totalRate);
//                } else {
//                    System.out.println("No active parking record found for slot: " + parkedSlot);
//                }
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
    	lastClickedButton = button;
        if (button.getBorder() != null && ((LineBorder) button.getBorder()).getLineColor().equals(Color.RED)) {
            // IF PARKED
            startParkBox.setVisible(false);
            navigationBox.setVisible(false);
            endParkBox.setVisible(true);
            System.out.println();
            System.out.println(lastClickedButton.getName() + " is currently occupied.");
        } else {
            // IF NOT PARKED
            startParkBox.setVisible(true);
            navigationBox.setVisible(false);
            endParkBox.setVisible(false);
            System.out.println();
            System.out.println(lastClickedButton.getName() + " is currently available.");
        }

//        lastClickedButton = button;
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
            String sql = "SELECT Time_In FROM pms_day1 WHERE Slot = ? AND Time_Out IS NULL ORDER BY Time_In DESC LIMIT 1";
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
    
    // Method to start the live timer for a parking slot
    public void startLiveTimer(JButton button) {
        String parkedSlot = button.getName(); // Get the name of the button
        String url = "jdbc:mysql://localhost:3306/pmsdb";
        String username = "root";
        String password = "";

        try {
            // Establish connection to the database
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare the SQL statement to retrieve the parking time (Time_In)
            String sql = "SELECT Time_In FROM pms_day1 WHERE Slot = ? AND Time_Out IS NULL";
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

                // Stop any existing timer
                if (currentTimer != null) {
                    currentTimer.stop();
                }

                // Start a timer to update the endTimer label every second
                currentTimer = new Timer(1000, new ActionListener() {
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
                currentTimer.start();
            }

            // Close the connection
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            // If an exception occurs, indicate that an error occurred
            endTimer.setText("Error retrieving parking record");
        }
    }

    
    // Define a method to get the start time from the database based on the parked button
    public long getStartTime(JButton button) {
        String parkedSlot = button.getName(); // Get the name of the button
        String url = "jdbc:mysql://localhost:3306/pmsdb";
        String username = "root";
        String password = "";
        long startTime = 0;

        try {
            // Establish connection to the database
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare the SQL statement to retrieve the parking time (Time_In)
            String sql = "SELECT Time_In FROM pms_day1 WHERE Slot = ? AND Time_Out IS NULL";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, parkedSlot);

            // Execute the SQL statement
            ResultSet resultSet = statement.executeQuery();

            // If a result is found, retrieve the start time
            if (resultSet.next()) {
                Timestamp timeIn = resultSet.getTimestamp("Time_In");
                startTime = timeIn.getTime(); // Get the start time in milliseconds
            }

            // Close the connection
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Handle exceptions if necessary
        }

        return startTime;
    }
    
    

    // Method to calculate the parking rate based on start and end times
    public long calculateRate(LocalDateTime timeIn, LocalDateTime timeOut) {
        long totalRate = 0;
        LocalDateTime currentTime = timeIn;

        while (!currentTime.isAfter(timeOut)) {
            // Check if the current time is within the rate hours
            LocalTime currentLocalTime = currentTime.toLocalTime();
            if ((currentLocalTime.isAfter(START_RATE_HOUR) || currentLocalTime.equals(START_RATE_HOUR)) &&
                (currentLocalTime.isBefore(END_RATE_HOUR) || currentLocalTime.equals(END_RATE_HOUR))) {
                // Increment the rate if within the rate hours
                totalRate += RATE_PER_TIME;
            }

            // Move to the next rate time unit
            currentTime = currentTime.plus(RATE_TIME_UNIT);
        }

        return totalRate;
    }

    // Method to update the endRate label live
    public void updateLiveRate(JButton button) {
        String parkedSlot = button.getName(); // Get the name of the button
        String url = "jdbc:mysql://localhost:3306/pmsdb";
        String username = "root";
        String password = "";

        try {
            // Establish connection to the database
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare the SQL statement to retrieve the parking time (Time_In)
            String sqlSelect = "SELECT Time_In FROM pms_day1 WHERE Slot = ? AND Time_Out IS NULL";
            PreparedStatement statementSelect = con.prepareStatement(sqlSelect);
            statementSelect.setString(1, parkedSlot);

            // Execute the SQL statement
            ResultSet resultSet = statementSelect.executeQuery();

            if (resultSet.next()) {
                Timestamp timeIn = resultSet.getTimestamp("Time_In");
                LocalDateTime timeInLDT = timeIn.toLocalDateTime();
                LocalDateTime timeOutLDT = LocalDateTime.now(); // Use current time as Time_Out

                // Calculate the rate
                long totalRate = calculateRate(timeInLDT, timeOutLDT);

                // Update the endRate label with the calculated rate
                endRate.setText("" + totalRate);
            }

            // Close the connection
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } 
    

    public void updateFloorTotals() {
        String url = "jdbc:mysql://localhost:3306/pmsdb";
        String username = "root";
        String password = "";

        try {
            // Establish connection to the database
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare the SQL statement to retrieve the counts for each floor and PWD
            String sql = "SELECT Floor, Slot_Type FROM parked";
            PreparedStatement statement = con.prepareStatement(sql);

            // Execute the SQL statement
            ResultSet resultSet = statement.executeQuery();

            // Initialize variables to store the counts for each floor and PWD
            int floorOneCount = 0;
            int floorTwoCount = 0;
            int floorThreeCount = 0;
            int floorFourCount = 0;
            int floorOnePwdCount = 0;
            int floorTwoPwdCount = 0;
            int floorThreePwdCount = 0;
            int floorFourPwdCount = 0;

            // Iterate through the results and update the counts
            while (resultSet.next()) {
                int floor = resultSet.getInt("Floor");
                String slotType = resultSet.getString("Slot_Type");

                switch (floor) {
                    case 1:
                        floorOneCount++;
                        if (slotType != null && slotType.equals("PWD")) {
                            floorOnePwdCount++;
                        }
                        break;
                    case 2:
                        floorTwoCount++;
                        if (slotType != null && slotType.equals("PWD")) {
                            floorTwoPwdCount++;
                        }
                        break;
                    case 3:
                        floorThreeCount++;
                        if (slotType != null && slotType.equals("PWD")) {
                            floorThreePwdCount++;
                        }
                        break;
                    case 4:
                        floorFourCount++;
                        if (slotType != null && slotType.equals("PWD")) {
                            floorFourPwdCount++;
                        }
                        break;
                    default:
                        break;
                }
            }

            // Subtract the counts from the initialized totals to get the available slots
            floorOneTotal = 16 - floorOneCount;
            floorTwoTotal = 19 - floorTwoCount;
            floorThreeTotal = 22 - floorThreeCount;
            floorFourTotal = 24 - floorFourCount;
            floorOnePwdTotal = 4 - floorOnePwdCount;
            floorTwoPwdTotal = 2 - floorTwoPwdCount;
            floorThreePwdTotal = 2 - floorThreePwdCount;
            floorFourPwdTotal = 2 - floorFourPwdCount;

            // Set the text of the JLabels
            floorOneTotalText.setText(String.valueOf(floorOneTotal));
            floorTwoTotalText.setText(String.valueOf(floorTwoTotal));
            floorThreeTotalText.setText(String.valueOf(floorThreeTotal));
            floorFourTotalText.setText(String.valueOf(floorFourTotal));
            floorOnePwdTotalText.setText(String.valueOf(floorOnePwdTotal));
            floorTwoPwdTotalText.setText(String.valueOf(floorTwoPwdTotal));
            floorThreePwdTotalText.setText(String.valueOf(floorThreePwdTotal));
            floorFourPwdTotalText.setText(String.valueOf(floorFourPwdTotal));

            // Close the connection
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
} // public class

    

