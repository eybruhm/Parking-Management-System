package pms;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FloorOneButtons {
	 private pms mainClass1;
	
	 public FloorOneButtons(pms mainClass1) {
	     this.mainClass1 = mainClass1;
	     initializeButtons();
	 }
	
	 private void initializeButtons() {
	    
//		JLabel imgFloorOne = new JLabel();
//        imgFloorOne.setBounds(0, 0, 664, 661); // Adjust the bounds as needed
//        ImageIcon imageIcon1 = new ImageIcon("C:\\Users\\babap\\1.png");
//        Image image1 = imageIcon1.getImage().getScaledInstance(imgFloorOne.getWidth(), imgFloorOne.getHeight(), Image.SCALE_SMOOTH);
//        imgFloorOne.setIcon(new ImageIcon(image1));
//        mainClass1.floorOnePage.add(imgFloorOne);
		 
//	    JButton btn1A = new JButton("1A");
//        btn1A.setName("1A"); // Set the name of the button
//        btn1A.setBounds(79, 86, 89, 23);
//        mainClass1.floorOnePage.add(btn1A);
//        btn1A.addActionListener(e -> {
//	         mainClass1.updateTimeIn(btn1A); // Call updateTimeIn with the button and its associated label
//	         mainClass1.startLiveTimer(btn1A);
//	         mainClass1.isParked(btn1A);
//	         mainClass1.updateSlotLabels("1A");
//	         mainClass1.updateTypeLocation("Regular", "1st Floor, Slot A");
//	         mainClass1.updateLiveRate(btn1A);
//	      
//	     });
        
        JButton btn1A = new JButton(); 											
        btn1A.setName("1A"); 	
        btn1A.setBounds(202, 190, 70, 34);		
        mainClass1.floorOnePage.add(btn1A);		
        btn1A.addActionListener(e -> {	
            mainClass1.updateTimeIn(btn1A); 											
	         mainClass1.startLiveTimer(btn1A);			// maY SPACEE								
	         mainClass1.isParked(btn1A);												
	         mainClass1.updateSlotLabels("1A");						 					
	         mainClass1.updateTypeLocation("Regular", "1st Floor, Slot A");			 	
	         mainClass1.updateLiveRate(btn1A);	  
	     });																			
    	JButton btn1B = new JButton(); 											
        btn1B.setName("1B"); 	
        btn1B.setBounds(202, 241, 70, 34);		
        mainClass1.floorOnePage.add(btn1B);		
        btn1B.addActionListener(e -> {	
            mainClass1.updateTimeIn(btn1B); 											
	         mainClass1.startLiveTimer(btn1B);											
	         mainClass1.isParked(btn1B);												
	         mainClass1.updateSlotLabels("1B");						 					
	         mainClass1.updateTypeLocation("Regular", "1st Floor, Slot B");			 	
	         mainClass1.updateLiveRate(btn1B);	
         });	
        JButton btn1C = new JButton(); 											
        btn1C.setName("1C"); 	
        btn1C.setBounds(202, 290, 70, 34);		
        mainClass1.floorOnePage.add(btn1C);		
        btn1C.addActionListener(e -> {	
            mainClass1.updateTimeIn(btn1C); 											
	         mainClass1.startLiveTimer(btn1C);											
	         mainClass1.isParked(btn1C);												
	         mainClass1.updateSlotLabels("1C");						 					
	         mainClass1.updateTypeLocation("Regular", "1st Floor, Slot C");			 	
	         mainClass1.updateLiveRate(btn1C);	
         });	
        JButton btn1D = new JButton(); 											
        btn1D.setName("1D"); 	
        btn1D.setBounds(202, 353, 70, 34);		
        mainClass1.floorOnePage.add(btn1D);		
        btn1D.addActionListener(e -> {	
            mainClass1.updateTimeIn(btn1D); 											
	         mainClass1.startLiveTimer(btn1D);											
	         mainClass1.isParked(btn1D);												
	         mainClass1.updateSlotLabels("1D");						 					
	         mainClass1.updateTypeLocation("PWD", "1st Floor, Slot D");			 	
	         mainClass1.updateLiveRate(btn1D);	
         });	
        JButton btn1E = new JButton(); 											
        btn1E.setName("1E"); 	
        btn1E.setBounds(202, 426, 70, 34);		
        mainClass1.floorOnePage.add(btn1E);		
        btn1E.addActionListener(e -> {	
            mainClass1.updateTimeIn(btn1E); 											
	         mainClass1.startLiveTimer(btn1E);											
	         mainClass1.isParked(btn1E);												
	         mainClass1.updateSlotLabels("1E");						 					
	         mainClass1.updateTypeLocation("PWD", "1st Floor, Slot E");			 	
	         mainClass1.updateLiveRate(btn1E);	
         });	
        JButton btn1F = new JButton(); 											
        btn1F.setName("1F"); 	
        btn1F.setBounds(393, 190, 70, 34);		
        mainClass1.floorOnePage.add(btn1F);		
        btn1F.addActionListener(e -> {	
        	 mainClass1.updateTimeIn(btn1F); 											
	         mainClass1.startLiveTimer(btn1F);											
	         mainClass1.isParked(btn1F);												
	         mainClass1.updateSlotLabels("1F");						 					
	         mainClass1.updateTypeLocation("Regular", "1st Floor, Slot F");			 	
	         mainClass1.updateLiveRate(btn1F);	
         });	
        JButton btn1G = new JButton(); 											
        btn1G.setName("1G"); 	
        btn1G.setBounds(393, 240, 70, 34);		
        mainClass1.floorOnePage.add(btn1G);		
        btn1G.addActionListener(e -> {	
        	mainClass1.updateTimeIn(btn1G); 											
	         mainClass1.startLiveTimer(btn1G);											
	         mainClass1.isParked(btn1G);												
	         mainClass1.updateSlotLabels("1G");						 					
	         mainClass1.updateTypeLocation("Regular", "1st Floor, Slot G");			 	
	         mainClass1.updateLiveRate(btn1G);	
         });	
        JButton btn1H = new JButton(); 											
        btn1H.setName("1H"); 	
        btn1H.setBounds(393, 289, 70, 34);		
        mainClass1.floorOnePage.add(btn1H);		
        btn1H.addActionListener(e -> {	
        	mainClass1.updateTimeIn(btn1H); 											
	         mainClass1.startLiveTimer(btn1H);											
	         mainClass1.isParked(btn1H);												
	         mainClass1.updateSlotLabels("1H");						 					
	         mainClass1.updateTypeLocation("Regular", "1st Floor, Slot H");			 	
	         mainClass1.updateLiveRate(btn1H);	
         });	
        JButton btn1I = new JButton(); 											
        btn1I.setName("1I"); 	
        btn1I.setBounds(393, 352, 70, 34);		
        mainClass1.floorOnePage.add(btn1I);		
        btn1I.addActionListener(e -> {	
        	mainClass1.updateTimeIn(btn1I); 											
	         mainClass1.startLiveTimer(btn1I);											
	         mainClass1.isParked(btn1I);												
	         mainClass1.updateSlotLabels("1I");						 					
	         mainClass1.updateTypeLocation("PWD", "1st Floor, Slot I");			 	
	         mainClass1.updateLiveRate(btn1I);	
         });	
        JButton btn1J = new JButton(); 											
        btn1J.setName("1J"); 	
        btn1J.setBounds(393, 426, 70, 34);		
        mainClass1.floorOnePage.add(btn1J);		
        btn1J.addActionListener(e -> {	
        	mainClass1.updateTimeIn(btn1J); 											
	         mainClass1.startLiveTimer(btn1J);											
	         mainClass1.isParked(btn1J);												
	         mainClass1.updateSlotLabels("1J");						 					
	         mainClass1.updateTypeLocation("PWD", "1st Floor, Slot J");			 	
	         mainClass1.updateLiveRate(btn1J);	
         });	
        JButton btn1K = new JButton(); 			 								
        btn1K.setName("1K"); 	
        btn1K.setBounds(574, 93, 70, 34);		
        mainClass1.floorOnePage.add(btn1K);		
        btn1K.addActionListener(e -> {
        	mainClass1.updateTimeIn(btn1K); 											
	         mainClass1.startLiveTimer(btn1K);											
	         mainClass1.isParked(btn1K);												
	         mainClass1.updateSlotLabels("1K");						 					
	         mainClass1.updateTypeLocation("Regular", "1st Floor, Slot K");			 	
	         mainClass1.updateLiveRate(btn1K);	
         });	
        JButton btn1L = new JButton(); 											
        btn1L.setName("1L"); 	
        btn1L.setBounds(574, 142, 70, 34);		
        mainClass1.floorOnePage.add(btn1L);		
        btn1L.addActionListener(e -> {	
        	mainClass1.updateTimeIn(btn1L); 											
	         mainClass1.startLiveTimer(btn1L);											
	         mainClass1.isParked(btn1L);												
	         mainClass1.updateSlotLabels("1L");						 					
	         mainClass1.updateTypeLocation("Regular", "1st Floor, Slot L");			 	
	         mainClass1.updateLiveRate(btn1L);	
         });	
        JButton btn1M = new JButton(); 											
        btn1M.setName("1M"); 	
        btn1M.setBounds(574, 192, 70, 34);		
        mainClass1.floorOnePage.add(btn1M);		
        btn1M.addActionListener(e -> {	
        	mainClass1.updateTimeIn(btn1M); 											
	         mainClass1.startLiveTimer(btn1M);											
	         mainClass1.isParked(btn1M);												
	         mainClass1.updateSlotLabels("1M");						 					
	         mainClass1.updateTypeLocation("Regular", "1st Floor, Slot M");			 	
	         mainClass1.updateLiveRate(btn1M);	
         });	
        JButton btn1N = new JButton(); 											
        btn1N.setName("1N"); 	
        btn1N.setBounds(574, 242, 70, 34);		
        mainClass1.floorOnePage.add(btn1N);		
        btn1N.addActionListener(e -> {
        	mainClass1.updateTimeIn(btn1N); 											
	         mainClass1.startLiveTimer(btn1N);											
	         mainClass1.isParked(btn1N);												
	         mainClass1.updateSlotLabels("1N");						 					
	         mainClass1.updateTypeLocation("Regular", "1st Floor, Slot N");			 	
	         mainClass1.updateLiveRate(btn1N);	
         });	
        JButton btn1O = new JButton(); 											
        btn1O.setName("1O"); 	
        btn1O.setBounds(574, 291, 70, 34);		
        mainClass1.floorOnePage.add(btn1O);		
        btn1O.addActionListener(e -> {	
        	mainClass1.updateTimeIn(btn1O); 											
	         mainClass1.startLiveTimer(btn1O);											
	         mainClass1.isParked(btn1O);												
	         mainClass1.updateSlotLabels("1O");						 					
	         mainClass1.updateTypeLocation("Regular", "1st Floor, Slot O");			 	
	         mainClass1.updateLiveRate(btn1O);	
         });	
        JButton btn1P = new JButton(); 											
        btn1P.setName("1P"); 	
        btn1P.setBounds(574, 341, 70, 34);		
        mainClass1.floorOnePage.add(btn1P);		
        btn1P.addActionListener(e -> {	
        	mainClass1.updateTimeIn(btn1P); 											
	         mainClass1.startLiveTimer(btn1P);											
	         mainClass1.isParked(btn1P);												
	         mainClass1.updateSlotLabels("1P");						 					
	         mainClass1.updateTypeLocation("Regular", "1st Floor, Slot P");			 	
	         mainClass1.updateLiveRate(btn1P);	
         });
        
        JLabel imgFloorOne = new JLabel();
        imgFloorOne.setBounds(0, 0, 664, 661); // Adjust the bounds as needed
        ImageIcon imageIcon1 = new ImageIcon("D:\\ALMM\\Programming\\Java\\PMS\\src\\pms\\floorOneImg.png");
        Image image1 = imageIcon1.getImage().getScaledInstance(imgFloorOne.getWidth(), imgFloorOne.getHeight(), Image.SCALE_SMOOTH);
        imgFloorOne.setIcon(new ImageIcon(image1));
        mainClass1.floorOnePage.add(imgFloorOne);

	     
	 }
}
