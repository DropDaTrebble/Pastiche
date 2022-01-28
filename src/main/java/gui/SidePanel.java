package gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class SidePanel extends JPanel{
	
	/**
	 *
	 */
	public JPanel sidePanel;

	public SidePanel(Dimension prefDim, Color bgColor) {
		
		this.sidePanel = new JPanel();
		
		sidePanel.setBackground(bgColor);
		sidePanel.setPreferredSize(prefDim);
	}
	
}
