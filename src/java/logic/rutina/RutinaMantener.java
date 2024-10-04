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
public class RutinaMantener implements RutinaIn{
    
    @Override
    public String hacerRutinaL(){
        
        StringBuilder rutina = new StringBuilder();
        
        String[] ejercicios = {"Press de banca (3-10)", 
                               "Remo con mancuernas (3-10)", 
                               "Aperturas con mancuernas (3-12)", 
                               "Fondos en paralelas (3-10)", 
                               "Curl de bíceps (3-12)"};
        
        for (String ejercicio : ejercicios) {
            rutina.append(ejercicio).append("<br><br>");
        }
        
        return rutina.toString();
    }
    
    @Override
    public String hacerRutinaM(){
        
        StringBuilder rutina = new StringBuilder();
        
        String[] ejercicios = {"Correr en la cinta o al aire libre (20-30 min a ritmo moderado)", 
                                "Plancha (3-30 seg)", 
                                "Elevaciones de piernas (3-12)", 
                                "Abdominales bicicleta (3-15)", 
                                "Mountain climbers (3 x 30 seg)" };

        for (String ejercicio : ejercicios) {
            rutina.append(ejercicio).append("<br><br>");
        }
        return rutina.toString();
    }
    
    @Override
    public String hacerRutinaW(){
        
        StringBuilder rutina = new StringBuilder();
        
        String[] ejercicios = {"Sentadillas (3-12)", 
                               "Zancadas alternas (3-10 por pierna)", 
                               "Peso muerto con piernas rígidas (3-10)", 
                               "Elevaciones de talones (3-15)", 
                               "Puente de glúteos (3-12)"};
        
        for (String ejercicio : ejercicios) {
            rutina.append(ejercicio).append("<br><br>");
        }
        return rutina.toString();
    }
    
    @Override
    public String hacerRutinaJ(){
        
        StringBuilder rutina = new StringBuilder();
        
        String[] ejercicios = {"Sentadillas (3-12)", 
                               "Zancadas alternas (3-10 por pierna)", 
                               "Peso muerto con piernas rígidas (3-10)", 
                               "Elevaciones de talones (3-15)", 
                               "Puente de glúteos (3-12)"};
        
        for (String ejercicio : ejercicios) {
            rutina.append(ejercicio).append("<br><br>");
        }
        return rutina.toString();
    }
    
    @Override
    public String hacerRutinaV(){
        
        StringBuilder rutina = new StringBuilder();
        
        String[] ejercicios = {
            "Caminata rápida o bicicleta (30-45 min a ritmo moderado)", 
            "Estiramientos (10-15 min)", 
            "Ejercicios de movilidad articular (5-10 min)"
        };

        for (String ejercicio : ejercicios) {
            rutina.append(ejercicio).append("<br><br>");
        }
        return rutina.toString();
    }
    
    @Override
    public String hacerRutinaS(){
        
        StringBuilder rutina = new StringBuilder();
        
        String[] ejercicios = {"Circuito (repetir 3 veces):", 
                               "   - Flexiones de brazos (10-12)", 
                               "   - Sentadillas (12-15)", 
                               "   - Abdominales (15)", 
                               "   - Saltos en cuclillas (10)", 
                               "   - Plancha lateral (30 seg por lado)"};
        
        for (String ejercicio : ejercicios) {
            rutina.append(ejercicio).append("<br><br>");
        }
        return rutina.toString();
    }
}
