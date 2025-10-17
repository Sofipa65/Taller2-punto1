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
public class Equipo {
    
    private String nombreEquipo;
    private String pais;
    ArrayList<Competidor> competidores= new ArrayList<>();

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getPais() {
        return pais;
    }

    public ArrayList<Competidor> getCompetidores() {
        return competidores;
    }
    
    public void agregarCompetidor(String pais){
        
        String nombre= JOptionPane.showInputDialog("Ingrese el nombre del competidor: ");
        int edad= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del competidor: "));
        double estatura= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura del competidor: "));
        double peso= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del competidor: "));
        int puntos= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el puntaje actual del competidor: "));
        
        Competidor competidor= new Competidor(nombre, edad, pais, estatura, peso, puntos);
        competidores.add(competidor);    
    }

    @Override
    public String toString() {
        return "Equipo: " + nombreEquipo + "  | Pais: " + pais + "  | Cantidad competidores: " + competidores.size() + "\n";
    }
    
    
    
}
