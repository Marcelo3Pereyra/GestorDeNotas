package datosDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Profesor;
public class ProfesorDAO extends SQLQuery {
    public Profesor prof1;
    public ProfesorDAO() {
        
        try {
             conectar("localhost", "proyectoMetodologia", "root", "root");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error de conexion.");
        }
    }
    public Boolean agregarProfesorDao(Profesor prof) throws SQLException {
        String insertTableSQL = "INSERT INTO Profesor"
                + "(dni_prof,nom_prof,ape_prof,domic_prof,tel_prof) VALUES"
                + "(?,?,?,?,?)";
        consulta =  conexion.prepareStatement(insertTableSQL);
        consulta.setLong(1, prof.getDni_prof());
        consulta.setString(2, prof.getNom_prof());
        consulta.setString(3, prof.getApe_prof());
        consulta.setString(4, prof.getDomic_prof());
        consulta.setString(5, prof.getTel_prof());

        if (consulta.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }
    public ArrayList<Profesor> getListadoProfesores() {
        ArrayList<Profesor> ListadoProfesores = new ArrayList<Profesor>();
        String sql = "SELECT * FROM Profesor";

        try {
            consulta =  conexion.prepareStatement(sql);
            consulta.execute();
            datos = consulta.executeQuery();
            while ( datos.next()) {
                prof1 = new Profesor();
                prof1.setDni_prof( datos.getLong("dni_prof"));
                prof1.setNom_prof( datos.getString("nom_prof"));
                prof1.setApe_prof( datos.getString("ape_prof"));
                prof1.setDomic_prof( datos.getString("domic_prof"));
                prof1.setTel_prof( datos.getString("tel_prof"));
                ListadoProfesores.add(prof1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ListadoProfesores;
    }
    public boolean eliminarProfesor(Profesor prof) {
        PreparedStatement elimProfesor = null;
        String elimProf = "DELETE FROM Profesor WHERE dni_prof = " + prof.getDni_prof();
        
        try {
            elimProfesor = conexion.prepareStatement(elimProf);
            elimProfesor.executeUpdate();
             
        } catch (SQLException e1) {
            return false;
        }
        return true;
    }    
    public Profesor modificarProfesorDAO(Profesor prof) {
        int modificado = 0;

        if (prof.getNom_prof().length() > 0) {
            try {
                 conectar("localhost", "proyectoMetodologia", "root", "root");
                consulta = conexion.prepareStatement("UPDATE Profesor SET nom_prof=? WHERE dni_prof=?");
                consulta.setString(1, prof.getNom_prof());
                consulta.setLong(2, prof.getDni_prof());
                consulta.executeUpdate();
                if (consulta.executeUpdate() > 0) {
                    modificado++;
                } else {
                    modificado = -10;
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (prof.getApe_prof().length() > 0) {
            try {
                 conectar("localhost", "proyectoMetodologia", "root", "root");
                consulta = conexion.prepareStatement("UPDATE Profesor SET ape_prof=? WHERE dni_prof=?");
                consulta.setString(1, prof.getApe_prof());
                consulta.setLong(2, prof.getDni_prof());
                consulta.execute();
                if (consulta.executeUpdate() > 0) {
                    modificado++;
                } else {
                    modificado = -10;
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (prof.getDomic_prof().length() > 0) {
            try {
                 conectar("localhost", "proyectoMetodologia", "root", "root");
                consulta = conexion.prepareStatement("UPDATE Profesor SET domic_prof=? WHERE dni_prof=?");
                consulta.setString(1, prof.getDomic_prof());
                consulta.setLong(2, prof.getDni_prof());
                if (consulta.executeUpdate() > 0) {
                    modificado++;
                } else {
                    modificado = -10;
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (prof.getTel_prof().length() > 0) {
            try {
                 conectar("localhost", "proyectoMetodologia", "root", "root");
                consulta = conexion.prepareStatement("UPDATE Profesor SET tel_prof=? WHERE dni_prof=?");
                consulta.setString(1, prof.getTel_prof());
                consulta.setLong(2, prof.getDni_prof());
                consulta.executeUpdate();
                if (consulta.executeUpdate() > 0) {
                    modificado++;
                } else {
                    modificado = -10;
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (modificado > 0) {
            JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido realizar la modificacion de los datos.\n"
                    + "Intentelo nuevamente.", "Error en la operación", JOptionPane.ERROR_MESSAGE);
        }
        return prof;
    }
}