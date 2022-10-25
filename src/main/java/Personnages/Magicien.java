/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author lucas
 */
public class Magicien extends Personnage{
    
    boolean Confirme;
    int nb_magicien = 0;
    
    public Magicien(String name, int hp, boolean confirme){
        super(name, hp, "Baton");
        Confirme = confirme;
        nb_magicien ++;
    }
    
    public void set_confirme(boolean confirme){
        Confirme = confirme;
    }
    
    @Override
    public void finalize() {
        if (super.nb_personnages > 0 && nb_magicien > 0){
            super.finalize();
            nb_magicien --;
        }else{
            System.out.println("Impossible de supprimer ce personnage");
        }
    }

}
