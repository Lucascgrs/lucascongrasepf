/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.speedclick_congras;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author lucas
 */
public class Partie {
    
    Grille grille;
    int score;
    int Time;
    
    public Partie(int time){
        
        grille = new Grille();
        Time = time;
        
    }
    
    public void setcellules(){
        
        grille.newcellactive();
        
    }
    
    public void init(){
        grille.clear();
        setcellules();
        grille.affichergrille();
    }
    
    public void timergame(){
        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            int time = Time;
            @Override
            public void run(){
                if (time == 0){
                    cancel();
                }
                System.out.println(time);
                time--;
            }

        }, 100, Time * 100);
        
    }
    
    public void jouerunefois(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ligne :");
        int x = sc.nextInt();
        System.out.println("Colonne :");
        int y = sc.nextInt();
        if(grille.CellulesJeu[x][y].bonus){
            score++;
        }
        if(grille.touchcell(x, y)){
            score++;
        }
        grille.affichergrille();
    }
    
    public int jouer(){
        init();
        int cpt = 0;
        while(cpt < 10){
            jouerunefois();
            cpt++;
        }
        return cpt;
    }
}