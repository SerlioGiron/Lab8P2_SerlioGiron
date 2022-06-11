/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_serliogiron;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author usuario
 */
public class Zona {
//     id zona (Autonumérico y único), nombre, lista de ítems disponible para 
    //el numero de zona, remuneración (aleatorio: id Zona*100-idZona*300), probabilidad de derrumbe 
    //(en caso de minar) o probabilidad de ser atacado por un megalodon (en caso de pescar).
    static Random random = new Random();
    
    int id;
    String nombre;
    ArrayList <Item> items = new ArrayList();
    int remuneracion;
    double derrumbe;//en caso de minar)
    double atacado;//megalodon

    public Zona() {
    }
    
    

    public Zona(int id, String nombre, double derrumbe, double atacado) {
        this.id = id;
        this.nombre = nombre;
        this.derrumbe = derrumbe;
        this.atacado = atacado;
        this.remuneracion = (id*100)+random.nextInt(id*300);
    }
    
    

    @Override
    public String toString() {
        return nombre;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public int getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(int remuneracion) {
        this.remuneracion = remuneracion;
    }

    public double getDerrumbe() {
        return derrumbe;
    }

    public void setDerrumbe(double derrumbe) {
        this.derrumbe = derrumbe;
    }

    public double getAtacado() {
        return atacado;
    }

    public void setAtacado(double atacado) {
        this.atacado = atacado;
    }
    
    
}
