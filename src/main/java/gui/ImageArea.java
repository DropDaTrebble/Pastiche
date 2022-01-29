/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.*;
import java.awt.*;

public class ImageArea extends Canvas{
    
    //Graphics g;
    public boolean circle;
    
    public ImageArea(Color color, int width, int height)
    {
        this.circle = false;
        
        setBackground(color);
        setSize(new Dimension(width, height));
        setVisible(true);
        
        //g = new Graphics();
        //Graphics2D g2D = (Graphics2D) g;
    }
    
    public void paint(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) getGraphics();
        
        g2D.setPaint(Color.red);
        //g2D.drawOval(3, 3, 100, 100);
        
        
        int i = 0;
        while(i < 10 && circle)
        {
            g2D.drawOval(40-4*i, 40-4*i, 100+8*i, 100+8*i);
            i++;
            if(i == 9)
                this.circle = false;
        }
    }

}
