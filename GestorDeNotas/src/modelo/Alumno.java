package modelo;
import datosDAO.AlumnoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
public class Alumno {
    private long dni_alu;
    private String nom_alu, ape_alu, domic_alu, tel_alu;
    AlumnoDAO alumnoDAO = new AlumnoDAO();
    ArrayList<Alumno> ListadoAlumnos = new ArrayList<>();
    public Alumno() {
    }
    public Alumno(long dni_alu, String nom_alu, String ape_alu, String domic_alu, String tel_alu) {
        this.dni_alu = dni_alu;
        this.nom_alu = nom_alu;
        this.ape_alu = ape_alu;
        this.domic_alu = domic_alu;
        this.tel_alu = tel_alu;
    }
    public long getDni_alu() {
        return dni_alu;
    }
    public void setDni_alu(long dni_alu) {
        this.dni_alu = dni_alu;
    }
    public String getNom_alu() {
        return nom_alu;
    }
    public void setNom_alu(String nom_alu) {
        this.nom_alu = nom_alu;
    }
    public String getApe_alu() {
        return ape_alu;
    }
    public void setApe_alu(String ape_alu) {
        this.ape_alu = ape_alu;
    }
    public String getDomic_alu() {
        return domic_alu;
    }
    public void setDomic_alu(String domic_alu) {
        this.domic_alu = domic_alu;
    }
    public String getTel_alu() {
        return tel_alu;
    }
    public void setTel_alu(String tel_alu) {
        this.tel_alu = tel_alu;
    }
    public AlumnoDAO getAlumnoDAO() {
        return alumnoDAO;
    }
    public void setAlumnoDAO(AlumnoDAO alumnoDAO) {
        this.alumnoDAO = alumnoDAO;
    }
    public boolean agregarAlumno(Alumno alu) throws SQLException {
        return alumnoDAO.agregarAlumnoDao(alu);
    }
    public ArrayList<Alumno> listarAlumnos() {
        return alumnoDAO.getListadoAlumnos();
    }
    public boolean eliminarAlumno(Alumno alu){
        return alumnoDAO.eliminarAlumnos(alu);
    }
     public Alumno modificarAlumno(Alumno alu){
        return alumnoDAO.modificarAlumno(alu);
    }
}