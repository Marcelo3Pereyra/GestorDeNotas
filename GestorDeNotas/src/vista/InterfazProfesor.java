package vista;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
public class InterfazProfesor extends javax.swing.JFrame {
    public InterfazProfesor() {
        initComponents();
    }
    public JButton getBtnAgregarProf() {
        return btnAgregarProf;
    }
    public void setBtnAgregarProf(JButton btnAgregarProf) {
        this.btnAgregarProf = btnAgregarProf;
    }
    public JButton getBtnEliminarProf() {
        return btnEliminarProf;
    }
    public void setBtnEliminarProf(JButton btnEliminarProf) {
        this.btnEliminarProf = btnEliminarProf;
    }
    public JButton getBtnVolverProf() {
        return btnVolverProf;
    }
    public void setBtnVolverProf(JButton btnVolverAlu) {
        this.btnVolverProf = btnVolverAlu;
    }
    public JTable getTablaProf() {
        return tablaProf;
    }
    public void setTablaProf(JTable tablaProf) {
        this.tablaProf = tablaProf;
    }
    public JTextField getTxtApe_prof() {
        return txtApe_prof;
    }
    public void setTxtApe_prof(JTextField txtApe_prof) {
        this.txtApe_prof = txtApe_prof;
    }
    public JTextField getTxtDni_prof() {
        return txtDni_prof;
    }
    public void setTxtDni_prof(JTextField txtDni_prof) {
        this.txtDni_prof = txtDni_prof;
    }
    public JTextField getTxtDomic_prof() {
        return txtDomic_prof;
    }
    public void setTxtDomic_prof(JTextField txtDomic_prof) {
        this.txtDomic_prof = txtDomic_prof;
    }
    public JTextField getTxtNom_prof() {
        return txtNom_prof;
    }
    public void setTxtNom_prof(JTextField txtNom_prof) {
        this.txtNom_prof = txtNom_prof;
    }
    public JTextField getTxtTel_prof() {
        return txtTel_prof;
    }
    public void setTxtTel_prof(JTextField txtTel_prof) {
        this.txtTel_prof = txtTel_prof;
    }
    public JButton getBtnModificarProf() {
        return btnModificarProf;
    }
    public void setBtnModificarProf(JButton btnModificarProf) {
        this.btnModificarProf = btnModificarProf;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDni_prof = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNom_prof = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApe_prof = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDomic_prof = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTel_prof = new javax.swing.JTextField();
        btnEliminarProf = new javax.swing.JButton();
        btnModificarProf = new javax.swing.JButton();
        btnAgregarProf = new javax.swing.JButton();
        btnVolverProf = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProf = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Profesor");

        jLabel1.setText("DNI");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Domicilio");

        jLabel5.setText("Telefono");

        btnEliminarProf.setText("Eliminar");

        btnModificarProf.setText("Modificar");

        btnAgregarProf.setText("Agregar Profesor");

        btnVolverProf.setText("Volver");

        tablaProf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DNI:", "Nombre:", "Apellido:", "Domicilio:", "Telefono:"
            }
        ));
        jScrollPane1.setViewportView(tablaProf);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDni_prof)
                            .addComponent(txtNom_prof)
                            .addComponent(txtApe_prof)
                            .addComponent(txtDomic_prof)
                            .addComponent(txtTel_prof, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminarProf)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarProf)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarProf)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolverProf)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDni_prof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNom_prof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtApe_prof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDomic_prof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTel_prof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarProf)
                            .addComponent(btnModificarProf)
                            .addComponent(btnAgregarProf)
                            .addComponent(btnVolverProf)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazProfesor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProf;
    private javax.swing.JButton btnEliminarProf;
    private javax.swing.JButton btnModificarProf;
    private javax.swing.JButton btnVolverProf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProf;
    private javax.swing.JTextField txtApe_prof;
    private javax.swing.JTextField txtDni_prof;
    private javax.swing.JTextField txtDomic_prof;
    private javax.swing.JTextField txtNom_prof;
    private javax.swing.JTextField txtTel_prof;
    // End of variables declaration//GEN-END:variables
}