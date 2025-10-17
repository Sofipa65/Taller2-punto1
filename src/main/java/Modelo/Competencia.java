/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sofia
 */
public class Competencia {
    
    private String nombreEvento;
    ArrayList<Equipo> equipos= new ArrayList<>();

    public Competencia(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }
    
    
     public void agregarEquipo(String nombreEquipo, String pais){
         
         Equipo equipo= new Equipo(nombreEquipo, pais);
         
         equipos.add(equipo);
         
         JOptionPane.showMessageDialog(null, "equipo agregado correctamente");
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }
     
    
    
}
