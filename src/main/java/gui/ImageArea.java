/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.*;
import java.awt.*;

public class ImageArea extends Canvas{
    
    public ImageArea(Color color, int width, int height)
    {
        setBackground(color);
        setSize(new Dimension(width, height));
        setVisible(true);
    }
    
}
