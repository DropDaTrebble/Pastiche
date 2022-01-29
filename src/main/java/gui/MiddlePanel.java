package gui;
import javax.swing.*;
import java.awt.*;


public class MiddlePanel {

    JPanel middlePanel;
    ImageArea imgArea;
    Graphics g;
    
    public MiddlePanel(Color backgroundColor, int width, int height)
    {
        //g = imgArea.getGraphics();
        
        this.middlePanel = new JPanel(new GridBagLayout());
        this.middlePanel.setBackground(backgroundColor);
        this.middlePanel.setPreferredSize(new Dimension(width, height));
        
        
        //g.setColor(new Color(255, 0, 0));
        //g.drawString("Hello", 200, 200);
        
        /*imgArea.setSize(width, height);
        imgArea.setBackground(Color.BLACK);
        imgArea.setVisible(true);
        imgArea.setFocusable(false);*/
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;
        
        gbc.weighty = 1; //this might not have to be there XD
        
        //newImageArea(Color.WHITE, 300, 400);
        //drawTest();
        //g.drawString("Hell", 2, 2);
        
    }
    
    public JPanel getMiddlePanel()
    {return this.middlePanel;}
    
    public void newImageArea(Color color, int width, int height)
    {  
        this.imgArea  = new ImageArea(color, width, height);
        this.middlePanel.add(imgArea);
        this.imgArea.setVisible(true);
        this.g = this.imgArea.getGraphics();
    }
    
    public void hideImageArea()
    {  
        this.imgArea.setVisible(false);
    }
    
    public void drawTest()
    {
        System.out.print("WTFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        //this.g.setColor(Color.BLUE);
        //g.drawString("Hell", 2, 2);


        //this.g.setColor(Color.BLACK);
        //g.drawString("Hell", 2, 2);
    }
}
