package modelo;

import datosDAO.ProfesorDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author m3per
 */
public class Profesor {

    private long dni_prof;
    private String nom_prof;
    private String ape_prof;
    private String domic_prof;
    private String tel_prof;
    private ProfesorDAO profDAO = new ProfesorDAO();

    public Profesor(int dni_prof, String nom_prof, String ape_prof, String domic_prof, String tel_prof, ProfesorDAO profDAO) {
        this.dni_prof = dni_prof;
        this.nom_prof = nom_prof;
        this.ape_prof = ape_prof;
        this.domic_prof = domic_prof;
        this.tel_prof = tel_prof;
        this.profDAO = new ProfesorDAO();
    }

    public Profesor() {
    }

    public long getDni_prof() {
        return dni_prof;
    }

    public void setDni_prof(long dni_prof) {
        this.dni_prof = dni_prof;
    }

    public String getNom_prof() {
        return nom_prof;
    }

    public void setNom_prof(String nom_prof) {
        this.nom_prof = nom_prof;
    }

    public String getApe_prof() {
        return ape_prof;
    }

    public void setApe_prof(String ape_prof) {
        this.ape_prof = ape_prof;
    }

    public String getDomic_prof() {
        return domic_prof;
    }

    public void setDomic_prof(String domic_prof) {
        this.domic_prof = domic_prof;
    }

    public String getTel_prof() {
        return tel_prof;
    }

    public void setTel_prof(String tel_prof) {
        this.tel_prof = tel_prof;
    }

    public boolean agregarProfesor(Profesor prof) throws SQLException {
        return profDAO.agregarProfesorDao(prof);
    }

    public ArrayList<Profesor> ListarProfesores() {
        return profDAO.getListadoProfesores();
    }

    public boolean eliminarProfesor(Profesor prof) {
        return profDAO.eliminarProfesor(prof);
    }

    public Profesor modificarProfesor(Profesor prof) {
        return profDAO.modificarProfesorDAO(prof);
    }
}
