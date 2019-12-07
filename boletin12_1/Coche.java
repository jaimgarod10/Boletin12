package com.mycompany.boletin12_1;

/**
 *
 * @author User
 */
public class Coche {
    
    private String matricula;
    private float tiempo;

    public Coche() {
    }

    public Coche(String matricula, float tiempo) {
        this.matricula = matricula;
        this.tiempo = tiempo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }    
    
}
