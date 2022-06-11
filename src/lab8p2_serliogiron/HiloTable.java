/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_serliogiron;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class HiloTable extends Thread{
    JTable tabla;

    public HiloTable(JTable tabla) {
        this.tabla = tabla;
    }

    @Override
    public void run() {
        while (true) {
            
            int vida;
            DefaultTableModel modelo = new DefaultTableModel();
            modelo = (DefaultTableModel)tabla.getModel();
            int delay;
            int tiempo = 0;
            
            for (int i = 0; i < tabla.getRowCount(); i++) 
            {
                vida = (Integer)modelo.getValueAt(i, 3);
                delay = (Integer)modelo.getValueAt(i, 1);
                
                if (tiempo % delay == 0) {
                    vida = vida - 100;
                }
                
                modelo.setValueAt(vida, i, 3);
                tabla.setModel(modelo);
            }
            tiempo += 100;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }
    }
    
    

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }
    
    
}
