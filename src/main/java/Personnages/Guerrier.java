/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author lucas
 */
public class Guerrier extends Personnage{
    
    boolean Acheval;
    int nb_guerrier = 0;
    
    public Guerrier(String name, int hp, boolean acheval){
        super(name, hp, "Epée");
        Acheval = acheval;
        nb_guerrier ++;
    }
    
    
    public void set_acheval(boolean acheval){
        Acheval = acheval;
    }
    
    @Override
    public void finalize() {
        if (super.nb_personnages > 0 && nb_guerrier > 0){
            super.finalize();
            nb_guerrier --;
        }else{
            System.out.println("Impossible de supprimer ce personnage");
        }
    }
    
}
