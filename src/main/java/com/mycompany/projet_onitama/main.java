/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_onitama;

/**
 *
 * @author lucas
 */
public class main {
    
    public static void main(String[] args){
        Joueur j1 = new Joueur("Lucas");
        Joueur j2 = new Joueur("Léa");
        
        Partie partie = new Partie(j1, j2);
        partie.initialiserpartie();
        partie.debuterpartie();
    }
    
}
