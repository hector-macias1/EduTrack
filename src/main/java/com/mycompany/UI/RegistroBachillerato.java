/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.UI;

import com.mycompany.Entity.AlumnoPreparatoria;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hecta
 */
public class RegistroBachillerato extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<AlumnoPreparatoria> listaAlumnos = new ArrayList<>();

    /**
     * Creates new form RegistroBachillerato
     */
    public RegistroBachillerato() {
        initComponents();
        this.setTitle("EduTrack");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nivel");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Promedio");
        readFile();
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NombreAlumno = new javax.swing.JTextField();
        DireccionAlumno = new javax.swing.JTextField();
        EdadAlumno = new javax.swing.JSpinner();
        cboGrade = new javax.swing.JSpinner();
        Especialidad = new javax.swing.JComboBox<>();
        Agregar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        Ordenamiento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Edad");

        jLabel3.setText("Dirección");

        jLabel4.setText("Especialidad");

        jLabel5.setText("Promedio");

        Especialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informática", "Traducción", "Ciencias" }));

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaAlumnos);

        jLabel6.setText("Ordenar por");

        Ordenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Aprobacion", "Especialidad" }));
        Ordenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenamientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NombreAlumno)
                                        .addComponent(DireccionAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                        .addComponent(EdadAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Agregar)
                        .addGap(44, 44, 44)
                        .addComponent(Borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(Ordenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(EdadAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DireccionAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar)
                    .addComponent(Borrar)
                    .addComponent(jLabel6)
                    .addComponent(Ordenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
        try {
            AlumnoPreparatoria alumno = new AlumnoPreparatoria();
            alumno.setName(NombreAlumno.getText());
            alumno.setAge(Integer.parseInt(EdadAlumno.getValue().toString()));
            alumno.setAddress(DireccionAlumno.getText());
            alumno.setStage("Secundaria");
            alumno.setEspecialidad(Especialidad.getSelectedItem().toString());
            alumno.setGrade(Double.parseDouble(cboGrade.getValue().toString()));
            listaAlumnos.add(alumno);
            refreshTable();
            
            // Escribir archivo
            try (FileOutputStream f = new FileOutputStream("myObjects3.txt");
            ObjectOutputStream o = new ObjectOutputStream(f);){
                o.writeObject(listaAlumnos);
                o.close();
                f.close();
                
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                throw new RuntimeException(e);
            } catch (IOException ioe) {
                System.out.println("Error while writing");
            }           
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        // TODO add your handling code here:
        NombreAlumno.setText("");
        EdadAlumno.setValue(5);
        DireccionAlumno.setText("");
        cboGrade.setValue(0);
        listaAlumnos.remove(listaAlumnos.size() - 1);
        refreshTable();
        
        // Escribir archivo
        try {
            FileOutputStream f = new FileOutputStream(new File("myObjects3.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
                        
            o.writeObject(listaAlumnos);
            o.close();
            f.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"cannot write");
        }
    }//GEN-LAST:event_BorrarActionPerformed

    private void OrdenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenamientoActionPerformed
        // TODO add your handling code here:
        if("Aprobacion".equals(Ordenamiento.getSelectedItem().toString())) {
            // Expresion lambda para ordenar el arraylist por calificacion
            Collections.sort(listaAlumnos, (a1, a2) -> Double.compare(a2.getGrade(), a1.getGrade()));
        } else if ("Taller".equals(Ordenamiento.getSelectedItem().toString())) {
            // Expresion lambda para ordenar por orden alfabetico el arraylist
            Collections.sort(listaAlumnos, (a1, a2) -> a1.getEspecialidad().compareTo(a2.getEspecialidad()));
        } else {
            // Expresion lambda para ordenar por orden alfabetico el arraylist
            Collections.sort(listaAlumnos, (a1, a2) -> a1.getName().compareTo(a2.getName()));
        }
        refreshTable();
    }//GEN-LAST:event_OrdenamientoActionPerformed

    /**
     * Refrescar Tabla
     */
    public void refreshTable() {
        // Borrar todos los elementos del modelo
        while (modelo.getRowCount()> 0) {            
            modelo.removeRow(0);
        }
        
        for (AlumnoPreparatoria alumno : listaAlumnos) {
            Object a[] = new Object[5];
            a[0] = alumno.getName();
            a[1] = alumno.getAge();
            a[2] = alumno.getStage();
            a[3] = alumno.getEspecialidad();
            a[4] = alumno.getGrade();
            modelo.addRow(a);
        }
        tablaAlumnos.setModel(modelo);
    }
    
    /**
     * Leer archivo
     */
    public void readFile() {
        try (FileInputStream fi = new FileInputStream(new File("myObjects3.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);){
            
            listaAlumnos = (ArrayList) oi.readObject();
            oi.close();
            fi.close();
            
            for(AlumnoPreparatoria alumno : listaAlumnos) {
                System.out.println(alumno);
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
        
        //refreshTable();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroBachillerato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroBachillerato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroBachillerato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroBachillerato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroBachillerato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Borrar;
    private javax.swing.JTextField DireccionAlumno;
    private javax.swing.JSpinner EdadAlumno;
    private javax.swing.JComboBox<String> Especialidad;
    private javax.swing.JTextField NombreAlumno;
    private javax.swing.JComboBox<String> Ordenamiento;
    private javax.swing.JSpinner cboGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAlumnos;
    // End of variables declaration//GEN-END:variables
}