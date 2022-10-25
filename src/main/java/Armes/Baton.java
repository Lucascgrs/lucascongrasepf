/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author lucas
 */
public class Baton extends Arme{
    
    int Age;
    
    public Baton(String name, int pc, int age){
        super(name, pc);
        Age = age;
    }
    
    public int get_age(){
        return Age;
    }

}
