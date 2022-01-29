/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.*;

/**
 *
 * @author BartekZ
 */
public class MenuGui {
    
    JMenuBar menuBar;
    
    public MenuGui()
    {
        this.menuBar = new JMenuBar();
                
                JMenu menuFile = new JMenu("Plik");
                JMenu menuEdit = new JMenu("Edycja");
        
        JMenuItem menuItemFileNew = new JMenuItem("Nowy");
                JMenuItem menuItemFileOpen = new JMenuItem("Otwórz");
                JMenuItem menuItemFileSave = new JMenuItem("Zapisz");
                JMenuItem menuItemFileExport = new JMenuItem("Eksportuj");
                
                menuFile.add(menuItemFileNew);
                menuFile.add(menuItemFileOpen);
                menuFile.add(menuItemFileSave);
                menuFile.add(menuItemFileExport);
                
                menuBar.add(menuFile);
                menuBar.add(menuEdit);
    }
    
    public JMenuBar getBar()
    {return this.menuBar;}
    
}
