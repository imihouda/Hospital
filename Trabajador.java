/*
En un hospital se han desarrollado diferentes tipos de trabajadores que tienen funciones específicas en la organización. 
Estos trabajadores se clasifican en dos categorías: médicos y no médicos. Cada trabajador tiene un nombre, un número de 
identificación y un sueldo.
Los médicos pueden ser de diferentes especialidades como cardiólogos, pediatras, cirujanos, entre otros. Además de los 
atributos mencionados anteriormente, cada médico tiene un número de colegiado y un número de pacientes que ha atendido.
Por otro lado, los trabajadores no médicos pueden ser enfermeros, recepcionistas, limpiadores, entre otros. 
Cada trabajador no médico tiene un área de trabajo asignada, además de los atributos mencionados anteriormente.
Crea una clase Trabajador que tenga los atributos mencionados anteriormente y métodos para acceder y modificar cada atributo. 
Luego, crea una clase Médico que herede de Trabajador y añade los atributos y métodos adicionales mencionados anteriormente. 
Por último, crea una clase TrabajadorNoMedico que herede de Trabajador y añade los atributos y métodos adicionales mencionados 
anteriormente.

Crea un programa en Java que muestre cómo crear objetos de las tres clases, establecer los atributos correspondientes y 
mostrarlos por pantalla.
 */
package hospital;


public class Trabajador {
    private String nombre;
    private int identificacion;
    private double sueldo;
    
    public Trabajador(String nombre, int identificacion, double sueldo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.sueldo = sueldo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getIdentificacion() {
        return identificacion;
    }
    
    public double getSueldo() {
        return sueldo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
