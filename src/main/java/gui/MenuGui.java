/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class MenuGui implements ActionListener, ItemListener {
    
    JMenuBar menuBar;
    
    public MenuGui()
    {
        this.menuBar = new JMenuBar();
        this.menuBar.setBackground(Color.WHITE);
                
        JMenu menuFile = new JMenu("Plik");
        JMenu menuEdit = new JMenu("Edycja");

        JMenuItem menuItemFileNew = new JMenuItem("Nowy");
        menuItemFileNew.addActionListener(this);
        
        //action performed after pressing "Otwórz"
        JMenuItem menuItemFileOpen = new JMenuItem("Otwórz");
        menuItemFileOpen.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("\nNACIŚNIĘTO: \'Otwórz\'");
            }
        });
        
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

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
