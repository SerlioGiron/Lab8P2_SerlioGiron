/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_serliogiron;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class HiloBarra extends Thread{
    JProgressBar barra;
    boolean corre;
    String nombremascota;
    JTable tabla;

    public HiloBarra(JProgressBar barra, String nombremascota, JTable tabla) {
        this.barra = barra;
        corre = true;
        this.nombremascota = nombremascota;
        this.tabla = tabla;
    }

    
    
    @Override
    public void run() {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel)tabla.getModel();
        String nombre;
        
        
        for (int i = 0; i < tabla.getRowCount(); i++) {
            nombre = (String)modelo.getValueAt(i, 0);
            
            if (nombre.equals(nombremascota)) {
                
                barra.setMaximum((Integer)modelo.getValueAt(i, 3));
                barra.setValue((Integer)modelo.getValueAt(i, 3));
                barra.setBackground((Color)modelo.getValueAt(i, 4));
                
                while (corre) {
                    barra.setValue((Integer)modelo.getValueAt(i, 3));
                    if (barra.getValue() <= 0) {
                        corre = false;
                    }
                    
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        
                    }
                }
            }
        }
        
        
        
    }

    public boolean isCorre() {
        return corre;
    }

    public void setCorre(boolean corre) {
        this.corre = corre;
    }
    
    

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    
}
