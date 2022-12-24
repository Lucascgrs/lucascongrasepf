/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_onitama;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Partie {
    
    Joueur[] ListeJoueur = new Joueur[2];
    ArrayList<Carte> ListeCarte = new ArrayList<Carte>();
    Joueur JoueurCourant;
    Carte CarteCourante;
    Grille GrilleJeu;
    ArrayList<String> colorlist = new ArrayList<String>(){{
        add("Rouge");
        add("Jaune");
        add("Bleu");
        add("Vert");
        add("Noir");
        add("Blanc");
    }};
    
    public Partie(Joueur j1, Joueur j2){
        j1.PlayerNum = 0;
        j2.PlayerNum = 1;
        ListeJoueur[0] = j1;
        ListeJoueur[1] = j2;
        defcartes();
    }
    
    public void initialiserpartie(){
        
        GrilleJeu = new Grille();
        JoueurCourant = ListeJoueur[0];
        Pion pion;
        
        String[] couleurs = attribuercouleursauxjoueurs();
        
        GrilleJeu.CellulesJeu[4][0].PionCourant = new Pion(couleurs[0], "pion");
        GrilleJeu.CellulesJeu[4][1].PionCourant = new Pion(couleurs[0], "pion");
        GrilleJeu.CellulesJeu[4][2].PionCourant = new Pion(couleurs[0], "Dragon");
        GrilleJeu.CellulesJeu[4][3].PionCourant = new Pion(couleurs[0], "pion");
        GrilleJeu.CellulesJeu[4][4].PionCourant = new Pion(couleurs[0], "pion");
        
        GrilleJeu.CellulesJeu[0][0].PionCourant = new Pion(couleurs[1], "pion");
        GrilleJeu.CellulesJeu[0][1].PionCourant = new Pion(couleurs[1], "pion");
        GrilleJeu.CellulesJeu[0][2].PionCourant = new Pion(couleurs[1], "Dragon");
        GrilleJeu.CellulesJeu[0][3].PionCourant = new Pion(couleurs[1], "pion");
        GrilleJeu.CellulesJeu[0][4].PionCourant = new Pion(couleurs[1], "pion");
        
        attribuercartes();
        
    }
    
    public String[] attribuercouleursauxjoueurs(){
        
        int couleur;
        String[] couleurs = new String[2];
        Random generateurAleat = new Random();
        
        for(int k = 0; k < 2; k++){
            
            couleur = generateurAleat.nextInt(colorlist.size());
            couleurs[k] = colorlist.get(couleur);
            ListeJoueur[k].affectercouleur(colorlist.get(couleur));
            System.out.println("Le joueur : " + ListeJoueur[k].Nom + " a la couleur " + colorlist.get(couleur));
            colorlist.remove(couleur);
        }
        return couleurs;
    }
    
    public void defcartes(){
        int[][] dep = {{0, -1}, {0, 1}, {1, 0}};
        ListeCarte.add(new Carte(dep, "Boar"));
        dep = new int[][] {{0, -1}, {-1, 1}, {1, 1}};
        ListeCarte.add(new Carte(dep, "Cobra"));
        dep = new int[][] {{0, -2}, {0, 2}, {1, 0}};
        ListeCarte.add(new Carte(dep, "Crab"));
        dep = new int[][] {{1, 0}, {-1, -1}, {-1, 1}};
        ListeCarte.add(new Carte(dep, "Crane"));
        dep = new int[][] {{1, -2}, {1, 2}, {-1, -1}, {-1, 1}};
        ListeCarte.add(new Carte(dep, "Dragon"));
        dep = new int[][] {{-1, -1}, {1, -1}, {0, 1}};
        ListeCarte.add(new Carte(dep, "Eel"));
        dep = new int[][] {{0, 1}, {0, -1}, {1, -1}, {1, 1}};
        ListeCarte.add(new Carte(dep, "Elephant"));
        dep = new int[][] {{0, -2}, {1, -1}, {-1, 1}};
        ListeCarte.add(new Carte(dep, "Frog"));
        dep = new int[][] {{0, -1}, {0, 1}, {1, -1}, {-1, 1}};
        ListeCarte.add(new Carte(dep, "Goose"));
        dep = new int[][] {{1, 0}, {-1, 0}, {0, -1}};
        ListeCarte.add(new Carte(dep, "Horse"));
        dep = new int[][] {{-1, 0}, {1, -1}, {1, 1}};
        ListeCarte.add(new Carte(dep, "Mantis"));
        dep = new int[][] {{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
        ListeCarte.add(new Carte(dep, "Monkey"));
        dep = new int[][] {{1, 0}, {-1, 0}, {0, 1}};
        ListeCarte.add(new Carte(dep, "Ox"));
        dep = new int[][] {{-1, -1}, {1, 1}, {0, 2}};
        ListeCarte.add(new Carte(dep, "Rabbit"));
        dep = new int[][] {{0, -1}, {0, 1}, {1, 1}, {-1, -1}};
        ListeCarte.add(new Carte(dep, "Rooster"));
        dep = new int[][] {{2, 0}, {-1, 0}};
        ListeCarte.add(new Carte(dep, "Tiger"));
    }
    
    public void attribuercartes(){
        Random r = new Random();
        for(int k = 0; k < 2; k++){
            for(int i = 0; i < 2; i++){
                int rand = r.nextInt(ListeCarte.size());
                ListeJoueur[k].addcard(ListeCarte.get(rand));
                ListeCarte.remove(rand);
            }
        }
        CarteCourante = ListeCarte.get(r.nextInt(ListeCarte.size()));
    }
    
    public void debuterpartie(){
        
        int nbrcoup = 0;
        int choice;
        
        while(true){
            
            GrilleJeu.affichergrille();

            if(nbrcoup % 2 == 0){
                JoueurCourant = ListeJoueur[0];
            }else{
                JoueurCourant = ListeJoueur[1];
            }
            
            System.out.println("C'est à " + JoueurCourant.Nom + " de jouer\n");
            
            choice = choice();
            jouer(choice);
            
            nbrcoup++;
            
            if(GrilleJeu.etregagnantpourjoueur(ListeJoueur[0])){
                System.out.println("Le joueur " + ListeJoueur[0].Nom + " a gagné");
                break;
            }
            if(GrilleJeu.etregagnantpourjoueur(ListeJoueur[1])){
                System.out.println("Le joueur " + ListeJoueur[1].Nom + " a gagné");
                break;
            }
            
        }
        
        System.out.println("--Partie terminée--");
        
    }
    
    public void jouer(int choice){
        Carte carte = JoueurCourant.ListeCarte[choice];
        int x = -1;
        int y = -1;
        
        do{
            System.out.println("Les coordonnées du pion que vous voulez déplacer : ");
            x = asknbr("Ligne : ");
            y = asknbr("Colonne : ");}
        while(!GrilleJeu.Celluleoccupee(x, y) | GrilleJeu.CellulesJeu[x][y].getpioncolor() != JoueurCourant.Couleur);
        
        ArrayList<Cellule> all_dep = GrilleJeu.deplacementspossibles(JoueurCourant, carte, x, y);
        afficherdeppossibles(all_dep);
        
        if(all_dep.size() > 0){
            int rep =  asknbr("Choix de la cellule de déplacement, " + all_dep.size() + " choix possibles : ");
            Pion p = GrilleJeu.CellulesJeu[x][y].getpion();
            GrilleJeu.CellulesJeu[x][y].setpion(null);
            if(all_dep.get(rep).getpioncolor() != JoueurCourant.Couleur & all_dep.get(rep).getpioncolor() != ""){
                GrilleJeu.recupererpionennemi(JoueurCourant, all_dep.get(rep).getpion());
                System.out.println("Vous venez de récupérer un " + all_dep.get(rep).getpiontype() + " ennemi");
                if(JoueurCourant == ListeJoueur[0]){
                    ListeJoueur[1].PionsRestant --;
                }else{
                    ListeJoueur[0].PionsRestant --;
                }
            }
            all_dep.get(rep).setpion(p);
        }
        Carte temp = carte;
        carte = CarteCourante;
        CarteCourante = temp;
    }
    
    public int asknbr(String qst){
        Scanner sc = new Scanner(System.in);
        System.out.println(qst);
        int rep = sc.nextInt();
        return rep;
    }
            
    public int choice(){
        Scanner sc = new Scanner(System.in);
        int rep = -1;
        while(rep < 0| rep > 1){
            JoueurCourant.ListeCarte[0].presentationcarte();
            JoueurCourant.ListeCarte[1].presentationcarte();
            rep = asknbr("0 -> carte 1\n1 -> carte 2");
        }
        return rep;
    }
    
    public void afficherdeppossibles(ArrayList<Cellule> dep){
        for(int k = 0; k < dep.size(); k++){
            System.out.println("Case possible : " + dep.get(k).X + " " + dep.get(k).Y + dep.get(k).getpiontype() + dep.get(k).getpioncolor());
        }
    }
    
}
