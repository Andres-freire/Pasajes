/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Dell
 */
public class Precio {
 
    public double calcular(Vehiculo vehiculo) {
      
        double distancia = vehiculo.getDistancia();
        
       
        switch (vehiculo) {
            case Taxi taxi -> {
                return taxi.Taxi( distancia);
            }
            case Bus bus -> {
                return bus.Bus( distancia);
            }
            default -> throw new IllegalArgumentException("Tipo de vehículo no admitido");
        }
    }
}
