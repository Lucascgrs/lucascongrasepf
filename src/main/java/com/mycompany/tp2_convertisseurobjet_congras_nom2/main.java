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
        
        Convertisseur C1 = new Convertisseur();
        while(res != res-300){
            
            res = C1.convert();
            System.out.println(C1.toString());
            System.out.println("Le résultat de la conversion est " + res + "\n");
            
        }
        
    }
    
}
