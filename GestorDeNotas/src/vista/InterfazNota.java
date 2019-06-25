package vista;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
public class InterfazNota extends javax.swing.JFrame {
    public InterfazNota() {
        initComponents();
    }
    public JButton getBtnAgregNot() {
        return btnAgregNot;
    }
    public void setBtnAgregNot(JButton btnAgregNot) {
        this.btnAgregNot = btnAgregNot;
    }
    public JButton getBtnElimNot() {
        return btnElimNot;
    }
    public void setBtnElimNot(JButton btnElimNot) {
        this.btnElimNot = btnElimNot;
    }
    public JButton getBtnModNot() {
        return btnModNot;
    }
    public void setBtnModNot(JButton btnModNot) {
        this.btnModNot = btnModNot;
    }
    public JButton getBtnVolverNot() {
        return btnVolverNot;
    }
    public void setBtnVolverNot(JButton btnVolverNot) {
        this.btnVolverNot = btnVolverNot;
    }
    public JTable getTablaNotas() {
        return tablaNotas;
    }
    public void setTablaNotas(JTable tablaNotas) {
        this.tablaNotas = tablaNotas;
    }
    public JTextField getTxtCodMatNot() {
        return txtCodMatNot;
    }
    public void setTxtCodMatNot(JTextField txtCodMatNot) {
        this.txtCodMatNot = txtCodMatNot;
    }
    public JTextField getTxtDniAluNot() {
        return txtDniAluNot;
    }
    public void setTxtDniAluNot(JTextField txtDniAluNot) {
        this.txtDniAluNot = txtDniAluNot;
    }
    public JTextField getTxtNota() {
        return txtNota;
    }
    public void setTxtNota(JTextField txtNota) {
        this.txtNota = txtNota;
    }
    public JTable getTablaAlumnoNota() {
        return tablaAlumnoNota;
    }
    public void setTablaAlumnoNota(JTable tablaAlumnoNota) {
        this.tablaAlumnoNota = tablaAlumnoNota;
    }
    public JTable getTablaMateriaNota() {
        return tablaMateriaNota;
    }
    public void setTablaMateriaNota(JTable tablaMateriaNota) {
        this.tablaMateriaNota = tablaMateriaNota;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDniAluNot = new javax.swing.JTextField();
        txtCodMatNot = new javax.swing.JTextField();
        txtNota = new javax.swing.JTextField();
        btnElimNot = new javax.swing.JButton();
        btnModNot = new javax.swing.JButton();
        btnAgregNot = new javax.swing.JButton();
        btnVolverNot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNotas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAlumnoNota = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMateriaNota = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DNI Alumno:");

        jLabel2.setText("Codigo Materia:");

        jLabel3.setText("Nota:");

        btnElimNot.setText("Eliminar");

        btnModNot.setText("Modificar");

        btnAgregNot.setText("Agregar");

        btnVolverNot.setText("Volver");

        tablaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DNI Alumno:", "Codigo Materia:", "Nota"
            }
        ));
        jScrollPane1.setViewportView(tablaNotas);
        if (tablaNotas.getColumnModel().getColumnCount() > 0) {
            tablaNotas.getColumnModel().getColumn(1).setHeaderValue("Codigo Materia:");
            tablaNotas.getColumnModel().getColumn(2).setHeaderValue("Nota");
        }

        tablaAlumnoNota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DNI Alumno:", "Nombre:", "Apellido:"
            }
        ));
        jScrollPane2.setViewportView(tablaAlumnoNota);
        if (tablaAlumnoNota.getColumnModel().getColumnCount() > 0) {
            tablaAlumnoNota.getColumnModel().getColumn(1).setHeaderValue("Codigo Materia:");
            tablaAlumnoNota.getColumnModel().getColumn(2).setHeaderValue("Nota");
        }

        tablaMateriaNota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo Materia:", "Nombre"
            }
        ));
        jScrollPane3.setViewportView(tablaMateriaNota);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDniAluNot, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodMatNot, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnElimNot)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModNot)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregNot)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVolverNot)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDniAluNot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodMatNot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnElimNot)
                            .addComponent(btnModNot)
                            .addComponent(btnAgregNot)
                            .addComponent(btnVolverNot)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazNota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregNot;
    private javax.swing.JButton btnElimNot;
    private javax.swing.JButton btnModNot;
    private javax.swing.JButton btnVolverNot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaAlumnoNota;
    private javax.swing.JTable tablaMateriaNota;
    private javax.swing.JTable tablaNotas;
    private javax.swing.JTextField txtCodMatNot;
    private javax.swing.JTextField txtDniAluNot;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}