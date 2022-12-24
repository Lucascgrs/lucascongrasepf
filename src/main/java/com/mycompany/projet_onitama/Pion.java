/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_onitama;

/**
 *
 * @author lucas
 */
public class Pion {
    
    String Couleur;
    String Type;
    
    public Pion(String couleur, String type){
        Couleur = couleur;
        Type = type;
    }
    
    @Override
    public String toString(){
        return Couleur.substring(0, 1) + " " + Type.substring(0, 1);
    }
    
}
