/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_serliogiron;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Jugador {
    // lista de ítems, lista de mascotas, dinero y dinero en el banco.
    
    ArrayList <Item> items = new ArrayList();
    ArrayList <Mascota> mascotas = new ArrayList();
    double dinero;
    double banco;

    public Jugador() {
    }
    
    

    public Jugador(double dinero, double banco) {
        this.dinero = dinero;
        this.banco = banco;
    }
    
    

    @Override
    public String toString() {
        return "Jugador{" + "items=" + items + ", mascotas=" + mascotas + ", dinero=" + dinero + ", banco=" + banco + '}';
    }
    
    

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public double getBanco() {
        return banco;
    }

    public void setBanco(double banco) {
        this.banco = banco;
    }
    
    
}
