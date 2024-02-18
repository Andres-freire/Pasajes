/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Dell l
 */
public class Bus extends Vehiculo {
    public double Bus(double tarifa, double distancia){
        double precio= tarifa*(0.5/distancia);
        return precio;
    }
}
