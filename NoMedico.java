/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Mac
 */
    
public class NoMedico extends Trabajador {
    private String areaTrabajo;
    
    public NoMedico(String nombre, int identificacion, double sueldo, String areaTrabajo) {
        super(nombre, identificacion, sueldo);
        this.areaTrabajo = areaTrabajo;
    }
    
    public String getAreaTrabajo() {
        return areaTrabajo;
    }
    
    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }
}
