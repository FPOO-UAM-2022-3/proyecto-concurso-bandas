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
public class Integrante {
    private String cedula;
    private String nombre;
    private int añosExperiencia;
    private Instrumento miInstrumento;

    public Integrante(String cedula, String nombre, int añosExperiencia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.añosExperiencia = añosExperiencia;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
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
     * @return the añosExperiencia
     */
    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    /**
     * @param añosExperiencia the añosExperiencia to set
     */
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    /**
     * @return the miInstrumento
     */
    public Instrumento getMiInstrumento() {
        return miInstrumento;
    }

    /**
     * @param miInstrumento the miInstrumento to set
     */
    public void setMiInstrumento(Instrumento miInstrumento) {
        this.miInstrumento = miInstrumento;
    }
    
}
