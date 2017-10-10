/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import modelo.Camion;
import modelo.Coche;
import modelo.Furgoneta;
import modelo.Microbus;
import modelo.Vehiculo;

/**
 *
 * @author ironkk
 */
public class Main extends IOException {

    /*
    La empresa dispone de un vehículo de cada tipo.
    Éstos se almacenarán en un array de 4 posiciones.
Obtener precio alquiler: se pide al usuario la matrícula del vehículo y los días que ha durado el alquiler.
    La aplicación mostrará el precio del alquiler.
     */
    static List<Vehiculo> misVehiculos = new ArrayList<>();

    public static void main(String[] args) {
        misVehiculos.add((new Coche(2, "3619BBB")));
        misVehiculos.add((new Furgoneta("B7453TL", 4, true)));
        misVehiculos.add((new Microbus("4533KBC", 6)));
        misVehiculos.add((new Camion("2310JDK")));
        
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        try{
            
            //foreach para imprimir por pantalla todas las matriculas de todos los vehiculos con el precio de alquiler
              misVehiculos.forEach(vehiculo -> System.out.println(vehiculo.getMatricula()+" - "+vehiculo.calcularAlquiler(30)));
            System.out.println("Introduce la matricula del vehiculo: ");
              // final -> no podemos acceder ni a los getters ni los setters de matricula, solo podemos modificar la asignacion del objeto.
              //guardamos la matricula
            final String matricula = buffer.readLine();
            System.out.println("Dias de alquiler: ");
            // final ->no podemos acceder ni a los getters ni los setters de dias, solo podemos modificar la asignacion del objeto.
            //guardamos los dias
            final int dias = Integer.parseInt(buffer.readLine());
            //filtramos que a partir de x matricula y a partir de x numero de dias de alquiler que introduzca el usuario, se llame al metodo calcularAlquiler que toca.
            Vehiculo v = misVehiculos.stream()
                    .filter(vehiculo -> vehiculo.getMatricula().equalsIgnoreCase(matricula))
                    .findFirst().orElse(null);
            //si no filtra ningun coche dentro de la array con esa matricula -> no existe
            if (v == null)
                System.out.println("La matricula no existe!");
            //si lo hace, existe y hacemos el metodo que toque para ese vehiculo
            else
                System.out.println(v.calcularAlquiler(dias));

            
         } catch(IOException ex){
            System.out.println("Error de entrada y salida");
         }

    }

}
