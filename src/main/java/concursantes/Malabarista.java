/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursantes;

/**
 *
 * @author PC-Cristopher
 */
public class Malabarista implements Concursante {

    private int pelotas = 5;

    public Malabarista() {
    }

    public Malabarista(int pelotas) {
        this.pelotas = pelotas;
    }

    public int getPelotas() {
        return pelotas;
    }

    public void setPelotas(int pelotas) {
        this.pelotas = pelotas;
    }

    @Override
    public void ejecutar() throws EjecucionException {
        System.out.println("Malabareando " + pelotas + " pelotas");
    }

}
