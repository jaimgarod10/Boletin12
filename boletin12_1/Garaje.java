package com.mycompany.boletin12_1;

/**
 *
 * @author User
 */
public class Garaje {
    
    public static final int MAXCOCHES = 5;
    private int numCoches;
    private String matricula;
    public static final double TRESHORAS=1.5;
    public static final double RESTO=0.2;

    public Garaje() {
    }

    public Garaje(int numCoches, String matricula) {
        this.numCoches = numCoches;
        this.matricula = matricula;
    }

    public int getNumCoches() {
        return numCoches;
    }

    public void setNumCoches(int numCoches) {
        this.numCoches = numCoches;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
     public boolean estaLleno(){
        return this.numCoches >= MAXCOCHES;
    } 
    
    public void plazas(){
    if(!estaLleno()){
              System.out.println("Plazas disponibles.");
    }else {
        System.out.println("Completo");
    }
    
    }
   public double calcularPrecio(float tiempo){
       if(tiempo<3){
           return TRESHORAS;
        }else {
           return (TRESHORAS + (tiempo-3)* 0.20);
       }
   }
   
   public void generarFactura(String matricula, float tiempo, float dinero){
       System.out.println("Factura:");
       System.out.println(" Matricula coche: " + matricula);
       System.out.println(" Tiempo: " + tiempo);
       System.out.println(" Precio: " + calcularPrecio(tiempo));
       System.out.println(" Dinero recibido: " + dinero);
       System.out.println(" Dinero devuelto: " + (dinero - calcularPrecio(tiempo)));
       System.out.println(" Gracias por usar nuestro aparcamiento.");
   }
}
