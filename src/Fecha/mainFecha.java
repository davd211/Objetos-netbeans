/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fecha;
import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class mainFecha {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {

 
        Scanner sc = new Scanner(System.in);

        // Pedir datos por teclado
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int año = sc.nextInt();

        // Crear objeto Fecha
        Fecha fecha = new Fecha(dia, mes, año);

        // Comprobar si la fecha es correcta
        if (fecha.fechaCorrecta()) {

            // Mostrar el día siguiente
            fecha.diaSiguiente();
            System.out.println( fecha);
        } else {
            System.out.println("Fecha incorrecta");
        }
    }
}