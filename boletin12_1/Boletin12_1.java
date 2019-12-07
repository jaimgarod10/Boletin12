package com.mycompany.boletin12_1;

/**
 *
 * @author User
 */
public class Boletin12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Garaje garaje= new Garaje();
        garaje.setNumCoches(3);
        garaje.plazas();
        Coche coche= new Coche();
        coche.setTiempo(4);
        coche.setMatricula("SDFS345");
        garaje.calcularPrecio(6);
        garaje.generarFactura(coche.getMatricula(), coche.getTiempo(), 10);
        
    }
    
}
