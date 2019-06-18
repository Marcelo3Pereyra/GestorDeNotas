package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Alumno;
import vista.InterfazAlumno;

public class ControladorAlu extends MouseAdapter implements ActionListener {

    private Alumno alumno = new Alumno();
    InterfazAlumno interAlu = new InterfazAlumno();

    public ControladorAlu() {
        this.interAlu.setVisible(true);
        llenarTabla();
        this.interAlu.getBtnVolverAlu().addActionListener(this);
        this.interAlu.getBtnAgregarAlumno().addActionListener(this);
        this.interAlu.getBtnEliminar().addActionListener(this);
        this.interAlu.getBtnModificar().addActionListener(this);
        this.interAlu.getTabla_alum().addMouseListener(this);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource().equals(this.interAlu.getBtnAgregarAlumno())) {

            if (interAlu.getTxtDni().getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "El campo dni esta vacio, por favor ingrese correctamente los datos", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                alumno.setDni_alu(Long.parseLong(interAlu.getTxtDni().getText()));
                alumno.setNom_alu(interAlu.getTxtNomAlu().getText());
                alumno.setApe_alu(interAlu.getTxtApeAlu().getText());
                alumno.setDomic_alu(interAlu.getTxtDomic_alu().getText());
                alumno.setTel_alu(interAlu.getTxtTelefono().getText());

                try {
                    if (alumno.agregarAlumno(alumno)) {
                        JOptionPane.showMessageDialog(null, "Se agregó al alumno correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo agregar el alumno");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAlu.class.getName()).log(Level.SEVERE, null, ex);
                }
                interAlu.getTxtDni().setText("");
                interAlu.getTxtNomAlu().setText("");
                interAlu.getTxtApeAlu().setText("");
                interAlu.getTxtDomic_alu().setText("");
                interAlu.getTxtTelefono().setText("");
            }
            llenarTabla();
        } else if (ae.getSource().equals(this.interAlu.getBtnVolverAlu())) {
            Controlador cont = new Controlador();
            this.interAlu.setVisible(false);

        } else if (ae.getSource().equals(this.interAlu.getBtnEliminar())) {
            if (interAlu.getTxtDni().getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "El campo dni esta vacio, por favor ingrese correctamente los datos", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                alumno.setDni_alu(Long.parseLong(interAlu.getTxtDni().getText()));
                alumno.setNom_alu(interAlu.getTxtNomAlu().getText());
                alumno.setApe_alu(interAlu.getTxtApeAlu().getText());
                alumno.setDomic_alu(interAlu.getTxtDomic_alu().getText());
                alumno.setTel_alu(interAlu.getTxtTelefono().getText());

                if (alumno.eliminarAlumno(alumno)) {
                    JOptionPane.showMessageDialog(null, "Se eliminó al alumno correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el alumno");
                }
                interAlu.getTxtDni().setText("");
                interAlu.getTxtNomAlu().setText("");
                interAlu.getTxtApeAlu().setText("");
                interAlu.getTxtDomic_alu().setText("");
                interAlu.getTxtTelefono().setText("");
            }
            llenarTabla();
        } else if (ae.getSource().equals(this.interAlu.getBtnModificar())) {
            if (interAlu.getTxtIngresoDni().getText().length() > 0) {
                alumno.setDni_alu(Long.parseLong(interAlu.getTxtIngresoDni().getText()));
                alumno.setNom_alu(interAlu.getTxtNomAlu().getText());
                alumno.setApe_alu(interAlu.getTxtApeAlu().getText());
                alumno.setDomic_alu(interAlu.getTxtDomic_alu().getText());
                alumno.setTel_alu(interAlu.getTxtTelefono().getText());
                alumno.modificarAlumno(alumno);
            } else {
                JOptionPane.showMessageDialog(null, "El campo DNI no puede estar vacío.");
            }
            llenarTabla();
        }

    }

    public void llenarTabla() {

        DefaultTableModel tabla = (DefaultTableModel) interAlu.getTabla_alum().getModel();

        ArrayList<Alumno> ListadoAlumnos = new ArrayList<>();
        ListadoAlumnos = alumno.listarAlumnos();
        tabla.setNumRows(0);

        for (int i = 0; i < ListadoAlumnos.size(); i++) {
            Object row[] = {ListadoAlumnos.get(i).getDni_alu(), ListadoAlumnos.get(i).getNom_alu(), ListadoAlumnos.get(i).getApe_alu(), ListadoAlumnos.get(i).getDomic_alu(), ListadoAlumnos.get(i).getTel_alu()};
            tabla.addRow(row);
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        if (me.getClickCount() == 1) {
            int fila = interAlu.getTabla_alum().getSelectedRow();

            if (fila > -1) {
                interAlu.getTxtDni().setText(interAlu.getTabla_alum().getValueAt(fila, 0).toString());
                interAlu.getTxtNomAlu().setText(interAlu.getTabla_alum().getValueAt(fila, 1).toString());
                interAlu.getTxtApeAlu().setText(interAlu.getTabla_alum().getValueAt(fila, 2).toString());
                interAlu.getTxtDomic_alu().setText(interAlu.getTabla_alum().getValueAt(fila, 3).toString());
                interAlu.getTxtTelefono().setText(interAlu.getTabla_alum().getValueAt(fila, 4).toString());
            }
        }
    }

}
