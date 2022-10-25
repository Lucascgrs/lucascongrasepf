/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1_convertisseur_congras_nom2;

import java.util.Scanner;

/**
 *
 * @author Lucas Congras
 * Creation 04/10/2022
 * TP1
 */
public class main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez une valeur : ");
        double t = sc.nextDouble();
        System.out.println("Vous avez choisi : " + t + "\n");
        
        byte mode = selectmode();
        String entry = "";
        String output = "";
        double res = 0;
        
        switch(mode){
            
            case 1:
                entry = "Celsius";
                output = "Kelvin";
                res = CelciusVersKelvin(t);
                break;
            case 2:
                entry = "Kelvin";
                output = "Celsius";
                res = KelvinVersCelcius(t);
                break;
            case 3:
                entry = "Farenheit";
                output = "Celsius";
                res = FarenheitVersCelcius(t);
                break;
            case 4:
                entry = "Celsius";
                output = "Farenheit";
                res = CelciusVersFarenheit(t);
                break;
            case 5:
                entry = "Kelvin";
                output = "Farenheit";
                res = KelvinVersFarenheit(t);
                break;
            case 6:
                entry = "Farenheit";
                output = "Kelvin";
                res = FarenheitVersKelvin(t);
                break;
            
        }
        
        System.out.println("La température de " + t + entry + "°C correspond à " + res + " " + output);
        
    }
    
    
    private static byte selectmode(){
        
        byte mode = 0;
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("Selectionnez la conversion de temperature souhaitee : \n"
                + "1 -> Celcius Vers Kelvin\n"
                + "2 -> Kelvin Vers Celcius\n"
                + "3 -> Farenheit Vers Celcius\n"
                + "4 -> Celcius Vers Farenheit\n"
                + "5 -> Kelvin Vers Farenheit\n"
                + "6 -> Farenheit Vers Kelvin\n");
        
        while(mode<1 | mode>6){
            
            mode = sc.nextByte();
            
        }
        
        return mode;
        
    }
    
    
    private static double CelciusVersKelvin(double celcius){
        
        double Kelvin = celcius + 273.15;
        
        return Kelvin;
        
    }
    
    
    private static double KelvinVersCelcius(double kelvin){

        double celcius = kelvin - 273.15;

        return celcius;
        
    }
    
    
    private static double FarenheitVersCelcius(double farenheit){

        double celcius = (farenheit - 32) / 1.8;

        return celcius;

    }


    private static double CelciusVersFarenheit(double celcius){

        double farenheit = (celcius * 1.8) + 32;

        return farenheit;
        
    }
    
    
    private static double KelvinVersFarenheit(double kelvin){

        double farenheit = CelciusVersFarenheit(KelvinVersCelcius(kelvin));

        return farenheit;
        
    }
    
    
    private static double FarenheitVersKelvin(double farenheit){

        double kelvin = CelciusVersKelvin(FarenheitVersCelcius(farenheit));

        return kelvin;
        
    }
    
}
