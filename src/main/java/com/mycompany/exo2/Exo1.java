/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exo2;

import java.util.Scanner;

/**
 *
 * @author Lucas Congras
 * Creation 04/10/2022
 * TP0
 */
public class Exo1 {
    
    public static void main(String[] args){
        
        //Declaration des variables
        int nb; // nombre d'entiers a additionner
        //nb=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt(); // On demande a sc de donner le prochain entier

        int result; // resultat
        int ind; //indice
        //nb=5;
        result=0;
        // Addition des nb premiers entiers
        ind=1;
        while (ind <= nb) {
            result=result+ind;
            ind ++;
        }
        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des "+ nb + " entiers est: "+result);
        
    }
    
}
