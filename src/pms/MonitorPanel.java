package pms;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class MonitorPanel {
	
	private pms mainClassMonitor;
	
	public MonitorPanel(pms mainClassMonitor) {
	     this.mainClassMonitor = mainClassMonitor;
	     initializeButtons();
	 }
	
	private void initializeButtons() {
		
		JLabel monitorPageHeader = new JLabel("AVAILABLE  SLOTS");
        monitorPageHeader.setForeground(Color.WHITE);
        monitorPageHeader.setBackground(Color.decode("#ff8109"));
        monitorPageHeader.setFont(new Font("High Tower Text", Font.BOLD, 45));
        monitorPageHeader.setHorizontalAlignment(SwingConstants.CENTER);
        monitorPageHeader.setBounds(68, 72, 524, 92);
        monitorPageHeader.setOpaque(false);
        Border border = new RoundedBorder1(20, Color.WHITE, Color.decode("#ff8109")); // Set radius, border color, and background color
        monitorPageHeader.setBorder(border);
        mainClassMonitor.monitorPage.add(monitorPageHeader);;
        
        JLabel floorLabel = new JLabel("FLOOR");
        floorLabel.setFont(new Font("High Tower Text", Font.PLAIN, 20));
        floorLabel.setForeground(Color.WHITE);
        floorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        floorLabel.setBounds(68, 183, 162, 38);
        mainClassMonitor.monitorPage.add(floorLabel);
        Border border1 = new RoundedBorder1(20, Color.WHITE, Color.decode("#ff8109")); // Set radius, border color, and background color
        floorLabel.setBorder(border1);

        
        JLabel totalSlotsLabel = new JLabel("ALL SLOTS");
        totalSlotsLabel.setFont(new Font("High Tower Text", Font.PLAIN, 20));
        totalSlotsLabel.setForeground(Color.WHITE);
        totalSlotsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        totalSlotsLabel.setBounds(240, 183, 162, 38);
        mainClassMonitor.monitorPage.add(totalSlotsLabel);
        totalSlotsLabel.setBorder(border1);
        
        JLabel totalPwdSlotsLabel = new JLabel("PWD SLOTS\r\n");
        totalPwdSlotsLabel.setFont(new Font("High Tower Text", Font.PLAIN, 20));
        totalPwdSlotsLabel.setForeground(Color.WHITE);
        totalPwdSlotsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        totalPwdSlotsLabel.setBounds(412, 183, 180, 38);
        mainClassMonitor.monitorPage.add(totalPwdSlotsLabel);
        totalPwdSlotsLabel.setBorder(border1);
        
        JLabel floorOne = new JLabel("1");
        floorOne.setFont(new Font("Niagara Engraved", Font.BOLD, 28));
        floorOne.setForeground(Color.BLACK);
        floorOne.setHorizontalAlignment(SwingConstants.CENTER);
        floorOne.setBounds(68, 260, 162, 50);
        mainClassMonitor.monitorPage.add(floorOne);
        floorOne.setBorder(border1);
        Border border2 = new RoundedBorder1(20, Color.WHITE, Color.WHITE); // Set radius, border color, and background color
		floorOne.setBorder(border2);
        
        
        JLabel floorTwo = new JLabel("2");
        floorTwo.setFont(new Font("Niagara Engraved", Font.BOLD, 28));
        floorTwo.setForeground(Color.BLACK);
        floorTwo.setHorizontalAlignment(SwingConstants.CENTER);
        floorTwo.setBounds(68, 353, 162, 50);
        mainClassMonitor.monitorPage.add(floorTwo);
        Border border3 = new RoundedBorder1(20, Color.WHITE, Color.GRAY);
        floorTwo.setBorder(border3);
        
        JLabel floorThree = new JLabel("3");
        floorThree.setFont(new Font("Niagara Engraved", Font.BOLD, 28));
        floorThree.setForeground(Color.BLACK);
        floorThree.setHorizontalAlignment(SwingConstants.CENTER);
        floorThree.setBounds(68, 444, 162, 50);
        mainClassMonitor.monitorPage.add(floorThree);
        floorThree.setBorder(border2);
        
        JLabel floorFour = new JLabel("4");
        floorFour.setFont(new Font("Niagara Engraved", Font.BOLD, 28));
        floorFour.setForeground(Color.BLACK);
        floorFour.setHorizontalAlignment(SwingConstants.CENTER);
        floorFour.setBounds(68, 531, 162, 50);
        mainClassMonitor.monitorPage.add(floorFour);
        floorFour.setBorder(border3);
        
        mainClassMonitor.floorOneTotalText = new JLabel("16");
        mainClassMonitor.floorOneTotalText.setFont(new Font("Niagara Engraved", Font.PLAIN, 28));
        mainClassMonitor.floorOneTotalText.setForeground(Color.BLACK);
        mainClassMonitor.floorOneTotalText.setHorizontalAlignment(SwingConstants.CENTER);
        mainClassMonitor.floorOneTotalText.setBounds(240, 260, 162, 50);
        mainClassMonitor.monitorPage.add(mainClassMonitor.floorOneTotalText);
        mainClassMonitor.floorOneTotalText.setBorder(border2);
        
        mainClassMonitor.floorTwoTotalText = new JLabel("19");
        mainClassMonitor.floorTwoTotalText.setForeground(Color.BLACK);
        mainClassMonitor.floorTwoTotalText.setFont(new Font("Niagara Engraved", Font.PLAIN, 28));
        mainClassMonitor.floorTwoTotalText.setHorizontalAlignment(SwingConstants.CENTER);
        mainClassMonitor.floorTwoTotalText.setBounds(240, 353, 162, 50);
        mainClassMonitor.monitorPage.add(mainClassMonitor.floorTwoTotalText);
        mainClassMonitor.floorTwoTotalText.setBorder(border3);
        
        mainClassMonitor.floorThreeTotalText = new JLabel("22");
        mainClassMonitor.floorThreeTotalText.setForeground(Color.BLACK);
        mainClassMonitor.floorThreeTotalText.setFont(new Font("Niagara Engraved", Font.PLAIN, 28));
        mainClassMonitor.floorThreeTotalText.setHorizontalAlignment(SwingConstants.CENTER);
        mainClassMonitor.floorThreeTotalText.setBounds(240, 444, 162, 50);
        mainClassMonitor.monitorPage.add(mainClassMonitor.floorThreeTotalText);
        mainClassMonitor.floorThreeTotalText.setBorder(border2);
        
        mainClassMonitor.floorFourTotalText = new JLabel("24");
        mainClassMonitor.floorFourTotalText.setFont(new Font("Niagara Engraved", Font.PLAIN, 28));
        mainClassMonitor.floorFourTotalText.setForeground(Color.BLACK);
        mainClassMonitor.floorFourTotalText.setHorizontalAlignment(SwingConstants.CENTER);
        mainClassMonitor.floorFourTotalText.setBounds(240, 531, 162, 50);
        mainClassMonitor.monitorPage.add(mainClassMonitor.floorFourTotalText);
        mainClassMonitor.floorFourTotalText.setBorder(border3);
        
        mainClassMonitor.floorOnePwdTotalText = new JLabel("4");
        mainClassMonitor.floorOnePwdTotalText.setFont(new Font("Niagara Engraved", Font.PLAIN, 28));
        mainClassMonitor.floorOnePwdTotalText.setForeground(Color.BLACK);
        mainClassMonitor.floorOnePwdTotalText.setHorizontalAlignment(SwingConstants.CENTER);
        mainClassMonitor.floorOnePwdTotalText.setBounds(412, 260, 180, 50);
        mainClassMonitor.monitorPage.add(mainClassMonitor.floorOnePwdTotalText);
        mainClassMonitor.floorOnePwdTotalText.setBorder(border2);
        
        mainClassMonitor.floorTwoPwdTotalText = new JLabel("2");
        mainClassMonitor.floorTwoPwdTotalText.setFont(new Font("Niagara Engraved", Font.PLAIN, 28));
        mainClassMonitor.floorTwoPwdTotalText.setForeground(Color.BLACK);
        mainClassMonitor.floorTwoPwdTotalText.setHorizontalAlignment(SwingConstants.CENTER);
        mainClassMonitor.floorTwoPwdTotalText.setBounds(416, 353, 180, 50);
        mainClassMonitor.monitorPage.add(mainClassMonitor.floorTwoPwdTotalText);
        mainClassMonitor.floorTwoPwdTotalText.setBorder(border3);
        
        mainClassMonitor.floorThreePwdTotalText = new JLabel("2");
        mainClassMonitor.floorThreePwdTotalText.setForeground(Color.BLACK);
        mainClassMonitor.floorThreePwdTotalText.setFont(new Font("Niagara Engraved", Font.PLAIN, 28));
        mainClassMonitor.floorThreePwdTotalText.setHorizontalAlignment(SwingConstants.CENTER);
        mainClassMonitor.floorThreePwdTotalText.setBounds(416, 444, 180, 50);
        mainClassMonitor.monitorPage.add(mainClassMonitor.floorThreePwdTotalText);
        mainClassMonitor.floorThreePwdTotalText.setBorder(border2);
        
        mainClassMonitor.floorFourPwdTotalText = new JLabel("2");
        mainClassMonitor.floorFourPwdTotalText.setForeground(Color.BLACK);
        mainClassMonitor.floorFourPwdTotalText.setFont(new Font("Niagara Engraved", Font.PLAIN, 28));
        mainClassMonitor.floorFourPwdTotalText.setHorizontalAlignment(SwingConstants.CENTER);
        mainClassMonitor.floorFourPwdTotalText.setBounds(412, 531, 180, 50);
        mainClassMonitor.monitorPage.add(mainClassMonitor.floorFourPwdTotalText);
        mainClassMonitor.floorFourPwdTotalText.setBorder(border3);
		
		
	
	}
	
} // class

