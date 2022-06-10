/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_serliogiron;

import java.awt.Color;

/**
 *
 * @author usuario
 */
public class Mascota {
    //nombre único, pts vida (múltiplo de 200), delay
    //(múltiplo de 100 milisegundos), costo y color.
    
    String nombre;
    int vida;
    int delay;
    double costo;
    Color color;

    public Mascota() {
    }
    
    

    public Mascota(String nombre, int vida, int delay, double costo, Color color) {
        this.nombre = nombre;
        this.vida = vida;
        this.delay = delay;
        this.costo = costo;
        this.color = color;
    }
    
    

    @Override
    public String toString() {
        return nombre;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
}
