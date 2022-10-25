/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4_heritage_lcongras_nom2;

import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Epée;
import Armes.Baton;
import java.util.Vector;

/**
 *
 * @author lucas
 */
public class main {
    
    public static void main(String args[]){
        
        Epée epee1 = new Epée("Excalibur", 7, 5);
        Epée epee2 = new Epée("Durandal", 4, 7);
        Epée epee3 = new Epée("Epée legendaire", 5, 6);
        
        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);
        Baton baton3 = new Baton("Etre", 3, 9);
        
        Vector list = new Vector();
        list.add(epee1);
        list.add(epee2);
        list.add(epee3);
        list.add(baton1);
        list.add(baton2);
        list.add(baton3);
        
        for (int k = 0; k< list.size(); k++){
            System.out.println(list.elementAt(k));
        }
        
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Magicien Garcimore = new Magicien("Garcimore", 44, false);
        
        Guerrier Conan = new Guerrier("Conan", 78, false);
        Guerrier Lannister = new Guerrier("Lannister", 45, true);
        
        Vector list2 = new Vector();
        list2.add(gandalf);
        list2.add(Garcimore);
        list2.add(Conan);
        list2.add(Lannister);
        
        for (int k = 0; k< list2.size(); k++){
            System.out.println(list2.elementAt(k));
        }
        
        Conan.ajouter_arme(epee1);
        Conan.ajouter_arme(epee2);
        Conan.ajouter_arme(baton1);
        Conan.prendre_arme(epee1);
        System.out.println("Le nombre d'armes preferees de "+ Conan.get_name() + " est de : " + Conan.get_nb_predilections());
        
        Conan.toString();
        
        Magicien magicien1 = new Magicien("magicien", 40, true);
        Guerrier guerrier1 = new Guerrier("guerrier", 41, false);
        
        System.out.println(magicien1.toString() + guerrier1.toString());
        
        guerrier1.seFatiguer();
        System.out.println(guerrier1.estVivant());
        guerrier1.ajouter_arme(epee2);
        guerrier1.prendre_arme(epee2);
        System.out.println(guerrier1.toString());
        guerrier1.attack(magicien1);
        System.out.println(magicien1.toString() + guerrier1.toString());
        
        //Test d'un combat
        
        Epée epee11 = new Epée("Excalibur", 7, 5);
        Epée epee22 = new Epée("Durandal",4,7);
        
        Baton b1 = new Baton("Chêne", 4, 5);
        Baton b2 = new Baton("Charme", 5, 6);
        
        Magicien magicien= new Magicien("Le magicien de la mort qui tue", 60, false);
        Guerrier guerrier = new Guerrier("Le guerrier de la mort qui tue", 55, true);
        
        guerrier.ajouter_arme(b1);
        guerrier.ajouter_arme(epee11);
        magicien.ajouter_arme(b2);
        magicien.ajouter_arme(epee22);
        
        guerrier.prendre_arme(b1);
        magicien.prendre_arme(b2);
        
        magicien.attack(guerrier);
        System.out.println(magicien.toString() + "\n" + guerrier.toString());
        guerrier.attack(magicien);
        System.out.println(magicien.toString() + "\n" + guerrier.toString());
        System.out.println("Le magicien est vivant : " + magicien.estVivant() + "\n" + "Le guerrier est vivant : " + guerrier.estVivant());
    }
    
}
