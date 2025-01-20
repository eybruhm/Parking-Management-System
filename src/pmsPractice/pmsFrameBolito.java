package pmsPractice;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import pms.RoundedBorder1;

import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Font;

import javax.swing.ImageIcon;

public class pmsFrameBolito extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    private JPanel monitorPage;
    private JPanel floorOnePage;
    private JPanel floorTwoPage;
    private JPanel floorThreePage;
    private JPanel floorFourPage;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    pmsFrameBolito frame = new pmsFrameBolito();
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
    public pmsFrameBolito() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700); // Set the size before setLocationRelativeTo(null)
        setLocationRelativeTo(null);// Center the frame on the screen
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLayeredPane leftContainer = new JLayeredPane();
        leftContainer.setBounds(0, 0, 220, 661);
        contentPane.add(leftContainer);

        JPanel navigationBox = new JPanel();
        navigationBox.setBounds(0, 0, 220, 661);
        navigationBox.setBackground(Color.decode("#ff8109"));
        leftContainer.add(navigationBox);
        navigationBox.setLayout(null);

        JButton navBtnMonitor = new JButton("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Monitor</html>");
        navBtnMonitor.setForeground(Color.BLACK);
        navBtnMonitor.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        navBtnMonitor.setHorizontalAlignment(SwingConstants.LEFT);
        navBtnMonitor.setIcon(new ImageIcon("C:\\Users\\QCU\\Downloads\\Frame_406_black-removebg-preview.png"));
        navBtnMonitor.setBounds(0, 178, 220, 40);
        navBtnMonitor.setOpaque(false);
        navBtnMonitor.setFocusPainted(false);
        navBtnMonitor.setBorderPainted(false);
        navBtnMonitor.setContentAreaFilled(false);
        navigationBox.add(navBtnMonitor);

        JButton navBtnFloorOne = new JButton("<html>&nbsp;&nbsp;&nbsp;&nbsp;First Floor</html>");
        navBtnFloorOne.setForeground(Color.BLACK);
        navBtnFloorOne.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        navBtnFloorOne.setHorizontalAlignment(SwingConstants.LEFT);
        navBtnFloorOne.setIcon(new ImageIcon("C:\\Users\\QCU\\Downloads\\2-removebg-preview (1).png"));
        navBtnFloorOne.setBounds(0, 245, 220, 40);
        navBtnFloorOne.setOpaque(false);
        navBtnFloorOne.setFocusPainted(false);
        navBtnFloorOne.setBorderPainted(false);
        navBtnFloorOne.setContentAreaFilled(false);
        navigationBox.add(navBtnFloorOne);

        JButton navBtnFloorTwo = new JButton("<html>&nbsp;&nbsp;&nbsp;&nbsp;Second Floor</html>");
        navBtnFloorTwo.setForeground(Color.BLACK);
        navBtnFloorTwo.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        navBtnFloorTwo.setHorizontalAlignment(SwingConstants.LEFT);
        navBtnFloorTwo.setIcon(new ImageIcon("C:\\Users\\QCU\\Downloads\\3-removebg-preview (1).png"));
        navBtnFloorTwo.setBounds(0, 312, 220, 40);
        navBtnFloorTwo.setOpaque(false);
        navBtnFloorTwo.setFocusPainted(false);
        navBtnFloorTwo.setBorderPainted(false);
        navBtnFloorTwo.setContentAreaFilled(false);
        navigationBox.add(navBtnFloorTwo);
        
        JButton navBtnFloorThree = new JButton("<html>&nbsp;&nbsp;&nbsp;&nbsp;Third Floor</html>");
        navBtnFloorThree.setForeground(Color.BLACK);
        navBtnFloorThree.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        navBtnFloorThree.setHorizontalAlignment(SwingConstants.LEFT);
        navBtnFloorThree.setIcon(new ImageIcon("C:\\Users\\QCU\\Downloads\\4-removebg-preview (1).png"));
        navBtnFloorThree.setBounds(0, 379, 220, 40);
        navBtnFloorThree.setOpaque(false);
        navBtnFloorThree.setFocusPainted(false);
        navBtnFloorThree.setBorderPainted(false);
        navBtnFloorThree.setContentAreaFilled(false);
        navigationBox.add(navBtnFloorThree);

        JButton navBtnFloorFour = new JButton("<html>&nbsp;&nbsp;&nbsp;Fourth Floor</html>");
        navBtnFloorFour.setForeground(Color.BLACK);
        navBtnFloorFour.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        navBtnFloorFour.setHorizontalAlignment(SwingConstants.LEFT);
        navBtnFloorFour.setIcon(new ImageIcon("C:\\Users\\QCU\\Downloads\\5-removebg-preview (1).png"));
        navBtnFloorFour.setBounds(0, 443, 220, 40);
        navBtnFloorFour.setOpaque(false);
        navBtnFloorFour.setFocusPainted(false);
        navBtnFloorFour.setBorderPainted(false);
        navBtnFloorFour.setContentAreaFilled(false);
        navigationBox.add(navBtnFloorFour);
        
        JPanel navLogo = new JPanel();
        navLogo.setBounds(0, 43, 220, 45);
        navLogo.setBackground(Color.BLACK);
        navigationBox.add(navLogo);
        navLogo.setLayout(null);
        
        JLabel imgLogo = new JLabel("");
        imgLogo.setBounds(0, 0, 220, 45);
        navLogo.add(imgLogo);
        imgLogo.setIcon(new ImageIcon("C:\\Users\\QCU\\Downloads\\final na (3)1.jpg"));
        imgLogo.setHorizontalAlignment(SwingConstants.CENTER);
      


        JPanel endParkBox = new JPanel();
        endParkBox.setBounds(0, 0, 220, 661);
        endParkBox.setBackground(Color.WHITE);
        leftContainer.add(endParkBox);

        JPanel startParkBox = new JPanel();
        startParkBox.setBounds(0, 0, 220, 661);
        startParkBox.setBackground(Color.CYAN);
        leftContainer.add(startParkBox);

        JLayeredPane rightContainer = new JLayeredPane();
        rightContainer.setBounds(220, 0, 664, 661);
        contentPane.add(rightContainer);

        monitorPage = new JPanel();
        monitorPage.setBounds(0, 0, 664, 661);
        monitorPage.setBackground(Color.BLACK);
        rightContainer.add(monitorPage);

        floorOnePage = new JPanel();
        floorOnePage.setBounds(0, 0, 664, 661);
        floorOnePage.setBackground(Color.YELLOW);
        rightContainer.add(floorOnePage);

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
        monitorPage.setLayout(null);
        
        JLabel monitorPageHeader = new JLabel("AVAILABLE SLOTS");
        monitorPageHeader.setForeground(Color.WHITE);
        monitorPageHeader.setBackground(Color.decode("#ff8109"));
        monitorPageHeader.setFont(new Font("Courier New", Font.BOLD, 45));
        monitorPageHeader.setHorizontalAlignment(SwingConstants.CENTER);
        monitorPageHeader.setBounds(68, 72, 524, 92);
        monitorPageHeader.setOpaque(false);
        Border border = new RoundedBorder1(20, Color.WHITE, Color.decode("#ff8109")); // Set radius, border color, and background color
        monitorPageHeader.setBorder(border);
        monitorPage.add(monitorPageHeader);;
        
        JLabel floorLabel = new JLabel("FLOOR");
        floorLabel.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 22));
        floorLabel.setForeground(Color.WHITE);
        floorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        floorLabel.setBounds(68, 183, 162, 38);
        monitorPage.add(floorLabel);
        Border border1 = new RoundedBorder1(20, Color.WHITE, Color.decode("#ff8109")); // Set radius, border color, and background color
        floorLabel.setBorder(border1);

        
        JLabel totalSlotsLabel = new JLabel("ALL SLOTS");
        totalSlotsLabel.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 22));
        totalSlotsLabel.setForeground(Color.WHITE);
        totalSlotsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        totalSlotsLabel.setBounds(240, 183, 162, 38);
        monitorPage.add(totalSlotsLabel);
        totalSlotsLabel.setBorder(border1);
        
        JLabel totalPwdSlotsLabel = new JLabel("PWD SLOTS\r\n");
        totalPwdSlotsLabel.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 22));
        totalPwdSlotsLabel.setForeground(Color.WHITE);
        totalPwdSlotsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        totalPwdSlotsLabel.setBounds(412, 183, 180, 38);
        monitorPage.add(totalPwdSlotsLabel);
        totalPwdSlotsLabel.setBorder(border1);
        
        JLabel floorOne = new JLabel("1");
        floorOne.setFont(new Font("Bahnschrift", Font.PLAIN, 28));
        floorOne.setForeground(Color.BLACK);
        floorOne.setHorizontalAlignment(SwingConstants.CENTER);
        floorOne.setBounds(68, 260, 162, 50);
        monitorPage.add(floorOne);
        floorOne.setBorder(border1);
        Border border2 = new RoundedBorder1(20, Color.WHITE, Color.WHITE); // Set radius, border color, and background color
		floorOne.setBorder(border2);
        
        
        JLabel floorTwo = new JLabel("2");
        floorTwo.setFont(new Font("Bahnschrift", Font.PLAIN, 28));
        floorTwo.setForeground(Color.BLACK);
        floorTwo.setHorizontalAlignment(SwingConstants.CENTER);
        floorTwo.setBounds(68, 353, 162, 50);
        monitorPage.add(floorTwo);
        Border border3 = new RoundedBorder1(20, Color.WHITE, Color.GRAY);
        floorTwo.setBorder(border3);
        
        JLabel floorThree = new JLabel("3");
        floorThree.setFont(new Font("Bahnschrift", Font.PLAIN, 28));
        floorThree.setForeground(Color.BLACK);
        floorThree.setHorizontalAlignment(SwingConstants.CENTER);
        floorThree.setBounds(68, 444, 162, 50);
        monitorPage.add(floorThree);
        floorThree.setBorder(border2);
        
        JLabel floorFour = new JLabel("4");
        floorFour.setFont(new Font("Bahnschrift", Font.PLAIN, 28));
        floorFour.setForeground(Color.BLACK);
        floorFour.setHorizontalAlignment(SwingConstants.CENTER);
        floorFour.setBounds(68, 531, 162, 50);
        monitorPage.add(floorFour);
        floorFour.setBorder(border3);
        
        JLabel floorOneTotalText = new JLabel("16");
        floorOneTotalText.setFont(new Font("Bahnschrift", Font.PLAIN, 28));
        floorOneTotalText.setForeground(Color.BLACK);
        floorOneTotalText.setHorizontalAlignment(SwingConstants.CENTER);
        floorOneTotalText.setBounds(240, 260, 162, 50);
        monitorPage.add(floorOneTotalText);
        floorOneTotalText.setBorder(border2);
        
        JLabel floorTwoTotalText = new JLabel("19");
        floorTwoTotalText.setForeground(Color.BLACK);
        floorTwoTotalText.setFont(new Font("Bahnschrift", Font.PLAIN, 28));
        floorTwoTotalText.setHorizontalAlignment(SwingConstants.CENTER);
        floorTwoTotalText.setBounds(240, 353, 162, 50);
        monitorPage.add(floorTwoTotalText);
        floorTwoTotalText.setBorder(border3);
        
        JLabel floorThreeTotalText = new JLabel("22");
        floorThreeTotalText.setForeground(Color.BLACK);
        floorThreeTotalText.setFont(new Font("Bahnschrift", Font.PLAIN, 28));
        floorThreeTotalText.setHorizontalAlignment(SwingConstants.CENTER);
        floorThreeTotalText.setBounds(240, 444, 162, 50);
        monitorPage.add(floorThreeTotalText);
        floorThreeTotalText.setBorder(border2);
        
        JLabel floorFourTotalText = new JLabel("24");
        floorFourTotalText.setFont(new Font("Bahnschrift", Font.PLAIN, 28));
        floorFourTotalText.setForeground(Color.BLACK);
        floorFourTotalText.setHorizontalAlignment(SwingConstants.CENTER);
        floorFourTotalText.setBounds(240, 531, 162, 50);
        monitorPage.add(floorFourTotalText);
        floorFourTotalText.setBorder(border3);
        
        JLabel floorOnePwdTotalText = new JLabel("4");
        floorOnePwdTotalText.setFont(new Font("Bahnschrift", Font.PLAIN, 28));
        floorOnePwdTotalText.setForeground(Color.BLACK);
        floorOnePwdTotalText.setHorizontalAlignment(SwingConstants.CENTER);
        floorOnePwdTotalText.setBounds(412, 260, 180, 50);
        monitorPage.add(floorOnePwdTotalText);
        floorOnePwdTotalText.setBorder(border2);
        
        JLabel floorTwoPwdTotalText = new JLabel("2");
        floorTwoPwdTotalText.setFont(new Font("Bahnschrift", Font.PLAIN, 28));
        floorTwoPwdTotalText.setForeground(Color.BLACK);
        floorTwoPwdTotalText.setHorizontalAlignment(SwingConstants.CENTER);
        floorTwoPwdTotalText.setBounds(416, 353, 180, 50);
        monitorPage.add(floorTwoPwdTotalText);
        floorTwoPwdTotalText.setBorder(border3);
        
        JLabel floorThreePwdTotalText = new JLabel("2");
        floorThreePwdTotalText.setForeground(Color.BLACK);
        floorThreePwdTotalText.setFont(new Font("Bahnschrift", Font.PLAIN, 28));
        floorThreePwdTotalText.setHorizontalAlignment(SwingConstants.CENTER);
        floorThreePwdTotalText.setBounds(416, 444, 180, 50);
        monitorPage.add(floorThreePwdTotalText);
        floorThreePwdTotalText.setBorder(border2);
        
        JLabel floorFourPwdTotalText = new JLabel("2");
        floorFourPwdTotalText.setForeground(Color.BLACK);
        floorFourPwdTotalText.setFont(new Font("Bahnschrift", Font.PLAIN, 28));
        floorFourPwdTotalText.setHorizontalAlignment(SwingConstants.CENTER);
        floorFourPwdTotalText.setBounds(412, 531, 180, 50);
        monitorPage.add(floorFourPwdTotalText);
        floorFourPwdTotalText.setBorder(border3);

        // Add action listeners to the buttons
        navBtnMonitor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel(monitorPage);
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

        navBtnFloorOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel(floorOnePage);
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

        navBtnFloorTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel(floorTwoPage);
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

        navBtnFloorThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel(floorThreePage);
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

        navBtnFloorFour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel(floorFourPage);
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
    }

    // Method to show a specific panel and hide others
    private void showPanel(JPanel panel) {
        monitorPage.setVisible(false);
        floorOnePage.setVisible(false);
        floorTwoPage.setVisible(false);
        floorThreePage.setVisible(false);
        floorFourPage.setVisible(false);

        panel.setVisible(true);
    }
    
    
    
    
}

