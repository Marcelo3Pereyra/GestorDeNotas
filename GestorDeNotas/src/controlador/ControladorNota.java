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
import modelo.Materia;
import modelo.Nota;
import vista.InterfazNota;

public class ControladorNota extends MouseAdapter implements ActionListener {

    private Nota nota = new Nota();
    InterfazNota interNot = new InterfazNota();

    public ControladorNota() {

        this.interNot.setVisible(true);
        llenarTabla();
        interNot.getBtnAgregNot().addActionListener(this);
        interNot.getBtnModNot().addActionListener(this);
        interNot.getBtnElimNot().addActionListener(this);
        interNot.getBtnVolverNot().addActionListener(this);
        interNot.getTablaNotas().addMouseListener(this);
        interNot.getTablaAlumnoNota().addMouseListener(this);
        interNot.getTablaMateriaNota().addMouseListener(this);
        llenarTablaAlumnos();
        llenarTablaMaterias();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource().equals(this.interNot.getBtnAgregNot())) {
            if (this.interNot.getTxtDniAluNot().getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "El DNI no puede estar vacío. Por favor, ingrese un DNI.");
            } else {
                nota.setDniAluNot(Long.parseLong(interNot.getTxtDniAluNot().getText()));
                nota.setCodMatNot(Integer.parseInt(interNot.getTxtCodMatNot().getText()));
                nota.setNotaNot(Integer.parseInt(interNot.getTxtNota().getText()));
                try {
                    nota.agregarNota(nota);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorNota.class.getName()).log(Level.SEVERE, null, ex);
                }
                llenarTabla();
                interNot.getTxtDniAluNot().setText("");
                interNot.getTxtCodMatNot().setText("");
                interNot.getTxtNota().setText("");
            }
        } else if (ae.getSource().equals(this.interNot.getBtnVolverNot())) {
            Controlador ctrlPpal = new Controlador();
            this.interNot.setVisible(false);
        } else if (ae.getSource().equals(this.interNot.getBtnElimNot())) {
            if (interNot.getTxtDniAluNot().getText().length() == 0 || interNot.getTxtCodMatNot().getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Los campos Codigo Materia o DNI alumno no pueden estar vacíos.");
            } else {
                nota.setDniAluNot(Long.parseLong(interNot.getTxtDniAluNot().getText()));
                nota.setCodMatNot(Integer.parseInt(interNot.getTxtCodMatNot().getText()));
                if (nota.eliminarNota(nota)) {
                    JOptionPane.showMessageDialog(null, "Se eliminó correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar.");
                }
                interNot.getTxtDniAluNot().setText("");
                interNot.getTxtCodMatNot().setText("");
                interNot.getTxtNota().setText("");
            }
            llenarTabla();
        } else if (ae.getSource().equals(interNot.getBtnModNot())) {
            if (this.interNot.getTxtDniAluNot().getText().length() == 0 || interNot.getTxtCodMatNot().getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Los campos Codigo Materia o DNI alumno no pueden estar vacios.");
            } else {
                nota.setDniAluNot(Long.parseLong(interNot.getTxtDniAluNot().getText()));
                nota.setCodMatNot(Integer.parseInt(interNot.getTxtCodMatNot().getText()));
                nota.setNotaNot(Integer.parseInt(interNot.getTxtNota().getText()));
                nota.modificarNota(nota);
                llenarTabla();
                interNot.getTxtDniAluNot().setText("");
                interNot.getTxtCodMatNot().setText("");
                interNot.getTxtNota().setText("");
            }
        }
    }

    public void llenarTabla() {

        DefaultTableModel tabla = (DefaultTableModel) interNot.getTablaNotas().getModel();

        ArrayList<Nota> listadoNotas = new ArrayList<>();
        listadoNotas = nota.ListarNota();
        tabla.setNumRows(0);

        for (int i = 0; i < listadoNotas.size(); i++) {
            Object row[] = {listadoNotas.get(i).getDniAluNot(), listadoNotas.get(i).getCodMatNot(), listadoNotas.get(i).getNotaNot()};
            tabla.addRow(row);
        }
    }

    public void llenarTablaAlumnos() {
        Alumno alu = new Alumno();
        DefaultTableModel tabla = (DefaultTableModel) interNot.getTablaAlumnoNota().getModel();
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos = alu.listarAlumnos();
        tabla.setNumRows(0);

        for (int i = 0; i < alumnos.size(); i++) {
            Object row[] = {alumnos.get(i).getDni_alu(), alumnos.get(i).getNom_alu(), alumnos.get(i).getApe_alu()};
            tabla.addRow(row);
        }
    }

    public void llenarTablaMaterias() {
        Materia mat = new Materia();
        DefaultTableModel tabla = (DefaultTableModel) interNot.getTablaMateriaNota().getModel();
        ArrayList<Materia> materias = new ArrayList<>();
        materias = mat.listarMaterias();
        tabla.setNumRows(0);

        for (int i = 0; i < materias.size(); i++) {
            Object row[] = {materias.get(i).getCod_mat(), materias.get(i).getDescr_mat()};
            tabla.addRow(row);
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        if (me.getClickCount() == 1) {
            int fila = interNot.getTablaNotas().getSelectedRow();

            if (fila > -1) {
                interNot.getTxtDniAluNot().setText(interNot.getTablaNotas().getValueAt(fila, 0).toString());
                interNot.getTxtCodMatNot().setText(interNot.getTablaNotas().getValueAt(fila, 1).toString());
                interNot.getTxtNota().setText(interNot.getTablaNotas().getValueAt(fila, 2).toString());
            }
        }

        if (me.getClickCount() == 1) {
            int fila = interNot.getTablaAlumnoNota().getSelectedRow();

            if (fila > -1) {
                interNot.getTxtDniAluNot().setText(interNot.getTablaAlumnoNota().getValueAt(fila, 0).toString());
            }
        }

        if (me.getClickCount() == 1) {
            int fila = interNot.getTablaMateriaNota().getSelectedRow();

            if (fila > -1) {
                interNot.getTxtCodMatNot().setText(interNot.getTablaMateriaNota().getValueAt(fila, 0).toString());
            }
        }
    }

}
