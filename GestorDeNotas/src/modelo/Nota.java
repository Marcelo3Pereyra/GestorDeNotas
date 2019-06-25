package modelo;
import datosDAO.NotaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
public class Nota {
    private long dniAluNot;
    private int codMatNot;
    private int notaNot;
    private NotaDAO notaDAO = new NotaDAO();
    public Nota() {
    }
    public Nota(long dniAluNot, int codMatNot, int notaNot) {
        this.dniAluNot = dniAluNot;
        this.codMatNot = codMatNot;
        this.notaNot = notaNot;
    }
    public long getDniAluNot() {
        return dniAluNot;
    }
    public void setDniAluNot(long dniAluNot) {
        this.dniAluNot = dniAluNot;
    }
    public int getCodMatNot() {
        return codMatNot;
    }
    public void setCodMatNot(int codMatNot) {
        this.codMatNot = codMatNot;
    }
    public int getNotaNot() {
        return notaNot;
    }
    public void setNotaNot(int notaNot) {
        this.notaNot = notaNot;
    }
    public NotaDAO getNotDao() {
        return notaDAO;
    }
    public void setNotDao(NotaDAO notDao) {
        this.notaDAO = notDao;
    }
    public boolean agregarNota(Nota nota) throws SQLException {
        return notaDAO.agregarNotaDAO(nota);
    }
    public boolean eliminarNota(Nota nota) {
        return notaDAO.eliminarNotaDAO(nota);
    }
    public Nota modificarNota(Nota nota) {
        return notaDAO.modificarNotaDAO(nota);
    }
    public ArrayList<Nota> ListarNota() {
        return notaDAO.getListadoNotas();
    }
}