package com.bocho.coche;

public class Coche {

    String marca, modelo, matricula, añoFabricacion;

    public Coche() {
    }

    public Coche(String marca, String modelo, String matricula, String añoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.añoFabricacion = añoFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setAñoFabricacion(String añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", añoFabricacion='" + añoFabricacion + '\'' +
                '}';
    }
}
