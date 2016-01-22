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
public class Moto extends Vehiculo {
    private int numRuedas;

    public Moto(String matricula, String nifDueño) {
        super(matricula, nifDueño);
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }
    
    
}
