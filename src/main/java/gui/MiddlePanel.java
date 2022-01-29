package gui;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author JA
 */
public class MiddlePanel {

    JPanel middlePanel;
    ImageArea imgArea;
    
    public MiddlePanel(Color backgroundColor, int width, int height)
    {
        this.imgArea  = new ImageArea(Color.WHITE, 300, 300);
        this.middlePanel = new JPanel(new GridBagLayout());
        this.middlePanel.setBackground(backgroundColor);
        this.middlePanel.setPreferredSize(new Dimension(width, height));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;
        
        this.middlePanel.add(imgArea);
        
        gbc.weighty = 1;
        
    }
    
    public JPanel getMiddlePanel()
    {return this.middlePanel;}
}
