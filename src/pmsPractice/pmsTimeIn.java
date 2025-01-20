package pmsPractice;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;



public class pmsTimeIn extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    private JPanel monitorPage;
    private JPanel floorOnePage;
    private JPanel floorTwoPage;
    private JPanel floorThreePage;
    private JPanel floorFourPage;
    private JPanel startParkBox;
    private JPanel navigationBox;
    private String slotType = "Regular";

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    pmsTimeIn frame = new pmsTimeIn();
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
    public pmsTimeIn() {
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
        
		// Initialize the startParkBox panel
		startParkBox = new JPanel();
		startParkBox.setBounds(0, 0, 220, 661);
		startParkBox.setBackground(Color.CYAN);
		leftContainer.add(startParkBox);
		startParkBox.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Start Parking");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(42, 37, 140, 21);
		startParkBox.add(lblNewLabel);
		
		JButton btnPark = new JButton("Park");
		btnPark.setBounds(10, 531, 89, 23);
		startParkBox.add(btnPark);
		
		JButton btnParkCancel = new JButton("Cancel");
		btnParkCancel.setBounds(121, 580, 89, 23);
		startParkBox.add(btnParkCancel);
		
		JLabel slotClicked = new JLabel("slot");
		slotClicked.setFont(new Font("Source Code Pro Semibold", Font.PLAIN, 18));
		slotClicked.setHorizontalAlignment(SwingConstants.CENTER);
		slotClicked.setBounds(83, 102, 70, 70);
		startParkBox.add(slotClicked);
		
		JLabel startSlotType = new JLabel("type");
		startSlotType.setFont(new Font("Source Code Pro Black", Font.PLAIN, 11));
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
		        // Get the text of the button from slotClicked label
		        String slot = slotClicked.getText();
		        
		        // Get the current datetime
		        LocalDateTime timeIn = LocalDateTime.now();
		        
		        // Insert data into the database
		        insertData(slot, timeIn);
		        
		        // Hide the startParkBox panel and display the navigation box
		        startParkBox.setVisible(false);
		        navigationBox.setVisible(true);
		    }
		});
		
		navigationBox = new JPanel();
		navigationBox.setBounds(0, 0, 220, 661);
		navigationBox.setBackground(Color.BLUE);
		leftContainer.add(navigationBox);
		navigationBox.setLayout(null);

        JButton navBtnMonitor = new JButton("Monitor");
        navBtnMonitor.setBounds(0, 243, 220, 30);
        navBtnMonitor.setBackground(Color.DARK_GRAY);
        navigationBox.add(navBtnMonitor);

        JButton navBtnFloorOne = new JButton("1st Floor");
        navBtnFloorOne.setBackground(Color.YELLOW);
        navBtnFloorOne.setBounds(0, 270, 220, 30);
        navigationBox.add(navBtnFloorOne);

        JButton navBtnFloorTwo = new JButton("2nd Floor");
        navBtnFloorTwo.setBackground(Color.GREEN);
        navBtnFloorTwo.setBounds(0, 297, 220, 30);
        navigationBox.add(navBtnFloorTwo);

        JButton navBtnFloorThree = new JButton("3rd Floor");
        navBtnFloorThree.setBackground(Color.RED);
        navBtnFloorThree.setBounds(0, 324, 220, 30);
        navigationBox.add(navBtnFloorThree);

        JButton navBtnFloorFour = new JButton("4th Floor");
        navBtnFloorFour.setBackground(Color.ORANGE);
        navBtnFloorFour.setBounds(0, 351, 220, 30);
        navigationBox.add(navBtnFloorFour);

        JPanel navLogo = new JPanel();
        navLogo.setBounds(42, 23, 134, 30);
        navLogo.setBackground(Color.BLACK);
        navigationBox.add(navLogo);

        JPanel endParkBox = new JPanel();
        endParkBox.setBounds(0, 0, 220, 661);
        endParkBox.setBackground(Color.WHITE);
        leftContainer.add(endParkBox);

        JLayeredPane rightContainer = new JLayeredPane();
        rightContainer.setBounds(220, 0, 664, 661);
        contentPane.add(rightContainer);

        floorOnePage = new JPanel();
        floorOnePage.setBounds(0, 0, 664, 661);
        floorOnePage.setBackground(new Color(255, 255, 255));
        rightContainer.add(floorOnePage);
        floorOnePage.setLayout(null);

        JButton btn1A = new JButton("1A");
        btn1A.setBounds(79, 86, 89, 23);
        floorOnePage.add(btn1A);

        JButton btn2A = new JButton("2A");
        btn2A.setBounds(79, 128, 89, 23);
        floorOnePage.add(btn2A);

        JButton btn3A = new JButton("3A");
        btn3A.setBounds(79, 176, 89, 23);
        floorOnePage.add(btn3A);

        JButton btn4A = new JButton("4A PWD");
        btn4A.setBounds(79, 231, 89, 23);
        floorOnePage.add(btn4A);

        JButton btn5A = new JButton("5A PWD");
        btn5A.setBounds(79, 287, 89, 23);
        floorOnePage.add(btn5A);

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
                startParkBox.setVisible(true); // Display the startParkBox panel
                navigationBox.setVisible(false); // Hide the navigation box
                // Set the text of slotClicked label to the text of the button
                slotClicked.setText(btn1A.getText());
                startSlotType.setText(slotType);
            }
        });

        btn2A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startParkBox.setVisible(true); // Display the startParkBox panel
                navigationBox.setVisible(false); // Hide the navigation box
                // Set the text of slotClicked label to the text of the button
                slotClicked.setText(btn2A.getText());
                startSlotType.setText(" ");
                
            }
        });

        btn3A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startParkBox.setVisible(true); // Display the startParkBox panel
                navigationBox.setVisible(false); // Hide the navigation box
                // Set the text of slotClicked label to the text of the button
                slotClicked.setText(btn3A.getText());
                startSlotType.setText(slotType);
            }
        });

        btn4A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startParkBox.setVisible(true); // Display the startParkBox panel
                navigationBox.setVisible(false); // Hide the navigation box
                // Set the text of slotClicked label to the text of the button
                slotClicked.setText(btn4A.getText());
                startSlotType.setText("PWD");
            }
        });

        btn5A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startParkBox.setVisible(true); // Display the startParkBox panel
                navigationBox.setVisible(false); // Hide the navigation box
                // Set the text of slotClicked label to the text of the button
                slotClicked.setText(btn5A.getText());
                startSlotType.setText("PWD");
            }
        });
        
    }

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
    
    
    // Add a method to insert data into the database
    private void insertData(String slot, LocalDateTime timeIn) {
        String url = "jdbc:mysql://localhost:3306/pmsdb";
        String username = "root";
        String password = "";

        try {
            // Establish connection to the database
            Connection con = DriverManager.getConnection(url, username, password);
            
            // Prepare the SQL statement to insert data
            String sql = "INSERT INTO trytimein (Slot, Time_In) VALUES (?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            
            // Set values for the parameters in the SQL statement
            statement.setString(1, slot);
            statement.setObject(2, timeIn);
            
            // Execute the SQL statement to insert data
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new record has been inserted successfully.");
            }
            
            // Close the connection
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
