/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.*;
import java.awt.*;


public class RightPanel {
    
    JPanel rightPanel;
    
    public RightPanel(Color backgroundColor, int width, int height)
    {
        this.rightPanel = new JPanel();
        this.rightPanel.setBackground(backgroundColor);
        this.rightPanel.setPreferredSize(new Dimension(width, height));
    }
    
    public JPanel getRightPanel()
    {return this.rightPanel;}
    
}
