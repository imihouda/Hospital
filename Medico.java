/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Mac
 */
    
public class Medico extends Trabajador {
    private int numColegiado;
    private int numPacientes;
    
    public Medico(String nombre, int identificacion, double sueldo, int numColegiado, int numPacientes) {
        super(nombre, identificacion, sueldo);
        this.numColegiado = numColegiado;
        this.numPacientes = numPacientes;
    }
    
    public int getNumColegiado() {
        return numColegiado;
    }
    
    public int getNumPacientes() {
        return numPacientes;
    }
    
    public void setNumColegiado(int numColegiado) {
        this.numColegiado = numColegiado;
    }
    
    public void setNumPacientes(int numPacientes) {
        this.numPacientes = numPacientes;
    }
}
