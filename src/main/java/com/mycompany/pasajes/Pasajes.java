package com.mycompany.pasajes;

import backend.Bus;
import backend.Precio;
import backend.Taxi;
import frontend.MenuJFrame;

public class Pasajes {

    public static void main(String[] args) {
        MenuJFrame menu = new MenuJFrame();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
       
        Precio precio = new Precio();
       
        Taxi taxi = new Taxi();
      
        taxi.setDistancia(20.0); 
       
        Bus bus = new Bus();
     
        bus.setDistancia(20.0);   
        double precioTaxi = precio.calcular(taxi);
        System.out.println("Precio del taxi: " + precioTaxi);
        double precioBus = precio.calcular(bus);
        System.out.println("Precio del bus: " + precioBus);
    }
}
