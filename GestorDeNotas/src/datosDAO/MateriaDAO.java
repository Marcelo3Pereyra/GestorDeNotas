package datosDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Materia;

public class MateriaDAO extends SQLQuery {
    public Materia mat;
    public MateriaDAO() {
        
        try {
             conectar("localhost", "proyectoMetodologia", "root", "root");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MateriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error de conexion.");
        }
    }
    public Boolean agregarMateriaDAO(Materia mat) throws SQLException {
        ArrayList<Long> dniProfesores = new ArrayList<>();
        String sql = "SELECT dni_prof FROM Profesor";

        try {
             consulta =  conexion.prepareStatement(sql);
            consulta.execute();
            datos = consulta.executeQuery();
            while ( datos.next()) {
                long dni;
                dni = ( datos.getLong("dni_prof"));
                dniProfesores.add(dni);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int cont = 0;
        String insertTableSQL = "SET FOREIGN_KEY_CHECKS =0";
        consulta =  conexion.prepareStatement(insertTableSQL);
        consulta.executeUpdate();
        insertTableSQL = "INSERT INTO Materia"
                + "(cod_mat, descr_mat, cant_hor_mat, dni_prof_mat) VALUES"
                + "(?,?,?,?)";
         consulta =  conexion.prepareStatement(insertTableSQL);
        consulta.setInt(1, mat.getCod_mat());
        consulta.setString(2, mat.getDescr_mat());
        consulta.setInt(3, mat.getCant_hor_mat());
        consulta.setLong(4, mat.getDni_prof_mat());
        
        for (int i = 0; i < dniProfesores.size(); i++) {
            if (dniProfesores.get(i) == mat.getDni_prof_mat()) {
                cont++;
            }
        }
        
        if (cont > 0) {
            if (consulta.executeUpdate() > 0) {
                insertTableSQL = "SET FOREIGN_KEY_CHECKS =1";
                consulta =  conexion.prepareStatement(insertTableSQL);
                consulta.executeUpdate();
                return true;
            } else {

                return false;
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro un profesor que coincida con ese documento.");
            JOptionPane.showMessageDialog(null, "Agrege ese profesor, y reintente.");
            return false;
        }
    }
    public boolean eliminarMateriaDAO(Materia mat) {
        String elimMateria = "DELETE FROM Materia WHERE cod_mat = " + mat.getCod_mat();
        
        try {
            consulta = conexion.prepareStatement(elimMateria);
            if (consulta.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e1) {
            return false;
        }
    }
    public Materia modificarMateriaDAO(Materia mat) {
        int modificado = 0;
        
        if (mat.getDescr_mat().length() > 0) {

            try {
                 conectar("localhost", "proyectoMetodologia", "root", "root");
                 consulta =  conexion.prepareStatement("UPDATE Materia SET descr_mat=? WHERE cod_mat=?");
                consulta.setString(1, mat.getDescr_mat());
                consulta.setLong(2, mat.getCod_mat());
                consulta.executeUpdate();
                if (consulta.executeUpdate() > 0) {
                    modificado++;
                } else {
                    modificado = -10;
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Materia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (mat.getDescr_mat().length() > 0) {
            try {
                 conectar("localhost", "proyectoMetodologia", "root", "root");
                 consulta =  conexion.prepareStatement("UPDATE Materia SET descr_mat=? WHERE cod_mat=?");
                consulta.setString(1, mat.getDescr_mat());
                consulta.setLong(2, mat.getCod_mat());
                consulta.execute();
                if (consulta.executeUpdate() > 0) {
                    modificado++;
                } else {
                    modificado = -10;
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Materia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (mat.getCant_hor_mat() > 0) {
            try {
                 conectar("localhost", "proyectoMetodologia", "root", "root");
                 consulta =  conexion.prepareStatement("UPDATE Materia SET cant_hor_mat=? WHERE cod_mat=?");
                consulta.setInt(1, mat.getCant_hor_mat());
                consulta.setInt(2, mat.getCod_mat());
                consulta.execute();
                if (consulta.executeUpdate() > 0) {
                    modificado++;
                } else {
                    modificado = -10;
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Materia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (mat.getDni_prof_mat() > 0) {
            try {
                 conectar("localhost", "proyectoMetodologia", "root", "root");
                 consulta =  conexion.prepareStatement("UPDATE Materia SET dni_prof_mat=? WHERE cod_mat=?");
                consulta.setLong(1, mat.getDni_prof_mat());
                consulta.setLong(2, mat.getCod_mat());
                consulta.executeUpdate();
                if (consulta.executeUpdate() > 0) {
                    modificado++;
                } else {
                    modificado = -10;
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Materia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (modificado > 0) {
            JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido realizar la modificacion de los datos.\n"
                    + "Intentelo nuevamente.", "Error en la operación", JOptionPane.ERROR_MESSAGE);
        }
        return mat;
    }
    public ArrayList<Materia> getListadoMateriasDAO() {
        ArrayList<Materia> listadoMaterias = new ArrayList<>();
        String sql = "SELECT * FROM Materia";

        try {
             consulta =  conexion.prepareStatement(sql);
            consulta.execute();
            datos = consulta.executeQuery();
            while ( datos.next()) {
                mat = new Materia();
                mat.setCod_mat( datos.getInt("cod_mat"));
                mat.setDescr_mat( datos.getString("descr_mat"));
                mat.setCant_hor_mat( datos.getInt("cant_hor_mat"));
                mat.setDni_prof_mat( datos.getLong("dni_prof_mat"));
                listadoMaterias.add(mat);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MateriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listadoMaterias;
    }
}