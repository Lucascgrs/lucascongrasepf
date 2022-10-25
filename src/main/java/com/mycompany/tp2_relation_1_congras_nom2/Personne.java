/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation_1_congras_nom2;

/**
 *
 * @author lucas
 */
public class Personne {
    
    String Prenom;
    String Nom;
    int nbVoitures;
    Voiture[] liste_voitures;
        
    public Personne(String prenom, String nom){
        
        Prenom = prenom;
        Nom = nom;
        liste_voitures = new Voiture[3];
        nbVoitures = 0;
    }
    
        @Override
    public String toString(){
        //return "Prenom : " + Prenom + " Nom : " + Nom + " Possede : " + nbVoitures + " voitures";
        return Prenom + " " + Nom;
    }
    
    
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        
        if (nbVoitures < 3 & voiture_a_ajouter.proprietaire == null){
            
            for(int k = 0; k < 3; k ++){
                if(liste_voitures[k] == null){
                    liste_voitures[k] = voiture_a_ajouter;
                    nbVoitures ++;
                    voiture_a_ajouter.proprietaire = this;
                    return true;
                }
            } 
        }
        return false;
    }

}