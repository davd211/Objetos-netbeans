/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangulo;

/**
 *
 * @author David.P
 */
public class Rectangulo {

    private String nombre;
    private double ancho;
    private double alto;
    
    public Rectangulo(){ //Este es el constructor por defecto 
    
    }

    public String getNombre() {   // en el momento que hay un return hay que especificar el tipo de dato como int o string o etc...
        return this.nombre;
    }

    public Rectangulo(String nombre, double ancho, double alto) {
        this.nombre = nombre;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public Rectangulo (Rectangulo r){  // el constructor copia 
    this.nombre = r.getNombre();
    this.alto = r.getAlto();
    this.ancho = r.getAncho();
    }
 
    public void setNombre(String nombre) {  
// el void se pone cuando se va a introducir los datos 
// no me esta devolviendo informacion con la que le paso se le asigna 
        this.nombre = nombre;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

  
}
