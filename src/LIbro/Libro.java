/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LIbro;

/**
 *
 * @author David.P Crea una clase Libro, con los atributos titulo, isbn, autor
 * (todos String) y atributo prestado (boolean) y con los métodos préstamo,
 * devolución y toString. La clase contendrá un constructor por defecto, un
 * constructor con parámetros (en ambos el atributo prestado será igual a false,
 * con lo que no tendremos que pasar su valor como parámetro) y los métodos
 * getters y setters
 */
public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean prestado;

    public Libro() {
        prestado = false;
    }

    public Libro(String titulo, String autor, String isb) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        prestado = false;

    }

    public void prestamo() {
        if (!prestado) {
            prestado = true;
            System.out.println("Libro prestado correctamente.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    public void devolucion() {
        if (prestado) {
            prestado = false;
            System.out.println("Libro devuelto correctamente.");
        } else {
            System.out.println("El libro no estaba prestado.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

}
