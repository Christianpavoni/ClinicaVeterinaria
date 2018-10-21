/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.vistas;

import clinicaveterinaria.Modelo.Conexion;
import clinicaveterinaria.Modelo.Mascota;
import clinicaveterinaria.Modelo.MascotaData;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ListadoMascotaxTratamiento extends javax.swing.JInternalFrame {
    private MascotaData mascotaData;
    private Conexion conexion;
    /**
     * Creates new form ListadoMascotaxTratamiento
     */
    public ListadoMascotaxTratamiento() {
        initComponents();
        try {
        conexion = new Conexion("jdbc:mysql://localhost/clinicaveterinaria", "root", "");
        mascotaData = new MascotaData(conexion);
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ListadoTratamientosActivos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_LMXT = new javax.swing.JLabel();
        jl_LMXT_Tratamiento = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jsp_LMXT = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jb_buscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jl_LMXT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jl_LMXT.setText("LISTADO DE MASCOTA POR TRATAMIENTO");

        jl_LMXT_Tratamiento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jl_LMXT_Tratamiento.setText("TRATAMIENTOS");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VACUNACIÓN", "ENFERMEDAD", "CURACIONES", "BAÑO Y CORTE DE PELO", "CASTRACIÓN", "OTROS", " " }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Mascota", "Codigo", "Alias", "Sexo", "Especie", "Raza", "Color de pelo", "Fecha Nacimiento", "Peso actual", "Peso promedio"
            }
        ));
        jsp_LMXT.setViewportView(jTable1);

        jb_buscar.setText("Buscar");
        jb_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsp_LMXT)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_LMXT_Tratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(79, 79, 79)
                        .addComponent(jb_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addComponent(jl_LMXT, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jl_LMXT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_LMXT_Tratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_buscar))
                .addGap(18, 18, 18)
                .addComponent(jsp_LMXT, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarActionPerformed
        List<Mascota> mascotas = new ArrayList<>();
        //limpiar tabla
        for(int i=0;i<15;i++)
            for(int j=0;j<10;j++)
                jTable1.setValueAt("",i,j);
                 
            
               
        
            mascotas = mascotaData.MascotasPorTratamiento(jComboBox1.getSelectedIndex());

                if(!mascotas.isEmpty()){
                    
                    for(int i=0;i<mascotas.size();i++){

                        jTable1.setValueAt(mascotas.get(i).getId_mascota(), i, 0);
                        jTable1.setValueAt(mascotas.get(i).getCod_mascota(), i, 1);
                        jTable1.setValueAt(mascotas.get(i).getAlias(), i, 2);
                        jTable1.setValueAt(mascotas.get(i).getSexo(), i, 3);
                        jTable1.setValueAt(mascotas.get(i).getEspecie(), i, 4);
                        jTable1.setValueAt(mascotas.get(i).getRaza(), i, 5);
                        jTable1.setValueAt(mascotas.get(i).getColor_pelo(), i, 6);
                        jTable1.setValueAt(mascotas.get(i).getFecha_nac(), i, 7);
                        jTable1.setValueAt(mascotas.get(i).getPeso_actual(), i, 8);
                        jTable1.setValueAt(mascotas.get(i).getPeso_promedio(), i, 9);

                    }
                }
                else
                JOptionPane.showMessageDialog(null, "No hay mascotas con el tratamiento seleccionado.");
            
        

    }//GEN-LAST:event_jb_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JLabel jl_LMXT;
    private javax.swing.JLabel jl_LMXT_Tratamiento;
    private javax.swing.JScrollPane jsp_LMXT;
    // End of variables declaration//GEN-END:variables
}
