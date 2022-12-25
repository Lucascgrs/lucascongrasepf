/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.speedclick_congras;

import java.util.Random;

/**
 *
 * @author lucas
 */
public class Grille {
    
    int Ligne = 5;
    int Colonne = 5;
    Cellule[][] CellulesJeu= new Cellule[Ligne][Colonne];
    
    public Grille(){
        for(int k = 0; k < Ligne; k++){
            for(int i = 0; i < Colonne; i++){
                CellulesJeu[k][i] = new Cellule(k, i);
            }
        }
    }
    
    public void newcellactive(){
        
        Random r = new Random();
        int x = r.nextInt(Ligne);
        int y = r.nextInt(Colonne);
        CellulesJeu[x][y].activate();
        int b = r.nextInt(20);
        if(b == 1){
            CellulesJeu[x][y].bonus = true;
        }
        
    }
    
    public boolean touchcell(int x, int y){
        if(CellulesJeu[x][y].isactivate()){
            CellulesJeu[x][y].desactivate();
            CellulesJeu[x][y].bonus = false;
            newcellactive();
            return true;
        }else{return false;}
    }
    
    public void affichergrille(){
        for(int k = 0; k < Ligne; k++){
            for(int i = 0; i < Colonne; i++){
                System.out.print("[" + CellulesJeu[k][i].isactivate() + "]");
                if(i == Colonne - 1){
                    System.out.println("");
                }
            }
        }
    }
    
    public void clear(){
        for(int k = 0; k < Ligne; k++){
            for(int i = 0; i < Colonne; i++){
                CellulesJeu[k][i].desactivate();
            }
        }
    }
    
}
