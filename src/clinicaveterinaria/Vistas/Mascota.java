/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.Vistas;

/**
 *
 * @author Usuario
 */
public class Mascota extends javax.swing.JInternalFrame {

    /**
     * Creates new form Mascota
     */
    public Mascota() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();
        jl_Mascota = new javax.swing.JLabel();
        jl_Mascota_Dueño = new javax.swing.JLabel();
        jl_Mascota_Pelo = new javax.swing.JLabel();
        jl_Mascota_Alias = new javax.swing.JLabel();
        jl_Mascota_Raza = new javax.swing.JLabel();
        jl_Mascota_Sexo = new javax.swing.JLabel();
        jl_Mascota_Especie = new javax.swing.JLabel();
        jl_Mascota_Peso = new javax.swing.JLabel();
        jl_Mascota_Fecha = new javax.swing.JLabel();
        jtf_Mascota_Dueño = new javax.swing.JTextField();
        jtf_Mascota_Alias = new javax.swing.JTextField();
        jtb_Mascota_M = new javax.swing.JRadioButton();
        jrb_Mascota_F = new javax.swing.JRadioButton();
        jtf_Mascota_Especie = new javax.swing.JTextField();
        jtf_Mascota_Raza = new javax.swing.JTextField();
        jtf_Mascota_Pelo = new javax.swing.JTextField();
        jtf_Mascota_F = new javax.swing.JTextField();
        jtf_Mascota_PesoActual = new javax.swing.JTextField();
        jb_Mascota_Guardar = new javax.swing.JButton();
        jb_Mascota_Borrar = new javax.swing.JButton();
        jb_Mascota_Cancelar = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton4.setText("jButton4");

        jl_Mascota.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jl_Mascota.setText("Registrar Mascota");

        jl_Mascota_Dueño.setText("Dueño");

        jl_Mascota_Pelo.setText("Color De Pelo");

        jl_Mascota_Alias.setText("Alias");

        jl_Mascota_Raza.setText("Raza");

        jl_Mascota_Sexo.setText("Sexo");

        jl_Mascota_Especie.setText("Especie");

        jl_Mascota_Peso.setText("Peso Actual");

        jl_Mascota_Fecha.setText("Fecha De Nacimiento");

        jtb_Mascota_M.setText("Masculino");

        jrb_Mascota_F.setText("Femenino");

        jb_Mascota_Guardar.setText("Guardar");

        jb_Mascota_Borrar.setText("Borrar");

        jb_Mascota_Cancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_Mascota_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtb_Mascota_M)
                                .addGap(63, 63, 63)
                                .addComponent(jrb_Mascota_F))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_Mascota_Pelo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_Mascota_Pelo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_Mascota_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_Mascota_F, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jl_Mascota_Dueño, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtf_Mascota_Dueño, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jl_Mascota_Alias, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtf_Mascota_Alias))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jl_Mascota_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtf_Mascota_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jl_Mascota_Especie, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtf_Mascota_Especie, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jb_Mascota_Borrar)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jl_Mascota_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtf_Mascota_PesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jb_Mascota_Guardar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(jb_Mascota_Cancelar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jl_Mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jl_Mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Mascota_Dueño, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_Mascota_Dueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Mascota_Alias, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_Mascota_Alias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Mascota_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtb_Mascota_M)
                    .addComponent(jrb_Mascota_F))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Mascota_Especie, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_Mascota_Especie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Mascota_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_Mascota_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Mascota_Pelo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_Mascota_Pelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Mascota_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_Mascota_F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Mascota_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_Mascota_PesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Mascota_Guardar)
                    .addComponent(jb_Mascota_Cancelar)
                    .addComponent(jb_Mascota_Borrar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Mascota_Borrar;
    private javax.swing.JButton jb_Mascota_Cancelar;
    private javax.swing.JButton jb_Mascota_Guardar;
    private javax.swing.JLabel jl_Mascota;
    private javax.swing.JLabel jl_Mascota_Alias;
    private javax.swing.JLabel jl_Mascota_Dueño;
    private javax.swing.JLabel jl_Mascota_Especie;
    private javax.swing.JLabel jl_Mascota_Fecha;
    private javax.swing.JLabel jl_Mascota_Pelo;
    private javax.swing.JLabel jl_Mascota_Peso;
    private javax.swing.JLabel jl_Mascota_Raza;
    private javax.swing.JLabel jl_Mascota_Sexo;
    private javax.swing.JRadioButton jrb_Mascota_F;
    private javax.swing.JRadioButton jtb_Mascota_M;
    private javax.swing.JTextField jtf_Mascota_Alias;
    private javax.swing.JTextField jtf_Mascota_Dueño;
    private javax.swing.JTextField jtf_Mascota_Especie;
    private javax.swing.JTextField jtf_Mascota_F;
    private javax.swing.JTextField jtf_Mascota_Pelo;
    private javax.swing.JTextField jtf_Mascota_PesoActual;
    private javax.swing.JTextField jtf_Mascota_Raza;
    // End of variables declaration//GEN-END:variables
}