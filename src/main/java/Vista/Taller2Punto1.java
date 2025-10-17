/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;

import javax.swing.JOptionPane;
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
                                                             3. Mostrar resumen de evento
                                                             4. Mostrar Ranking de competidores
                                                             5. Salir
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
            case 3 -> 
            case 4 -> 
            case 5 -> { 
                JOptionPane.showMessageDialog(null, "Saliendo del sistema");
            }
            default -> JOptionPane.showMessageDialog(null, "Opción inválida");
        }        
        }while(opcion !=5);
        
    }
    
    
}
