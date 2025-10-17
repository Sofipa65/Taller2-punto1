/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

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
public class CompetidorTest {
    
    @Test
    public void testActualizarRanking() {
        
        Competidor c = new Competidor("Carlos Ruiz", 30, "México", 1.75, 70, 10);

        c.actualizarRanking(50);

        assertEquals(60, c.getPuntos());
}

    
}
