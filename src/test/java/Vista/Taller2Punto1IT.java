/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Vista;

import Modelo.Competencia;
import Modelo.Competidor;
import Modelo.Equipo;
import java.util.ArrayList;
import java.util.Collections;
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
public class Taller2Punto1IT {
    
     @Test
    public void testIntegracionCompleta() {
        
        Competencia competencia = new Competencia("Mundial de ciclismo");

        competencia.agregarEquipo("Leones", "Colombia");
        competencia.agregarEquipo("Jaguares", "Perú");

        assertEquals(2, competencia.getEquipos().size());

        // Obtener los equipos
        Equipo e1 = competencia.getEquipos().get(0);
        Equipo e2 = competencia.getEquipos().get(1);

        // Agregar competidores manualmente
        e1.getCompetidores().add(new Competidor("Juan", 23, "Colombia", 1.80, 75, 120));
        e1.getCompetidores().add(new Competidor("Laura", 20, "Colombia", 1.65, 60, 110));
        e2.getCompetidores().add(new Competidor("Carlos", 27, "México", 1.78, 70, 130));

        
        ArrayList<Competidor> competidoresGlobal = new ArrayList<>();
        for (Equipo eq : competencia.getEquipos()) {
            competidoresGlobal.addAll(eq.getCompetidores());
        }

        Collections.sort(competidoresGlobal, (a, b) -> b.getPuntos() - a.getPuntos());
        for (int i = 0; i < competidoresGlobal.size(); i++) {
            competidoresGlobal.get(i).setRankingMundial(i + 1);
        }

        assertEquals(2, competencia.getEquipos().size(), "La competencia debe tener 2 equipos");
        assertEquals(2, e1.getCompetidores().size(), "El primer equipo debe tener 2 competidores");
        assertEquals(1, e2.getCompetidores().size(), "El segundo equipo debe tener 1 competidor");

        assertEquals("Juan", e1.getCompetidores().get(0).getNombre());
        assertEquals("Carlos", e2.getCompetidores().get(0).getNombre());

        assertEquals("Carlos", competidoresGlobal.get(0).getNombre(), "El competidor con más puntos debe estar primero");
        assertEquals(1, competidoresGlobal.get(0).getRankingMundial(), "El primer lugar debe tener ranking 1");

        assertTrue(competidoresGlobal.get(0).getPuntos() >= competidoresGlobal.get(1).getPuntos());
    }
}
