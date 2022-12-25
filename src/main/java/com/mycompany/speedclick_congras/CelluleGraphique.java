/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.speedclick_congras;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author lucas
 */
public class CelluleGraphique extends JButton{
    Cellule CelluleAssociee;

    public CelluleGraphique(Cellule cellule){
        CelluleAssociee = cellule;
    }
    
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        if(CelluleAssociee.isactivate()){
            setBackground(Color.GREEN);
        }else{
            setBackground(Color.gray);
        }
        if(CelluleAssociee.bonus){
            setBackground(Color.MAGENTA);
        }
    }

}