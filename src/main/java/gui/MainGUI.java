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


public class MainGUI extends JFrame {
	
	public void MainGUI() {
	
		JFrame frame = new JFrame();
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1200,800);	// change to pack()
		frame.setMinimumSize(new Dimension(900,600));
		frame.setLayout(new BorderLayout());

		JPanel middlePanel = new JPanel();
		middlePanel.setBackground(Color.darkGray);
		middlePanel.setPreferredSize(new Dimension(10,10));
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground (Color.magenta);
		leftPanel.setPreferredSize(new Dimension(140,300));
		
		//SidePanel leftPanel = new SidePanel(new Dimension(140,300), Color.magenta);
		
		SidePanel rightPanel = new SidePanel(new Dimension(180,300), Color.cyan);
		/*rightPanel.setBackground(Color.cyan);
		rightPanel.setPreferredSize(new Dimension(180,300));*/
		
		System.out.print("-MainGUI: Panels done, now adding to frame:\n");
		
		frame.add(middlePanel, BorderLayout.CENTER);
		frame.add(leftPanel,BorderLayout.WEST);
		frame.add(rightPanel, BorderLayout.EAST);
		
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		
	}
	
}
