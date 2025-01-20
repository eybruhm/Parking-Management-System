package pms;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class StartPark {
	private pms mainClassStartBox;
	
	 public StartPark(pms mainClassStartBox) {
	     this.mainClassStartBox = mainClassStartBox;
	     initializeButtons();
	 }
	
	 private void initializeButtons() {
		 
		JLabel startParking = new JLabel("START PARKING");
        startParking.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        startParking.setHorizontalAlignment(SwingConstants.CENTER);
        startParking.setBounds(10, 20, 200, 70);
        mainClassStartBox.startParkBox.add(startParking);
		 
        mainClassStartBox.slotClicked = new JLabel("9Z");
        mainClassStartBox.slotClicked.setFont(new Font("Stencil", Font.PLAIN, 60));
        mainClassStartBox.slotClicked.setHorizontalAlignment(SwingConstants.CENTER);
        mainClassStartBox.slotClicked.setBounds(20, 90, 171, 80);
        mainClassStartBox.startParkBox.add(mainClassStartBox.slotClicked);
        
        mainClassStartBox.startPositionLabel = new JLabel("Position:");
        mainClassStartBox.startPositionLabel.setFont(new Font("Source Code Pro Black", Font.PLAIN, 12));
        mainClassStartBox.startPositionLabel.setBounds(10, 215, 100, 14);
        mainClassStartBox.startParkBox.add(mainClassStartBox.startPositionLabel);
        
        mainClassStartBox.startPosition = new JLabel("XX Floor, Slot X");
        mainClassStartBox.startPosition.setFont(new Font("Source Code Pro Semibold", Font.PLAIN, 15));
        mainClassStartBox.startPosition.setBounds(10, 228, 200, 20);
        mainClassStartBox.startParkBox.add(mainClassStartBox.startPosition);
        
        mainClassStartBox.startTypeLabel = new JLabel("Slot Type:");
        mainClassStartBox.startTypeLabel.setFont(new Font("Source Code Pro Black", Font.PLAIN, 12));
        mainClassStartBox.startTypeLabel.setBounds(10, 265, 100, 14);
        mainClassStartBox.startParkBox.add(mainClassStartBox.startTypeLabel);
        
        mainClassStartBox.startSlotType = new JLabel("Regular");
        mainClassStartBox.startSlotType.setFont(new Font("Source Code Pro Semibold", Font.PLAIN, 15));
        mainClassStartBox.startSlotType.setBounds(10, 278, 100, 20);
        mainClassStartBox.startParkBox.add(mainClassStartBox.startSlotType);
        

        
        JButton btnPark = new JButton("Park");
        btnPark.setFont(new Font("Maiandra GD", Font.BOLD, 20));
        btnPark.setBounds(36, 500, 150, 40);
        btnPark.setBackground(new Color(0x1C7C00));
        btnPark.setOpaque(true);
        btnPark.setBorder(new LineBorder(Color.WHITE, 2));
        btnPark.setContentAreaFilled(true);
        btnPark.setBorderPainted(true);
        btnPark.setForeground(Color.WHITE);
        btnPark.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (mainClassStartBox.lastClickedButton != null) {
                    mainClassStartBox.lastClickedButton.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                }
                
                // Get the slot type from the updateTypeLocation method (you might need to store it in a variable)
                String slotType = mainClassStartBox.startSlotType.getText(); // Assuming startSlotType is updated with the slot type

                // Insert data into the database
                mainClassStartBox.insertParked(mainClassStartBox.lastClickedButton, slotType);
                
                // Insert data into the database
                mainClassStartBox.toPark(mainClassStartBox.lastClickedButton);

                // Hide the startParkBox panel and display the navigation box
                mainClassStartBox.startParkBox.setVisible(false);
                mainClassStartBox.navigationBox.setVisible(true);
                
                switch (mainClassStartBox.floorDb) {
                	case 1:
                		mainClassStartBox.floorOneTotal -= 1;
                	case 2:
                		mainClassStartBox.floorTwoTotal -= 1;
                	case 3:
                		mainClassStartBox.floorThreeTotal -= 1;
                	case 4:
                		mainClassStartBox.floorFourTotal -= 1;
                }
                
                mainClassStartBox.updateFloorTotals();
                
//                System.out.println();
//                System.out.println("Floor 1: " + mainClassStartBox.floorOneTotalText.getText());
//                System.out.println("Floor 2: " + mainClassStartBox.floorTwoTotalText.getText());
//                System.out.println("Floor 3: " + mainClassStartBox.floorThreeTotalText.getText());
//                System.out.println("Floor 4: " + mainClassStartBox.floorFourTotalText.getText());
//                System.out.println();
//                System.out.println("PWD 1: " + mainClassStartBox.floorOnePwdTotalText.getText());
//                System.out.println("PWD 2: " + mainClassStartBox.floorTwoPwdTotalText.getText());
//                System.out.println("PWD 3: " + mainClassStartBox.floorThreePwdTotalText.getText());
//                System.out.println("PWD 4: " + mainClassStartBox.floorFourPwdTotalText.getText());
                
            }
        });
        
        JButton btnParkCancel = new JButton("Cancel");
        btnParkCancel.setFont(new Font("Maiandra GD", Font.BOLD, 20));
        btnParkCancel.setBounds(36, 560, 150, 40);
        btnParkCancel.setBackground(new Color(0xE25823));
        btnParkCancel.setOpaque(true);
        btnParkCancel.setBorder(new LineBorder(Color.BLACK, 2));
        btnParkCancel.setContentAreaFilled(true);
        btnParkCancel.setBorderPainted(true);
        btnParkCancel.setForeground(Color.BLACK);
        mainClassStartBox.startParkBox.add(btnParkCancel);
        mainClassStartBox.startParkBox.add(btnPark);
        btnParkCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	mainClassStartBox.startParkBox.setVisible(false);
                mainClassStartBox.navigationBox.setVisible(true); // Display the navigation box
            }
        });

        
        

		 
        
        
	 }
}
