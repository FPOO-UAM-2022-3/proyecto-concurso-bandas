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
public class Ronda {
    private String id;
    private String dia;
    private int hora;
    private String direccion;
    private LinkedList<Presentacion> misPresentaciones;
    public Ronda(String id, String dia, int hora, String direccion) {
        this.id = id;
        this.dia = dia;
        this.hora = hora;
        this.direccion = direccion;
        this.misPresentaciones=new LinkedList<>();
    }
    public String bandaMayorPuntaje(){
        String respuesta="";
        double mayor=Double.MIN_VALUE;
        for (int i = 0; i < this.misPresentaciones.size(); i++) {
            if (this.misPresentaciones.get(i).getPuntaje()>mayor) {
                mayor=this.misPresentaciones.get(i).getPuntaje();
                respuesta=this.misPresentaciones.get(i).getMiBanda().getId();
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
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
