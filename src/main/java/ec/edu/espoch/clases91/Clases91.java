/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.clases91;

import ec.edu.espoch.clases91.Clases.Persona;
import ec.edu.espoch.clases91.Enumeraciones.Dias;

/**
 *
 * @author anthony
 */
public class Clases91 {

    public static void main(String[] args) {
    Persona objPersonal = new Persona(); 
    
    
    objPersonal.nombre="Anthomy";
    objPersonal.apellidoPaterno="Pulupa";
    objPersonal.apellidoMaterno="Martin";
    objPersonal.imprimir();
    
    Persona objPersona2 = new Persona ();
    
    objPersona2.nombre="Lemon";
    objPersona2.apellidoPaterno="Lelo";
    objPersona2.apellidoMaterno="Lali";
    
    objPersona2.imprimir();
    
    System.out.println("El nombre del obj 1 es: "+objPersonal.nombre);
    System.out.println("El apellidoPaterno del obj 1 es: "+objPersonal.apellidoPaterno);
    System.out.println("El apellidoMaterno del obj 1 es: "+objPersonal.apellidoMaterno);
    
    System.out.println("El dia es: "+Dias.Miercoles);
    }
}
