/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1_guessmynumber_congras_nom2;

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
        
        Random generateurAleat = new Random();
        
        for (byte k = 0; k<5; k++){
            
        int n = generateurAleat.nextInt(100);
        //System.out.println(n);
            
        }
        
        Scanner sc = new Scanner(System.in);
        double rdm = generateurAleat.nextInt(100); //choix du nombre à deviner
        double user = -1;
        int essais = 0;
        int maxessais = 0;
        double eloignement = 0;
        double distance = 0;
        double pfalse = 0;
        byte mode = selectmode();
        String modeS = "";
        
        System.out.println("a deviner : " + rdm);
        
        switch(mode){
            
            case 1:
                maxessais = 40;
                eloignement = 0.10;
                modeS = "Facile";
                break;
            case 2:
                maxessais = 15;
                eloignement = 0.25;
                modeS = "Normal";
                break;
            case 3:
                maxessais = 10;
                eloignement = 0.40;
                modeS = "Difficile";
                break;
            case 4:
                maxessais = 6;
                eloignement = 0.45;
                modeS = "Cauchemard";
                break;
        }
        
        System.out.println("Vous avez choisi le mode " + modeS + ", vous avez donc " + maxessais + " essais.\n"
                + "La précision des conseils est de " + (eloignement * 100) + "% entre votre reponse et celle attendue\n\n");
        
        while(!(user == rdm) & maxessais > essais){
            
            System.out.println("Il vous reste " + (maxessais - essais) + " essais");
            System.out.println("Entrez un nombre entre 0 et 100: ");
            user = sc.nextInt();
            essais ++;
            
            distance = (rdm - user) / 100;
            if (distance < 0){
                distance = distance * -1;
            }
            
            System.out.println("distance : " + distance);
            
            if (modeS == "Cauchemard"){
                
                pfalse = generateurAleat.nextDouble();
                System.out.println(pfalse);
                
                if (pfalse<=0.30 & user < rdm){
                    
                    user = rdm + 1;
                    
                }else if(pfalse <= 0.30 & user > rdm){
                    
                    user = rdm - 1;
                    
                }
                
            }
            
            if (user > rdm){
                
                System.out.println("Trop grand");
                
                if (eloignement <= distance){
                    
                    System.out.println("Le resultat est bien moins grand");
                    
                }else{
                    
                    System.out.println("Le resultat n'est pas si loin");
                    
                }
                
            }else if(user < rdm){
                
                System.out.println("Trop petit");
                
                if (eloignement <= distance){
                    
                    System.out.println("Le resultat est bien plus grand");
                    
                }else{
                    
                    System.out.println("Le resultat n'est pas si loin");
                    
                }
                
            } else{
                System.out.println("Bravo ! Vous avez trouvés le nombre : " + rdm + " en " + essais + " essais");
                break;
            }
            
        }
        
    }
    
    
    private static byte selectmode(){

        byte mode = 0;
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Selectionnez la difficulté : \n"
                + "1 -> Facile\n"
                + "2 -> Normal\n"
                + "3 -> Difficile\n"
                + "4 -> Cauchemard");

        while(mode<1 | mode>4){

            mode = sc.nextByte();

        }

        return mode;
        
    }
    
}