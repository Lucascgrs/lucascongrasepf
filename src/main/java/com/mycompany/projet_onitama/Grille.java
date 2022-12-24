/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_onitama;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Grille {
    
    int Ligne = 5;
    int Colonne = 5;
    Cellule[][] CellulesJeu = new Cellule[Ligne][Colonne];
    
    public Grille(){
        for(int k = 0; k < Ligne; k++){
            for (int i = 0; i < Colonne; i++){
                CellulesJeu[k][i] = new Cellule(k, i);
            }
        }
    }
    
    public boolean Celluleoccupee(int x, int y){
        if (CellulesJeu[x][y].getpion() != null){
            return true;
        }
        return false;
    }
    
    public void vidergrille(){
        for(int k = 0; k < Ligne; k++){
            for (int i = 0; i < Colonne; i++){
                CellulesJeu[k][i].setpion(null);
            }
        }
    }
    
    public void affichergrille(){
        for(int k = 0; k < Ligne; k++){
            for (int i = 0; i < Colonne; i++){
                System.out.print("[" + CellulesJeu[k][i].getpiontype() + " " + CellulesJeu[k][i].getpioncolor() + "]");
                
                if(i == Colonne - 1){
                    System.out.println("");
                }
            }
        }
        System.out.println("");
    }
    
    public boolean etregagnantpourjoueur(Joueur joueur){
        //System.out.println(joueur.PlayerNum);
        if(joueur.PlayerNum == 0){
            if((CellulesJeu[0][2].PionCourant != null & CellulesJeu[0][2].getpioncolor() == joueur.Couleur) | (joueur.containdragon())){
                //System.out.println("vrai");
                //System.out.println(joueur.Couleur + " " + CellulesJeu[0][2].getpioncolor());
                return true;
            }
        }else{
            if((CellulesJeu[Ligne - 1][2].PionCourant != null & CellulesJeu[Ligne - 1][2].getpioncolor() == joueur.Couleur) | (joueur.containdragon())){
                //System.out.println("vrai");
                //System.out.println(joueur.Couleur + " " + CellulesJeu[4][2].getpioncolor() + CellulesJeu[4][2].getpiontype());
                return true;
            }
        }
        return false;
    }
    
    public void recupererpionennemi(Joueur joueur, Pion pion){
        joueur.ajouterpionennemi(pion);
    }
    
    public ArrayList<Cellule> deplacementspossibles(Joueur joueur, Carte carte, int x, int y){
        ArrayList<Cellule> dep = new ArrayList<Cellule>();
        Cellule cell;
        if(x >= 0 & x < Ligne & y >= 0 & y < Colonne){
            if(CellulesJeu[x][y].getpion() != null & CellulesJeu[x][y].getpion().Couleur == joueur.Couleur){
                for(int k = 0; k < carte.Dep.length; k++){
                    boolean cond = true;
                    try{
                        
                        if(joueur.PlayerNum == 0){
                            cell = CellulesJeu[x - carte.Dep[k][0]][y + carte.Dep[k][1]];
                            if(cell.getpioncolor() == joueur.Couleur){
                                cond = false;
                            }
                        }else{
                            cell = CellulesJeu[x + carte.Dep[k][0]][y - carte.Dep[k][1]]; 
                            if(cell.getpioncolor() == joueur.Couleur){
                                cond = false;
                            }
                        }
                        if(cond){
                            dep.add(cell);
                        }
                            
                    }catch(Exception e){
                        //System.out.println("Erreur");
                    }
                    
                }
            }
        }
        return dep;
    }
}
