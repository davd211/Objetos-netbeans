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

        System.out.print("Introduzca el día: ");
        int dia = sc.nextInt();

        System.out.print("Introduzca el mes: ");
        int mes = sc.nextInt();

        System.out.print("Introduzca el año: ");
        int año = sc.nextInt();

        Fecha fecha = new Fecha(dia, mes, año);

        if (fecha.esCorrecta()) {
            fecha.diaSiguiente();
        } else {
            System.out.println("Fecha incorrecta");
        }
    }
}

