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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class pmsGetTimeIn extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    private JPanel monitorPage;
    private JPanel floorOnePage;
    private JPanel floorTwoPage;
    private JPanel floorThreePage;
    private JPanel floorFourPage;
    private JPanel startParkBox;
    private JPanel endParkBox;;
    private JPanel navigationBox;
    private JButton lastClickedButton;
    private JLabel slotClicked;
    private JLabel slotClickedEnd;
    private JButton btnEndCancel;
    private JButton btnEnd;
    private JLabel endTimeIn;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    pmsGetTimeIn frame = new pmsGetTimeIn();
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
    public pmsGetTimeIn() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 700);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLayeredPane leftContainer = new JLayeredPane();
        leftContainer.setBounds(0, 0, 220, 661);
        contentPane.add(leftContainer);
        
                endParkBox = new JPanel();
                endParkBox.setBounds(0, 0, 220, 661);
                endParkBox.setBackground(Color.WHITE);
                leftContainer.add(endParkBox);
                endParkBox.setLayout(null);
                endParkBox.setVisible(false);
                
                slotClickedEnd = new JLabel("slot");
                slotClickedEnd.setFont(new Font("Tahoma", Font.PLAIN, 20));
                slotClickedEnd.setHorizontalAlignment(SwingConstants.CENTER);
                slotClickedEnd.setBounds(39, 21, 134, 68);
                endParkBox.add(slotClickedEnd);
                
                btnEnd = new JButton("End");
                btnEnd.setBounds(65, 300, 89, 23);
                endParkBox.add(btnEnd);
                
                btnEndCancel = new JButton("Cancel");
                btnEndCancel.setBounds(65, 345, 89, 23);
                endParkBox.add(btnEndCancel);
                
                endTimeIn = new JLabel("timeIn");
                endTimeIn.setBounds(29, 175, 150, 17);
                endParkBox.add(endTimeIn);
                
                JLabel endTimer = new JLabel("timer");
                endTimer.setBounds(29, 205, 150, 17);
                endParkBox.add(endTimer);
                
                btnEndCancel.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	endParkBox.setVisible(false);
                        navigationBox.setVisible(true); // Display the navigation box
                    }
                });
                
                btnEnd.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	
                    	if (lastClickedButton != null) {
                            lastClickedButton.setBackground(Color.GREEN);
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
                

        // Initialize the startParkBox panel
        startParkBox = new JPanel();
        startParkBox.setBounds(0, 0, 220, 661);
        startParkBox.setBackground(Color.CYAN);
        leftContainer.add(startParkBox);
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

        JLabel startSlotType = new JLabel("type");
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
                    lastClickedButton.setBackground(Color.RED);
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
        

        navigationBox = new JPanel();
        navigationBox.setBounds(0, 0, 220, 661);
        leftContainer.add(navigationBox);
        navigationBox.setLayout(null);

        JButton navBtnMonitor = new JButton("Monitor");
        navBtnMonitor.setBounds(0, 243, 220, 30);
        navigationBox.add(navBtnMonitor);

        JButton navBtnFloorOne = new JButton("1st Floor");
        navBtnFloorOne.setBounds(0, 270, 220, 30);
        navigationBox.add(navBtnFloorOne);

        JButton navBtnFloorTwo = new JButton("2nd Floor");
        navBtnFloorTwo.setBounds(0, 297, 220, 30);
        navigationBox.add(navBtnFloorTwo);

        JButton navBtnFloorThree = new JButton("3rd Floor");
        navBtnFloorThree.setBounds(0, 324, 220, 30);
        navigationBox.add(navBtnFloorThree);

        JButton navBtnFloorFour = new JButton("4th Floor");
        navBtnFloorFour.setBounds(0, 351, 220, 30);
        navigationBox.add(navBtnFloorFour);

        JPanel navLogo = new JPanel();
        navLogo.setBounds(42, 23, 134, 30);
        navigationBox.add(navLogo);

        JLayeredPane rightContainer = new JLayeredPane();
        rightContainer.setBounds(220, 0, 664, 661);
        contentPane.add(rightContainer);

        floorOnePage = new JPanel();
        floorOnePage.setBounds(0, 0, 664, 661);
        floorOnePage.setBackground(new Color(255, 255, 255));
        rightContainer.add(floorOnePage);
        floorOnePage.setLayout(null);

        JButton btn1A = new JButton("1A");
        btn1A.setName("btn1A"); // Set the name of the button
        btn1A.setBounds(79, 86, 89, 23);
        floorOnePage.add(btn1A);

        JButton btn1B = new JButton("1B");
        btn1B.setName("btn1B");
        btn1B.setBounds(79, 128, 89, 23);
        floorOnePage.add(btn1B);

        JButton btn1C = new JButton("1C");
        btn1C.setName("btn1C");
        btn1C.setBounds(79, 176, 89, 23);
        floorOnePage.add(btn1C);

        JButton btn1D = new JButton("1D");
        btn1D.setName("btn1D");
        btn1D.setBounds(79, 231, 89, 23);
        floorOnePage.add(btn1D);

        JButton btn1E = new JButton("1E");
        btn1E.setName("btn1E");
        btn1E.setBounds(79, 287, 89, 23);
        floorOnePage.add(btn1E);

        // Populate the list of parked slots from the database
        ArrayList<String> parkedSlots = getParkedSlots();

        // Update button colors based on parked slots
        updateButtonColors(parkedSlots, floorOnePage);


        monitorPage = new JPanel();
        monitorPage.setBounds(0, 0, 664, 661);
        monitorPage.setBackground(Color.DARK_GRAY);
        rightContainer.add(monitorPage);

        floorTwoPage = new JPanel();
        floorTwoPage.setBounds(0, 0, 664, 661);
        floorTwoPage.setBackground(Color.GREEN);
        rightContainer.add(floorTwoPage);

        floorThreePage = new JPanel();
        floorThreePage.setBounds(0, 0, 664, 661);
        floorThreePage.setBackground(Color.RED);
        rightContainer.add(floorThreePage);

        floorFourPage = new JPanel();
        floorFourPage.setBounds(0, 0, 664, 661);
        floorFourPage.setBackground(Color.ORANGE);
        rightContainer.add(floorFourPage);

        // Set the monitor page as default
        showPanel(monitorPage);

        // Add action listeners to the navigation buttons
        navBtnMonitor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel(monitorPage);
            }
        });

        navBtnFloorOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel(floorOnePage);
            }
        });

        navBtnFloorTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel(floorTwoPage);
            }
        });

        navBtnFloorThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel(floorThreePage);
            }
        });

        navBtnFloorFour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel(floorFourPage);
            }
        });

        // Add action listeners to the floor buttons
        btn1A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	updateTimeIn();
            	isParked(btn1A);
            	
            	updateSlotLabels("1A");
            	
                startSlotType.setText("Regular");
            }
        });

        btn1B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	updateTimeIn();
            	isParked(btn1B);
            	
            	updateSlotLabels("1B");
            	
                startSlotType.setText("Regular");
            }
        });

        btn1C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	updateTimeIn();
            	isParked(btn1C);
            	
            	updateSlotLabels("1C");
            	
                startSlotType.setText("Regular");
            }
        });

        btn1D.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	updateTimeIn();
            	isParked(btn1D);
            	
            	updateSlotLabels("1D");
            	
                startSlotType.setText("PWD");
            }
        });

        btn1E.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	updateTimeIn();
            	isParked(btn1E);
            	
            	updateSlotLabels("1E");
            	
                startSlotType.setText("PWD");
            }
        });
        
        slotClickedEnd.setText(slotClicked.getText());
      
    } // public class

    // Method to show a specific panel and hide others
    private void showPanel(JPanel panel) {
        monitorPage.setVisible(false);
        floorOnePage.setVisible(false);
        floorTwoPage.setVisible(false);
        floorThreePage.setVisible(false);
        floorFourPage.setVisible(false);
        startParkBox.setVisible(false); // Hide the startParkBox panel

        panel.setVisible(true);
    }
    
    // Method na nag-iinput ng parked slots sa database / park in method
    private void insertParked(JButton button) {
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
    private void removeParked(JButton button) {
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
    
    
    
    // Method na mag-reretrieve at mag-sstore ng mga parked slots sa database
    private ArrayList<String> getParkedSlots() {
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
    
    // Method na mag-chechecked kung naka-parked ang slot at mag-change ng background color
    private void updateButtonColors(ArrayList<String> parkedSlots, JPanel panel) {
        Component[] components = panel.getComponents();
        for (Component component : components) {
            if (component instanceof JButton) {
                JButton button = (JButton) component;
                String buttonName = button.getName(); // Get the name of the button
                if (parkedSlots.contains(buttonName)) {
                    button.setBackground(Color.RED);
                } else {
                    button.setBackground(Color.GREEN);
                }
            }
        }
    }
    
    // Method na mag-hahide ng startParkBox at endParkBox
    private void isParked(JButton button) {
        if (button.getBackground().equals(Color.RED)) {
        	// IF PARKED
        	startParkBox.setVisible(false);
            navigationBox.setVisible(false);
            endParkBox.setVisible(true);
            System.out.println("This button has a red background and it is Parked");
        } else {
        	// IF NOT PARKED
        	startParkBox.setVisible(true);
            navigationBox.setVisible(false);
            endParkBox.setVisible(false);
            System.out.println("This button has a green background and it is not Parked");
        }
        
        lastClickedButton = button;
    }
    
    // Method na nag-iinput ng slot at timein sa database
    private void toPark(JButton button) {
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
    private void endPark(JButton button) {
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
    
 // Method to check if the last clicked button is parked and update endTimeIn if it is
    private void updateTimeIn() {
        JButton lastClickedButton = this.lastClickedButton;
        if (lastClickedButton != null && lastClickedButton.getBackground().equals(Color.RED)) {
            String parkedSlot = lastClickedButton.getName(); // Get the name of the button
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
        } else {
            // If the last clicked button is not parked, clear the endTimeIn label
            endTimeIn.setText("This is the time in");
        }
    }





    
    // Method na nag-didisplay ng Slot na napindot
    private void updateSlotLabels(String text) {
        slotClicked.setText(text);
        slotClickedEnd.setText(text);
    }


      
} // public class

    

