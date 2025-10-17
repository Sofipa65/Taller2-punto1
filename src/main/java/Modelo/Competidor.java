/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Sofia
 */
public class Competidor {
    
    private String nombre;
    private int edad;
    private String pais;
    private int rankingMundial ;
    private double estatura;
    private double peso;
    private int puntos;

    public Competidor(String nombre, int edad, String pais, double estatura, double peso, int puntos) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
        this.estatura = estatura;
        this.peso = peso;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPais() {
        return pais;
    }

    public int getRankingMundial() {
        return rankingMundial;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setRankingMundial(int rankingMundial) {
        this.rankingMundial = rankingMundial;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
    public void actualizarRanking (int puntosObtenidos){
        
        this.puntos += puntosObtenidos;
    }

    @Override
    public String toString() {
        return """
               Competidores:
                -"""+ nombre + " |edad: " + edad + "|pais: " + pais + " |rankingMundial: " + rankingMundial + " |estatura:" + estatura + " |peso:" + peso + " |puntos:" + puntos;
    }
    
    
    
}
