/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_serliogiron;

/**
 *
 * @author usuario
 */
public class Item {
//    ítems, estos tendrán un id (único Autonumérico), nombre, si es alimento o no, 
//probabilidad de obtención, precio/costo de venta.
    
    int id;
    String nombre;
    boolean alimento;
    double obtencion;
    double precio;

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

    public boolean isAlimento() {
        return alimento;
    }

    public void setAlimento(boolean alimento) {
        this.alimento = alimento;
    }

    public double getObtencion() {
        return obtencion;
    }

    public void setObtencion(double obtencion) {
        this.obtencion = obtencion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
