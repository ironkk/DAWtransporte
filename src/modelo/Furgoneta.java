/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DAM
 */
public class Furgoneta extends Vehiculo {

    private double pma;
    private boolean refrig;

    public Furgoneta(String matricula, double pma, boolean refrig) {
        super(matricula);
        this.pma = pma;
        this.refrig = refrig;
    }

    public double getPma() {
        return pma;
    }

    public void setPma(double pma) {
        this.pma = pma;
    }

    public boolean isRefrig() {
        return refrig;
    }

    public void setRefrig(boolean refrig) {
        this.refrig = refrig;
    }
    
 // tambien podriamos haber puesto la clase vehiculo sin ser abstracta y acceder al metodo con super.(nombredelmetodo)(operaciones)
    @Override
    public double calcularAlquiler(int dias) {
        return (dias) + pma * 20;
    }

}
