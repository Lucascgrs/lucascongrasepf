/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_onitama;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Joueur {
    
    String Nom;
    String Couleur;
    ArrayList<Pion> ListePions = new ArrayList<Pion>();
    int PionsRestant = 5;
    int Money = 100;
    int PlayerNum;
    ArrayList<Pion> ListePionsEnnemi = new ArrayList<Pion>();
    Carte[] ListeCarte = new Carte[2];
    int stade = 0;
    
    public Joueur(String nom){
        Nom = nom;
    }
    
    public void affectercouleur(String couleur){
        Couleur = couleur;
    }
    
    public void ajouterpion(Pion pion){
        ListePions.add(pion);
        PionsRestant++;
    }
    
    public void setmoney(int money){
        Money = money;
    }
    
    public void addmoney(int amount){
        Money += amount;
    }
    
    public void ajouterpionennemi(Pion pion){
        ListePionsEnnemi.add(pion);
    }
    
    public int getplayernum(){
        return PlayerNum;
    }
    
    public void addcard(Carte carte){
        if(ListeCarte[0] == null){
            ListeCarte[0] = carte;
        }else{
            ListeCarte[1] = carte;
        }
    }
    
    public boolean containdragon(){
        for(int k = 0; k < ListePionsEnnemi.size(); k++){
            if(ListePionsEnnemi.get(k).Type.equals("Dragon")){
                //System.out.println("dragonnnn");
                return true;
            }
        }
        return false;
    }
    
}
