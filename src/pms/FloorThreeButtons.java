package pms;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FloorThreeButtons {
	
	private pms mainClass3;
	
	public FloorThreeButtons(pms mainClass3) {
	     this.mainClass3 = mainClass3;
	     initializeButtons();
	 }
	
	private void initializeButtons() {
		
		JButton btn3A = new JButton(); 											
        btn3A.setName("3A"); 	
        btn3A.setBounds(18, 209, 70, 35);		
        mainClass3.floorThreePage.add(btn3A);		
        btn3A.addActionListener(e -> {
            mainClass3.updateTimeIn(btn3A); 											
	         mainClass3.startLiveTimer(btn3A);											
	         mainClass3.isParked(btn3A);												
	         mainClass3.updateSlotLabels("3A");						 					
	         mainClass3.updateTypeLocation("PWD", "3rd Floor, Slot A");			 	
	         mainClass3.updateLiveRate(btn3A);	
	     });																			
    	JButton btn3B = new JButton(); 											
        btn3B.setName("3B"); 	
        btn3B.setBounds(18, 280, 70, 35);		
        mainClass3.floorThreePage.add(btn3B);		
        btn3B.addActionListener(e -> {
            mainClass3.updateTimeIn(btn3B); 											
	         mainClass3.startLiveTimer(btn3B);											
	         mainClass3.isParked(btn3B);												
	         mainClass3.updateSlotLabels("3B");						 					
	         mainClass3.updateTypeLocation("PWD", "3rd Floor, Slot B");			 	
	         mainClass3.updateLiveRate(btn3B);	
         });	
        JButton btn3C = new JButton(); 											
        btn3C.setName("3C"); 	
        btn3C.setBounds(205, 197, 70, 35);		
        mainClass3.floorThreePage.add(btn3C);		
        btn3C.addActionListener(e -> {	
        	mainClass3.updateTimeIn(btn3C); 											
  	         mainClass3.startLiveTimer(btn3C);											
  	         mainClass3.isParked(btn3C);												
  	         mainClass3.updateSlotLabels("3C");						 					
  	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot C");			 	
  	         mainClass3.updateLiveRate(btn3C);	

         });	
        JButton btn3D = new JButton(); 											
        btn3D.setName("3D"); 	
        btn3D.setBounds(205, 246, 70, 35);		
        mainClass3.floorThreePage.add(btn3D);		
        btn3D.addActionListener(e -> {	
        	 mainClass3.updateTimeIn(btn3D); 											
  	         mainClass3.startLiveTimer(btn3D);											
  	         mainClass3.isParked(btn3D);												
  	         mainClass3.updateSlotLabels("3D");						 					
  	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot D");			 	
  	         mainClass3.updateLiveRate(btn3D);	

         });	
        JButton btn3E = new JButton(); 											
        btn3E.setName("3E"); 	
        btn3E.setBounds(205, 296, 70, 35);		
        mainClass3.floorThreePage.add(btn3E);		
        btn3E.addActionListener(e -> {	
         mainClass3.updateTimeIn(btn3B); 											
  	         mainClass3.startLiveTimer(btn3E);											
  	         mainClass3.isParked(btn3E);												
  	         mainClass3.updateSlotLabels("3E");						 					
  	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot E");			 	
  	         mainClass3.updateLiveRate(btn3E);	

         });	
        JButton btn3F = new JButton(); 											
        btn3F.setName("3F"); 	
        btn3F.setBounds(205, 343, 70, 35);		
        mainClass3.floorThreePage.add(btn3F);		
        btn3F.addActionListener(e -> {	
        	mainClass3.updateTimeIn(btn3F); 											
 	         mainClass3.startLiveTimer(btn3F);											
 	         mainClass3.isParked(btn3F);												
 	         mainClass3.updateSlotLabels("3F");						 					
 	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot F");			 	
 	         mainClass3.updateLiveRate(btn3F);	
         });	
        JButton btn3G = new JButton(); 											
        btn3G.setName("3G"); 	
        btn3G.setBounds(205, 392, 70, 35);		
        mainClass3.floorThreePage.add(btn3G);		
        btn3G.addActionListener(e -> {	
        	mainClass3.updateTimeIn(btn3G); 											
	         mainClass3.startLiveTimer(btn3G);											
	         mainClass3.isParked(btn3G);												
	         mainClass3.updateSlotLabels("3G");						 					
	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot G");			 	
	         mainClass3.updateLiveRate(btn3G);	
         });	
        JButton btn3H = new JButton(); 											
        btn3H.setName("3H"); 	
        btn3H.setBounds(205, 443, 70, 35);		
        mainClass3.floorThreePage.add(btn3H);		
        btn3H.addActionListener(e -> {	
        	mainClass3.updateTimeIn(btn3H); 											
	         mainClass3.startLiveTimer(btn3H);											
	         mainClass3.isParked(btn3H);												
	         mainClass3.updateSlotLabels("3H");						 					
	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot H");			 	
	         mainClass3.updateLiveRate(btn3H);	
         });	
        JButton btn3I = new JButton(); 											
        btn3I.setName("3I"); 	
        btn3I.setBounds(394, 197, 70, 35);		
        mainClass3.floorThreePage.add(btn3I);		
        btn3I.addActionListener(e -> {	
        	mainClass3.updateTimeIn(btn3I); 											
	         mainClass3.startLiveTimer(btn3I);											
	         mainClass3.isParked(btn3I);												
	         mainClass3.updateSlotLabels("3I");						 					
	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot I");			 	
	         mainClass3.updateLiveRate(btn3I);	
         });	
        JButton btn3J = new JButton(); 											
        btn3J.setName("3J"); 	
        btn3J.setBounds(394, 246, 70, 35);		
        mainClass3.floorThreePage.add(btn3J);		
        btn3J.addActionListener(e -> {	
        	mainClass3.updateTimeIn(btn3J); 											
	         mainClass3.startLiveTimer(btn3J);											
	         mainClass3.isParked(btn3J);												
	         mainClass3.updateSlotLabels("3J");						 					
	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot J");			 	
	         mainClass3.updateLiveRate(btn3J);	
         });	
        JButton btn3K = new JButton(); 											
        btn3K.setName("3K"); 	
        btn3K.setBounds(394, 296, 70, 35);		
        mainClass3.floorThreePage.add(btn3K);		
        btn3K.addActionListener(e -> {
        	mainClass3.updateTimeIn(btn3K); 											
	         mainClass3.startLiveTimer(btn3K);											
	         mainClass3.isParked(btn3K);												
	         mainClass3.updateSlotLabels("3K");						 					
	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot K");			 	
	         mainClass3.updateLiveRate(btn3K);	
         });	
        JButton btn3L = new JButton(); 											
        btn3L.setName("3L"); 	
        btn3L.setBounds(394, 345, 70, 35);		
        mainClass3.floorThreePage.add(btn3L);		
        btn3L.addActionListener(e -> {
        	mainClass3.updateTimeIn(btn3L); 											
	         mainClass3.startLiveTimer(btn3L);											
	         mainClass3.isParked(btn3L);												
	         mainClass3.updateSlotLabels("3L");						 					
	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot L");			 	
	         mainClass3.updateLiveRate(btn3L);
         });	
        JButton btn3M = new JButton(); 											
        btn3M.setName("3M"); 	
        btn3M.setBounds(394, 395, 70, 35);		
        mainClass3.floorThreePage.add(btn3M);		
        btn3M.addActionListener(e -> {
        	mainClass3.updateTimeIn(btn3M); 											
	         mainClass3.startLiveTimer(btn3M);											
	         mainClass3.isParked(btn3M);												
	         mainClass3.updateSlotLabels("3M");						 					
	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot M");			 	
	         mainClass3.updateLiveRate(btn3M);	
         });	
        JButton btn3N = new JButton(); 											
        btn3N.setName("3N"); 	
        btn3N.setBounds(394, 444, 70, 35);		
        mainClass3.floorThreePage.add(btn3N);		
        btn3N.addActionListener(e -> {	
        	mainClass3.updateTimeIn(btn3N); 											
	         mainClass3.startLiveTimer(btn3N);											
	         mainClass3.isParked(btn3N);												
	         mainClass3.updateSlotLabels("3N");						 					
	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot N");			 	
	         mainClass3.updateLiveRate(btn3N);	
         });	
        JButton btn3O = new JButton(); 											
        btn3O.setName("3O"); 	
        btn3O.setBounds(577, 197, 70, 35);		
        mainClass3.floorThreePage.add(btn3O);		
        btn3O.addActionListener(e -> {	
        	mainClass3.updateTimeIn(btn3O); 											
	         mainClass3.startLiveTimer(btn3O);											
	         mainClass3.isParked(btn3O);												
	         mainClass3.updateSlotLabels("3O");						 					
	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot O");			 	
	         mainClass3.updateLiveRate(btn3O);	
         });	
        JButton btn3P = new JButton(); 											
        btn3P.setName("3P"); 	
        btn3P.setBounds(577, 246, 70, 35);		
        mainClass3.floorThreePage.add(btn3P);		
        btn3P.addActionListener(e -> {
        	mainClass3.updateTimeIn(btn3P); 											
	         mainClass3.startLiveTimer(btn3P);											
	         mainClass3.isParked(btn3P);												
	         mainClass3.updateSlotLabels("3P");						 					
	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot P");			 	
	         mainClass3.updateLiveRate(btn3P);	
         });	
        JButton btn3Q = new JButton(); 											
        btn3Q.setName("3Q"); 	
        btn3Q.setBounds(577, 296, 70, 35);		
        mainClass3.floorThreePage.add(btn3Q);		
        btn3Q.addActionListener(e -> {	
        	mainClass3.updateTimeIn(btn3Q); 											
	         mainClass3.startLiveTimer(btn3Q);											
	         mainClass3.isParked(btn3Q);												
	         mainClass3.updateSlotLabels("3Q");						 					
	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot Q");			 	
	         mainClass3.updateLiveRate(btn3Q);	
         });	
        JButton btn3R = new JButton(); 											
        btn3R.setName("3R"); 	
        btn3R.setBounds(577, 345, 70, 35);		
        mainClass3.floorThreePage.add(btn3R);		
        btn3R.addActionListener(e -> {	
        	mainClass3.updateTimeIn(btn3R); 											
	         mainClass3.startLiveTimer(btn3R);											
	         mainClass3.isParked(btn3R);												
	         mainClass3.updateSlotLabels("3R");						 					
	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot R");			 	
	         mainClass3.updateLiveRate(btn3R);	
         });	
        JButton btn3S = new JButton(); 											
        btn3S.setName("3S"); 	
        btn3S.setBounds(577, 396, 70, 35);		
        mainClass3.floorThreePage.add(btn3S);		
        btn3S.addActionListener(e -> {	
        	mainClass3.updateTimeIn(btn3S); 											
	         mainClass3.startLiveTimer(btn3S);											
	         mainClass3.isParked(btn3S);												
	         mainClass3.updateSlotLabels("3S");						 					
	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot S");			 	
	         mainClass3.updateLiveRate(btn3S);	
         });
        JButton btn3T = new JButton(); 											
        btn3T.setName("3T"); 	
        btn3T.setBounds(577, 445, 70, 35);		
        mainClass3.floorThreePage.add(btn3T);		
        btn3T.addActionListener(e -> {
        	mainClass3.updateTimeIn(btn3T); 											
	         mainClass3.startLiveTimer(btn3T);											
	         mainClass3.isParked(btn3T);												
	         mainClass3.updateSlotLabels("3T");						 					
	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot T");			 	
	         mainClass3.updateLiveRate(btn3T);	
         });	
        JButton btn3U = new JButton(); 											
        btn3U.setName("3U"); 	
        btn3U.setBounds(577, 495, 70, 35);		
        mainClass3.floorThreePage.add(btn3U);		
        btn3U.addActionListener(e -> {
        	mainClass3.updateTimeIn(btn3U); 											
	         mainClass3.startLiveTimer(btn3U);											
	         mainClass3.isParked(btn3U);												
	         mainClass3.updateSlotLabels("3U");						 					
	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot U");			 	
	         mainClass3.updateLiveRate(btn3U);	
         });	
        JButton btn3V = new JButton(); 											
        btn3V.setName("3V"); 	
        btn3V.setBounds(577, 544, 70, 35);		
        mainClass3.floorThreePage.add(btn3V);		
        btn3V.addActionListener(e -> {	
        	mainClass3.updateTimeIn(btn3V); 											
	         mainClass3.startLiveTimer(btn3V);											
	         mainClass3.isParked(btn3V);												
	         mainClass3.updateSlotLabels("3V");						 					
	         mainClass3.updateTypeLocation("Regular", "3rd Floor, Slot V");			 	
	         mainClass3.updateLiveRate(btn3V);	
         });	
		
		
		
		
		
        JLabel imgFloorThree = new JLabel();
        imgFloorThree.setBounds(0, 0, 664, 661); // Adjust the bounds as needed
        ImageIcon imageIcon3 = new ImageIcon("D:\\ALMM\\Programming\\Java\\PMS\\src\\pms\\floorThreeImg.png");
        Image image3 = imageIcon3.getImage().getScaledInstance(imgFloorThree.getWidth(), imgFloorThree.getHeight(), Image.SCALE_SMOOTH);
        imgFloorThree.setIcon(new ImageIcon(image3));
        mainClass3.floorThreePage.add(imgFloorThree);
		
		
	}
} // class

