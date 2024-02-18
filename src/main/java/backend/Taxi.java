/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Dell
 */
public class Taxi extends Vehiculo {
 public double Taxi (double tarifa, double distancia){
     double precio= tarifa*(1.5/distancia);
     return precio;   
 }   
}
