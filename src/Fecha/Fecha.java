/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fecha;

/**
 *
 * @author David.P
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    
    public boolean esCorrecta() {
        if (dia < 1 || dia > 31) {
            return false;
        }
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (año < 1) {
            return false;
        }
        // Validar días de febrero
        if (mes == 2 && dia > 28) {
            if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
                return dia <= 29;
            } else {
                return dia <= 28;
            }
        }
        return true;
    }

   public void diaSiguiente() {
    if (esCorrecta()) {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dia++;
                if (dia > 31) {
                    dia = 1;
                    mes++;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dia++;
                if (dia > 30) {
                    dia = 1;
                    mes++;
                }
                break;
            case 2:
                if (esBisiesto()) {
                    dia++;
                    if (dia > 29) {
                        dia = 1;
                        mes++;
                    }
                } else {
                    dia++;
                    if (dia > 28) {
                        dia = 1;
                        mes++;
                    }
                }
                break;
        }
    }
}
public boolean esBisiesto() {
    return año % 4 == 0 && (año % 100 != 0 || año % 400 == 0);
}



    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return  dia + " de " + mes + " de " + año ;
    }

   
    //1░de░1░de░2023⁋

    
}
