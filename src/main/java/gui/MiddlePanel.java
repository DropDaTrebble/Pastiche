package gui;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author JA
 */
public class MiddlePanel {

    JPanel middlePanel;
    
    public MiddlePanel(Color backgroundColor, int width, int height)
    {
        this.middlePanel = new JPanel();
        this.middlePanel.setBackground(backgroundColor);
        this.middlePanel.setPreferredSize(new Dimension(width, height));
    }
    
    public JPanel getMiddlePanel()
    {return this.middlePanel;}
}
