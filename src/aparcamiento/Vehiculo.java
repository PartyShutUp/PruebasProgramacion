/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento;

/**
 *
 * @author daw1
 */
public class Vehiculo {
    protected String matricula;
    protected String modelo;
    protected String color;
    protected String nifDueño;
    protected String telf;

    public Vehiculo(String matricula, String nifDueño) {
        this.matricula = matricula;
        this.nifDueño = nifDueño;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNifDueño() {
        return nifDueño;
    }

    public void setNifDueño(String nifDueño) {
        this.nifDueño = nifDueño;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        if(telf.length() == 9) {
            this.telf = telf;
        }   
    }
    
    @Override
    public String toString() {
        return this.matricula + " " + this.modelo + " " + this.color;
    }
    
}
