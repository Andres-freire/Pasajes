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
 public double Taxi (double distancia){
     double precio= (1.5/3)*distancia;
     return precio;   
 }   
}
