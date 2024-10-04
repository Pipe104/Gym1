/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic.rutina;

import logic.rutina.RutinaIn;

/**
 *
 * @author laver
 */
public class RutinaSubir implements RutinaIn{

    
    @Override
    public String hacerRutinaL(){
        
        StringBuilder rutina = new StringBuilder();
        
        String[] ejercicios = {"Press banca(4-10)", 
                               "Press inclinado con mancuernas(4-10)",
                                "Aperturas con mancuernas(3-12)", 
                                "Fondos en paralelas(3-8)", 
                                "Extensiones de tríceps en polea(3-12)"};
        
        for (String ejercicio : ejercicios) {
            rutina.append(ejercicio).append("<br><br>");
        }
        
        return rutina.toString();
    }
    
    @Override
    public String hacerRutinaM(){
        
        StringBuilder rutina = new StringBuilder();
        
        String[] ejercicios = {"Dominadas(4-8)", 
                               "Remo con barra(4-10)",
                               "Remo en maquina(3-10)", 
                               "Pull over con mancuernas(3-12)",
                               "Curl con barra(4-8)"};
        
        for (String ejercicio : ejercicios) {
            rutina.append(ejercicio).append("<br><br>");
        }
        return rutina.toString();
    }
    
    @Override
    public String hacerRutinaW(){
        
        StringBuilder rutina = new StringBuilder();
        
        String[] ejercicios = {"Sentadillas con barra(4-10)", 
                               "Prensa de pierna(4-12)", 
                               "Peso muerto rumano(4-10)", 
                               "Zancadas(3-12 por pierna)", 
                               "Extensión de piernas en máquina(3-12)"};
        
        for (String ejercicio : ejercicios) {
            rutina.append(ejercicio).append("<br><br>");
        }
        return rutina.toString();
    }
    
    @Override
    public String hacerRutinaJ(){
        
        StringBuilder rutina = new StringBuilder();
        
        String[] ejercicios = {"Press militar con barra(4-10)", 
                               "Press con mancuernas sentado(4-10)", 
                               "Elevaciones laterales(3-12)", 
                               "Elevaciones frontales con mancuernas(3-12)", 
                               "Encogimientos de hombros con barra(4-12)"};
        
        for (String ejercicio : ejercicios) {
            rutina.append(ejercicio).append("<br><br>");
        }
        return rutina.toString();
    }
    
    @Override
    public String hacerRutinaV(){
        
        StringBuilder rutina = new StringBuilder();
        
        String[] ejercicios = {"Peso muerto convencional(4-8)", 
                               "Sentadilla frontal(4-10)", 
                               "Sentadilla búlgara con mancuernas(3-12 por pierna)", 
                               "Levantamiento de talones en máquina(4-15)", 
                               "Hip thrust(elevación de cadera)(4-10)"};
        
        for (String ejercicio : ejercicios) {
            rutina.append(ejercicio).append("<br><br>");
        }
        return rutina.toString();
    }
    
    @Override
    public String hacerRutinaS(){
        
        StringBuilder rutina = new StringBuilder();
        
        String[] ejercicios = {"Burpees(3-15)", 
                               "Flexiones de pecho(3-15)", 
                               "Dominadas(3-8)", 
                               "Planchas(3 series de 1 minuto)", 
                               "Ab wheel(3-12)"};
        
        for (String ejercicio : ejercicios) {
            rutina.append(ejercicio).append("<br><br>");
        }
        return rutina.toString();
    }
}
