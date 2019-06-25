package vista;
import javax.swing.JButton;
public class InterfazPrincipal extends javax.swing.JFrame {
    public InterfazPrincipal() {
        initComponents();
    }
    public JButton getBtnAlumno() {
        return btnAlumno;
    }
    public void setBtnAlumno(JButton btnAlumno) {
        this.btnAlumno = btnAlumno;
    }
    public JButton getBtnCargarNota() {
        return btnCargarNota;
    }
    public void setBtnCargarNota(JButton btnCargarNota) {
        this.btnCargarNota = btnCargarNota;
    }
    public JButton getBtnMateria() {
        return btnMateria;
    }
    public void setBtnMateria(JButton btnMateria) {
        this.btnMateria = btnMateria;
    }
    public JButton getBtnProfesor() {
        return btnProfesor;
    }
    public void setBtnProfesor(JButton btnProfesor) {
        this.btnProfesor = btnProfesor;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMateria = new javax.swing.JButton();
        btnProfesor = new javax.swing.JButton();
        btnAlumno = new javax.swing.JButton();
        btnCargarNota = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de Notas");

        jPanel1.setToolTipText("Gestor de Notas");

        btnMateria.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnMateria.setText("Materia");

        btnProfesor.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnProfesor.setText("Profesor");

        btnAlumno.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnAlumno.setText("Alumno");

        btnCargarNota.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnCargarNota.setText("Cargar Nota");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCargarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCargarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlumno;
    private javax.swing.JButton btnCargarNota;
    private javax.swing.JButton btnMateria;
    private javax.swing.JButton btnProfesor;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}