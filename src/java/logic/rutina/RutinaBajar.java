/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic.rutina;
import java.util.Random;

/**
 *
 * @author laver
 */
public class RutinaBajar implements RutinaIn{
    
    
    @Override
    public String hacerRutinaL(){
        
        StringBuilder rutina = new StringBuilder();
        
    
        String[] ejercicios = {"Saltos de tijera(5-10 min)", 
                               "Flexiones de brazos (3-15)", 
                               "Remo con mancuernas (3-15)", 
                               "Elevaciones laterales (3-15)", 
                               "Plancha (3-60 seg)"};
        
        for (String ejercicio : ejercicios) {
            
            rutina.append(ejercicio).append("<br><br>");
        }
        
        return rutina.toString();
    }
    
    @Override
    public String hacerRutinaM(){
        
        StringBuilder rutina = new StringBuilder();
        
        String[] ejercicios = {"Saltos de cuerda (5-10 min)", 
                               "Sentadillas (3-15)", 
                               "Zancadas alternas (3-12 por pierna)", 
                               "Puente de glúteos (3-15)", 
                               "Elevaciones de talones (3-15)"};
        
        for (String ejercicio : ejercicios) {
            rutina.append(ejercicio).append("<br><br>");
        }
        return rutina.toString();
    }
    
    @Override
    public String hacerRutinaW(){
        
        StringBuilder rutina = new StringBuilder();

        String[] ejercicios = {"Trote ligero (5-10 min)", 
                               "Burpees (4 x 30 seg)", 
                               "Mountain climbers (4 x 30 seg)", 
                               "Sprints en el lugar (4 x 30 seg)", 
                               "Abdominales bicicleta (3-15)"};
        
        for (String ejercicio : ejercicios) {
            rutina.append(ejercicio).append("<br><br>");
        }
        return rutina.toString();
    }
    
    @Override
    public String hacerRutinaJ(){
        
        StringBuilder rutina = new StringBuilder();
        
        String[] ejercicios = {"Caminata rápida (5-10 min)", 
                               "Press de banca (3-12)", 
                               "Peso muerto con mancuernas (3-12)", 
                               "Plancha lateral (3-30 seg)", 
                               "Saltos en cuclillas (3-15)"};
        
        for (String ejercicio : ejercicios) {
            rutina.append(ejercicio).append("<br><br>");
        }
        return rutina.toString();
    }
    
    @Override
    public String hacerRutinaV(){
        
        StringBuilder rutina = new StringBuilder();
        
        String[] ejercicios = {
            "Correr o andar en bicicleta (30-45 min)", 
            "Estiramientos (10-15 min)"
        };
        
        for (String ejercicio : ejercicios) {
            rutina.append(ejercicio).append("<br><br>");
        }
        return rutina.toString();
    }
    
    @Override
    public String hacerRutinaS(){
        
        StringBuilder rutina = new StringBuilder();
        
        String[] ejercicios = {"Movimientos articulares (5-10 min)", 
                               "Flexiones de brazos (3-15)", 
                               "Sentadillas (3-15)", 
                               "Saltos de tijera (30 seg)", 
                               "Remo con mancuernas (3-12)", 
                               "Abdominales (3-15)"};
        
        for (String ejercicio : ejercicios) {
            rutina.append(ejercicio).append("<br><br>");
        }
        return rutina.toString();
    }
}
