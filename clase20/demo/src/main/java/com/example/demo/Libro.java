package com.example.demo;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;

@Entity
@Table(name = "Libros")
public class Libro {


    @JsonView(Vistas.AutoresLibros.class)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @JsonView(Vistas.AutoresLibros.class)
    @Column
    private String titulo;

    @Column(name = "id_autor")
    private int idAutor;

    public Libro() {
    }

    public Libro(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }
}
