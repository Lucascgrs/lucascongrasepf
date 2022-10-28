/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_convertisseurobjet_congras_nom2;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Convertisseur {
    
    int nbConversions;
    
    public Convertisseur(){
        nbConversions = 0;
    }
    
    @Override
    public String toString(){       //redéfinition de la méthode toString
        return "nombre de conversions : "+ nbConversions;
    }
    
    
    public double CelciusVersKelvin(double celcius){        //toute les méthodes de conversions déjà vues dans le tp1
        
        double Kelvin = celcius + 273.15;
        
        return Kelvin;
        
    }
    
    
    public double KelvinVersCelcius(double kelvin){

        double celcius = kelvin - 273.15;

        return celcius;
        
    }
    
    
    public double FarenheitVersCelcius(double farenheit){

        double celcius = (farenheit - 32) / 1.8;

        return celcius;

    }


    public double CelciusVersFarenheit(double celcius){

        double farenheit = (celcius * 1.8) + 32;

        return farenheit;
        
    }
    
    
    public double KelvinVersFarenheit(double kelvin){

        double farenheit = CelciusVersFarenheit(KelvinVersCelcius(kelvin));

        return farenheit;
        
    }
    
    
    public double FarenheitVersKelvin(double farenheit){

        double kelvin = CelciusVersKelvin(FarenheitVersCelcius(farenheit));

        return kelvin;
        
    }
    
    
    public byte selectmode(){       //méthode qui affiche toute les possiblilités de conversions possibles et retourne  le choix de la conversion (ou -300 pour stop)
        
        byte mode = 0;
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("Selectionnez la conversion de temperature souhaitee : \n"
                + "0 -> STOP\n"
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
    
    
    public double convert(){        // Fait la convertion
        
        byte mode = selectmode();   // demande à l'utilisateur quel mode de conversion veut il faire
        
        Scanner sc = new Scanner(System.in);    // la température à convertir
        System.out.println("Saisissez une valeur : ");
        double t = sc.nextDouble();
        System.out.println("Vous avez choisi : " + t + "\n");
        
        String entry = "";
        String output = "";
        double res = 0;
        
        switch(mode){   //pour chaque mode de conversion, on a une phrase spécifique qui va être construie ainsi qu'une méthode spécifique qui va être utilisée
            
            case 0:
                return -300;
            
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
        nbConversions ++;
        return res;     //on retourne le résultat
        //System.out.println("La température de " + t + entry + " correspond à " + res + " " + output);
        
    }
    
}