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
public class Colegio {
    private String id;
    private String nombre;
    private int añoFundacion;

    public Colegio(String id, String nombre, int añoFundacion) {
        this.id = id;
        this.nombre = nombre;
        this.añoFundacion = añoFundacion;
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
}
