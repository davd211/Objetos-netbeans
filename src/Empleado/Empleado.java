/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

/**
 *
 * @author David.P Crea una clase Empleado (dni, nombre, sueldo). La clase
 * contendrá un atributo estático o atributo de clase (numEmpleados)
 *
 * Constructor por defecto, setters y getters.
 *
 * Crear la clase principal, donde crearemos un empleado con constructor por
 * defecto, y mostraremos el número de empleados. A continuación creamos otros
 * dos empleados y volvemos a mostrar cuantos empleados hay
 */
public class Empleado {

    private String dni;
    private String nombre;
    private double sueldo;
    public static int numEmpleados = 0;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getNumEmpleados() {
        return numEmpleados;
    }

    public Empleado() {
        numEmpleados++;
    }
    

   
    
    
    

}
