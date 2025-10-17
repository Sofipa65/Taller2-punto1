/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sofia
 */
public class CompetenciaTest {
    
    @Test
    public void testAgregarEquipoYVerificarDatos() {
        
        Competencia competencia = new Competencia("Mundial de ciclismo");

        competencia.agregarEquipo("Jaguares", "Colombia");
        
        assertEquals(1, competencia.getEquipos().size());

        Equipo equipoAgregado = competencia.getEquipos().get(0);

        assertEquals("Jaguares", equipoAgregado.getNombreEquipo());
        assertEquals("Colombia", equipoAgregado.getPais());
    
   }
}
