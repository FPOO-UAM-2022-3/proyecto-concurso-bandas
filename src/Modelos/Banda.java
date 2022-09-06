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
public class Banda {
    private String id;
    private String municipio;
    private int añoFundacion;
    private int cantidadTitulos;
    private Colegio miColegio;
    private LinkedList<Integrante> misIntegrantes;
    private LinkedList<Presentacion> misPresentaciones;
    public Banda(String id, String municipio, int añoFundacion, int cantidadTitulos) {
        this.id = id;
        this.municipio = municipio;
        this.añoFundacion = añoFundacion;
        this.cantidadTitulos = cantidadTitulos;
        this.misIntegrantes=new LinkedList<>();
        this.misPresentaciones=new LinkedList<>();
    }
    public String personaMasExperiencia(){
        String respuesta="";
        int mayor=Integer.MIN_VALUE;
        //Aqui a programar
        for (int i = 0; i < this.getMisIntegrantes().size(); i++) {
            if (this.getMisIntegrantes().get(i).getAñosExperiencia()>mayor) {
                mayor=this.getMisIntegrantes().get(i).getAñosExperiencia();
                respuesta=this.getMisIntegrantes().get(i).getNombre();
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
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * @return the añoFundacion
     */
    public int getAñoFundacion() {
        return añoFundacion;
    }

    /**
     * @param añoFundacion the añoFundacion to set
     */
    public void setAñoFundacion(int añoFundacion) {
        this.añoFundacion = añoFundacion;
    }

    /**
     * @return the cantidadTitulos
     */
    public int getCantidadTitulos() {
        return cantidadTitulos;
    }

    /**
     * @param cantidadTitulos the cantidadTitulos to set
     */
    public void setCantidadTitulos(int cantidadTitulos) {
        this.cantidadTitulos = cantidadTitulos;
    }

    /**
     * @return the miColegio
     */
    public Colegio getMiColegio() {
        return miColegio;
    }

    /**
     * @param miColegio the miColegio to set
     */
    public void setMiColegio(Colegio miColegio) {
        this.miColegio = miColegio;
    }

    /**
     * @return the misIntegrantes
     */
    public LinkedList<Integrante> getMisIntegrantes() {
        return misIntegrantes;
    }

    /**
     * @param misIntegrantes the misIntegrantes to set
     */
    public void setMisIntegrantes(LinkedList<Integrante> misIntegrantes) {
        this.misIntegrantes = misIntegrantes;
    }

    /**
     * @return the misPresentaciones
     */
    public LinkedList<Presentacion> getMisPresentaciones() {
        return misPresentaciones;
    }

    /**
     * @param misPresentaciones the misPresentaciones to set
     */
    public void setMisPresentaciones(LinkedList<Presentacion> misPresentaciones) {
        this.misPresentaciones = misPresentaciones;
    }
    
    
}
