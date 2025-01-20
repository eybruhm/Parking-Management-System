package pms;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FloorFourButtons {
	
	private pms mainClass4;
	
	public FloorFourButtons(pms mainClass4) {
	     this.mainClass4 = mainClass4;
	     initializeButtons();
	 }
	
	
	private void initializeButtons() {
		
		JButton btn4A = new JButton(); 											
        btn4A.setName("4A"); 	
        btn4A.setBounds(14, 96, 70, 35);		
        mainClass4.floorFourPage.add(btn4A);		
        btn4A.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4A); 											
	         mainClass4.startLiveTimer(btn4A);											
	         mainClass4.isParked(btn4A);												
	         mainClass4.updateSlotLabels("4A");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot A");			 	
	         mainClass4.updateLiveRate(btn4A);	
	     });																			
    	JButton btn4B = new JButton(); 											
        btn4B.setName("4B"); 	
        btn4B.setBounds(14, 142, 70, 35);		
        mainClass4.floorFourPage.add(btn4B);		
        btn4B.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4B); 											
	         mainClass4.startLiveTimer(btn4B);											
	         mainClass4.isParked(btn4B);												
	         mainClass4.updateSlotLabels("4B");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot B");			 	
	         mainClass4.updateLiveRate(btn4B);	
         });	
        JButton btn4C = new JButton(); 											
        btn4C.setName("4C"); 	
        btn4C.setBounds(15, 204, 70, 35);		
        mainClass4.floorFourPage.add(btn4C);		
        btn4C.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4C); 											
	         mainClass4.startLiveTimer(btn4C);											
	         mainClass4.isParked(btn4C);												
	         mainClass4.updateSlotLabels("4C");						 					
	         mainClass4.updateTypeLocation("PWD", "4th Floor, Slot C");			 	
	         mainClass4.updateLiveRate(btn4C);	
         });	
        JButton btn4D = new JButton(); 											
        btn4D.setName("4D"); 	
        btn4D.setBounds(15, 280, 70, 35);		
        mainClass4.floorFourPage.add(btn4D);		
        btn4D.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4D); 											
	         mainClass4.startLiveTimer(btn4D);											
	         mainClass4.isParked(btn4D);												
	         mainClass4.updateSlotLabels("4D");						 					
	         mainClass4.updateTypeLocation("PWD", "4th Floor, Slot D");			 	
	         mainClass4.updateLiveRate(btn4D);	
         });	
        JButton btn4E = new JButton(); 											
        btn4E.setName("4E"); 	
        btn4E.setBounds(204, 196, 70, 35);		
        mainClass4.floorFourPage.add(btn4E);		
        btn4E.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4E); 											
	         mainClass4.startLiveTimer(btn4E);											
	         mainClass4.isParked(btn4E);												
	         mainClass4.updateSlotLabels("4E");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot E");			 	
	         mainClass4.updateLiveRate(btn4E);	
         });	
        JButton btn4F = new JButton(); 											
        btn4F.setName("4F"); 	
        btn4F.setBounds(204, 246, 70, 35);		
        mainClass4.floorFourPage.add(btn4F);		
        btn4F.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4F); 											
	         mainClass4.startLiveTimer(btn4F);											
	         mainClass4.isParked(btn4F);												
	         mainClass4.updateSlotLabels("4F");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot F");			 	
	         mainClass4.updateLiveRate(btn4F);	
         });	
        JButton btn4G = new JButton(); 											
        btn4G.setName("4G"); 	
        btn4G.setBounds(204, 296, 70, 35);		
        mainClass4.floorFourPage.add(btn4G);		
        btn4G.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4G); 											
	         mainClass4.startLiveTimer(btn4G);											
	         mainClass4.isParked(btn4G);												
	         mainClass4.updateSlotLabels("4G");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot G");			 	
	         mainClass4.updateLiveRate(btn4G);	
         });	
        JButton btn4H = new JButton(); 											
        btn4H.setName("4H"); 	
        btn4H.setBounds(204, 343, 70, 35);		
        mainClass4.floorFourPage.add(btn4H);		
        btn4H.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4H); 											
	         mainClass4.startLiveTimer(btn4H);											
	         mainClass4.isParked(btn4H);												
	         mainClass4.updateSlotLabels("4H");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot H");			 	
	         mainClass4.updateLiveRate(btn4H);	
         });	
        JButton btn4I = new JButton(); 											
        btn4I.setName("4I"); 	
        btn4I.setBounds(204, 393, 70, 35);		
        mainClass4.floorFourPage.add(btn4I);		
        btn4I.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4I); 											
	         mainClass4.startLiveTimer(btn4I);											
	         mainClass4.isParked(btn4I);												
	         mainClass4.updateSlotLabels("4I");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot I");			 	
	         mainClass4.updateLiveRate(btn4I);	
         });	
        JButton btn4J = new JButton(); 											
        btn4J.setName("4J"); 	
        btn4J.setBounds(204, 444, 70, 35);		
        mainClass4.floorFourPage.add(btn4J);		
        btn4J.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4J); 											
	         mainClass4.startLiveTimer(btn4J);											
	         mainClass4.isParked(btn4J);												
	         mainClass4.updateSlotLabels("4J");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot J");			 	
	         mainClass4.updateLiveRate(btn4J);	
         });	
        JButton btn4K = new JButton(); 											
        btn4K.setName("4K"); 	
        btn4K.setBounds(394, 194, 70, 35);		
        mainClass4.floorFourPage.add(btn4K);		
        btn4K.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4K); 											
	         mainClass4.startLiveTimer(btn4K);											
	         mainClass4.isParked(btn4K);												
	         mainClass4.updateSlotLabels("4K");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot K");			 	
	         mainClass4.updateLiveRate(btn4K);	
         });	
        JButton btn4L = new JButton(); 											
        btn4L.setName("4L"); 	
        btn4L.setBounds(394, 245, 70, 35);		
        mainClass4.floorFourPage.add(btn4L);		
        btn4L.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4L); 											
	         mainClass4.startLiveTimer(btn4L);											
	         mainClass4.isParked(btn4L);												
	         mainClass4.updateSlotLabels("4L");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot L");			 	
	         mainClass4.updateLiveRate(btn4L);	
         });	
        JButton btn4M = new JButton(); 											
        btn4M.setName("4M"); 	
        btn4M.setBounds(394, 293, 70, 35);		
        mainClass4.floorFourPage.add(btn4M);		
        btn4M.addActionListener(e -> {
            mainClass4.updateTimeIn(btn4M); 											
	         mainClass4.startLiveTimer(btn4M);											
	         mainClass4.isParked(btn4M);												
	         mainClass4.updateSlotLabels("4M");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot M");			 	
	         mainClass4.updateLiveRate(btn4M);	
         });	
        JButton btn4N = new JButton(); 											
        btn4N.setName("4N"); 	
        btn4N.setBounds(394, 343, 70, 35);		
        mainClass4.floorFourPage.add(btn4N);		
        btn4N.addActionListener(e -> {
            mainClass4.updateTimeIn(btn4N); 											
	         mainClass4.startLiveTimer(btn4N);											
	         mainClass4.isParked(btn4N);												
	         mainClass4.updateSlotLabels("4N");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot N");			 	
	         mainClass4.updateLiveRate(btn4N);	
         });	
        JButton btn4O = new JButton(); 											
        btn4O.setName("4O"); 	
        btn4O.setBounds(394, 393, 70, 35);		
        mainClass4.floorFourPage.add(btn4O);		
        btn4O.addActionListener(e -> {
            mainClass4.updateTimeIn(btn4O); 											
	         mainClass4.startLiveTimer(btn4O);											
	         mainClass4.isParked(btn4O);												
	         mainClass4.updateSlotLabels("4O");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot O");			 	
	         mainClass4.updateLiveRate(btn4O);	
         });	
        JButton btn4P = new JButton(); 											
        btn4P.setName("4P"); 	
        btn4P.setBounds(394, 443, 70, 35);		
        mainClass4.floorFourPage.add(btn4P);		
        btn4P.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4P); 											
	         mainClass4.startLiveTimer(btn4P);											
	         mainClass4.isParked(btn4P);												
	         mainClass4.updateSlotLabels("4P");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot P");			 	
	         mainClass4.updateLiveRate(btn4P);	
         });	
        JButton btn4Q = new JButton(); 											
        btn4Q.setName("4Q"); 	
        btn4Q.setBounds(575, 195, 70, 35);		
        mainClass4.floorFourPage.add(btn4Q);		
        btn4Q.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4Q); 											
	         mainClass4.startLiveTimer(btn4Q);											
	         mainClass4.isParked(btn4Q);												
	         mainClass4.updateSlotLabels("4Q");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot Q");			 	
	         mainClass4.updateLiveRate(btn4Q);	
         });	
        JButton btn4R = new JButton(); 											
        btn4R.setName("4R"); 	
        btn4R.setBounds(575, 245, 70, 35);		
        mainClass4.floorFourPage.add(btn4R);		
        btn4R.addActionListener(e -> {
            mainClass4.updateTimeIn(btn4R); 											
	         mainClass4.startLiveTimer(btn4R);											
	         mainClass4.isParked(btn4R);												
	         mainClass4.updateSlotLabels("4R");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot R");			 	
	         mainClass4.updateLiveRate(btn4R);	
         });	
        JButton btn4S = new JButton(); 											
        btn4S.setName("4S"); 	
        btn4S.setBounds(575, 294, 70, 35);		
        mainClass4.floorFourPage.add(btn4S);		
        btn4S.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4S); 											
	         mainClass4.startLiveTimer(btn4S);											
	         mainClass4.isParked(btn4S);												
	         mainClass4.updateSlotLabels("4S");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot S");			 	
	         mainClass4.updateLiveRate(btn4S);	
         });
        JButton btn4T = new JButton(); 											
        btn4T.setName("4T"); 	
        btn4T.setBounds(575, 344, 70, 35);		
        mainClass4.floorFourPage.add(btn4T);		
        btn4T.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4T); 											
	         mainClass4.startLiveTimer(btn4T);											
	         mainClass4.isParked(btn4T);												
	         mainClass4.updateSlotLabels("4T");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot T");			 	
	         mainClass4.updateLiveRate(btn4T);	
         });	
        JButton btn4U = new JButton(); 											
        btn4U.setName("4U"); 	
        btn4U.setBounds(575, 393, 70, 35);		
        mainClass4.floorFourPage.add(btn4U);		
        btn4U.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4U); 											
	         mainClass4.startLiveTimer(btn4U);											
	         mainClass4.isParked(btn4U);												
	         mainClass4.updateSlotLabels("4U");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot U");			 	
	         mainClass4.updateLiveRate(btn4U);	
         });	
        JButton btn4V = new JButton(); 											
        btn4V.setName("4V"); 	
        btn4V.setBounds(575, 444, 70, 35);		
        mainClass4.floorFourPage.add(btn4V);		
        btn4V.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4V); 											
	         mainClass4.startLiveTimer(btn4V);											
	         mainClass4.isParked(btn4V);												
	         mainClass4.updateSlotLabels("4V");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot V");			 	
	         mainClass4.updateLiveRate(btn4V);	
         });	
        JButton btn4W = new JButton(); 											
        btn4W.setName("4W"); 	
        btn4W.setBounds(575, 493, 70, 35);		
        mainClass4.floorFourPage.add(btn4W);		
        btn4W.addActionListener(e -> {	
            mainClass4.updateTimeIn(btn4W); 											
	         mainClass4.startLiveTimer(btn4W);											
	         mainClass4.isParked(btn4W);												
	         mainClass4.updateSlotLabels("4W");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot W");			 	
	         mainClass4.updateLiveRate(btn4W);	
         });	
        JButton btn4X = new JButton(); 											
        btn4X.setName("4X"); 	
        btn4X.setBounds(576, 544, 70, 35);		
        mainClass4.floorFourPage.add(btn4X);		
        btn4X.addActionListener(e -> {
            mainClass4.updateTimeIn(btn4X); 											
	         mainClass4.startLiveTimer(btn4X);											
	         mainClass4.isParked(btn4X);												
	         mainClass4.updateSlotLabels("4X");						 					
	         mainClass4.updateTypeLocation("Regular", "4th Floor, Slot X");			 	
	         mainClass4.updateLiveRate(btn4X);	
         });	
		
		
		
		
		
		
		JLabel imgFloorTwo = new JLabel();
        imgFloorTwo.setBounds(0, 0, 664, 661); // Adjust the bounds as needed
        ImageIcon imageIcon2 = new ImageIcon("D:\\ALMM\\Programming\\Java\\PMS\\src\\pms\\floorFourImg.png");
        Image image2 = imageIcon2.getImage().getScaledInstance(imgFloorTwo.getWidth(), imgFloorTwo.getHeight(), Image.SCALE_SMOOTH);
        imgFloorTwo.setIcon(new ImageIcon(image2));
        mainClass4.floorFourPage.add(imgFloorTwo);
		
	}
} // class
