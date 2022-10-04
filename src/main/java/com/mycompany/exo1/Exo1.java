/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exo1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lucas Congras
 * Creation 04/10/2022
 * TP0
 */
public class Exo1 {
    
    public static void main(String[] args){
        
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();
        
        System.out.println("Au revoir " + prenom);
        
    }
    
}
