/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.*;
import java.awt.*;


public class LeftPanel {
    
    JPanel leftPanel;
    
    public LeftPanel(Color backgroundColor, int width, int height)
    {
        this.leftPanel = new JPanel();
        this.leftPanel.setBackground(backgroundColor);
        this.leftPanel.setPreferredSize(new Dimension(width, height));
    }
    
    public JPanel getLeftPanel()
    {return this.leftPanel;}
    
}
