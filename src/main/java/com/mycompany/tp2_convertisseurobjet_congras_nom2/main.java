/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_convertisseurobjet_congras_nom2;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class main {
    
    public static void main(String args[]){
        double res = 0;
        
        Convertisseur C1 = new Convertisseur(); //création d'un nouvel objet de la classe Convertisseur
        while(res != -300){      // boucle qui permet de faire autant de conversions que l'on veut. Le stop correspond à la valeur -300 donc tant que cette conditon n'est pas vérifiée, on continue les conversions
            
            res = C1.convert();     //on fait les conversions avec l'objet C1 de la classe Convertisseur
            System.out.println(C1.toString());
            System.out.println("Le résultat de la conversion est " + res + "\n");       //On affiche le résultat de la conversion
            
        }
        
    }
    
}
