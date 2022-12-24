/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_onitama;

/**
 *
 * @author lucas
 */
public class Cellule {
    
    Pion PionCourant;
    int X;
    int Y;
    boolean deppossible = false;
    
    public Cellule(int x, int y){
        
        X = x;
        Y = y;
        
    }
    
    public void setpion(Pion pion){
        PionCourant = pion;
    }
    
    public Pion getpion(){
        return PionCourant;
    }
    
    public String getpioncolor(){
        if(PionCourant != null){
            return PionCourant.Couleur;
        }else{
            return "";
        }
    }
    
    public String getpiontype(){
        if(PionCourant != null){
            return PionCourant.Type;
        }else{
            return "";
        }
    }
    
    public String[] caracteristiques(){
        return new String[] {getpiontype(), getpioncolor()};
    }
    
    
}
