/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import Modelo.Competencia;
import Modelo.Equipo;
import Modelo.Competidor;

/**
 *
 * @author Sofia
 */
public class Taller2Punto1 {

    public static void main(String[] args) {
        
        String nombreEvento= JOptionPane.showInputDialog("Ingrese el nombre del evento: ");
                Competencia competencia= new Competencia(nombreEvento);
        
        int opcion;
        do{ 
        opcion= Integer.parseInt(JOptionPane.showInputDialog("""
                                                             Menu  
                                                             1. Añadir equipo 
                                                             2. Añadir competidor
                                                             3. Actualizar puntajes
                                                             4. Mostrar resumen de evento
                                                             5. Mostrar Ranking de competidores
                                                             6. Salir
                                                             Elija una opción: """)); 
        switch (opcion){
            case 1 -> {
                String nombreEquipo= JOptionPane.showInputDialog("Ingrese el nombre del equipo: ");
                String pais= JOptionPane.showInputDialog("Ingrese el País del equipo: ");
                
                competencia.agregarEquipo(nombreEquipo,pais);
            }
            case 2 -> {
                String equipoBuscado= JOptionPane.showInputDialog("Ingrese el nombre del equipo al que desea añadir competidores: ");
                
                for (Equipo e : competencia.getEquipos()){
                    
                    if (e.getNombreEquipo().equalsIgnoreCase(equipoBuscado)){
                        
                        String pais= e.getPais();
                        e.agregarCompetidor(pais);
                        JOptionPane.showMessageDialog(null, "Competidor agregado correctamente");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Equipo no encontrado");    
            }
            case 3 -> {
                
                String equipoBuscado= JOptionPane.showInputDialog("Ingrese el nombre del equipo al que desea actualizar: ");
                
                for (Equipo e : competencia.getEquipos()){
                    
                    if (e.getNombreEquipo().equalsIgnoreCase(equipoBuscado)){
                        
                        String competidorBuscado= JOptionPane.showInputDialog("Ingrese el nombre del competidor al cuál desea actualizarle el puntaje: ");   
                        
                        for (Competidor c : e.getCompetidores()){
                            
                            if (c.getNombre().equalsIgnoreCase(competidorBuscado)) {
                                
                                int puntosObtenidos= Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntos obtenidos por el competidor: "));
                                c.actualizarRanking(puntosObtenidos);
                            }
                            
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, "Equipo no encontrado");
            }
            case 4 -> {
                
            }
            
            case 5 -> {
                
                organizarRanking(competencia);
                    
                }   
            case 6 -> { 
                JOptionPane.showMessageDialog(null, "Saliendo del sistema");
            }
            default -> JOptionPane.showMessageDialog(null, "Opción inválida");
        }        
        }while(opcion !=6);
        
    }
   
    public static void organizarRanking(Competencia competencia){
        
        ArrayList<Competidor> competidoresGlobal = new ArrayList<>();
        
        for (Equipo e : competencia.getEquipos()) {
            
            competidoresGlobal.addAll(e.getCompetidores());
        }
        
        Collections.sort(competidoresGlobal, (a, b) -> b.getPuntos() - a.getPuntos());
        
        for (int i = 0; i < competidoresGlobal.size(); i++) {
            competidoresGlobal.get(i).setRankingMundial(i + 1);
        }  
    }
    
}
