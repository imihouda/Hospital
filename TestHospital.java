/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;


public class TestHospital {
    
    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador("Houda", 123466, 1600.0);
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Identificación: " + trabajador.getIdentificacion());
        System.out.println("Sueldo: " + trabajador.getSueldo());
        
        Medico medico = new Medico("Laura", 653521, 6000.0, 1254, 40);
        System.out.println("Nombre: " + medico.getNombre());
        System.out.println("Identificación: " + medico.getIdentificacion());
        System.out.println("Sueldo: " + medico.getSueldo());
        System.out.println("Número de colegiado: " + medico.getNumColegiado());
        System.out.println("Número de pacientes atendidos: " + medico.getNumPacientes());
        
        NoMedico noMedico = new NoMedico("Juanan", 789212, 2000.0, "Limpieza");
        System.out.println("Nombre: " + noMedico.getNombre());
        System.out.println("Identificación: " + noMedico.getIdentificacion());
        System.out.println("Sueldo: " + noMedico.getSueldo());
        System.out.println("Área de trabajo: " + noMedico.getAreaTrabajo());
    }
}


