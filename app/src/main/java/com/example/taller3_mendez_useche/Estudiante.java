package com.example.taller3_mendez_useche;

import java.io.Serializable;

public class Estudiante implements Serializable{
    private final String nota = "4.5"; // Constante para mostrar la nota

    private String codigo;
    private String correo;


    public String getNota() {
        return nota;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}


