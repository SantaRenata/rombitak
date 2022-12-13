/*
* File: MainController.java
* Author: Sánta Renáta Diána
* Copyright: 2022, Sánta Renáta Diána
* Group: Szoft II N
* Date: 2022-12-13
* Github: https://github.com/SantaRenata/
* Licenc: GNU GPL
*/

package controllers;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import views.MainWindow;

public class MainController {
    MainWindow mainwWindow;

    public MainController(){
        this.mainwWindow = new MainWindow();
        this.handleEvents();
    }

    public void handleEvents(){
        JButton calcArea = this.mainwWindow.buttonsPanel.calcAreaButton;
        JButton calcPerimeter = this.mainwWindow.buttonsPanel.calcPerimeterButton;
        JButton aboutButton = this.mainwWindow.buttonsPanel.aboutButton;

        calcArea.addActionListener(e->calcArea());
        calcPerimeter.addActionListener(e->calcPerimeter());
        aboutButton.addActionListener(e->showAbout());
    }

    public void calcArea(){
        String asideStr = this.mainwWindow.asidePanel.getValue();
        String alfaStr = this.mainwWindow.alfaPanel.getValue();
        double aside = Double.parseDouble(asideStr);
        double alfa = Double.parseDouble(alfaStr);
        alfa = Math.toRadians(alfa);
        Double perimeter = Math.pow(aside, 2) * Math.sin(alfa);

        this.mainwWindow.perimeterPanel.setValue(perimeter.toString());
    }

    public void calcPerimeter(){
        String asideStr = this.mainwWindow.asidePanel.getValue();
        double aside = Double.parseDouble(asideStr);
        Double area = 4* aside;

        this.mainwWindow.areaPanel.setValue(area.toString());
    }

    public void showAbout(){
        String about = "Rombusz terület és kerület számító\nVerzió:0.1\nSánta Renáta Diána\nSzoft II N\n2022-12-13";
        JOptionPane.showMessageDialog(this.mainwWindow.getContentPane(),about, "Névjegy",1);
    }


}
