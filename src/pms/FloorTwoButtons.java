package pms;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FloorTwoButtons {
	
	private pms mainClass2;
	
	public FloorTwoButtons(pms mainClass2) {
	     this.mainClass2 = mainClass2;
	     initializeButtons();
	 }
	
	
	private void initializeButtons() {
		
		JButton btn2A = new JButton(); 											
        btn2A.setName("2A"); 	
        btn2A.setBounds(203, 197, 70, 35);		
        mainClass2.floorTwoPage.add(btn2A);		
        btn2A.addActionListener(e -> {
            mainClass2.updateTimeIn(btn2A); 											
	         mainClass2.startLiveTimer(btn2A);											
	         mainClass2.isParked(btn2A);												
	         mainClass2.updateSlotLabels("2A");						 					
	         mainClass2.updateTypeLocation("Regular", "2nd Floor, Slot A");			 	
	         mainClass2.updateLiveRate(btn2A);	
	     });																			
    	JButton btn2B = new JButton(); 											
        btn2B.setName("2B"); 	
        btn2B.setBounds(203, 246, 70, 35);		
        mainClass2.floorTwoPage.add(btn2B);		
        btn2B.addActionListener(e -> {	
        	 mainClass2.updateTimeIn(btn2B); 											
	         mainClass2.startLiveTimer(btn2B);											
	         mainClass2.isParked(btn2B);												
	         mainClass2.updateSlotLabels("2B");						 					
	         mainClass2.updateTypeLocation("Regular", "2nd Floor, Slot B");			 	
	         mainClass2.updateLiveRate(btn2B);
         });	
        JButton btn2C = new JButton(); 											
        btn2C.setName("2C"); 	
        btn2C.setBounds(203, 296, 70, 35);		
        mainClass2.floorTwoPage.add(btn2C);		
        btn2C.addActionListener(e -> {	
        	mainClass2.updateTimeIn(btn2C); 											
	         mainClass2.startLiveTimer(btn2C);											
	         mainClass2.isParked(btn2C);												
	         mainClass2.updateSlotLabels("2C");						 					
	         mainClass2.updateTypeLocation("Regular", "2nd Floor, Slot C");			 	
	         mainClass2.updateLiveRate(btn2C);
         });	
        JButton btn2D = new JButton(); 											
        btn2D.setName("2D"); 	
        btn2D.setBounds(203, 359, 70, 35);		
        mainClass2.floorTwoPage.add(btn2D);		
        btn2D.addActionListener(e -> {	
        	mainClass2.updateTimeIn(btn2D); 											
	         mainClass2.startLiveTimer(btn2D);											
	         mainClass2.isParked(btn2D);												
	         mainClass2.updateSlotLabels("2D");						 					
	         mainClass2.updateTypeLocation("PWD", "2nd Floor, Slot D");			 	
	         mainClass2.updateLiveRate(btn2D);
         });	
        JButton btn2E = new JButton(); 											
        btn2E.setName("2E"); 	
        btn2E.setBounds(203, 433, 70, 35);		
        mainClass2.floorTwoPage.add(btn2E);		
        btn2E.addActionListener(e -> {	
        	mainClass2.updateTimeIn(btn2E); 											
	         mainClass2.startLiveTimer(btn2E);											
	         mainClass2.isParked(btn2E);												
	         mainClass2.updateSlotLabels("2E");						 					
	         mainClass2.updateTypeLocation("PWD", "2nd Floor, Slot E");			 	
	         mainClass2.updateLiveRate(btn2E);
         });	
        JButton btn2F = new JButton(); 											
        btn2F.setName("2F"); 	
        btn2F.setBounds(393, 197, 70, 35);		
        mainClass2.floorTwoPage.add(btn2F);		
        btn2F.addActionListener(e -> {	
        	mainClass2.updateTimeIn(btn2F); 											
	         mainClass2.startLiveTimer(btn2F);											
	         mainClass2.isParked(btn2F);												
	         mainClass2.updateSlotLabels("2F");						 					
	         mainClass2.updateTypeLocation("Regular", "2nd Floor, Slot F");			 	
	         mainClass2.updateLiveRate(btn2F);
         });	
        JButton btn2G = new JButton(); 											
        btn2G.setName("2G"); 	
        btn2G.setBounds(393, 246, 70, 35);		
        mainClass2.floorTwoPage.add(btn2G);		
        btn2G.addActionListener(e -> {	
        	mainClass2.updateTimeIn(btn2G); 											
	         mainClass2.startLiveTimer(btn2G);											
	         mainClass2.isParked(btn2G);												
	         mainClass2.updateSlotLabels("2G");						 					
	         mainClass2.updateTypeLocation("Regular", "2nd Floor, Slot G");			 	
	         mainClass2.updateLiveRate(btn2G);
         });	
        JButton btn2H = new JButton(); 											
        btn2H.setName("2H"); 	
        btn2H.setBounds(393, 296, 70, 35);		
        mainClass2.floorTwoPage.add(btn2H);		
        btn2H.addActionListener(e -> {	
        	mainClass2.updateTimeIn(btn2H); 											
	         mainClass2.startLiveTimer(btn2H);											
	         mainClass2.isParked(btn2H);												
	         mainClass2.updateSlotLabels("2H");						 					
	         mainClass2.updateTypeLocation("Regular", "2nd Floor, Slot H");			 	
	         mainClass2.updateLiveRate(btn2H);
         });	
        JButton btn2I = new JButton(); 											
        btn2I.setName("2I"); 	
        btn2I.setBounds(393, 346, 70, 35);		
        mainClass2.floorTwoPage.add(btn2I);		
        btn2I.addActionListener(e -> {
        	mainClass2.updateTimeIn(btn2I); 											
	         mainClass2.startLiveTimer(btn2I);											
	         mainClass2.isParked(btn2I);												
	         mainClass2.updateSlotLabels("2I");						 					
	         mainClass2.updateTypeLocation("Regular", "2nd Floor, Slot I");			 	
	         mainClass2.updateLiveRate(btn2I);
         });	
        JButton btn2J = new JButton(); 											
        btn2J.setName("2J"); 	
        btn2J.setBounds(393, 395, 70, 35);		
        mainClass2.floorTwoPage.add(btn2J);		
        btn2J.addActionListener(e -> {	
        	mainClass2.updateTimeIn(btn2J); 											
	         mainClass2.startLiveTimer(btn2J);											
	         mainClass2.isParked(btn2J);												
	         mainClass2.updateSlotLabels("2J");						 					
	         mainClass2.updateTypeLocation("Regular", "2nd Floor, Slot J");			 	
	         mainClass2.updateLiveRate(btn2J);
         });	
        JButton btn2K = new JButton(); 											
        btn2K.setName("2K"); 	
        btn2K.setBounds(393, 445, 70, 35);		
        mainClass2.floorTwoPage.add(btn2K);		
        btn2K.addActionListener(e -> {	
        	mainClass2.updateTimeIn(btn2K); 											
	         mainClass2.startLiveTimer(btn2K);											
	         mainClass2.isParked(btn2K);												
	         mainClass2.updateSlotLabels("2K");						 					
	         mainClass2.updateTypeLocation("Regular", "2nd Floor, Slot K");			 	
	         mainClass2.updateLiveRate(btn2K);
         });	
        JButton btn2L = new JButton(); 											
        btn2L.setName("2L"); 	
        btn2L.setBounds(576, 197, 70, 35);		
        mainClass2.floorTwoPage.add(btn2L);		
        btn2L.addActionListener(e -> {	
        	mainClass2.updateTimeIn(btn2L); 											
	         mainClass2.startLiveTimer(btn2L);											
	         mainClass2.isParked(btn2L);												
	         mainClass2.updateSlotLabels("2L");						 					
	         mainClass2.updateTypeLocation("Regular", "2nd Floor, Slot L");			 	
	         mainClass2.updateLiveRate(btn2L);
         });	
        JButton btn2M = new JButton(); 											
        btn2M.setName("2M"); 	
        btn2M.setBounds(576, 246, 70, 35);		
        mainClass2.floorTwoPage.add(btn2M);		
        btn2M.addActionListener(e -> {	
        	mainClass2.updateTimeIn(btn2M); 											
	         mainClass2.startLiveTimer(btn2M);											
	         mainClass2.isParked(btn2M);												
	         mainClass2.updateSlotLabels("2M");						 					
	         mainClass2.updateTypeLocation("Regular", "2nd Floor, Slot M");			 	
	         mainClass2.updateLiveRate(btn2M);
         });	
        JButton btn2N = new JButton(); 											
        btn2N.setName("2N"); 	
        btn2N.setBounds(576, 296, 70, 35);		
        mainClass2.floorTwoPage.add(btn2N);		
        btn2N.addActionListener(e -> {	
        	mainClass2.updateTimeIn(btn2N); 											
	         mainClass2.startLiveTimer(btn2N);											
	         mainClass2.isParked(btn2N);												
	         mainClass2.updateSlotLabels("2N");						 					
	         mainClass2.updateTypeLocation("Regular", "2nd Floor, Slot N");			 	
	         mainClass2.updateLiveRate(btn2N);
         });	
        JButton btn2O = new JButton(); 											
        btn2O.setName("2O"); 	
        btn2O.setBounds(576, 346, 70, 35);		
        mainClass2.floorTwoPage.add(btn2O);		
        btn2O.addActionListener(e -> {
        	mainClass2.updateTimeIn(btn2O); 											
	         mainClass2.startLiveTimer(btn2O);											
	         mainClass2.isParked(btn2O);												
	         mainClass2.updateSlotLabels("2O");						 					
	         mainClass2.updateTypeLocation("Regular", "2nd Floor, Slot O");			 	
	         mainClass2.updateLiveRate(btn2O);
         });	
        JButton btn2P = new JButton(); 											
        btn2P.setName("2P"); 	
        btn2P.setBounds(577, 396, 70, 35);		
        mainClass2.floorTwoPage.add(btn2P);		
        btn2P.addActionListener(e -> {	
        	mainClass2.updateTimeIn(btn2P); 											
	         mainClass2.startLiveTimer(btn2P);											
	         mainClass2.isParked(btn2P);												
	         mainClass2.updateSlotLabels("2P");						 					
	         mainClass2.updateTypeLocation("Regular", "2nd Floor, Slot P");			 	
	         mainClass2.updateLiveRate(btn2P);
         });	
        JButton btn2Q = new JButton(); 											
        btn2Q.setName("2Q"); 	
        btn2Q.setBounds(577, 447, 70, 35);		
        mainClass2.floorTwoPage.add(btn2Q);		
        btn2Q.addActionListener(e -> {	
        	mainClass2.updateTimeIn(btn2Q); 											
	         mainClass2.startLiveTimer(btn2Q);											
	         mainClass2.isParked(btn2Q);												
	         mainClass2.updateSlotLabels("2Q");						 					
	         mainClass2.updateTypeLocation("Regular", "2nd Floor, Slot Q");			 	
	         mainClass2.updateLiveRate(btn2Q);
         });	
        JButton btn2R = new JButton(); 											
        btn2R.setName("2R"); 	
        btn2R.setBounds(577, 496, 70, 35);		
        mainClass2.floorTwoPage.add(btn2R);		
        btn2R.addActionListener(e -> {
        	mainClass2.updateTimeIn(btn2R); 											
	         mainClass2.startLiveTimer(btn2R);											
	         mainClass2.isParked(btn2R);												
	         mainClass2.updateSlotLabels("2R");						 					
	         mainClass2.updateTypeLocation("Regular", "2nd Floor, Slot R");			 	
	         mainClass2.updateLiveRate(btn2R);
         });	
        JButton btn2S = new JButton(); 											
        btn2S.setName("2S"); 	
        btn2S.setBounds(577, 545, 70, 35);		
        mainClass2.floorTwoPage.add(btn2S);		
        btn2S.addActionListener(e -> {
        	mainClass2.updateTimeIn(btn2S); 											
	         mainClass2.startLiveTimer(btn2S);											
	         mainClass2.isParked(btn2S);												
	         mainClass2.updateSlotLabels("2S");						 					
	         mainClass2.updateTypeLocation("Regular", "2nd Floor, Slot S");			 	
	         mainClass2.updateLiveRate(btn2S);
         });	
        
        
        JLabel imgFloorTwo = new JLabel();
        imgFloorTwo.setBounds(0, 0, 664, 661); // Adjust the bounds as needed
        ImageIcon imageIcon2 = new ImageIcon("D:\\ALMM\\Programming\\Java\\PMS\\src\\pms\\floorTwoImg.png");
        Image image2 = imageIcon2.getImage().getScaledInstance(imgFloorTwo.getWidth(), imgFloorTwo.getHeight(), Image.SCALE_SMOOTH);
        imgFloorTwo.setIcon(new ImageIcon(image2));
        mainClass2.floorTwoPage.add(imgFloorTwo);

		
		
		
	}
	
	
} // class
