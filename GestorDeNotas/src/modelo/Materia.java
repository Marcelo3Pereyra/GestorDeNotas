package modelo;

import datosDAO.MateriaDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author RenzoTheJoker
 */
public class Materia {

    private int cod_mat;
    private String descr_mat;
    private int cant_hor_mat;
    private long dni_prof_mat;
    private MateriaDAO materiaDAO = new MateriaDAO();
    ArrayList<Materia> ListadoMaterias = new ArrayList<>();

    public Materia() {
    }

    public int getCod_mat() {
        return cod_mat;
    }

    public void setCod_mat(int cod_mat) {
        this.cod_mat = cod_mat;
    }

    public String getDescr_mat() {
        return descr_mat;
    }

    public void setDescr_mat(String descr_mat) {
        this.descr_mat = descr_mat;
    }

    public int getCant_hor_mat() {
        return cant_hor_mat;
    }

    public void setCant_hor_mat(int cant_hor_mat) {
        this.cant_hor_mat = cant_hor_mat;
    }

    public long getDni_prof_mat() {
        return dni_prof_mat;
    }

    public void setDni_prof_mat(long dni_prof_mat) {
        this.dni_prof_mat = dni_prof_mat;
    }

    public boolean agregarMateria(Materia mat) throws SQLException {
        return materiaDAO.agregarMateriaDAO(mat);
    }

    public boolean eliminarMateria(Materia mat) throws SQLException {
        return materiaDAO.eliminarMateriaDAO(mat);
    }

    public Materia modificarMateria(Materia mat) {
        return materiaDAO.modificarMateriaDAO(mat);
    }

    public ArrayList<Materia> listarMaterias() {
        return materiaDAO.getListadoMateriasDAO();
    }
}
