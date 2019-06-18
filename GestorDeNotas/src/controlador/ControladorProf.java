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
import modelo.Profesor;
import vista.InterfazProfesor;

public class ControladorProf extends MouseAdapter implements ActionListener {

    private Profesor profesor = new Profesor();
    InterfazProfesor interProf = new InterfazProfesor();

    public ControladorProf() {
        this.interProf.setVisible(true);
        llenarTabla();
        this.interProf.getBtnAgregarProf().addActionListener(this);
        this.interProf.getBtnEliminarProf().addActionListener(this);
        this.interProf.getBtnVolverProf().addActionListener(this);
        this.interProf.getBtnModificarProf().addActionListener(this);
        this.interProf.getTablaProf().addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource().equals(this.interProf.getBtnAgregarProf())) {

            if (interProf.getTxtDni_prof().getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "El campo dni esta vacio, por favor ingrese correctamente los datos", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                profesor.setDni_prof(Long.parseLong(interProf.getTxtDni_prof().getText()));
                profesor.setNom_prof(interProf.getTxtNom_prof().getText());
                profesor.setApe_prof(interProf.getTxtApe_prof().getText());
                profesor.setDomic_prof(interProf.getTxtDomic_prof().getText());
                profesor.setTel_prof(interProf.getTxtTel_prof().getText());

                try {
                    if (profesor.agregarProfesor(profesor)) {
                        JOptionPane.showMessageDialog(null, "Se agregó al profesor correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo agregar el profesor");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAlu.class.getName()).log(Level.SEVERE, null, ex);
                }
                interProf.getTxtDni_prof().setText("");
                interProf.getTxtNom_prof().setText("");
                interProf.getTxtApe_prof().setText("");
                interProf.getTxtDomic_prof().setText("");
                interProf.getTxtTel_prof().setText("");
            }
            llenarTabla();
        } else if (ae.getSource().equals(this.interProf.getBtnVolverProf())) {
            this.interProf.dispose();
            Controlador c = new Controlador();
        } else if (ae.getSource().equals(this.interProf.getBtnEliminarProf())) {
            if (interProf.getTxtDni_prof().getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "El campo dni esta vacio, por favor ingrese correctamente los datos", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                profesor.setDni_prof(Long.parseLong(interProf.getTxtDni_prof().getText()));
                profesor.setNom_prof(interProf.getTxtNom_prof().getText());
                profesor.setApe_prof(interProf.getTxtApe_prof().getText());
                profesor.setDomic_prof(interProf.getTxtDomic_prof().getText());
                profesor.setTel_prof(interProf.getTxtTel_prof().getText());

                if (profesor.eliminarProfesor(profesor)) {
                    JOptionPane.showMessageDialog(null, "Se eliminó al profesor correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el profesor.");
                }
                interProf.getTxtDni_prof().setText("");
                interProf.getTxtNom_prof().setText("");
                interProf.getTxtApe_prof().setText("");
                interProf.getTxtDomic_prof().setText("");
                interProf.getTxtTel_prof().setText("");
            }
            llenarTabla();
        } else {
            profesor.setDni_prof(Long.parseLong(interProf.getTxtDni_prof().getText()));
            profesor.setNom_prof(interProf.getTxtNom_prof().getText());
            profesor.setApe_prof(interProf.getTxtApe_prof().getText());
            profesor.setDomic_prof(interProf.getTxtDomic_prof().getText());
            profesor.setTel_prof(interProf.getTxtTel_prof().getText());
            profesor.modificarProfesor(profesor);
            interProf.getTxtDni_prof().setText("");
            interProf.getTxtNom_prof().setText("");
            interProf.getTxtApe_prof().setText("");
            interProf.getTxtDomic_prof().setText("");
            interProf.getTxtTel_prof().setText("");
            llenarTabla();
        }
    }

    public void llenarTabla() {

        DefaultTableModel tabla = (DefaultTableModel) interProf.getTablaProf().getModel();

        ArrayList<Profesor> ListadoProfesores = new ArrayList<Profesor>();

        ListadoProfesores = profesor.ListarProfesores();

        tabla.setNumRows(0);

        for (int i = 0; i < ListadoProfesores.size(); i++) {
            Object row[] = {ListadoProfesores.get(i).getDni_prof(), ListadoProfesores.get(i).getNom_prof(), ListadoProfesores.get(i).getApe_prof(), ListadoProfesores.get(i).getDomic_prof(), ListadoProfesores.get(i).getTel_prof()};
            tabla.addRow(row);
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        if (me.getClickCount() == 1) {
            int fila = interProf.getTablaProf().getSelectedRow();

            if (fila > -1) {
                interProf.getTxtDni_prof().setText(interProf.getTablaProf().getValueAt(fila, 0).toString());
                interProf.getTxtNom_prof().setText(interProf.getTablaProf().getValueAt(fila, 1).toString());
                interProf.getTxtApe_prof().setText(interProf.getTablaProf().getValueAt(fila, 2).toString());
                interProf.getTxtDomic_prof().setText(interProf.getTablaProf().getValueAt(fila, 3).toString());
                interProf.getTxtTel_prof().setText(interProf.getTablaProf().getValueAt(fila, 4).toString());
            }
        }
    }

}
