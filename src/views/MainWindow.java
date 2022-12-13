/*
* File: MainWindow.java
* Author: Sánta Renáta Diána
* Copyright: 2022, Sánta Renáta Diána
* Group: Szoft II N
* Date: 2022-12-13
* Github: https://github.com/SantaRenata/
* Licenc: GNU GPL
*/


package views;

import javax.swing.BoxLayout;
import javax.swing.JFrame;


import lan.santa.InputPanel;

public class MainWindow extends JFrame{
    InputPanel inputPanel;

    public AsidePanel asidePanel;
    public AlfaPanel alfaPanel;
    public AreaPanel areaPanel;
    public PerimeterPanel perimeterPanel;
    public ButtonsPanel buttonsPanel;

    public MainWindow(){
        this.asidePanel = new AsidePanel();
        this.alfaPanel = new AlfaPanel();
        this.buttonsPanel = new ButtonsPanel();
        this.areaPanel = new AreaPanel();
        this.perimeterPanel = new PerimeterPanel();

        this.initComponent();
        this.addComponentToWindow();
        this.initWindow();
    }

    public void initComponent(){
        this.inputPanel = new InputPanel();
    }

    public void addComponentToWindow(){
        this.add(this.asidePanel);
        this.add(this.alfaPanel);
        this.add(this.buttonsPanel);
        this.add(this.areaPanel);
        this.add(this.perimeterPanel);
    }

    public void initWindow(){
        this.setTitle("Rombusz terület és kerület számító");
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

}
