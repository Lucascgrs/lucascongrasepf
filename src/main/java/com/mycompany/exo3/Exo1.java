/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exo3;

import java.util.Scanner;

/**
 *
 * @author Lucas Congras
 * Creation 04/10/2022
 * TP0
 */
public class Exo1 {
    
    public static void main(String[] args){
        
        int operateur = askoperator();
        
        int operande1 = asknumber();
        int operande2 = asknumber();
        
        double rep = 0;
        
        switch(operateur){
            
            case 1:
                rep = operande1 + operande2;
                break;
            case 2:
                rep = operande1 - operande2;          
                break;
            case 3:
                rep = operande1 * operande2;
                break;
            case 4:
                rep = operande1 /operande2;
                break;
            case 5:
                rep = operande1 % operande2;
                break;
                
        }

        System.out.println("Le resultat est : " + rep);
        
    }
    
    
    private static int askoperator(){

        Scanner  sc = new Scanner(System.in);

        System.out.println("Please enter the operator:\n" +
                            "1) add\n" +
                            "2) substract\n" +
                            "3) multiply\n" +
                            "4) divide\n" +
                            "5) modulo");

        int rep = sc.nextInt();
        
        if(!(rep == 1 | rep == 2 | rep == 3 | rep == 4 | rep == 5)){
            
            System.out.println("Erreur...");
            
        }

        return rep;
        
    }
    
    
    private static int asknumber(){
        
        Scanner  sc = new Scanner(System.in);
        
        System.out.println("Please enter a number : ");
        
        int rep = sc.nextInt();
        
        return rep;
        
    }
    
}
