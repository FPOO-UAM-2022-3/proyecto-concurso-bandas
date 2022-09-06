/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author pipet
 */
public class Presentacion {
    private String id;
    private double puntaje;
    private Banda miBanda;
    private Ronda miRonda;

    public Presentacion(String id, double puntaje) {
        this.id = id;
        this.puntaje = puntaje;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the puntaje
     */
    public double getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    /**
     * @return the miBanda
     */
    public Banda getMiBanda() {
        return miBanda;
    }

    /**
     * @param miBanda the miBanda to set
     */
    public void setMiBanda(Banda miBanda) {
        this.miBanda = miBanda;
    }

    /**
     * @return the miRonda
     */
    public Ronda getMiRonda() {
        return miRonda;
    }

    /**
     * @param miRonda the miRonda to set
     */
    public void setMiRonda(Ronda miRonda) {
        this.miRonda = miRonda;
    }
    
}
