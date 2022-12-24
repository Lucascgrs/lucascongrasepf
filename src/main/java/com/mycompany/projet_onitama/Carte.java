/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_onitama;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lucas
 */
public class Carte {
    
    String Nom;
    int[][] Dep;
    
    public Carte(int[][] dep, String nom){
        Dep = dep;
        Nom = nom;
    }
    
    public int[][] getdep(){
        return Dep;
    }
    
    public void presentationcarte(){
        System.out.println("Présentation de la carte " + Nom + " : ");
        for(int k =0; k < Dep.length; k++){
            for(int i = 0; i < Dep[k].length; i++){
                System.out.print(Dep[k][i] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public String presentationcartegraphique(){
        //String txt = Nom + "\n";
        String txt = "<html>";
        String[][] matrice = new String[5][5];
        for(int k = 0; k < Dep.length; k++){
            matrice[Dep[k][0] + 2][Dep[k][1] + 2] = "x";
        }
        
        for(int k = 4; k >= 0; k--){
            for(int i = 0; i < 5; i++){
                if(matrice[k][i] == "x"){
                    txt += "[ x ]";
                }else{
                    txt += "[ - ]";
                }
            }
            txt += "<br>";
        }
        txt += "</html>";
        return txt;
    }
    
}
