package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.InterfazPrincipal;

public class Controlador implements ActionListener {
    
    InterfazPrincipal interPpal = new InterfazPrincipal();
    
    public Controlador() {
        this.interPpal.setVisible(true);
        this.interPpal.getBtnAlumno().addActionListener(this);
        this.interPpal.getBtnCargarNota().addActionListener(this);
        this.interPpal.getBtnProfesor().addActionListener(this);
        this.interPpal.getBtnMateria().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource().equals(this.interPpal.getBtnAlumno())) {
            ControladorAlu ctrlAlu = new ControladorAlu();
            this.interPpal.setVisible(false);
        } else if (ae.getSource().equals(interPpal.getBtnMateria())) {
            ControladorMat ctrlMat = new ControladorMat();
            interPpal.setVisible(false);
        } else if (ae.getSource().equals(interPpal.getBtnProfesor())) {
            ControladorProf ctrlProf = new ControladorProf();
            interPpal.setVisible(false);
        } else {
            ControladorNota ctrlNot = new ControladorNota();
            interPpal.setVisible(false);
        }
        
    }
    
}
