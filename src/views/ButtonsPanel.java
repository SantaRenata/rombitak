/*
* File: ButtonsPanel.java
* Author: Sánta Renáta Diána
* Copyright: 2022, Sánta Renáta Diána
* Group: Szoft II N
* Date: 2022-12-13
* Github: https://github.com/SantaRenata/
* Licenc: GNU GPL
*/


package views;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel {
    public JButton calcAreaButton;
    public JButton calcPerimeterButton;
    public JButton aboutButton;

    public ButtonsPanel() {
        this.calcAreaButton = new JButton("Terület számítása");
        this.calcPerimeterButton = new JButton("Kerület számítása");
        this.aboutButton = new JButton("Névjegy");

        this.addComponents();
    }
    public void addComponents() {
        this.add(this.calcAreaButton);
        this.add(this.calcPerimeterButton);
        this.add(this.aboutButton);
    }

}