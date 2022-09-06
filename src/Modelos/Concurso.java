/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.LinkedList;

/**
 *
 * @author pipet
 */
public class Concurso {
    private String id;
    private String lema;
    private double presupuesto;
    private LinkedList<Banda> misBandas;
    private LinkedList<Ronda> misRondas;
    public Concurso(String id, String lema, double presupuesto) {
        this.id = id;
        this.lema = lema;
        this.presupuesto = presupuesto;
        this.misBandas=new LinkedList<>();
        this.misRondas=new LinkedList<>();
    }
    public String idBandaPuntajeMasAltoEnRonda(){
        String respuesta="";
        double mayor=Double.MIN_VALUE;
        for (int i = 0; i < this.misRondas.size(); i++) {
            for (int j = 0; j < this.misRondas.get(i).getMisPresentaciones().size(); j++) {
                if (this.misRondas.get(i).getMisPresentaciones().get(j).getPuntaje()>mayor) {
                    mayor=this.misRondas.get(i).getMisPresentaciones().get(j).getPuntaje();
                    respuesta=this.misRondas.get(i).getMisPresentaciones().get(j).getMiBanda().getId();
                }
            }
        }
        return respuesta;
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
     * @return the lema
     */
    public String getLema() {
        return lema;
    }

    /**
     * @param lema the lema to set
     */
    public void setLema(String lema) {
        this.lema = lema;
    }

    /**
     * @return the presupuesto
     */
    public double getPresupuesto() {
        return presupuesto;
    }

    /**
     * @param presupuesto the presupuesto to set
     */
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    /**
     * @return the misBandas
     */
    public LinkedList<Banda> getMisBandas() {
        return misBandas;
    }

    /**
     * @param misBandas the misBandas to set
     */
    public void setMisBandas(LinkedList<Banda> misBandas) {
        this.misBandas = misBandas;
    }

    /**
     * @return the misRondas
     */
    public LinkedList<Ronda> getMisRondas() {
        return misRondas;
    }

    /**
     * @param misRondas the misRondas to set
     */
    public void setMisRondas(LinkedList<Ronda> misRondas) {
        this.misRondas = misRondas;
    }
    
}
