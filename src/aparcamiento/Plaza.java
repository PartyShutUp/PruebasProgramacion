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
public class Plaza {
    private Vehiculo vehiculo;
    private int numPlaza;
    private int numSotano;
    private String tipo;

    public Plaza(int numPlaza, int numSotano) {
        this.numPlaza = numPlaza;
        this.numSotano = numSotano;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNumPlaza() {
        return numPlaza;
    }

    public void setNumPlaza(int numPlaza) {
        this.numPlaza = numPlaza;
    }

    public int getNumSotano() {
        return numSotano;
    }

    public void setNumSotano(int numSotano) {
        this.numSotano = numSotano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int precio() {
        int resultado = 0;
        Vehiculo v = this.vehiculo;
        Coche c;
        if(this.vehiculo instanceof Moto) {
            resultado = 25;
        } else if(this.vehiculo instanceof Coche) {
            c = (Coche)v;
            if(c.getTipo().equalsIgnoreCase("corto")) {
                resultado = 40;
            } else if(c.getTipo().equalsIgnoreCase("largo")) {
                resultado = 55;
            }
        }
        
        if(resultado != 0 && this.numSotano == 2) {
            resultado = resultado - 5;
        }
        return resultado;
    }
    
    @Override
    public String toString() {
        String resultado;
        resultado = "Nº plaza: " + this.numPlaza + " Nº sotano: " + this.numSotano + "\n";
        if(this.vehiculo != null) {
            resultado = resultado.concat("Vehiculo: " + super.toString() + "\n" + "Precio: " + precio() + " €");   
        }
        return resultado;
    }
}
