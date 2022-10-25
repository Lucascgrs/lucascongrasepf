/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Baton;
import Armes.Epée;
import com.mycompany.tp4_heritage_lcongras_nom2.etreVivant;
import java.util.Vector;

/**
 *
 * @author lucas
 */
public abstract class Personnage implements etreVivant{
    
    String Name;
    int Hp;
    Vector Liste_Armes = new Vector();
    Arme Arme_Main;
    String Arme_predilection;
    int nb_personnages = 0;
    
    
    public Personnage(String name, int hp, String arme_predilection){
        Name = name;
        Hp = hp;
        Arme_predilection = arme_predilection;
        nb_personnages ++;
    }
    
    @Override
    public String toString(){
        String txt;
        txt = "Name : " + Name + " Hp : " + Hp;
        if (Arme_Main != null){
            txt = txt + " Arme en main : " + Arme_Main.toString();
        }
        return txt;
    }
    
    public void ajouter_arme(Arme arme){
        
        if (Liste_Armes.size() < 5){
            Liste_Armes.addElement(arme);
        }else{
            System.out.println(Name + " possede deja 5 armes !");
        }
    }
    
    public void prendre_arme(Arme arme){
        if (Liste_Armes.contains(arme)){
            Arme_Main = arme;
            System.out.println("L'arme en main est désormais : " + Arme_Main.get_name());
        }else{
            System.out.println("Aucune arme n'est tenue en main");
        }
    }
    
    public Arme get_arme_main(){
        return Arme_Main;
    }
    
    public Vector get_liste_armes(){
        return Liste_Armes; 
    }
    
    public String get_name(){
        return Name;
    }
    
    public boolean is_predilection(Arme arme){
        if (arme.get_type().equals(Arme_predilection)){
            return true;
        }else{
            return false;
        }
    }
    
    public int get_nb_predilections(){
        int nb = 0;
        Arme arme;
        
        for(int k = 0; k < Liste_Armes.size(); k++){
            arme = (Arme) Liste_Armes.elementAt(k);
            if (is_predilection(arme) == true){
                nb++;
            }
        }
        return nb;
    }
    
    @Override
    public void finalize() {
        if (nb_personnages > 0){
            nb_personnages --;
        }else{
            System.out.println("Impossible de supprimer ce personnage");
        }
    }
    
    public void seFatiguer(){
        
        Hp -= 10;
        
    }
    
    public boolean estVivant(){
        if (Hp > 0){
            return true;
        }else{
            return false;
        }
    }
    
    public void estAttaque(int damage){
        
        Hp -= damage;
        
    }
    
    public void attack(Personnage enemy){
        
        int damage = 0;
        this.seFatiguer();
        if (Arme_Main != null){
            
            damage = Arme_Main.get_pc();
            
            if (this.getClass().getSimpleName().equals("Guerrier") && Arme_Main.getClass().getSimpleName().equals("Epée")){
                Epée epee = (Epée) Arme_Main;
                Guerrier guerrier = (Guerrier) this;
                damage = damage * epee.get_finesse();
                if (guerrier.Acheval == true){
                    damage /= 2;
                }
                
                
            }else if(this.getClass().getSimpleName().equals("Magicien") && Arme_Main.getClass().getSimpleName().equals("Baton")){
                Baton baton = (Baton) Arme_Main;
                damage = damage * baton.get_age();
                Magicien magicien = (Magicien) this;
                if (magicien.Confirme== true){
                    damage /= 2;
                }
                
            }
            
        }
        
        enemy.estAttaque(damage);
        
    }
    
}
