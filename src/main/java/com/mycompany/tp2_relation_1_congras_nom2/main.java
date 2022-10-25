/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation_1_congras_nom2;

/**
 *
 * @author lucas
 */
public class main {
    
    public static void main(String args[]){
        
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        
        System.out.println("liste des voitures disponibles : \n" + uneClio.toString() + "\n" + uneAutreClio.toString() +  "\n" + une2008.toString() + "\n" + uneMicra.toString()) ;
        
        bob.liste_voitures[0] = uneClio ;
        bob.nbVoitures = 1;
        uneClio.proprietaire = bob;
        
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] ) ;
        
        bob.liste_voitures[1] = une2008;
        bob.nbVoitures ++;
        une2008.proprietaire = bob;
        
        reno.liste_voitures[0] = uneMicra;
        reno.nbVoitures ++;
        uneMicra.proprietaire = reno;
        
        reno.liste_voitures[1] = uneAutreClio;
        reno.nbVoitures ++;
        uneAutreClio.proprietaire = reno;
        
        System.out.println(bob.toString() + reno.toString());
        
        Voiture v1 = new Voiture("mod1", "mar1", 10);
        reno.ajouter_voiture(v1);
        System.out.println(reno.toString() + v1.toString());
    }
    
}
