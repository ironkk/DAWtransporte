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
public class Camion extends Vehiculo {

    public Camion(String matricula) {
        super(matricula);
    }

    @Override
    public double calcularAlquiler(int dias) {
        return (dias) + 40;
    }

}
