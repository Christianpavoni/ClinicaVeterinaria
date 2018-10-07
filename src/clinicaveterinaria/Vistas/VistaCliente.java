/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.vistas;

import clinicaveterinaria.Modelo.Cliente;
import clinicaveterinaria.Modelo.ClienteData;
import clinicaveterinaria.Modelo.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elinote
 */
public class VistaCliente extends javax.swing.JInternalFrame {
 private ClienteData clienteData;
 private Conexion conexion;
    /**
     * Creates new form Cliente
     */
    public VistaCliente() {
        initComponents();
          try {
        conexion = new Conexion("jdbc:mysql://localhost/clinicaveterinaria", "root", "");
        clienteData = new ClienteData(conexion);
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaCliente.class.getName()).log(Level.SEVERE, null, ex);
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

        jp_cliente = new javax.swing.JPanel();
        jt_idCliente = new javax.swing.JTextField();
        jl_id = new javax.swing.JLabel();
        jt_dni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jt_apellido = new javax.swing.JTextField();
        jl_nombre = new javax.swing.JLabel();
        jt_nombre = new javax.swing.JTextField();
        jl_direccion = new javax.swing.JLabel();
        jt_direccion = new javax.swing.JTextField();
        jl_telefono = new javax.swing.JLabel();
        jt_telefono = new javax.swing.JTextField();
        jl_personaAlt = new javax.swing.JLabel();
        jt_personaAlternativa = new javax.swing.JTextField();
        jl_dni = new javax.swing.JLabel();
        jb_guardarCliente = new javax.swing.JButton();
        jb_cancelarCliente = new javax.swing.JButton();
        jb_limpiarCliente = new javax.swing.JButton();
        jb_buscarCliente = new javax.swing.JButton();
        jb_borrarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jp_cliente.setBackground(new java.awt.Color(255, 255, 255));
        jp_cliente.setName(""); // NOI18N

        jl_id.setText("ID");

        jt_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_dniActionPerformed(evt);
            }
        });

        jLabel1.setText("APELLIDO");

        jl_nombre.setText("NOMBRE");

        jl_direccion.setText("DIRECCION");

        jl_telefono.setText("TELEFONO");

        jl_personaAlt.setText("PERSONA ALTERNATIVA");

        jl_dni.setText("DNI");

        javax.swing.GroupLayout jp_clienteLayout = new javax.swing.GroupLayout(jp_cliente);
        jp_cliente.setLayout(jp_clienteLayout);
        jp_clienteLayout.setHorizontalGroup(
            jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_clienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jl_nombre)
                    .addComponent(jl_direccion)
                    .addComponent(jl_telefono)
                    .addComponent(jl_personaAlt)
                    .addComponent(jl_dni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jt_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_apellido)
                    .addComponent(jt_dni, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jt_nombre)
                    .addComponent(jt_direccion)
                    .addComponent(jt_telefono)
                    .addComponent(jt_personaAlternativa, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_clienteLayout.setVerticalGroup(
            jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_clienteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_dni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_direccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_personaAlternativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_personaAlt))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jb_guardarCliente.setText("Guardar");
        jb_guardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarClienteActionPerformed(evt);
            }
        });

        jb_cancelarCliente.setText("Cancelar");
        jb_cancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarClienteActionPerformed(evt);
            }
        });

        jb_limpiarCliente.setText("Limpiar");
        jb_limpiarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_limpiarClienteActionPerformed(evt);
            }
        });

        jb_buscarCliente.setText("Buscar");
        jb_buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_buscarClienteActionPerformed(evt);
            }
        });

        jb_borrarCliente.setText("Borrar");
        jb_borrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrarClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("CLIENTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jb_guardarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(43, 43, 43)
                                .addComponent(jb_limpiarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(40, 40, 40)
                                .addComponent(jb_cancelarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jp_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_borrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jb_buscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_buscarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_borrarCliente)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jp_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_guardarCliente)
                            .addComponent(jb_limpiarCliente)
                            .addComponent(jb_cancelarCliente))
                        .addGap(44, 44, 44))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_guardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarClienteActionPerformed
      
        int dni=Integer.parseInt(jt_dni.getText().trim());
        String apellido=jt_apellido.getText();
        String nombre=jt_nombre.getText();
        String direccion=jt_direccion.getText();
        String telefono=jt_telefono.getText();
        String personaAlternativa=jt_personaAlternativa.getText();
         
        clinicaveterinaria.Modelo.Cliente cliente= new clinicaveterinaria.Modelo.Cliente(dni,apellido,nombre,direccion,telefono,personaAlternativa);
        clienteData.guardarCliente(cliente);
         jt_idCliente.setText(cliente.getId_cliente()+"");
    }//GEN-LAST:event_jb_guardarClienteActionPerformed

    private void jb_limpiarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_limpiarClienteActionPerformed
     jt_idCliente.setText(""); 
     jt_dni.setText("");
     jt_apellido.setText("");
     jt_nombre.setText("");
     jt_direccion.setText("");
     jt_telefono.setText("");
     jt_personaAlternativa.setText("");
    }//GEN-LAST:event_jb_limpiarClienteActionPerformed

    private void jb_cancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarClienteActionPerformed
     dispose();
    }//GEN-LAST:event_jb_cancelarClienteActionPerformed

    private void jt_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_dniActionPerformed

    private void jb_buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarClienteActionPerformed
        
        int id=Integer.parseInt(jt_idCliente.getText());
        Cliente cliente=clienteData.buscarCliente(id);
        if(cliente!=null){
                jt_idCliente.setText(cliente.getId_cliente()+"");
                jt_dni.setText(Integer.toString(cliente.getDni()));
                jt_apellido.setText(cliente.getApellido());
                jt_nombre.setText(cliente.getNombre());
                jt_direccion.setText(cliente.getDireccion());
                jt_telefono.setText(cliente.getTelefono());
                jt_personaAlternativa.setText(cliente.getPersona_alternativa());
        }     
               
    }//GEN-LAST:event_jb_buscarClienteActionPerformed

    private void jb_borrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrarClienteActionPerformed
     int id=Integer.parseInt(jt_idCliente.getText());
        clienteData.borrarCliente(id);
    }//GEN-LAST:event_jb_borrarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jb_borrarCliente;
    private javax.swing.JButton jb_buscarCliente;
    private javax.swing.JButton jb_cancelarCliente;
    private javax.swing.JButton jb_guardarCliente;
    private javax.swing.JButton jb_limpiarCliente;
    private javax.swing.JLabel jl_direccion;
    private javax.swing.JLabel jl_dni;
    private javax.swing.JLabel jl_id;
    private javax.swing.JLabel jl_nombre;
    private javax.swing.JLabel jl_personaAlt;
    private javax.swing.JLabel jl_telefono;
    private javax.swing.JPanel jp_cliente;
    private javax.swing.JTextField jt_apellido;
    private javax.swing.JTextField jt_direccion;
    private javax.swing.JTextField jt_dni;
    private javax.swing.JTextField jt_idCliente;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JTextField jt_personaAlternativa;
    private javax.swing.JTextField jt_telefono;
    // End of variables declaration//GEN-END:variables
}
