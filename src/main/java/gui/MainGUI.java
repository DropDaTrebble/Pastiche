package gui;

/**
 * Main GUI creator class.
 * @author Mateusz Murak
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;


public class MainGUI extends JFrame {
    
	public void MainGUI() {
	
		JFrame frame = new JFrame();
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1200, 800); // change to pack()
		frame.setMinimumSize(new Dimension(900, 600));
		frame.setLayout(new BorderLayout()); //po kolei

                MiddlePanel middlePanel = new MiddlePanel(Color.DARK_GRAY, 40, 40);
                LeftPanel leftPanel = new LeftPanel(Color.GRAY, 200, 300);
                RightPanel rightPanel = new RightPanel(Color.GRAY, 200, 300);
                
               // ImageArea imgArea = new ImageArea(Color.WHITE, 20, 20);
		
		//System.out.print("-MainGUI: Panels done, now adding to frame:\n");
                
                MenuGui menuGui = new MenuGui();
                
		frame.add(middlePanel.getMiddlePanel(), BorderLayout.CENTER);
		frame.add(leftPanel.getLeftPanel(),BorderLayout.WEST);
		frame.add(rightPanel.getRightPanel(), BorderLayout.EAST);
                frame.setJMenuBar(menuGui.getBar());
                //frame.add(imgArea, BorderLayout.CENTER);  //TODO: psuje sie
                        //frame.pack();
		
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		
	}
	
}
