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
import modelo.Materia;
import vista.InterfazMateria;
public class ControladorMat extends MouseAdapter implements ActionListener {
    Materia materia = new Materia();
    InterfazMateria interMat = new InterfazMateria();
    public ControladorMat() {
        this.interMat.setVisible(true);
        llenarTabla();
        this.interMat.getBtnAgregarMat().addActionListener(this);
        this.interMat.getBtnEliminarMat().addActionListener(this);
        this.interMat.getBtnModificarMat().addActionListener(this);
        this.interMat.getBtnVolverMat().addActionListener(this);
        this.interMat.getTablaMateria().addMouseListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(interMat.getBtnAgregarMat())) {
            if (interMat.getTxtCodigoMat().getText().length() > 0) {
                materia.setCod_mat(Integer.parseInt(interMat.getTxtCodigoMat().getText()));
                materia.setDescr_mat(interMat.getTxtNombreMat().getText());
                materia.setCant_hor_mat(Integer.parseInt(interMat.getTxtCargaMat().getText()));
                if (interMat.getTxtDniProfMat().getText().length() > 0) {
                    materia.setDni_prof_mat(Long.parseLong(interMat.getTxtDniProfMat().getText()));
                }
                try {
                    materia.agregarMateria(this.materia);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorMat.class.getName()).log(Level.SEVERE, null, ex);
                }
                interMat.getTxtCodigoMat().setText("");
                interMat.getTxtNombreMat().setText("");
                interMat.getTxtCargaMat().setText("");
                interMat.getTxtDniProfMat().setText("");
            } else {
                JOptionPane.showMessageDialog(null, "El codigo de la materia no puede estar en blanco.");
            }
            llenarTabla();
        } else if (ae.getSource().equals(interMat.getBtnEliminarMat())) {
            if (interMat.getTxtCodigoMat().getText().length() > 0) {
                materia.setCod_mat(Integer.parseInt(interMat.getTxtCodigoMat().getText()));
                try {
                    materia.eliminarMateria(materia);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorMat.class.getName()).log(Level.SEVERE, null, ex);
                }
                interMat.getTxtCodigoMat().setText("");
                interMat.getTxtNombreMat().setText("");
                interMat.getTxtCargaMat().setText("");
                interMat.getTxtDniProfMat().setText("");
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "El codigo de la materia no puede estar en blanco.");
            }
            llenarTabla();
        } else if (ae.getSource().equals(interMat.getBtnModificarMat())) {
            materia.setCod_mat(Integer.parseInt(interMat.getTxtCodigoMat().getText()));
            materia.setDescr_mat(interMat.getTxtNombreMat().getText());
            materia.setCant_hor_mat(Integer.parseInt(interMat.getTxtCargaMat().getText()));
            materia.setDni_prof_mat(Long.parseLong(interMat.getTxtDniProfMat().getText()));
            materia.modificarMateria(materia);
            interMat.getTxtCodigoMat().setText("");
            interMat.getTxtNombreMat().setText("");
            interMat.getTxtCargaMat().setText("");
            interMat.getTxtDniProfMat().setText("");
            llenarTabla();
        } else {
            Controlador ctrl = new Controlador();
            interMat.dispose();
        }
    }
    public void llenarTabla() {
        DefaultTableModel tabla = (DefaultTableModel) interMat.getTablaMateria().getModel();
        ArrayList<Materia> listadoMaterias = new ArrayList<>();
        listadoMaterias = materia.listarMaterias();
        tabla.setNumRows(0);
        for (int i = 0; i < listadoMaterias.size(); i++) {
            Object row[] = {listadoMaterias.get(i).getCod_mat(), listadoMaterias.get(i).getDescr_mat(), listadoMaterias.get(i).getCant_hor_mat(), listadoMaterias.get(i).getDni_prof_mat()};
            tabla.addRow(row);
        }
    }
    @Override
    public void mousePressed(MouseEvent me) {
        if (me.getClickCount() == 1) {
            int fila = interMat.getTablaMateria().getSelectedRow();
            if (fila > -1) {
                interMat.getTxtCodigoMat().setText(interMat.getTablaMateria().getValueAt(fila, 0).toString());
                interMat.getTxtNombreMat().setText(interMat.getTablaMateria().getValueAt(fila, 1).toString());
                interMat.getTxtCargaMat().setText(interMat.getTablaMateria().getValueAt(fila, 2).toString());
                interMat.getTxtDniProfMat().setText(interMat.getTablaMateria().getValueAt(fila, 3).toString());
            }
        }
    }
}