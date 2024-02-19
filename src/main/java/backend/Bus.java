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
    public double Bus( double distancia){
        double precio= (0.5/8)*distancia;
        return precio;
    }
}
