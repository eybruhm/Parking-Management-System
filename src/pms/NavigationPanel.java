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
import javax.swing.Timer;

public class NavigationPanel {
	
	private pms mainClassNav;
	
	public NavigationPanel(pms mainClassNav) {
	     this.mainClassNav = mainClassNav;
	     initializeButtons();
	 }
	
	private void initializeButtons() {
		
		JButton navBtnMonitor = new JButton("<html>&nbsp;&nbsp;&nbsp;Monitor</html>");
        navBtnMonitor.setForeground(Color.BLACK);
        navBtnMonitor.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        navBtnMonitor.setHorizontalAlignment(SwingConstants.LEFT);
        navBtnMonitor.setIcon(new ImageIcon("D:\\ALMM\\Programming\\Java\\PMS\\src\\pms\\nav-icon-monitor.png"));
        navBtnMonitor.setBounds(17, 178, 220, 40);
        navBtnMonitor.setOpaque(false);
        navBtnMonitor.setFocusPainted(false);
        navBtnMonitor.setBorderPainted(false);
        navBtnMonitor.setContentAreaFilled(false);
        mainClassNav.navigationBox.add(navBtnMonitor);
        navBtnMonitor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	mainClassNav.showPanel(mainClassNav.monitorPage);
            	mainClassNav.updateFloorTotals();
            	
            	navBtnMonitor.setForeground(Color.WHITE);

                // Schedule a task to change the color back to black after a short delay
                Timer timer = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	navBtnMonitor.setForeground(Color.BLACK);
                    }
                });
                timer.setRepeats(false); // Run the task only once
                timer.start();
            }
        });

        JButton navBtnFloorOne = new JButton("<html>&nbsp;&nbsp;&nbsp;First Floor</html>");
        navBtnFloorOne.setForeground(Color.BLACK);
        navBtnFloorOne.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        navBtnFloorOne.setHorizontalAlignment(SwingConstants.LEFT);
        navBtnFloorOne.setIcon(new ImageIcon("D:\\ALMM\\Programming\\Java\\PMS\\src\\pms\\nav-icon-one.png"));
        navBtnFloorOne.setBounds(20, 245, 220, 40);
        navBtnFloorOne.setOpaque(false);
        navBtnFloorOne.setFocusPainted(false);
        navBtnFloorOne.setBorderPainted(false);
        navBtnFloorOne.setContentAreaFilled(false);
        mainClassNav.navigationBox.add(navBtnFloorOne);
        navBtnFloorOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	mainClassNav.showPanel(mainClassNav.floorOnePage);
            
            	 navBtnFloorOne.setForeground(Color.WHITE);

                 // Schedule a task to change the color back to black after a short delay
                 Timer timer = new Timer(500, new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                     	navBtnFloorOne.setForeground(Color.BLACK);
                     }
                 });
                 timer.setRepeats(false); // Run the task only once
                 timer.start();
            }
        });

        JButton navBtnFloorTwo = new JButton("<html>&nbsp;&nbsp;&nbsp;Second Floor</html>");
        navBtnFloorTwo.setForeground(Color.BLACK);
        navBtnFloorTwo.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        navBtnFloorTwo.setHorizontalAlignment(SwingConstants.LEFT);
        navBtnFloorTwo.setIcon(new ImageIcon("D:\\ALMM\\Programming\\Java\\PMS\\src\\pms\\nav-icon-two.png"));
        navBtnFloorTwo.setBounds(20, 312, 220, 40);
        navBtnFloorTwo.setOpaque(false);
        navBtnFloorTwo.setFocusPainted(false);
        navBtnFloorTwo.setBorderPainted(false);
        navBtnFloorTwo.setContentAreaFilled(false);
        mainClassNav.navigationBox.add(navBtnFloorTwo);
        navBtnFloorTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	mainClassNav.showPanel(mainClassNav.floorTwoPage);
            
            	navBtnFloorTwo.setForeground(Color.WHITE);

                // Schedule a task to change the color back to black after a short delay
                Timer timer = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	navBtnFloorTwo.setForeground(Color.BLACK);
                    }
                });
                timer.setRepeats(false); // Run the task only once
                timer.start();
            }
        });

        JButton navBtnFloorThree = new JButton("<html>&nbsp;&nbsp;&nbsp;Third Floor</html>");
        navBtnFloorThree.setForeground(Color.BLACK);
        navBtnFloorThree.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        navBtnFloorThree.setHorizontalAlignment(SwingConstants.LEFT);
        navBtnFloorThree.setIcon(new ImageIcon("D:\\ALMM\\Programming\\Java\\PMS\\src\\pms\\nav-icon-three.png"));
        navBtnFloorThree.setBounds(20, 379, 220, 40);
        navBtnFloorThree.setOpaque(false);
        navBtnFloorThree.setFocusPainted(false);
        navBtnFloorThree.setBorderPainted(false);
        navBtnFloorThree.setContentAreaFilled(false);
        mainClassNav.navigationBox.add(navBtnFloorThree);
        navBtnFloorThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	mainClassNav.showPanel(mainClassNav.floorThreePage);
            
            	navBtnFloorThree.setForeground(Color.WHITE);

                // Schedule a task to change the color back to black after a short delay
                Timer timer = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	navBtnFloorThree.setForeground(Color.BLACK);
                    }
                });
                timer.setRepeats(false); // Run the task only once
                timer.start();
            }
        });

        JButton navBtnFloorFour = new JButton("<html>&nbsp;&nbsp;&nbsp;Fourth Floor</html>");
        navBtnFloorFour.setForeground(Color.BLACK);
        navBtnFloorFour.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        navBtnFloorFour.setHorizontalAlignment(SwingConstants.LEFT);
        navBtnFloorFour.setIcon(new ImageIcon("D:\\ALMM\\Programming\\Java\\PMS\\src\\pms\\nav-icon-four.png"));
        navBtnFloorFour.setBounds(20, 443, 220, 40);
        navBtnFloorFour.setOpaque(false);
        navBtnFloorFour.setFocusPainted(false);
        navBtnFloorFour.setBorderPainted(false);
        navBtnFloorFour.setContentAreaFilled(false);
        mainClassNav.navigationBox.add(navBtnFloorFour);
        navBtnFloorFour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	mainClassNav.showPanel(mainClassNav.floorFourPage);
            
            	navBtnFloorFour.setForeground(Color.WHITE);

                // Schedule a task to change the color back to black after a short delay
                Timer timer = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	navBtnFloorFour.setForeground(Color.BLACK);
                    }
                });
                timer.setRepeats(false); // Run the task only once
                timer.start();
            }
        });

        JPanel navLogo = new JPanel();
        navLogo.setBounds(0, 43, 220, 45);
        navLogo.setBackground(Color.BLACK);
        navLogo.setLayout(null);
        mainClassNav.navigationBox.add(navLogo);
        
        JLabel imgLogo = new JLabel("");
        imgLogo.setBounds(0, 0, 220, 45);
        imgLogo.setIcon(new ImageIcon("D:\\ALMM\\Programming\\Java\\PMS\\src\\pms\\pms-logo.jpg"));
        imgLogo.setHorizontalAlignment(SwingConstants.CENTER);
        navLogo.add(imgLogo);
        
		
        
	}
	
	
	
} // class

