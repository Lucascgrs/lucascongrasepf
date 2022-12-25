/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.speedclick_congras;

/**
 *
 * @author lucas
 */
public class Cellule {
    boolean Active;
    int x;
    int y;
    boolean bonus = false;
    
    public Cellule(int X, int Y){
        x = X;
        y = Y;
        
    }
    
    public void activate(){
        Active = true;
    }
    
    public void desactivate(){
        Active = false;
    }
    
    public boolean isactivate(){
        return Active;
    }
    
    public void changestate(){
        if(isactivate()){
            desactivate();
        }else{activate();}
    }
    
}
