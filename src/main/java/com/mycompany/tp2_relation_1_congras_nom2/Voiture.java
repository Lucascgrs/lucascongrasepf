/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation_1_congras_nom2;

/**
 *
 * @author lucas
 */
public class Voiture {
    
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
    
    public Voiture(String modele, String marque, int puissanceCV){
        
        Modele = modele;
        Marque = marque;
        PuissanceCV = puissanceCV;
        proprietaire = null;
    }
    
        @Override
    public String toString(){
        //return "Voiture de marque " + Marque + " de modele " + Modele + " avec une puissance de " + PuissanceCV + " chevaux !";
        return "/Marque : " + Marque + " /Modele : " + Modele + " /Puissance : " + PuissanceCV + " /Proprietaire : " + proprietaire;
    }
    
}
