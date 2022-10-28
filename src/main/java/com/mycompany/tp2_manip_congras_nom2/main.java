/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_manip_congras_nom2;

/**
 *
 * @author lucas
 */

public class main {
    
    public static void main(String args[]){
        
        Tartiflette assiette1 = new Tartiflette(500);       // on crée des instances de la classe tartiflette
        Tartiflette assiette2 = new Tartiflette(600);
        
        Tartiflette assiette3 = assiette2 ;
        
        System.out.println("La tartiflette 2 a " + assiette2.nbCalories + "calories\n"
                + "La tartiflette 3 a " + assiette3.nbCalories + "calories.");      //affichage
        
        //Les assiettes 2 et 3 sont les mêmes (prouvé par le même nombre de calories) donc il y a seulement 2 objets de créés
        
        //Inverser les assiettes 1 et 2:
        Tartiflette tmp = assiette1;
        assiette1 = assiette2;
        assiette2 = tmp;
        
        
        // les lignes "Moussaka assiette667 = new Tartiflette() ;" et "Moussaka assiette666 = assiette1 ;" sont fausses car elles référencent un type d'objet autre que ce qu'elles annoncent référencer
        
        Moussaka[] tabmoussaka = new Moussaka[10];
        for (int k = 0; k < tabmoussaka.length; k++){
            tabmoussaka[k] = new Moussaka(1);       //on met dans une liste de type moussaka 10 instances de la classe Moussaka
        }
    }
    
}
