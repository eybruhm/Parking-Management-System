package pms;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LandingPage extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LandingPage frame = new LandingPage();
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
    public LandingPage() {
    	
    	setTitle("Parking Management System"); 
        setIconImage(new ImageIcon("D:\\ALMM\\Programming\\Java\\PMS\\src\\pms\\pms-icon.jpg").getImage()); 

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500); // Set the size before setLocationRelativeTo(null)
        setLocationRelativeTo(null);// Center the frame on the screen
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel imagePanel = new JPanel();
        imagePanel.setBounds(0, 0, 784, 461);
        contentPane.add(imagePanel);
        imagePanel.setLayout(null);
        
        JPanel transparentPanel = new JPanel();
        transparentPanel.setBounds(190, 74, 417, 313);
        transparentPanel.setBackground(new Color(0, 0, 0, 200));
        imagePanel.add(transparentPanel);
        transparentPanel.setLayout(null);
        
        JLabel headerName1 = new JLabel("Parking Management");
        headerName1.setForeground(Color.WHITE);
        headerName1.setFont(new Font("Stencil", Font.BOLD, 32));
        headerName1.setHorizontalAlignment(SwingConstants.CENTER);
        headerName1.setBounds(0, -10, 417, 116);
        transparentPanel.add(headerName1);
        
        JLabel headerName2 = new JLabel("System");
        headerName2.setFont(new Font("Stencil", Font.BOLD, 32));
        headerName2.setForeground(Color.WHITE);
        headerName2.setHorizontalAlignment(SwingConstants.CENTER);
        headerName2.setBounds(147, 58, 124, 50);
        transparentPanel.add(headerName2);
        
        JLabel subHeader = new JLabel("<html>Park with Ease, Always Find a Space </html>");
        subHeader.setForeground(Color.WHITE);
        subHeader.setFont(new Font("Source Serif Pro Light", Font.ITALIC, 17));
        subHeader.setHorizontalAlignment(SwingConstants.CENTER);
        subHeader.setBounds(46, 98, 332, 92);
        transparentPanel.add(subHeader);
        
        JButton btnStart = new JButton("START");
        btnStart.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		// Hide the LandingPage frame
        		setVisible(false);
        		
                // Instantiate and show the popped-out window
        		pms pms = new pms();
				pms.setVisible(true);
        	}
        });
        btnStart.setBackground(Color.BLACK);
        btnStart.setForeground(Color.WHITE);
        btnStart.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        btnStart.setBounds(156, 244, 115, 33);
        btnStart.setFocusPainted(false);
        transparentPanel.add(btnStart);
        
        Border border = BorderFactory.createLineBorder(Color.WHITE, 3);
        btnStart.setBorder(border);
        
                JLabel startingPageImage = new JLabel("");
                startingPageImage.setBounds(-11, 0, 805, 461);
                startingPageImage.setIcon(new ImageIcon("D:\\ALMM\\Programming\\Java\\PMS\\src\\pms\\landing-page-img.jpg"));
                startingPageImage.setHorizontalAlignment(SwingConstants.CENTER);
                imagePanel.add(startingPageImage);

    }
}
