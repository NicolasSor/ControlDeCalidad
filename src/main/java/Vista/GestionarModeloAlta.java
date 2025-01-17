/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import MemoriaReglas.Empresa;
import Modelo.Color;
import Modelo.Modelo;
import Presentador.PresentadorGestionarModelos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.get;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author chris
 */
public class GestionarModeloAlta extends javax.swing.JFrame {
    private PresentadorGestionarModelos presentador;
    /**
     * Creates new form GestionarModeloAlta
     */
    public GestionarModeloAlta() {
        
        initComponents();
        InicializarTablas();
        presentador = new PresentadorGestionarModelos(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaColorEnMemoria = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaColorAgregado = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtDesc = new javax.swing.JTextField();
        jtObj = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        agregarColor = new javax.swing.JButton();
        altaModelo = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        revertir = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaColorEnMemoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaColorEnMemoria);

        tablaColorAgregado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaColorAgregado);

        jLabel1.setText("Descripcion:");

        jLabel2.setText("Objetivo:");

        jLabel3.setText("Alta modelo");

        agregarColor.setText("Agregar Color");
        agregarColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarColorActionPerformed(evt);
            }
        });

        altaModelo.setText("Alta modelo");
        altaModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaModeloActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        revertir.setText("Revertir");
        revertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(altaModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar))
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31)
                                .addComponent(jtObj, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(agregarColor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(revertir)
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtObj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarColor)
                    .addComponent(revertir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altaModelo)
                    .addComponent(cancelar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarColorActionPerformed
            if (tablaColorEnMemoria.getSelectedRow() <=-1)
            mostrarMensajeErrorFila();
        else
            {
            //Agrego a tabla Agregado
            DefaultTableModel tablaAg = (DefaultTableModel) tablaColorAgregado.getModel();
            Object[] o = new Object[2];
            o[0] = tablaColorEnMemoria.getValueAt(tablaColorEnMemoria.getSelectedRow(), 0);
            o[1] = tablaColorEnMemoria.getValueAt(tablaColorEnMemoria.getSelectedRow(), 1);
            tablaAg.addRow(o);
                
            
            
            //Remuevo Objeto de Tabla en memoria
            DefaultTableModel tablaMem = (DefaultTableModel) tablaColorEnMemoria.getModel();
            tablaMem.removeRow(tablaColorEnMemoria.getSelectedRow());
            

            }             // TODO add your handling code here:
    }//GEN-LAST:event_agregarColorActionPerformed

    private void revertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revertirActionPerformed
        
   if (tablaColorAgregado.getSelectedRow() <=-1)
            mostrarMensajeErrorFila();
        else
            {
            
            //Agrego a tabla en memoria
            DefaultTableModel tablaMem = (DefaultTableModel) tablaColorEnMemoria.getModel();
            Object[] o = new Object[2];
            o[0] = tablaColorAgregado.getValueAt(tablaColorAgregado.getSelectedRow(), 0);
            o[1] = tablaColorAgregado.getValueAt(tablaColorAgregado.getSelectedRow(), 1);
            tablaMem.addRow(o);
            
            
            
            //Remuevo Objeto de tabla agregado
            DefaultTableModel tablaAg = (DefaultTableModel) tablaColorAgregado.getModel();
            tablaAg.removeRow(tablaColorAgregado.getSelectedRow());
            

    }//GEN-LAST:event_revertirActionPerformed
    }
    
    private void altaModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaModeloActionPerformed
        int sku = 0;
        ArrayList<Color> col = new ArrayList<Color>();
        int cantF = tablaColorAgregado.getRowCount();
        int cantC = tablaColorAgregado.getColumnCount();
        Object[] o = new Object[2];
        for (int r = 0; r < cantF; r++) 
        {
            
            for (int c = 0; c < cantC ; c++)
            {
              o[c] = tablaColorAgregado.getValueAt(r, c);
            }
            Color color = new Color((int) o[0], (String) o[1]);
            col.add(color);
        {
        Modelo mod = new Modelo(sku, jtDesc.getText(),Integer.parseInt(jtObj.getText()) , col);
        
        presentador.agregarModelo(mod);
        }
    }
        
    }//GEN-LAST:event_altaModeloActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
    this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarColor;
    private javax.swing.JButton altaModelo;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jtDesc;
    private javax.swing.JTextField jtObj;
    private javax.swing.JButton revertir;
    private javax.swing.JTable tablaColorAgregado;
    private javax.swing.JTable tablaColorEnMemoria;
    // End of variables declaration//GEN-END:variables

    
    private void InicializarTablas() 
    {
        DefaultTableModel matriz1= new DefaultTableModel();   
        DefaultTableModel matriz2= new DefaultTableModel();
        matriz1.addColumn("Codigo");
        matriz1.addColumn("Descripcion");
        matriz2.addColumn("Codigo");
        matriz2.addColumn("Descripcion");
        tablaColorAgregado.setModel(matriz2);
        for(Color c : Empresa.getCol()){
            Object []f = new Object[2];
            f[0]= c.getCodigoCol();
            f[1]= c.getDescripcionCol();
            matriz1.addRow(f);
        }
        tablaColorEnMemoria.setModel(matriz1);
    }
    public void mostrarMensajeAlta() {
        JOptionPane.showMessageDialog(this, "Modelo agregado exitosamente","Exito",JOptionPane.INFORMATION_MESSAGE);
        jtDesc.setText("");
        jtObj.setText("");        
    }
           
           
    public void mostrarMensajeErrorFila() {
         JOptionPane.showMessageDialog(this, "Por favor seleccionar fila en tabla","Error",JOptionPane.ERROR_MESSAGE);
    }
}
