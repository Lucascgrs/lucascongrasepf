/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_onitama;

import java.awt.Color;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author lucas
 */
public class CelluleGraphique extends JButton{
    Cellule CelluleAssociee;
    //ImageIcon dragon = new javax.swing.ImageIcon(getClass().getResource("Images/dragon.png"));
    //ImageIcon pion = new javax.swing.ImageIcon(getClass().getResource("Images/pion.png"));
    
    public CelluleGraphique(Cellule cellule){
        CelluleAssociee = cellule;
    }
    
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        
        String[] pioncellule = CelluleAssociee.caracteristiques();
        switch(pioncellule[0]){
            case "Dragon":
                setBorder(BorderFactory.createRaisedBevelBorder());
                setText("DRAGON");
                //setIcon(dragon);
                break;
            case "pion":
                //setIcon(pion);
                setBorder(null);
                setText("");
                break;
            case "":
                setText("");
                setBorder(null);
                break;
        }
        //System.out.println("Couleur : " + couleurs.get(pioncellule[1]) + " car : " + pioncellule[1]);
        switch(pioncellule[1]){
            
            case "Rouge":
                setBackground(Color.RED);
                break;
            case "Vert":
                setBackground(Color.GREEN);
                break;
            case "Bleu":
                setBackground(Color.BLUE);
                break;
            case "Noir":
                setBackground(Color.BLACK);
                break;
            case "Blanc":
                setBackground(Color.WHITE);
                break;
            case "Jaune":
                setBackground(Color.YELLOW);
                break;
            case "":
                setBackground(Color.gray);
        }
        
        if(CelluleAssociee.deppossible){
            setBackground(Color.PINK);
        }
    }
}
