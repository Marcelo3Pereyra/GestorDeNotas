package datosDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Alumno;
import modelo.Nota;

public class NotaDAO extends SQLQuery {

    Nota nota;

    public NotaDAO() {

        try {
            this.conectar("localhost", "sga2019", "root", "mysql");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error de conexion.");
        }
    }

    public boolean agregarNotaDAO(Nota nota) throws SQLException {

        String agregar = "INSERT INTO Nota"
                + "(dni_alu_not, cod_mat_not, notas_not) VALUES"
                + "(?,?,?)";

        this.consulta = this.conexion.prepareStatement(agregar);
        consulta.setLong(1, nota.getDniAluNot());
        consulta.setInt(2, nota.getCodMatNot());
        consulta.setInt(3, nota.getNotaNot());

        if (consulta.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarNotaDAO(Nota nota) {
        PreparedStatement elimAlumnoNota = null;

        String elimAluNot = "DELETE FROM Nota WHERE dni_alu_not = " + nota.getDniAluNot() + " AND cod_mat_not= " + nota.getCodMatNot();

        try {
            elimAlumnoNota = conexion.prepareStatement(elimAluNot);

            if (elimAlumnoNota.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e1) {
            return false;
        }
    }

    public Nota modificarNotaDAO(Nota nota) {
        int modificado = 0;

        if (nota.getCodMatNot() > 0 && nota.getDniAluNot() > 0) {

            try {
                this.conectar("localhost", "sga2019", "root", "mysql");
                this.consulta = this.conexion.prepareStatement("UPDATE Nota SET notas_not=? WHERE dni_alu_not=? AND cod_mat_not=?");
                consulta.setInt(1, nota.getNotaNot());
                consulta.setLong(2, nota.getDniAluNot());
                consulta.setInt(3, nota.getCodMatNot());
                consulta.executeUpdate();
                if (consulta.executeUpdate() > 0) {
                    modificado++;
                } else {
                    modificado--;
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Nota.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (modificado > 0) {
            JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido realizar la modificacion de los datos.\n"
                    + "Intentelo nuevamente.", "Error en la operación", JOptionPane.ERROR_MESSAGE);
        }

        return nota;
    }

    public ArrayList<Nota> getListadoNotas() {
        ArrayList<Nota> ListadoNotas = new ArrayList<>();
        String sql = "SELECT * FROM Nota";

        try {
            this.consulta = this.conexion.prepareStatement(sql);
            consulta.execute();

            datos = consulta.executeQuery();

            while (this.datos.next()) {
                nota = new Nota();
                nota.setCodMatNot(this.datos.getInt("cod_mat_not"));
                nota.setDniAluNot(this.datos.getLong("dni_alu_not"));
                nota.setNotaNot(this.datos.getInt("notas_not"));
                ListadoNotas.add(nota);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ListadoNotas;
    }

}
