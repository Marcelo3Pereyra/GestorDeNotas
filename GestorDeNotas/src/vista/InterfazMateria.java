package vista;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
public class InterfazMateria extends javax.swing.JFrame {
    public InterfazMateria() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAgregarMat = new javax.swing.JButton();
        btnEliminarMat = new javax.swing.JButton();
        btnModificarMat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMateria = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreMat = new javax.swing.JTextField();
        txtCodigoMat = new javax.swing.JTextField();
        txtCargaMat = new javax.swing.JTextField();
        txtDniProfMat = new javax.swing.JTextField();
        btnVolverMat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        btnAgregarMat.setText("Agregar");

        btnEliminarMat.setText("Eliminar");

        btnModificarMat.setText("Modificar");

        tablaMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Carga Horaria", "Profesor"
            }
        ));
        jScrollPane1.setViewportView(tablaMateria);

        jLabel2.setText("Codigo");

        jLabel3.setText("Carga Horaria");

        jLabel4.setText("Profesor");

        btnVolverMat.setText("Volver");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreMat)
                            .addComponent(txtCodigoMat)
                            .addComponent(txtCargaMat)
                            .addComponent(txtDniProfMat, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(65, Short.MAX_VALUE)
                        .addComponent(btnAgregarMat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarMat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarMat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVolverMat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigoMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCargaMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDniProfMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVolverMat)
                            .addComponent(btnAgregarMat)
                            .addComponent(btnEliminarMat)
                            .addComponent(btnModificarMat))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JTable getTablaMateria() {
        return tablaMateria;
    }
    public void setTablaMateria(JTable tablaMateria) {
        this.tablaMateria = tablaMateria;
    }
    public JButton getBtnAgregarMat() {
        return btnAgregarMat;
    }
    public void setBtnAgregarMat(JButton btnAgregarMat) {
        this.btnAgregarMat = btnAgregarMat;
    }
    public JButton getBtnEliminarMat() {
        return btnEliminarMat;
    }
    public void setBtnEliminarMat(JButton btnEliminarMat) {
        this.btnEliminarMat = btnEliminarMat;
    }
    public JButton getBtnModificarMat() {
        return btnModificarMat;
    }
    public void setBtnModificarMat(JButton btnModificarMat) {
        this.btnModificarMat = btnModificarMat;
    }
    public JButton getBtnVolverMat() {
        return btnVolverMat;
    }
    public void setBtnVolverMat(JButton btnVolverMat) {
        this.btnVolverMat = btnVolverMat;
    }
    public JTextField getTxtCargaMat() {
        return txtCargaMat;
    }
    public void setTxtCargaMat(JTextField txtCargaMat) {
        this.txtCargaMat = txtCargaMat;
    }
    public JTextField getTxtCodigoMat() {
        return txtCodigoMat;
    }
    public void setTxtCodigoMat(JTextField txtCodigoMat) {
        this.txtCodigoMat = txtCodigoMat;
    }
    public JTextField getTxtNombreMat() {
        return txtNombreMat;
    }
    public void setTxtNombreMat(JTextField txtNombreMat) {
        this.txtNombreMat = txtNombreMat;
    }
    public JTextField getTxtDniProfMat() {
        return txtDniProfMat;
    }
    public void setTxtDniProfMat(JTextField txtDniProfMat) {
        this.txtDniProfMat = txtDniProfMat;
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazMateria().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMat;
    private javax.swing.JButton btnEliminarMat;
    private javax.swing.JButton btnModificarMat;
    private javax.swing.JButton btnVolverMat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMateria;
    private javax.swing.JTextField txtCargaMat;
    private javax.swing.JTextField txtCodigoMat;
    private javax.swing.JTextField txtDniProfMat;
    private javax.swing.JTextField txtNombreMat;
    // End of variables declaration//GEN-END:variables
}