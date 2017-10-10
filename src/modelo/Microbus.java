/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ironkk
 */
public class Microbus extends Vehiculo {

    private int plazas;

    public Microbus(String matricula, int plazas) {
        super(matricula);
        this.plazas = plazas;

    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    // tambien podriamos haber puesto la clase vehiculo sin ser abstracta y acceder al metodo con super.(nombredelmetodo)(operaciones)
    @Override
    public double calcularAlquiler(int dias) {
        return super.calcularAlquiler(dias) + 2 * plazas;
    }

}
