package datosDAO;

import datosDAO.SQLQuery;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Alumno;

public class AlumnoDAO extends SQLQuery {

    public Alumno alum1;

    public AlumnoDAO() {
        try {
            this.conectar("localhost", "proyectoMetodologia", "root", "root");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error de conexion.");
        }
    }

    public Boolean agregarAlumnoDao(Alumno alu) throws SQLException {
        String insertTableSQL = "INSERT INTO Alumno"
                + "(dni_alu,nom_alu,ape_alu,domic_alu,tel_alu) VALUES"
                + "(?,?,?,?,?)";
        this.consulta = this.conexion.prepareStatement(insertTableSQL);
        consulta.setLong(1, alu.getDni_alu());
        consulta.setString(2, alu.getNom_alu());
        consulta.setString(3, alu.getApe_alu());
        consulta.setString(4, alu.getDomic_alu());
        consulta.setString(5, alu.getTel_alu());

        if (consulta.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarAlumnos(Alumno alu) {
        PreparedStatement elimAlumno = null;
        PreparedStatement elimAlumnoNota = null;

        String elimAluNot = "DELETE FROM Nota WHERE dni_alu_not = " + alu.getDni_alu();
        String elimAlu = "DELETE FROM Alumno WHERE dni_alu = " + alu.getDni_alu();

        try {
            elimAlumnoNota = conexion.prepareStatement(elimAluNot);

            elimAlumnoNota.executeUpdate();

            elimAlumno = conexion.prepareStatement(elimAlu);

            if (elimAlumno.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e1) {
            return false;
        }

    }

    public Alumno modificarAlumno(Alumno alumno) {
        int modificado = 0;

        if (alumno.getNom_alu().length() > 0) {

            try {
                this.conectar("localhost", "proyectoMetodologia", "root", "root");
                this.consulta = this.conexion.prepareStatement("UPDATE Alumno SET nom_alu=? WHERE dni_alu=?");
                consulta.setString(1, alumno.getNom_alu());
                consulta.setLong(2, alumno.getDni_alu());
                consulta.executeUpdate();
                if (consulta.executeUpdate() > 0) {
                    modificado++;
                } else {
                    modificado = -10;
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (alumno.getApe_alu().length() > 0) {
            try {
                this.conectar("localhost", "proyectoMetodologia", "root", "root");
                this.consulta = this.conexion.prepareStatement("UPDATE Alumno SET ape_alu=? WHERE dni_alu=?");
                consulta.setString(1, alumno.getApe_alu());
                consulta.setLong(2, alumno.getDni_alu());
                consulta.execute();
                if (consulta.executeUpdate() > 0) {
                    modificado++;
                } else {
                    modificado = -10;
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (alumno.getDomic_alu().length() > 0) {
            try {
                this.conectar("localhost", "proyectoMetodologia", "root", "root");
                this.consulta = this.conexion.prepareStatement("UPDATE Alumno SET domic_alu=? WHERE dni_alu=?");
                consulta.setString(1, alumno.getDomic_alu());
                consulta.setLong(2, alumno.getDni_alu());
                consulta.execute();
                if (consulta.executeUpdate() > 0) {
                    modificado++;
                } else {
                    modificado = -10;
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (alumno.getTel_alu().length() > 0) {
            try {
                this.conectar("localhost", "proyectoMetodologia", "root", "root");
                this.consulta = this.conexion.prepareStatement("UPDATE Alumno SET tel_alu=? WHERE dni_alu=?");
                consulta.setString(1, alumno.getTel_alu());
                consulta.setLong(2, alumno.getDni_alu());
                consulta.executeUpdate();
                if (consulta.executeUpdate() > 0) {
                    modificado++;
                } else {
                    modificado = -10;
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (modificado > 0) {
            JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido realizar la modificacion de los datos.\n"
                    + "Intentelo nuevamente.", "Error en la operación", JOptionPane.ERROR_MESSAGE);
        }

        return alumno;
    }

    public ArrayList<Alumno> getListadoAlumnos() {
        ArrayList<Alumno> listadoAlumnos = new ArrayList<>();
        String sql = "SELECT * FROM Alumno";

        try {
            this.consulta = this.conexion.prepareStatement(sql);
            consulta.execute();

            datos = consulta.executeQuery();

            while (this.datos.next()) {
                alum1 = new Alumno();
                alum1.setDni_alu(this.datos.getLong("dni_alu"));
                alum1.setNom_alu(this.datos.getString("nom_alu"));
                alum1.setApe_alu(this.datos.getString("ape_alu"));
                alum1.setDomic_alu(this.datos.getString("domic_alu"));
                alum1.setTel_alu(this.datos.getString("tel_alu"));
                listadoAlumnos.add(alum1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listadoAlumnos;
    }
}
