/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation_1_congras_nom2;

/**
 *
 * @author lucas
 */
public class Personne {     //classe personne
    
    String Prenom;
    String Nom;
    int nbVoitures;
    Voiture[] liste_voitures;
        
    public Personne(String prenom, String nom){     //constructeur de la classe personne
        
        Prenom = prenom;
        Nom = nom;
        liste_voitures = new Voiture[3];
        nbVoitures = 0;
    }
    
        @Override
    public String toString(){       //redéfinition de la méthode toString qui affiche les caractéristiques 
        //return "Prenom : " + Prenom + " Nom : " + Nom + " Possede : " + nbVoitures + " voitures";
        return Prenom + " " + Nom;
    }
    
    
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {     //méthode ajouter_voiture qui prend en arguement un objet de la classe voiture
        
        if (nbVoitures < 3 & voiture_a_ajouter.proprietaire == null){       // si le personnage a moins de 3 voitures et que la voiture que l'on veut ajouter n'a pas de propriétaire (n'est pas volée)
            
            for(int k = 0; k < 3; k ++){        //on vérifie si on peut ajouter une voiture et à quelle place
                if(liste_voitures[k] == null){
                    liste_voitures[k] = voiture_a_ajouter;
                    nbVoitures ++;
                    voiture_a_ajouter.proprietaire = this;
                    return true;        // si on a réussi à ajouter la voiture on retourne true sinon false
                }
            } 
        }
        return false;
    }

}