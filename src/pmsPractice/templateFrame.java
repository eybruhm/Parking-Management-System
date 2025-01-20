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

public class templateFrame extends JFrame {

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
                    templateFrame frame = new templateFrame();
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
    public templateFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 700);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLayeredPane leftContainer = new JLayeredPane();
        leftContainer.setBounds(0, 0, 220, 661);
        contentPane.add(leftContainer);

        JPanel navigationBox = new JPanel();
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

        JPanel startParkBox = new JPanel();
        startParkBox.setBounds(0, 0, 220, 661);
        startParkBox.setBackground(Color.CYAN);
        leftContainer.add(startParkBox);

        JLayeredPane rightContainer = new JLayeredPane();
        rightContainer.setBounds(220, 0, 664, 661);
        contentPane.add(rightContainer);
        
                floorOnePage = new JPanel();
                floorOnePage.setBounds(0, 0, 664, 661);
                floorOnePage.setBackground(Color.YELLOW);
                rightContainer.add(floorOnePage);

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

        // Add action listeners to the buttons
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

