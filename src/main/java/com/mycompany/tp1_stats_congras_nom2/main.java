/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1_stats_congras_nom2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lucas Congras
 * Creation 04/10/2022
 * TP1
 */

public class main {
    
    public static void main(String[] args){
        
        String a = "a";
        String b = "a";
        int x = 'a';
        
        a = b + x;
        
        if (a.compareTo(b) == 0){
            System.out.println(x);
        }
        
        int[] list = {0, 0, 0, 0, 0, 0};
        List<Integer> list_ = Arrays.asList(0,0,0,0,0,0);
        int cote;
        int m;
        double somme = 0;
        double[] listp = {0,0,0,0,0,0};
        List<Double > list_p = Arrays.asList(0.0,0.0,0.0,0.0,0.0,0.0);
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        
        System.out.println("Entrez un nombre : ");
        m = sc.nextInt();
        
        for (int k = 0; k < m; k++){        //on incrémente m fois une face aléatoire

            cote = generateurAleat.nextInt(6);
            list[cote] ++;
            list_.set(cote, list_.get(cote) + 1);
        }
        
        System.out.println(Arrays.toString(list));
        System.out.println(list_);
        
        for (int k = 0; k <= 5; k++){
            
            somme = somme + list[k];
            System.out.println("L'element " + k + " du tableau est :" + list[k]);
            
        }
        
        for (int k = 0; k<= 5; k++){
            
            listp[k] = (list[k] / somme) * 100;
            list_p.set(k, (list[k] / somme) * 100);
            
        }
        
        System.out.println("Le tableau obtenu a une repartition dont les elements sont exprimes en pourcentage : " + Arrays.toString(listp));
        System.out.println("Le tableau obtenu a une repartition dont les elements sont exprimes en pourcentage : " + list_p);
        
    }
    
}
