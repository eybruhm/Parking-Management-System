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

public class EndPark {
	
	private pms mainClassEndBox;
	
	public EndPark(pms mainClassEndBox) {
	     this.mainClassEndBox = mainClassEndBox;
	     initializeButtons();
	 }
	
	private void initializeButtons() {
		
		JLabel stopParking = new JLabel("STOP PARKING");
	    stopParking.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
	    stopParking.setHorizontalAlignment(SwingConstants.CENTER);
	    stopParking.setBounds(10, 20, 200, 70);
	    mainClassEndBox.endParkBox.add(stopParking);
	    
	    mainClassEndBox.slotClickedEnd = new JLabel("9Z");
	    mainClassEndBox.slotClickedEnd.setFont(new Font("Stencil", Font.PLAIN, 60));
	    mainClassEndBox.slotClickedEnd.setHorizontalAlignment(SwingConstants.CENTER);
	    mainClassEndBox.slotClickedEnd.setBounds(20, 90, 171, 80);
	    mainClassEndBox.endParkBox.add(mainClassEndBox.slotClickedEnd);
	    
	    mainClassEndBox.endSlotTypeLabel = new JLabel("Slot Type:");
	    mainClassEndBox.endSlotTypeLabel.setFont(new Font("Source Code Pro Black", Font.PLAIN, 12));
	    mainClassEndBox.endSlotTypeLabel.setBounds(10, 265, 70, 14);
	    mainClassEndBox.endParkBox.add(mainClassEndBox.endSlotTypeLabel);
	    
	    mainClassEndBox.endSlotType = new JLabel("Regular");
	    mainClassEndBox.endSlotType.setFont(new Font("Source Code Pro Semibold", Font.BOLD, 15));
	    mainClassEndBox.endSlotType.setBounds(10, 278, 190, 17);
	    mainClassEndBox.endParkBox.add(mainClassEndBox.endSlotType);
	    
	    mainClassEndBox.endPositionLabel = new JLabel("Position:");
	    mainClassEndBox.endPositionLabel.setFont(new Font("Source Code Pro Black", Font.PLAIN, 12));
	    mainClassEndBox.endPositionLabel.setBounds(10, 215, 100, 14);
	    mainClassEndBox.endParkBox.add(mainClassEndBox.endPositionLabel);
	    
	    mainClassEndBox.endPosition = new JLabel("XXX Floor, Slot XX");
	    mainClassEndBox.endPosition.setFont(new Font("Source Code Pro Semibold", Font.BOLD, 15));
	    mainClassEndBox.endPosition.setBounds(10, 228, 190, 17);
	    mainClassEndBox.endParkBox.add(mainClassEndBox.endPosition);
	    
	    mainClassEndBox.endTimeInLabel = new JLabel("Time In:");
	    mainClassEndBox.endTimeInLabel.setFont(new Font("Source Code Pro Black", Font.PLAIN, 12));
	    mainClassEndBox.endTimeInLabel.setBounds(10, 318, 100, 14);
	    mainClassEndBox.endParkBox.add(mainClassEndBox.endTimeInLabel);
	    
	    mainClassEndBox.endTimeIn = new JLabel("YYYY-DD-MM   HH-MM-SS");
	    mainClassEndBox.endTimeIn.setFont(new Font("Source Code Pro Semibold", Font.BOLD, 15));
	    mainClassEndBox.endTimeIn.setBounds(10, 333, 190, 17);
	    mainClassEndBox.endParkBox.add(mainClassEndBox.endTimeIn);
        
	    mainClassEndBox.endTimerLabel = new JLabel("Park Time:");
	    mainClassEndBox.endTimerLabel.setFont(new Font("Source Code Pro Black", Font.PLAIN, 12));
	    mainClassEndBox.endTimerLabel.setBounds(10, 369, 100, 14);
	    mainClassEndBox.endParkBox.add(mainClassEndBox.endTimerLabel);
        
	    mainClassEndBox.endTimer = new JLabel("HH-MM-SS");
	    mainClassEndBox.endTimer.setFont(new Font("Source Code Pro Semibold", Font.BOLD, 15));
	    mainClassEndBox.endTimer.setBounds(10, 383, 190, 17);
	    mainClassEndBox.endParkBox.add(mainClassEndBox.endTimer);
        
	    JLabel endRateLabel = new JLabel("Rate:");
        endRateLabel.setFont(new Font("Source Code Pro Black", Font.PLAIN, 12));
        endRateLabel.setBounds(10, 414, 100, 14);
        mainClassEndBox.endParkBox.add(endRateLabel);
        
        mainClassEndBox.endRate = new JLabel("00");
        mainClassEndBox.endRate.setFont(new Font("Source Code Pro Semibold", Font.BOLD, 15));
        mainClassEndBox.endRate.setBounds(10, 428, 190, 17);
        mainClassEndBox.endParkBox.add(mainClassEndBox.endRate);
		
        mainClassEndBox.btnEnd = new JButton("END");
        mainClassEndBox.btnEnd.setFont(new Font("Maiandra GD", Font.BOLD, 20));
        mainClassEndBox.btnEnd.setBounds(36, 500, 150, 40);
        mainClassEndBox.btnEnd.setBackground(new Color(0xFB5353));
        mainClassEndBox.btnEnd.setOpaque(true);
        mainClassEndBox.btnEnd.setBorder(new LineBorder(Color.WHITE, 2));
        mainClassEndBox.btnEnd.setContentAreaFilled(true);
        mainClassEndBox.btnEnd.setBorderPainted(true);
        mainClassEndBox.btnEnd.setForeground(Color.WHITE);
        mainClassEndBox.endParkBox.add(mainClassEndBox.btnEnd);
        mainClassEndBox.btnEnd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
	        	if (mainClassEndBox.lastClickedButton != null) {
	        		mainClassEndBox.lastClickedButton.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
	        	}
		 
		        // Remove the parked slot from the database
	        	mainClassEndBox.removeParked(mainClassEndBox.lastClickedButton);
		        
		        // Update data in the database
	        	mainClassEndBox.endPark(mainClassEndBox.lastClickedButton);
		    	
		    	// Hide the endParkBox panel and display the navigation box
	        	mainClassEndBox.endParkBox.setVisible(false);
	        	mainClassEndBox.navigationBox.setVisible(true);
		        
	        	mainClassEndBox.updateLiveRate(mainClassEndBox.lastClickedButton);

		        // Stop the rate update timer
		        if (mainClassEndBox.rateUpdateTimer != null) {
		        	mainClassEndBox.rateUpdateTimer.stop();
		        }
		        
		        switch (mainClassEndBox.floorDb) {
            	case 1:
            		mainClassEndBox.floorOneTotal += 1;
            	case 2:
            		mainClassEndBox.floorTwoTotal += 1;
            	case 3:
            		mainClassEndBox.floorThreeTotal += 1;
            	case 4:
            		mainClassEndBox.floorFourTotal += 1;
	            }
		        
		        mainClassEndBox.updateFloorTotals();
		        
//		        System.out.println();
//                System.out.println("Floor 1: " + mainClassEndBox.floorOneTotalText.getText());
//                System.out.println("Floor 2: " + mainClassEndBox.floorTwoTotalText.getText());
//                System.out.println("Floor 3: " + mainClassEndBox.floorThreeTotalText.getText());
//                System.out.println("Floor 4: " + mainClassEndBox.floorFourTotalText.getText());
//                System.out.println();
//                System.out.println("PWD 1: " + mainClassEndBox.floorOnePwdTotalText.getText());
//                System.out.println("PWD 2: " + mainClassEndBox.floorTwoPwdTotalText.getText());
//                System.out.println("PWD 3: " + mainClassEndBox.floorThreePwdTotalText.getText());
//                System.out.println("PWD 4: " + mainClassEndBox.floorFourPwdTotalText.getText());
              }
        });
        
        mainClassEndBox.btnEndCancel = new JButton("CANCEL");
        mainClassEndBox.btnEndCancel.setFont(new Font("Maiandra GD", Font.BOLD, 20));
        mainClassEndBox.btnEndCancel.setBounds(36, 560, 150, 40);
        mainClassEndBox.btnEndCancel.setBackground(new Color(0xAFAFAF));
        mainClassEndBox.btnEndCancel.setOpaque(true);
        mainClassEndBox.btnEndCancel.setBorder(new LineBorder(Color.BLACK, 2));
        mainClassEndBox.btnEndCancel.setContentAreaFilled(true);
        mainClassEndBox.btnEndCancel.setBorderPainted(true);
        mainClassEndBox.btnEndCancel.setForeground(Color.BLACK);
        mainClassEndBox.endParkBox.add(mainClassEndBox.btnEndCancel);
        mainClassEndBox.btnEndCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	mainClassEndBox.endParkBox.setVisible(false);
            	mainClassEndBox.navigationBox.setVisible(true); // Display the navigation box
            }
        });
        
        
		
		
	}
	
	
	
} // class

